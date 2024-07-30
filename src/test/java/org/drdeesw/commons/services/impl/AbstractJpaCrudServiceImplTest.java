/**
 * 
 */
package org.drdeesw.commons.services.impl;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;

import org.drdeesw.commons.models.SomeEntity;
import org.drdeesw.commons.models.SomePojo;
import org.drdeesw.commons.queries.JpqlQuery;
import org.drdeesw.commons.queries.QueryResults;
import org.drdeesw.commons.queries.datatables.DataTablesJpqlQuery;
import org.drdeesw.commons.repositories.SomeRepository;
import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.internal.util.collections.Sets;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpHeaders;
import org.springframework.util.MultiValueMap;


/**
 * @author gary_kephart
 *
 */
public class AbstractJpaCrudServiceImplTest
{
  private static final String                DESCRIPTION = "tw4 df i5lg4yg k5 kt5h";
  private static final Long                  ID          = Long.valueOf(635);
  private static final String                NAME        = "tivti";
  private TestableAbstractJpaCrudServiceImpl objectUnderTest;
  private SomeRepository                     repository;

  /**
   * @throws java.lang.Exception
   */
  @BeforeEach
  public void setUp() throws Exception
  {
    this.repository = Mockito.mock(SomeRepository.class);

    this.objectUnderTest = new TestableAbstractJpaCrudServiceImpl();

    this.objectUnderTest.init(this.repository);
  }


  /**
   * @throws java.lang.Exception
   */
  @AfterEach
  public void tearDown() throws Exception
  {
  }


  /**
   * Test method for {@link org.drdeesw.commons.services.impl.AbstractJpaCrudServiceImpl#createAndFlush(java.util.Collection)}.
   */
  @Test
  public void testCreateAndFlushCollectionOfP()
  {
    SomePojo pojo = new SomePojo();
    SomeEntity entity = new SomeEntity();
    SomeEntity queryEntity = new SomeEntity();
    List<SomeEntity> entities = Collections.singletonList(entity);
    List<SomeEntity> queryEntities = Collections.singletonList(queryEntity);
    List<SomePojo> expected = Collections.singletonList(pojo);

    // Arrange

    pojo.setId(null);
    pojo.setName(NAME);
    pojo.setDescription(DESCRIPTION);

    queryEntity.setId(null);
    queryEntity.setName(NAME);
    queryEntity.setDescription(DESCRIPTION);

    entity.setId(ID);
    entity.setName(NAME);
    entity.setDescription(DESCRIPTION);

    Mockito.when(this.repository.saveAllAndFlush(queryEntities)).thenReturn(entities);

    // Act
    List<SomePojo> actuals = this.objectUnderTest.createAndFlush(expected);

    // Assert

    Mockito.verify(this.repository).saveAllAndFlush(queryEntities);

    Assert.assertEquals(1, actuals.size());
    SomePojo actual = actuals.get(0);
    Assert.assertEquals(ID, actual.getId());
    Assert.assertEquals(NAME, actual.getName());
    Assert.assertEquals(DESCRIPTION, actual.getDescription());
  }


  /**
   * Test method for {@link org.drdeesw.commons.services.impl.AbstractJpaCrudServiceImpl#createFlush(org.drdeesw.commons.models.pojos.UniquePojo)}.
   */
  @Test
  public void testCreateAndFlushP()
  {
    SomePojo pojo = new SomePojo();
    SomeEntity entity = new SomeEntity();

    // Arrange

    pojo.setId(null);
    pojo.setName(NAME);
    pojo.setDescription(DESCRIPTION);

    entity.setId(ID);
    entity.setName(NAME);
    entity.setDescription(DESCRIPTION);

    Mockito.when(this.repository.saveAndFlush(Mockito.any(SomeEntity.class))).thenReturn(entity);

    // Act
    SomePojo actual = this.objectUnderTest.createAndFlush(pojo);

    // Assert

    Mockito.verify(this.repository).saveAndFlush(Mockito.any(SomeEntity.class));

    Assert.assertEquals(ID, actual.getId());
    Assert.assertEquals(NAME, actual.getName());
    Assert.assertEquals(DESCRIPTION, actual.getDescription());
  }


  /**
   * Test method for {@link org.drdeesw.commons.services.impl.AbstractJpaCrudServiceImpl#create(java.util.Collection)}.
   */
  @Test
  public void testCreateCollectionOfP()
  {
    SomePojo pojo = new SomePojo();
    SomeEntity entity = new SomeEntity();
    SomeEntity queryEntity = new SomeEntity();
    List<SomeEntity> entities = Collections.singletonList(entity);
    List<SomeEntity> queryEntities = Collections.singletonList(queryEntity);
    List<SomePojo> expected = Collections.singletonList(pojo);

    // Arrange

    pojo.setId(null);
    pojo.setName(NAME);
    pojo.setDescription(DESCRIPTION);

    queryEntity.setId(null);
    queryEntity.setName(NAME);
    queryEntity.setDescription(DESCRIPTION);

    entity.setId(ID);
    entity.setName(NAME);
    entity.setDescription(DESCRIPTION);

    Mockito.when(this.repository.saveAll(queryEntities)).thenReturn(entities);

    // Act
    List<SomePojo> actuals = this.objectUnderTest.create(expected);

    // Assert

    Mockito.verify(this.repository).saveAll(queryEntities);

    Assert.assertEquals(1, actuals.size());
    SomePojo actual = actuals.get(0);
    Assert.assertEquals(ID, actual.getId());
    Assert.assertEquals(NAME, actual.getName());
    Assert.assertEquals(DESCRIPTION, actual.getDescription());
  }


  /**
   * Test method for {@link org.drdeesw.commons.services.impl.AbstractJpaCrudServiceImpl#create(org.drdeesw.commons.models.pojos.UniquePojo)}.
   * @throws Exception 
   */
  @Test
  public void testCreateP() throws Exception
  {
    SomePojo pojo = new SomePojo();
    SomeEntity entity = new SomeEntity();

    // Arrange

    pojo.setId(null);
    pojo.setName(NAME);
    pojo.setDescription(DESCRIPTION);

    entity.setId(ID);
    entity.setName(NAME);
    entity.setDescription(DESCRIPTION);

    Mockito.when(this.repository.save(Mockito.any(SomeEntity.class))).thenReturn(entity);

    // Act
    SomePojo actual = this.objectUnderTest.create(pojo);

    // Assert

    Mockito.verify(this.repository).save(Mockito.any(SomeEntity.class));

    Assert.assertEquals(ID, actual.getId());
    Assert.assertEquals(NAME, actual.getName());
    Assert.assertEquals(DESCRIPTION, actual.getDescription());
  }


  /**
   * Test method for {@link org.drdeesw.commons.services.impl.AbstractJpaCrudServiceImpl#delete(org.drdeesw.commons.models.pojos.UniquePojo)}.
   */
  @Test
  public void testDelete()
  {
    SomePojo pojo = new SomePojo();
    SomeEntity entity = new SomeEntity();

    // Arrange

    pojo.setId(ID);
    pojo.setName(NAME);
    pojo.setDescription(DESCRIPTION);

    entity.setId(ID);
    entity.setName(NAME);
    entity.setDescription(DESCRIPTION);

    // Act
    this.objectUnderTest.delete(pojo);

    // Assert

    Mockito.verify(this.repository).delete(entity);
  }


  /**
   * Test method for {@link org.drdeesw.commons.services.impl.AbstractJpaCrudServiceImpl#findById(java.io.Serializable)}.
   */
  @Test
  public void testFindByIdWhenPresent()
  {
    SomeEntity entity = new SomeEntity();

    // Arrange

    entity.setId(ID);
    entity.setName(NAME);
    entity.setDescription(DESCRIPTION);

    Mockito.when(this.repository.findById(ID)).thenReturn(Optional.of(entity));

    // Act
    Optional<SomePojo> actual = this.objectUnderTest.findById(ID);

    // Assert

    Mockito.verify(this.repository).findById(ID);

    Assert.assertEquals(true, actual.isPresent());
    Assert.assertEquals(ID, actual.get().getId());
    Assert.assertEquals(DESCRIPTION, actual.get().getDescription());
    Assert.assertEquals(NAME, actual.get().getName());
  }


  /**
   * Test method for {@link org.drdeesw.commons.services.impl.AbstractJpaCrudServiceImpl#findById(java.io.Serializable)}.
   */
  @Test
  public void testFindByIdWhenEmpty()
  {
    // Arrange

    Mockito.when(this.repository.findById(ID)).thenReturn(Optional.empty());

    // Act
    Optional<SomePojo> actual = this.objectUnderTest.findById(ID);

    // Assert

    Mockito.verify(this.repository).findById(ID);

    Assert.assertEquals(true, actual.isEmpty());
  }


  /**
   * Test method for {@link org.drdeesw.commons.services.impl.AbstractJpaCrudServiceImpl#findByQuery(org.springframework.util.MultiValueMap)}.
   */
  @Test
  public void testFindByQueryMultiValueMapOfStringString()
  {
    SomeEntity entity = new SomeEntity();
    MultiValueMap<String, String> parameterMap = new HttpHeaders();
    JpqlQuery<SomeEntity> query = new DataTablesJpqlQuery<SomeEntity>(SomeEntity.class,
        parameterMap);
    QueryResults<SomeEntity> entityQueryResults = new QueryResults<SomeEntity>(
        Collections.singletonList(entity));

    // Arrange

    entity.setId(ID);
    entity.setName(NAME);
    entity.setDescription(DESCRIPTION);

    Mockito.when(this.repository.findByQuery(query)).thenReturn(entityQueryResults);

    // Act
    QueryResults<SomePojo> pojoQueryResults = this.objectUnderTest.findByQuery(parameterMap);

    // Assert

    Mockito.verify(this.repository).findByQuery(query);

    Assert.assertEquals(1, pojoQueryResults.getSize());
    SomePojo pojo = pojoQueryResults.get(0);
    
    Assert.assertEquals(ID, pojo.getId());
    Assert.assertEquals(DESCRIPTION, pojo.getDescription());
    Assert.assertEquals(NAME, pojo.getName());
  }


  /**
   * Test method for {@link org.drdeesw.commons.services.impl.AbstractJpaCrudServiceImpl#findByQuery(org.drdeesw.commons.queries.JpqlQuery)}.
   */
  @Test
  public void testFindByQueryQ()
  {

    SomeEntity entity = new SomeEntity();
    JpqlQuery<SomePojo> pojoQuery = new JpqlQuery<SomePojo>(SomePojo.class)//
        .equals("name", NAME);
    JpqlQuery<SomeEntity> entityQuery = new JpqlQuery<SomeEntity>(SomeEntity.class, pojoQuery);
    SomeEntity[] expected = new SomeEntity[] { entity };
    QueryResults<SomeEntity> queryResults = new QueryResults<SomeEntity>(expected);

    // Arrange

    entity.setId(ID);
    entity.setName(NAME);
    entity.setDescription(DESCRIPTION);

    Mockito.when(this.repository.findByQuery(entityQuery)).thenReturn(queryResults);

    // Act
    QueryResults<SomePojo> actualQueryResults = this.objectUnderTest.findByQuery(pojoQuery);

    // Assert

    Mockito.verify(this.repository).findByQuery(entityQuery);

    Assert.assertEquals(1, actualQueryResults.getRecordsTotal());
    SomePojo actual = actualQueryResults.get(0);
    Assert.assertEquals(ID, actual.getId());
    Assert.assertEquals(DESCRIPTION, actual.getDescription());
    Assert.assertEquals(NAME, actual.getName());
  }


  /**
   * Test method for {@link org.drdeesw.commons.services.impl.AbstractJpaCrudServiceImpl#findEntities(org.drdeesw.commons.queries.JpqlQuery)}.
   */
  @Test
  public void testFindEntities()
  {
    SomeEntity entity = new SomeEntity();
    JpqlQuery<SomeEntity> entityQuery = new JpqlQuery<SomeEntity>(SomeEntity.class)//
        .equals("name", NAME);
    QueryResults<SomeEntity> expected = new QueryResults<>(Collections.singletonList(entity));

    // Arrange

    entity.setId(ID);
    entity.setName(NAME);
    entity.setDescription(DESCRIPTION);

    Mockito.when(this.repository.findByQuery(entityQuery)).thenReturn(expected);

    // Act
    QueryResults<SomeEntity> actual = this.objectUnderTest.findEntities(entityQuery);

    // Assert

    Mockito.verify(this.repository).findByQuery(entityQuery);

    Assert.assertEquals(expected, actual);
  }


  /**
   * Test method for {@link org.drdeesw.commons.services.impl.AbstractJpaCrudServiceImpl#get(java.io.Serializable)}.
   */
  @Test
  public void testGetID()
  {
    SomeEntity entity = new SomeEntity();

    // Arrange

    entity.setId(ID);
    entity.setName(NAME);
    entity.setDescription(DESCRIPTION);

    Mockito.when(this.repository.getReferenceById(ID)).thenReturn(entity);

    // Act
    SomePojo actual = this.objectUnderTest.get(ID);

    // Assert

    Mockito.verify(this.repository).getReferenceById(ID);

    Assert.assertEquals(ID, actual.getId());
    Assert.assertEquals(NAME, actual.getName());
    Assert.assertEquals(DESCRIPTION, actual.getDescription());
  }


  /**
   * Test method for {@link org.drdeesw.commons.services.impl.AbstractJpaCrudServiceImpl#getMap(java.util.Set)}.
   */
  @Test
  public void testGetMap()
  {
    SomeEntity entity = new SomeEntity();
    Set<Long> ids = new HashSet<>(Collections.singleton(ID));
    SomePojo actual;
    JpqlQuery<SomeEntity> query = new JpqlQuery<SomeEntity>(SomeEntity.class)//
        .in("id", ids);
    SomeEntity[] expected = new SomeEntity[] { entity };
    QueryResults<SomeEntity> queryResults = new QueryResults<SomeEntity>(expected);

    // Arrange

    entity.setId(ID);
    entity.setName(NAME);
    entity.setDescription(DESCRIPTION);

    Mockito.when(this.repository.findByQuery(query)).thenReturn(queryResults);

    // Act
    Map<Long, SomePojo> actuals = this.objectUnderTest.getMap(ids);

    // Assert

    Mockito.verify(this.repository).findByQuery(query);

    Assert.assertEquals(ids.size(), actuals.entrySet().size());
    actual = actuals.get(ID);
    Assert.assertEquals(ID, actual.getId());
    Assert.assertEquals(DESCRIPTION, actual.getDescription());
    Assert.assertEquals(NAME, actual.getName());
  }


  /**
   * Test method for {@link org.drdeesw.commons.services.impl.AbstractJpaCrudServiceImpl#getModelMapper()}.
   */
  @Test
  public void testGetModelMapper()
  {

    // Arrange

    // Act
    ModelMapper modelMapper = this.objectUnderTest.getModelMapper();

    // Assert
    Assert.assertNotNull(modelMapper);
  }


  /**
   * Test method for {@link org.drdeesw.commons.services.impl.AbstractJpaCrudServiceImpl#get(java.util.Set)}.
   */
  @Test
  public void testGetSetOfID()
  {
    SomeEntity entity = new SomeEntity();
    Set<Long> ids = new HashSet<>(Collections.singleton(ID));
    SomePojo actual;
    JpqlQuery<SomeEntity> query = new JpqlQuery<SomeEntity>(SomeEntity.class)//
        .in("id", ids);
    SomeEntity[] expected = new SomeEntity[] { entity };
    QueryResults<SomeEntity> queryResults = new QueryResults<SomeEntity>(expected);

    // Arrange

    entity.setId(ID);
    entity.setName(NAME);
    entity.setDescription(DESCRIPTION);

    Mockito.when(this.repository.findByQuery(query)).thenReturn(queryResults);

    // Act
    QueryResults<SomePojo> actuals = this.objectUnderTest.get(ids);

    // Assert

    Mockito.verify(this.repository).findByQuery(query);

    Assert.assertEquals(ids.size(), actuals.getSize());
    actual = actuals.get(0);
    Assert.assertEquals(ID, actual.getId());
    Assert.assertEquals(DESCRIPTION, actual.getDescription());
    Assert.assertEquals(NAME, actual.getName());
  }


  /**
   * Test method for {@link org.drdeesw.commons.services.impl.AbstractJpaCrudServiceImpl#isNotEmpty(java.util.Map)}.
   */
  @Test
  public void testIsNotEmptyMapOfQQWhenFalse()
  {
    Map<Long, SomePojo> map = new HashMap<>();
    SomePojo pojo = new SomePojo();

    // Arrange

    map.put(ID, pojo);

    // Act
    boolean actual = this.objectUnderTest.isNotEmpty(map);

    // Assert
    Assert.assertEquals(true, actual);
  }


  /**
   * Test method for {@link org.drdeesw.commons.services.impl.AbstractJpaCrudServiceImpl#isNotEmpty(java.util.Map)}.
   */
  @Test
  public void testIsNotEmptyMapOfQQWhenTrue()
  {
    Map<Long, SomePojo> map = new HashMap<>();

    // Arrange

    // Act
    boolean actual = this.objectUnderTest.isNotEmpty(map);

    // Assert
    Assert.assertEquals(false, actual);
  }


  /**
   * Test method for {@link org.drdeesw.commons.services.impl.AbstractJpaCrudServiceImpl#saveOrUpdateAll(java.util.List, java.util.function.Function, java.util.function.Function, java.lang.String)}.
   * @throws Exception 
   */
  @Test
  public void testSaveOrUpdateAll() throws Exception
  {
    SomePojo pojo = new SomePojo();
    SomeEntity entity = new SomeEntity();
    List<SomePojo> all = new ArrayList<>(Collections.singletonList(pojo));
    Function<SomePojo, Long> pojoKeyMapper = SomePojo::getId;
    Function<SomeEntity, Long> entityKeyMapper = SomeEntity::getId;
    String fieldName = "id";
    Set<Long> keySet = Sets.newSet(ID);
    JpqlQuery<SomeEntity> query = new JpqlQuery<SomeEntity>(SomeEntity.class)//
        .in(fieldName, keySet);
    QueryResults<SomeEntity> existingEntities = new QueryResults<SomeEntity>(
        Collections.singletonList(entity));

    // Arrange

    pojo.setId(ID);
    pojo.setName(NAME);
    pojo.setDescription(DESCRIPTION);

    entity.setId(ID);
    entity.setName(NAME);
    entity.setDescription(DESCRIPTION);

    Mockito.when(this.repository.findByQuery(query)).thenReturn(existingEntities);

    // Act
    this.objectUnderTest.saveOrUpdateAll(all, pojoKeyMapper, entityKeyMapper, fieldName);

    // Assert

    //Mockito.verify(this.repository).findByQuery(query);
    Mockito.verify(this.repository).saveAll(existingEntities);

  }


  /**
   * Test method for {@link org.drdeesw.commons.services.impl.AbstractJpaCrudServiceImpl#update(org.drdeesw.commons.models.pojos.UniquePojo)}.
   */
  @Test
  public void testUpdate()
  {
    SomePojo pojo = new SomePojo();
    SomeEntity entity = new SomeEntity();

    // Arrange

    pojo.setId(ID);
    pojo.setName(NAME);
    pojo.setDescription(DESCRIPTION);

    entity.setId(ID);
    entity.setName(NAME);
    entity.setDescription(DESCRIPTION);

    Mockito.when(this.repository.save(entity)).thenReturn(entity);

    // Act
    SomePojo updatedPojo = this.objectUnderTest.update(pojo);

    // Assert

    Mockito.verify(this.repository).save(entity);
  }

}
