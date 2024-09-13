/**
 * 
 */
package org.drdeesw.commons.services.impl;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.drdeesw.commons.models.base.entities.UniqueEntity;
import org.drdeesw.commons.models.base.pojos.UniquePojo;
import org.drdeesw.commons.queries.JpqlQuery;
import org.drdeesw.commons.queries.QueryResults;
import org.drdeesw.commons.queries.datatables.DataTablesJpqlQuery;
import org.drdeesw.commons.repositories.QueryRepository;
import org.drdeesw.commons.services.CrudService;
import org.modelmapper.ModelMapper;
import org.modelmapper.config.Configuration;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.util.MultiValueMap;


/**
 *
 * @author gary_kephart
 *
 * @param <P>  the POJO class
 * @param <E>  the entity class
 * @param <ID> the ID class
 */
public abstract class AbstractJpaCrudServiceImpl<P extends UniquePojo<ID>, E extends UniqueEntity<ID>, ID extends Serializable>
    extends AbstractService implements CrudService<P, ID>
{
  private Class<E>               entityClass;
  private ModelMapper            modelMapper;
  private Class<P>               pojoClass;
  private QueryRepository<E, ID> queryRepository;
  private JpaRepository<E, ID>   repository;

  /**
   * @param pojoClass
   * @param entityClass
   */
  protected AbstractJpaCrudServiceImpl(Class<P> pojoClass, Class<E> entityClass)
  {
    this.entityClass = entityClass;
    this.modelMapper = new ModelMapper();
    this.pojoClass = pojoClass;

    // This solves "name" not being copied from entity to pojo
    this.modelMapper.getConfiguration()//
        .setFieldMatchingEnabled(true)//
        .setMatchingStrategy(MatchingStrategies.STRICT)//)
        .setFieldAccessLevel(Configuration.AccessLevel.PRIVATE);
    
    customizeModelMapper(this.modelMapper);
  }


  /**
   * Allows subclasses to customize the ModelMapper.
   * 
   * @param modelMapper
   */
  protected void customizeModelMapper(
    ModelMapper modelMapper)
  {
  }


  /**
   * @param entities
   * @return
   */
  private List<P> convertEntityToPojo(
    Collection<E> entities)
  {
    List<P> pojos = new ArrayList<P>(entities.size());

    entities.forEach(entity -> pojos.add(convertEntityToPojo(entity)));

    return pojos;
  }


  /**
   * @param entity
   * @return
   */
  protected P convertEntityToPojo(
    E entity)
  {
    return entity == null ? null : this.modelMapper.map(entity, this.pojoClass);
  }


  /**
   * @param entityQueryResults
   * @return
   */
  protected QueryResults<P> convertEntityToPojo(
    QueryResults<E> entityQueryResults)
  {
    QueryResults<P> queryResults = new QueryResults<P>(entityQueryResults.getDraw(),
        entityQueryResults.getSize(), entityQueryResults.getRecordsTotal());

    entityQueryResults.forEach(entity -> queryResults.add(convertEntityToPojo(entity)));

    return queryResults;
  }


  /**
   * @param entities
   * @return
   */
  private List<E> convertPojoToEntity(
    Collection<P> pojos)
  {
    List<E> entities = new ArrayList<E>(pojos.size());

    for (P pojo : pojos)
    {
      entities.add(convertPojoToEntity(pojo));
    }

    return entities;
  }


  /**
   * @param pojo
   * @return
   */
  protected E convertPojoToEntity(
    P pojo)
  {
    return this.modelMapper.map(pojo, this.entityClass);
  }


  /*
   * (non-Javadoc)
   * 
   * @see org.drdeesw.commons.services.CrudService#saveAll(java.util.Collection)
   */
  @Override
  public List<P> create(
    Collection<P> pojos)
  {
    List<E> entities = convertPojoToEntity(pojos);

    return convertEntityToPojo(this.repository.saveAll(entities));
  }


  /*
   * (non-Javadoc)
   * 
   * @see
   * org.drdeesw.commons.services.CrudService#create(org.drdeesw.commons.models.base.
   * UniqueObject)
   */
  @Override
  public P create(
    P obj) throws Exception
  {
    E entity = convertPojoToEntity(obj);

    return convertEntityToPojo(this.repository.save(entity));
  }


  /*
   * (non-Javadoc)
   * 
   * @see org.drdeesw.commons.services.CrudService#saveAllAndFlush(java.util.
   * Collection)
   */
  @Override
  public List<P> createAndFlush(
    Collection<P> pojos)
  {
    List<E> entities = convertPojoToEntity(pojos);

    return convertEntityToPojo(this.repository.saveAllAndFlush(entities));
  }


  /*
   * (non-Javadoc)
   * 
   * @see
   * org.drdeesw.commons.services.CrudService#create(org.drdeesw.commons.models.base.
   * UniqueObject)
   */
  @Override
  public P createAndFlush(
    P obj)
  {
    E entity = convertPojoToEntity(obj);

    return convertEntityToPojo(this.repository.saveAndFlush(entity));
  }


  /**
   * Used when importing many objects, some of them which might already exist 
   * in the system and need updating.
   * 
   * This method first creates a map of POJOs by their key.
   * It queries the existing entities based on the provided keys.
   * It updates existing entities with the corresponding POJOs and removes the updated POJOs from the map.
   * It then saves all updated entities.
   * Any remaining POJOs in the map are new and need to be saved as new entities.
   * 
   * @param allPojos POJOs that have been fetched/updated from an outside source
   * @param pojoKeyMapper maps to the getId() method of pojos
   * @param entityKeyMapper maps to the getId() method of entities
   * @param idFieldName the name of the field for the ID property. Usually "id".
   * @throws Exception
   */
  public void createOrUpdateAll(
    List<P> allPojos,
    Function<P, ? extends Object> pojoKeyMapper,
    Function<E, ? extends Object> entityKeyMapper,
    String idFieldName) throws Exception
  {
    if (isNotEmpty(allPojos))
    {
      Map<Object, P> pojoMap = allPojos.stream()
          .collect(Collectors.toMap(pojoKeyMapper, Function.identity()));
      JpqlQuery<E> query = new JpqlQuery<E>(this.entityClass)//
          .in(idFieldName, pojoMap.keySet());
      QueryResults<E> existingEntities = findEntities(query);
      Collection<P> newPojos;

      existingEntities.forEach(entity -> {
        Object key = entityKeyMapper.apply(entity);
        P pojo = pojoMap.get(key);

        updateEntity(entity, pojo);
        pojoMap.remove(key);
      });
      this.repository.saveAll(existingEntities);

      newPojos = pojoMap.values();
      this.repository.saveAll(convertPojoToEntity(newPojos));
    }
  }


  /*
   * (non-Javadoc)
   * 
   * @see
   * org.drdeesw.commons.services.CrudService#delete(org.drdeesw.commons.models.base.
   * UniqueObject)
   */
  @Override
  public void delete(
    P obj)
  {
    E entity = convertPojoToEntity(obj);

    this.repository.delete(entity);
  }


  /**
   * @param <Q>
   * @param query
   * @return
   */
  private <Q extends JpqlQuery<E>> QueryResults<P> findByEntityQuery(
    Q query)
  {
    QueryResults<E> queryResults = this.queryRepository.findByQuery(query);

    return convertEntityToPojo(queryResults);
  }


  /*
   * (non-Javadoc)
   * 
   * @see org.drdeesw.commons.services.CrudService#findById(java.io.Serializable)
   */
  @Override
  public Optional<P> findById(
    ID id)
  {
    return this.repository.findById(id).map(entity -> {
      return convertEntityToPojo(entity);
    }).or(() -> {
      return Optional.empty();
    });
  }


  /*
   * (non-Javadoc)
   * 
   * @see
   * org.drdeesw.commons.services.CrudService#findByQuery(org.springframework.util
   * .MultiValueMap)
   */
  @Override
  public QueryResults<P> findByQuery(
    MultiValueMap<String, String> parameterMap)
  {
    JpqlQuery<E> query = getQuery(parameterMap);

    return findByEntityQuery(query);
  }


  /*
   * (non-Javadoc)
   * 
   * @see
   * org.drdeesw.commons.services.CrudService#findByQuery(org.drdeesw.commons.models.
   * queries.JpqlQuery)
   */
  public <Q extends JpqlQuery<P>> QueryResults<P> findByQuery(
    Q query)
  {
    JpqlQuery<E> entityQuery = new JpqlQuery<E>(this.entityClass, query);

    return findByEntityQuery(entityQuery);
  }


  /**
   * @param query
   * @return
   */
  public QueryResults<E> findEntities(
    JpqlQuery<E> query)
  {
    return this.queryRepository.findByQuery(query);
  }


  /*
   * (non-Javadoc)
   * 
   * @see org.drdeesw.commons.services.CrudService#get(java.io.Serializable)
   */
  @Override
  public P get(
    ID id)
  {
    E entity = this.repository.getReferenceById(id);

    return convertEntityToPojo(entity);
  }


  /*
   * (non-Javadoc)
   * 
   * @see org.drdeesw.commons.services.CrudService#get(java.util.Set)
   */
  @Override
  public QueryResults<P> get(
    Set<ID> ids)
  {
    QueryResults<P> queryResults = null;

    if (isNotEmpty(ids))
    {
      JpqlQuery<E> query = new JpqlQuery<E>(this.entityClass)//
          .in("id", ids);

      queryResults = findByEntityQuery(query);
    }
    else
    {
      List<P> list = new ArrayList<>();

      queryResults = new QueryResults<P>(list);
    }

    return queryResults;
  }


  /**
   * @param ids
   * @return
   */
  @Override
  public Map<ID, P> getMap(
    Set<ID> ids)
  {
    Map<ID, P> map = new HashMap<>();
    QueryResults<P> queryResults = get(ids);

    queryResults.forEach(result -> map.put(result.getId(), result));

    return map;
  }


  /**
   * @return the modelMapper
   */
  protected ModelMapper getModelMapper()
  {
    return modelMapper;
  }


  /**
   * @param parameterMap
   * @return
   */
  private JpqlQuery<E> getQuery(
    MultiValueMap<String, String> parameterMap)
  {
    return new DataTablesJpqlQuery<E>(this.entityClass, parameterMap);
  }


  /**
   * @param <R>
   * @param repository
   */
  protected <R extends JpaRepository<E, ID> & QueryRepository<E, ID>> void init(
    R repository)
  {
    this.queryRepository = repository;
    this.repository = repository;
  }


  /**
   * @param ids
   * @return
   */
  protected boolean isNotEmpty(
    Collection<?> ids)
  {
    return ids != null && !ids.isEmpty();
  }


  /**
   * @param map
   * @return
   */
  public boolean isNotEmpty(
    Map<?, ?> map)
  {
    return map != null && !map.isEmpty();
  }


  /*
   * This is used for the REST CRUD Update action.
   * 
   * @see
   * org.drdeesw.commons.services.CrudService#update(org.drdeesw.commons.models.base.
   * UniqueObject)
   */
  @Override
  public P update(
    P obj)
  {
    E entity = convertPojoToEntity(obj);

    return convertEntityToPojo(this.repository.save(entity));
  }


  /**
   * This is only used to update a Reaction, so expect this to disappear.
   * 
   * @param entity
   * @return
   */
  protected P updateEntity(
    E entity)
  {
    return convertEntityToPojo(this.repository.save(entity));
  }


  /**
   * Update the existing entity's properties using the pojo's properties.
   * Used in saveOrUpdateAll() when we're updating some entities and creating others.
   * 
   * @param entity
   * @param pojo
   */
  protected void updateEntity(
    E entity,
    P pojo)
  {
    this.modelMapper.map(pojo, entity);
  }
}
