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
import org.drdeesw.commons.security.models.entities.UserEntity;
import org.drdeesw.commons.security.models.pojos.UserPojo;
import org.drdeesw.commons.security.repositories.UserRepository;
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
  private static final String                USERNAME     = "old username";
  private static final Long                  ID           = Long.valueOf(635);
  private static final String                NAME         = "tivti";
  private static final String                NEW_USERNAME = "new username";
  private TestableAbstractJpaCrudServiceImpl objectUnderTest;
  private UserRepository                     repository;

  /**
   * @throws java.lang.Exception
   */
  @BeforeEach
  public void setUp() throws Exception
  {
    this.repository = Mockito.mock(UserRepository.class);

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
    UserPojo pojo = new UserPojo();
    UserEntity entity = new UserEntity();
    UserEntity queryEntity = new UserEntity();
    List<UserEntity> entities = Collections.singletonList(entity);
    List<UserEntity> queryEntities = Collections.singletonList(queryEntity);
    List<UserPojo> expected = Collections.singletonList(pojo);

    // Arrange

    pojo.setId(null);
    pojo.setUsername(USERNAME);

    queryEntity.setId(null);
    queryEntity.setUsername(USERNAME);

    entity.setId(ID);
    entity.setUsername(USERNAME);

    Mockito.when(this.repository.saveAllAndFlush(queryEntities)).thenReturn(entities);

    // Act
    List<UserPojo> actuals = this.objectUnderTest.createAndFlush(expected);

    // Assert

    Mockito.verify(this.repository).saveAllAndFlush(queryEntities);

    Assert.assertEquals(1, actuals.size());
    UserPojo actual = actuals.get(0);
    Assert.assertEquals(ID, actual.getId());
    Assert.assertEquals(USERNAME, actual.getUsername());
  }


  /**
   * Test method for {@link org.drdeesw.commons.services.impl.AbstractJpaCrudServiceImpl#createFlush(org.drdeesw.commons.models.pojos.UniquePojo)}.
   */
  @Test
  public void testCreateAndFlushP()
  {
    UserPojo pojo = new UserPojo();
    UserEntity entity = new UserEntity();

    // Arrange

    pojo.setId(null);
    pojo.setUsername(USERNAME);

    entity.setId(ID);
    entity.setUsername(USERNAME);

    Mockito.when(this.repository.saveAndFlush(Mockito.any(UserEntity.class))).thenReturn(entity);

    // Act
    UserPojo actual = this.objectUnderTest.createAndFlush(pojo);

    // Assert

    Mockito.verify(this.repository).saveAndFlush(Mockito.any(UserEntity.class));

    Assert.assertEquals(ID, actual.getId());
    Assert.assertEquals(USERNAME, actual.getUsername());
  }


  /**
   * Test method for {@link org.drdeesw.commons.services.impl.AbstractJpaCrudServiceImpl#create(java.util.Collection)}.
   */
  @Test
  public void testCreateCollectionOfP()
  {
    UserPojo pojo = new UserPojo();
    UserEntity entity = new UserEntity();
    UserEntity queryEntity = new UserEntity();
    List<UserEntity> entities = Collections.singletonList(entity);
    List<UserEntity> queryEntities = Collections.singletonList(queryEntity);
    List<UserPojo> expected = Collections.singletonList(pojo);

    // Arrange

    pojo.setId(null);
    pojo.setUsername(USERNAME);

    queryEntity.setId(null);
    queryEntity.setUsername(USERNAME);

    entity.setId(ID);
    entity.setUsername(USERNAME);

    Mockito.when(this.repository.saveAll(queryEntities)).thenReturn(entities);

    // Act
    List<UserPojo> actuals = this.objectUnderTest.create(expected);

    // Assert

    Mockito.verify(this.repository).saveAll(queryEntities);

    Assert.assertEquals(1, actuals.size());
    UserPojo actual = actuals.get(0);
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
    UserPojo pojo = new UserPojo();
    UserEntity entity = new UserEntity();

    // Arrange

    pojo.setId(null);
    pojo.setUsername(USERNAME);

    entity.setId(ID);
    entity.setUsername(USERNAME);

    Mockito.when(this.repository.save(Mockito.any(UserEntity.class))).thenReturn(entity);

    // Act
    UserPojo actual = this.objectUnderTest.create(pojo);

    // Assert

    Mockito.verify(this.repository).save(Mockito.any(UserEntity.class));

    Assert.assertEquals(ID, actual.getId());
    Assert.assertEquals(USERNAME, actual.getUsername());
  }


  /**
   * Test method for {@link org.drdeesw.commons.services.impl.AbstractJpaCrudServiceImpl#delete(org.drdeesw.commons.models.pojos.UniquePojo)}.
   */
  @Test
  public void testDelete()
  {
    UserPojo pojo = new UserPojo();
    UserEntity entity = new UserEntity();

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
    UserEntity entity = new UserEntity();

    // Arrange

    entity.setId(ID);
    entity.setUsername(USERNAME);

    Mockito.when(this.repository.findById(ID)).thenReturn(Optional.of(entity));

    // Act
    Optional<UserPojo> actual = this.objectUnderTest.findById(ID);

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
    Optional<UserPojo> actual = this.objectUnderTest.findById(ID);

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
    UserEntity entity = new UserEntity();
    MultiValueMap<String, String> parameterMap = new HttpHeaders();
    JpqlQuery<UserEntity> query = new DataTablesJpqlQuery<UserEntity>(UserEntity.class,
        parameterMap);
    QueryResults<UserEntity> entityQueryResults = new QueryResults<UserEntity>(
        Collections.singletonList(entity));

    // Arrange

    entity.setId(ID);
    entity.setUsername(USERNAME);

    Mockito.when(this.repository.findByQuery(query)).thenReturn(entityQueryResults);

    // Act
    QueryResults<UserPojo> pojoQueryResults = this.objectUnderTest.findByQuery(parameterMap);

    // Assert

    Mockito.verify(this.repository).findByQuery(query);

    Assert.assertEquals(1, pojoQueryResults.getSize());
    UserPojo pojo = pojoQueryResults.get(0);

    Assert.assertEquals(ID, pojo.getId());
    Assert.assertEquals(USERNAME, pojo.getUsername());
  }


  /**
   * Test method for {@link org.drdeesw.commons.services.impl.AbstractJpaCrudServiceImpl#findByQuery(org.drdeesw.commons.queries.JpqlQuery)}.
   */
  @Test
  public void testFindByQueryQ()
  {

    UserEntity entity = new UserEntity();
    JpqlQuery<UserPojo> pojoQuery = new JpqlQuery<UserPojo>(UserPojo.class)//
        .equals("name", NAME);
    JpqlQuery<UserEntity> entityQuery = new JpqlQuery<UserEntity>(UserEntity.class, pojoQuery);
    UserEntity[] expected = new UserEntity[] { entity };
    QueryResults<UserEntity> queryResults = new QueryResults<UserEntity>(expected);

    // Arrange

    entity.setId(ID);
    entity.setUsername(USERNAME);

    Mockito.when(this.repository.findByQuery(entityQuery)).thenReturn(queryResults);

    // Act
    QueryResults<UserPojo> actualQueryResults = this.objectUnderTest.findByQuery(pojoQuery);

    // Assert

    Mockito.verify(this.repository).findByQuery(entityQuery);

    Assert.assertEquals(1, actualQueryResults.getRecordsTotal());
    UserPojo actual = actualQueryResults.get(0);
    Assert.assertEquals(ID, actual.getId());
    Assert.assertEquals(USERNAME, actual.getUsername());
  }


  /**
   * Test method for {@link org.drdeesw.commons.services.impl.AbstractJpaCrudServiceImpl#findEntities(org.drdeesw.commons.queries.JpqlQuery)}.
   */
  @Test
  public void testFindEntities()
  {
    UserEntity entity = new UserEntity();
    JpqlQuery<UserEntity> entityQuery = new JpqlQuery<UserEntity>(UserEntity.class)//
        .equals("name", NAME);
    QueryResults<UserEntity> expected = new QueryResults<>(Collections.singletonList(entity));

    // Arrange

    entity.setId(ID);
    entity.setUsername(USERNAME);

    Mockito.when(this.repository.findByQuery(entityQuery)).thenReturn(expected);

    // Act
    QueryResults<UserEntity> actual = this.objectUnderTest.findEntities(entityQuery);

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
    UserEntity entity = new UserEntity();

    // Arrange

    entity.setId(ID);
    entity.setUsername(USERNAME);

    Mockito.when(this.repository.getReferenceById(ID)).thenReturn(entity);

    // Act
    UserPojo actual = this.objectUnderTest.get(ID);

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
    UserEntity entity = new UserEntity();
    Set<Long> ids = new HashSet<>(Collections.singleton(ID));
    UserPojo actual;
    JpqlQuery<UserEntity> query = new JpqlQuery<UserEntity>(UserEntity.class)//
        .in("id", ids);
    UserEntity[] expected = new UserEntity[] { entity };
    QueryResults<UserEntity> queryResults = new QueryResults<UserEntity>(expected);

    // Arrange

    entity.setId(ID);
    entity.setUsername(USERNAME);

    Mockito.when(this.repository.findByQuery(query)).thenReturn(queryResults);

    // Act
    Map<Long, UserPojo> actuals = this.objectUnderTest.getMap(ids);

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
    UserEntity entity = new UserEntity();
    Set<Long> ids = new HashSet<>(Collections.singleton(ID));
    UserPojo actual;
    JpqlQuery<UserEntity> query = new JpqlQuery<UserEntity>(UserEntity.class)//
        .in("id", ids);
    UserEntity[] expected = new UserEntity[] { entity };
    QueryResults<UserEntity> queryResults = new QueryResults<UserEntity>(expected);

    // Arrange

    entity.setId(ID);
    entity.setUsername(USERNAME);

    Mockito.when(this.repository.findByQuery(query)).thenReturn(queryResults);

    // Act
    QueryResults<UserPojo> actuals = this.objectUnderTest.get(ids);

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
    Map<Long, UserPojo> map = new HashMap<>();
    UserPojo pojo = new UserPojo();

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
    Map<Long, UserPojo> map = new HashMap<>();

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
    UserPojo pojo = new UserPojo();
    UserEntity entity = new UserEntity();
    List<UserPojo> all = new ArrayList<>(Collections.singletonList(pojo));
    Function<UserPojo, Long> pojoKeyMapper = UserPojo::getId;
    Function<UserEntity, Long> entityKeyMapper = UserEntity::getId;
    String idFieldName = "id";
    Set<Long> keySet = Sets.newSet(ID);
    JpqlQuery<UserEntity> query = new JpqlQuery<UserEntity>(UserEntity.class)//
        .in(idFieldName, keySet);
    QueryResults<UserEntity> existingEntities = new QueryResults<UserEntity>(
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

    UserEntity updatedEntity = existingEntities.get(0);
    Assert.assertEquals(ID, updatedEntity.getId());
    Assert.assertEquals(NEW_USERNAME, updatedEntity.getUsername());
  }


  /**
   * Test method for {@link org.drdeesw.commons.services.impl.AbstractJpaCrudServiceImpl#update(org.drdeesw.commons.models.pojos.UniquePojo)}.
   */
  @Test
  public void testUpdate()
  {
    UserPojo pojo = new UserPojo();
    UserEntity entity = new UserEntity();

    // Arrange

    pojo.setId(ID);
    pojo.setUsername(USERNAME);

    entity.setId(ID);
    entity.setUsername(USERNAME);

    Mockito.when(this.repository.save(entity)).thenReturn(entity);

    // Act
    UserPojo updatedPojo = this.objectUnderTest.update(pojo);

    // Assert

    Mockito.verify(this.repository).save(entity);
  }

}
