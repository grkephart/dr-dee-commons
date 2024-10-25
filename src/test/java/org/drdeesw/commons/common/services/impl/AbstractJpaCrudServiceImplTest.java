/**
 * 
 */
package org.drdeesw.commons.common.services.impl;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;

import org.drdeesw.commons.common.queries.JpqlQuery;
import org.drdeesw.commons.common.queries.QueryResults;
import org.drdeesw.commons.common.queries.datatables.DataTablesJpqlQuery;
import org.drdeesw.commons.common.repositories.TestUserEntityRepository;
import org.drdeesw.commons.security.models.entities.TestUserEntity;
import org.drdeesw.commons.security.models.pojos.SystemUserPojo;
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
  private static final String                USERNAME = "old username";
  private static final Long                  ID   = Long.valueOf(635);
  private static final String                NAME = "tivti";
  private static final String NEW_USERNAME = "new username";
  private TestableAbstractJpaCrudServiceImpl objectUnderTest;
  private TestUserEntityRepository           repository;

  /**
   * @throws java.lang.Exception
   */
  @BeforeEach
  public void setUp() throws Exception
  {
    this.repository = Mockito.mock(TestUserEntityRepository.class);

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
    SystemUserPojo pojo = new SystemUserPojo();
    TestUserEntity entity = new TestUserEntity();
    TestUserEntity queryEntity = new TestUserEntity();
    List<TestUserEntity> entities = Collections.singletonList(entity);
    List<TestUserEntity> queryEntities = Collections.singletonList(queryEntity);
    List<SystemUserPojo> expected = Collections.singletonList(pojo);

    // Arrange

    pojo.setId(null);
    pojo.setUsername(USERNAME);

    queryEntity.setId(null);
    queryEntity.setUsername(USERNAME);

    entity.setId(ID);
    entity.setUsername(USERNAME);

    Mockito.when(this.repository.saveAllAndFlush(queryEntities)).thenReturn(entities);

    // Act
    List<SystemUserPojo> actuals = this.objectUnderTest.createAndFlush(expected);

    // Assert

    Mockito.verify(this.repository).saveAllAndFlush(queryEntities);

    Assert.assertEquals(1, actuals.size());
    SystemUserPojo actual = actuals.get(0);
    Assert.assertEquals(ID, actual.getId());
    Assert.assertEquals(USERNAME, actual.getUsername());
  }


  /**
   * Test method for {@link org.drdeesw.commons.services.impl.AbstractJpaCrudServiceImpl#createFlush(org.drdeesw.commons.models.pojos.UniquePojo)}.
   */
  @Test
  public void testCreateAndFlushP()
  {
    SystemUserPojo pojo = new SystemUserPojo();
    TestUserEntity entity = new TestUserEntity();

    // Arrange

    pojo.setId(null);
    pojo.setUsername(USERNAME);

    entity.setId(ID);
    entity.setUsername(USERNAME);

    Mockito.when(this.repository.saveAndFlush(Mockito.any(TestUserEntity.class)))
        .thenReturn(entity);

    // Act
    SystemUserPojo actual = this.objectUnderTest.createAndFlush(pojo);

    // Assert

    Mockito.verify(this.repository).saveAndFlush(Mockito.any(TestUserEntity.class));

    Assert.assertEquals(ID, actual.getId());
    Assert.assertEquals(USERNAME, actual.getUsername());
  }


  /**
   * Test method for {@link org.drdeesw.commons.services.impl.AbstractJpaCrudServiceImpl#create(java.util.Collection)}.
   */
  @Test
  public void testCreateCollectionOfP()
  {
    SystemUserPojo pojo = new SystemUserPojo();
    TestUserEntity entity = new TestUserEntity();
    TestUserEntity queryEntity = new TestUserEntity();
    List<TestUserEntity> entities = Collections.singletonList(entity);
    List<TestUserEntity> queryEntities = Collections.singletonList(queryEntity);
    List<SystemUserPojo> expected = Collections.singletonList(pojo);

    // Arrange

    pojo.setId(null);
    pojo.setUsername(USERNAME);

    queryEntity.setId(null);
    queryEntity.setUsername(USERNAME);

    entity.setId(ID);
    entity.setUsername(USERNAME);

    Mockito.when(this.repository.saveAll(queryEntities)).thenReturn(entities);

    // Act
    List<SystemUserPojo> actuals = this.objectUnderTest.create(expected);

    // Assert

    Mockito.verify(this.repository).saveAll(queryEntities);

    Assert.assertEquals(1, actuals.size());
    SystemUserPojo actual = actuals.get(0);
    Assert.assertEquals(ID, actual.getId());
    Assert.assertEquals(USERNAME, actual.getUsername());
  }


  /**
   * Test method for {@link org.drdeesw.commons.services.impl.AbstractJpaCrudServiceImpl#create(org.drdeesw.commons.models.pojos.UniquePojo)}.
   * @throws Exception 
   */
  @Test
  public void testCreateP() throws Exception
  {
    SystemUserPojo pojo = new SystemUserPojo();
    TestUserEntity entity = new TestUserEntity();

    // Arrange

    pojo.setId(null);
    pojo.setUsername(USERNAME);

    entity.setId(ID);
    entity.setUsername(USERNAME);

    Mockito.when(this.repository.save(Mockito.any(TestUserEntity.class))).thenReturn(entity);

    // Act
    SystemUserPojo actual = this.objectUnderTest.create(pojo);

    // Assert

    Mockito.verify(this.repository).save(Mockito.any(TestUserEntity.class));

    Assert.assertEquals(ID, actual.getId());
    Assert.assertEquals(USERNAME, actual.getUsername());
  }


  /**
   * Test method for {@link org.drdeesw.commons.services.impl.AbstractJpaCrudServiceImpl#delete(org.drdeesw.commons.models.pojos.UniquePojo)}.
   */
  @Test
  public void testDelete()
  {
    SystemUserPojo pojo = new SystemUserPojo();
    TestUserEntity entity = new TestUserEntity();

    // Arrange

    pojo.setId(ID);
    pojo.setUsername(USERNAME);

    entity.setId(ID);
    entity.setUsername(USERNAME);

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
    TestUserEntity entity = new TestUserEntity();

    // Arrange

    entity.setId(ID);
    entity.setUsername(USERNAME);

    Mockito.when(this.repository.findById(ID)).thenReturn(Optional.of(entity));

    // Act
    Optional<SystemUserPojo> actual = this.objectUnderTest.findById(ID);

    // Assert

    Mockito.verify(this.repository).findById(ID);

    Assert.assertEquals(true, actual.isPresent());
    Assert.assertEquals(ID, actual.get().getId());
    Assert.assertEquals(USERNAME, actual.get().getUsername());
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
    Optional<SystemUserPojo> actual = this.objectUnderTest.findById(ID);

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
    TestUserEntity entity = new TestUserEntity();
    MultiValueMap<String, String> parameterMap = new HttpHeaders();
    JpqlQuery<TestUserEntity> query = new DataTablesJpqlQuery<TestUserEntity>(TestUserEntity.class,
        parameterMap);
    QueryResults<TestUserEntity> entityQueryResults = new QueryResults<TestUserEntity>(
        Collections.singletonList(entity));

    // Arrange

    entity.setId(ID);
    entity.setUsername(USERNAME);

    Mockito.when(this.repository.findByQuery(query)).thenReturn(entityQueryResults);

    // Act
    QueryResults<SystemUserPojo> pojoQueryResults = this.objectUnderTest.findByQuery(parameterMap);

    // Assert

    Mockito.verify(this.repository).findByQuery(query);

    Assert.assertEquals(1, pojoQueryResults.getSize());
    SystemUserPojo pojo = pojoQueryResults.get(0);

    Assert.assertEquals(ID, pojo.getId());
    Assert.assertEquals(USERNAME, pojo.getUsername());
  }


  /**
   * Test method for {@link org.drdeesw.commons.services.impl.AbstractJpaCrudServiceImpl#findByQuery(org.drdeesw.commons.queries.JpqlQuery)}.
   */
  @Test
  public void testFindByQueryQ()
  {

    TestUserEntity entity = new TestUserEntity();
    JpqlQuery<SystemUserPojo> pojoQuery = new JpqlQuery<SystemUserPojo>(SystemUserPojo.class)//
        .equals("name", NAME);
    JpqlQuery<TestUserEntity> entityQuery = new JpqlQuery<TestUserEntity>(TestUserEntity.class,
        pojoQuery);
    TestUserEntity[] expected = new TestUserEntity[] { entity };
    QueryResults<TestUserEntity> queryResults = new QueryResults<TestUserEntity>(expected);

    // Arrange

    entity.setId(ID);
    entity.setUsername(USERNAME);

    Mockito.when(this.repository.findByQuery(entityQuery)).thenReturn(queryResults);

    // Act
    QueryResults<SystemUserPojo> actualQueryResults = this.objectUnderTest.findByQuery(pojoQuery);

    // Assert

    Mockito.verify(this.repository).findByQuery(entityQuery);

    Assert.assertEquals(1, actualQueryResults.getRecordsTotal());
    SystemUserPojo actual = actualQueryResults.get(0);
    Assert.assertEquals(ID, actual.getId());
    Assert.assertEquals(USERNAME, actual.getUsername());
  }


  /**
   * Test method for {@link org.drdeesw.commons.services.impl.AbstractJpaCrudServiceImpl#findEntities(org.drdeesw.commons.queries.JpqlQuery)}.
   */
  @Test
  public void testFindEntities()
  {
    TestUserEntity entity = new TestUserEntity();
    JpqlQuery<TestUserEntity> entityQuery = new JpqlQuery<TestUserEntity>(TestUserEntity.class)//
        .equals("name", NAME);
    QueryResults<TestUserEntity> expected = new QueryResults<>(Collections.singletonList(entity));

    // Arrange

    entity.setId(ID);
    entity.setUsername(USERNAME);

    Mockito.when(this.repository.findByQuery(entityQuery)).thenReturn(expected);

    // Act
    QueryResults<TestUserEntity> actual = this.objectUnderTest.findEntities(entityQuery);

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
    TestUserEntity entity = new TestUserEntity();

    // Arrange

    entity.setId(ID);
    entity.setUsername(USERNAME);

    Mockito.when(this.repository.getReferenceById(ID)).thenReturn(entity);

    // Act
    SystemUserPojo actual = this.objectUnderTest.get(ID);

    // Assert

    Mockito.verify(this.repository).getReferenceById(ID);

    Assert.assertEquals(ID, actual.getId());
    Assert.assertEquals(USERNAME, actual.getUsername());
  }


  /**
   * Test method for {@link org.drdeesw.commons.services.impl.AbstractJpaCrudServiceImpl#getMap(java.util.Set)}.
   */
  @Test
  public void testGetMap()
  {
    TestUserEntity entity = new TestUserEntity();
    Set<Long> ids = new HashSet<>(Collections.singleton(ID));
    SystemUserPojo actual;
    JpqlQuery<TestUserEntity> query = new JpqlQuery<TestUserEntity>(TestUserEntity.class)//
        .in("id", ids);
    TestUserEntity[] expected = new TestUserEntity[] { entity };
    QueryResults<TestUserEntity> queryResults = new QueryResults<TestUserEntity>(expected);

    // Arrange

    entity.setId(ID);
    entity.setUsername(USERNAME);

    Mockito.when(this.repository.findByQuery(query)).thenReturn(queryResults);

    // Act
    Map<Long, SystemUserPojo> actuals = this.objectUnderTest.getMap(ids);

    // Assert

    Mockito.verify(this.repository).findByQuery(query);

    Assert.assertEquals(ids.size(), actuals.entrySet().size());
    actual = actuals.get(ID);
    Assert.assertEquals(ID, actual.getId());
    Assert.assertEquals(USERNAME, actual.getUsername());
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
    TestUserEntity entity = new TestUserEntity();
    Set<Long> ids = new HashSet<>(Collections.singleton(ID));
    SystemUserPojo actual;
    JpqlQuery<TestUserEntity> query = new JpqlQuery<TestUserEntity>(TestUserEntity.class)//
        .in("id", ids);
    TestUserEntity[] expected = new TestUserEntity[] { entity };
    QueryResults<TestUserEntity> queryResults = new QueryResults<TestUserEntity>(expected);

    // Arrange

    entity.setId(ID);
    entity.setUsername(USERNAME);

    Mockito.when(this.repository.findByQuery(query)).thenReturn(queryResults);

    // Act
    QueryResults<SystemUserPojo> actuals = this.objectUnderTest.get(ids);

    // Assert

    Mockito.verify(this.repository).findByQuery(query);

    Assert.assertEquals(ids.size(), actuals.getSize());
    actual = actuals.get(0);
    Assert.assertEquals(ID, actual.getId());
    Assert.assertEquals(USERNAME, actual.getUsername());
  }


  /**
   * Test method for {@link org.drdeesw.commons.services.impl.AbstractJpaCrudServiceImpl#isNotEmpty(java.util.Map)}.
   */
  @Test
  public void testIsNotEmptyMapOfQQWhenFalse()
  {
    Map<Long, SystemUserPojo> map = new HashMap<>();
    SystemUserPojo pojo = new SystemUserPojo();

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
    Map<Long, SystemUserPojo> map = new HashMap<>();

    // Arrange

    // Act
    boolean actual = this.objectUnderTest.isNotEmpty(map);

    // Assert
    Assert.assertEquals(false, actual);
  }


  /**
   * Test method for {@link org.drdeesw.commons.services.impl.AbstractJpaCrudServiceImpl#createOrUpdateAll(java.util.List, java.util.function.Function, java.util.function.Function, java.lang.String)}.
   * @throws Exception 
   */
  @Test
  public void testCreateOrUpdateAllWithAllExisting() throws Exception
  {
    SystemUserPojo pojo = new SystemUserPojo();
    TestUserEntity entity = new TestUserEntity();
    List<SystemUserPojo> all = new ArrayList<>(Collections.singletonList(pojo));
    Function<SystemUserPojo, Long> pojoKeyMapper = SystemUserPojo::getId;
    Function<TestUserEntity, Long> entityKeyMapper = TestUserEntity::getId;
    String idFieldName = "id";
    Set<Long> keySet = Sets.newSet(ID);
    JpqlQuery<TestUserEntity> query = new JpqlQuery<TestUserEntity>(TestUserEntity.class)//
        .in(idFieldName, keySet);
    QueryResults<TestUserEntity> existingEntities = new QueryResults<TestUserEntity>(
        Collections.singletonList(entity));

    // Arrange

    pojo.setId(ID);
    pojo.setUsername(NEW_USERNAME);

    entity.setId(ID);
    entity.setUsername(USERNAME);

    Mockito.when(this.repository.findByQuery(query)).thenReturn(existingEntities);

    // Act
    this.objectUnderTest.createOrUpdateAll(all, pojoKeyMapper, entityKeyMapper, idFieldName);

    // Assert

    //Mockito.verify(this.repository).findByQuery(query);
    Mockito.verify(this.repository).saveAll(existingEntities);

    TestUserEntity updatedEntity = existingEntities.get(0);
    Assert.assertEquals(ID, updatedEntity.getId());
    Assert.assertEquals(NEW_USERNAME, updatedEntity.getUsername());
  }


  /**
   * Test method for {@link org.drdeesw.commons.services.impl.AbstractJpaCrudServiceImpl#update(org.drdeesw.commons.models.pojos.UniquePojo)}.
   */
  @Test
  public void testUpdate()
  {
    SystemUserPojo pojo = new SystemUserPojo();
    TestUserEntity entity = new TestUserEntity();

    // Arrange

    pojo.setId(ID);
    pojo.setUsername(USERNAME);

    entity.setId(ID);
    entity.setUsername(USERNAME);

    Mockito.when(this.repository.save(entity)).thenReturn(entity);

    // Act
    SystemUserPojo updatedPojo = this.objectUnderTest.update(pojo);

    // Assert

    Mockito.verify(this.repository).save(entity);
  }

}
