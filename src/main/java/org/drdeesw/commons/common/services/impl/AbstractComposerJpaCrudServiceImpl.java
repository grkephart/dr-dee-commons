/**
 * 
 */
package org.drdeesw.commons.common.services.impl;


import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

import org.drdeesw.commons.common.models.entities.UniqueEntity;
import org.drdeesw.commons.common.models.pojos.UniquePojo;
import org.drdeesw.commons.common.queries.JpqlQuery;
import org.drdeesw.commons.common.queries.QueryResults;
import org.drdeesw.commons.common.services.ComposerCrudService;
import org.springframework.util.MultiValueMap;


/**
 * 
 * @author gary_kephart
 *
 * @param <P> the POJO class
 * @param <E> the entity class
 * @param <ID> the ID class
 */
public abstract class AbstractComposerJpaCrudServiceImpl<P extends UniquePojo<ID>, E extends UniqueEntity<ID>, ID extends Serializable>
    extends AbstractJpaCrudServiceImpl<P, E, ID> implements ComposerCrudService<P, ID>
{
  /**
   * @param pojoClass the POJO class
   * @param entityClass the entity class
   */
  protected AbstractComposerJpaCrudServiceImpl(Class<P> pojoClass, Class<E> entityClass)
  {
    super(pojoClass, entityClass);
  }


  /**
   * Sometimes it's more efficient to compose the entire collection at once.
   * May save on calls to other services.
   * 
   * @param values the collection of POJOs
   * @return the collection of composed POJOs
   */
  protected abstract Collection<P> compose(
    Collection<P> values);


  /**
   * 
   * @param pojo the POJO
   * @return the composed POJO
   */
  protected abstract P compose(
    P pojo);


  /**
   * @param queryResults the query results
   * @return the composed query results
   */
  protected QueryResults<P> compose(
    QueryResults<P> queryResults)
  {
    if (super.isNotEmpty(queryResults.getRecords()))
    {
      compose(queryResults.getRecords());
    }

    return queryResults;
  }


  /* (non-Javadoc)
   * @see org.drdeesw.commons.services.impl.AbstractJpaCrudServiceImpl#findById(java.io.Serializable)
   */
  @Override
  public Optional<P> findById(
    ID id)
  {
    Optional<P> optPojo = super.findById(id);

    if (optPojo.isPresent())
      optPojo = Optional.of(compose(optPojo.get()));

    return optPojo;
  }


  /* (non-Javadoc)
   * @see org.drdeesw.commons.services.impl.AbstractJpaCrudServiceImpl#findByQuery(org.springframework.util.MultiValueMap)
   */
  @Override
  public QueryResults<P> findByQuery(
    MultiValueMap<String, String> parameterMap)
  {
    final QueryResults<P> queryResults = super.findByQuery(parameterMap);

    compose(queryResults);

    return queryResults;
  }


  /* (non-Javadoc)
   * @see org.drdeesw.commons.services.impl.AbstractJpaCrudServiceImpl#findByQuery(org.drdeesw.commons.queries.JpqlQuery)
   */
  @Override
  public <Q extends JpqlQuery<P>> QueryResults<P> findByQuery(
    Q query)
  {
    final QueryResults<P> queryResults = super.findByQuery(query);

    compose(queryResults);

    return queryResults;
  }


  /* (non-Javadoc)
   * @see org.drdeesw.commons.services.impl.AbstractJpaCrudServiceImpl#get(java.io.Serializable)
   */
  @Override
  public P get(
    ID id)
  {
    P pojo = super.get(id);

    return compose(pojo);
  }


  /* (non-Javadoc)
   * @see org.drdeesw.commons.services.impl.AbstractJpaCrudServiceImpl#get(java.util.Set)
   */
  @Override
  public QueryResults<P> get(
    Set<ID> ids)
  {
    final QueryResults<P> queryResults = super.get(ids);

    compose(queryResults);

    return queryResults;
  }


  /* (non-Javadoc)
   * @see org.drdeesw.commons.services.impl.AbstractJpaCrudServiceImpl#getMap(java.util.Set)
   */
  @Override
  public Map<ID, P> getMap(
    Set<ID> ids)
  {
    final Map<ID, P> map = super.getMap(ids);

    if (super.isNotEmpty(map))
    {
      compose(map.values());
    }

    return map;
  }

}
