/**
 * 
 */
package org.drdeesw.commons.services.impl;


import static org.junit.Assert.fail;

import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.drdeesw.commons.models.SomeEntity;
import org.drdeesw.commons.models.SomePojo;
import org.drdeesw.commons.queries.JpqlQuery;
import org.drdeesw.commons.queries.QueryResults;
import org.drdeesw.commons.repositories.SomeRepository;
import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

/**
 * @author gary_kephart
 *
 */
public class AbstractJpaCrudServiceImplTest
{
  private static final String NAME = "tivti";
  private static final String DESCRIPTION = "tw4 df i5lg4yg k5 kt5h";
  private static final Long ID = Long.valueOf(635);
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
   * Test method for {@link org.drdeesw.commons.services.impl.AbstractJpaCrudServiceImpl#create(java.util.Collection)}.
   */
  @Test
  public void testCreateCollectionOfP()
  {
    fail("Not yet implemented");
  }


  /**
   * Test method for {@link org.drdeesw.commons.services.impl.AbstractJpaCrudServiceImpl#create(org.drdeesw.commons.models.pojos.UniquePojo)}.
   * @throws Exception 
   */
  @Test
  public void testCreate() throws Exception
  {
    SomePojo pojo = new SomePojo();
    SomeEntity entity = new SomeEntity();

    // Arrange
    
    entity.setId(ID);
    entity.setName(NAME);
    entity.setDescription(DESCRIPTION);
    Mockito.when(this.repository.save(Mockito.any(SomeEntity.class))).thenReturn(entity);

    // Act
    SomePojo actual = this.objectUnderTest.create(pojo);

    // Assert
    
    Mockito.verify(this.repository).save(Mockito.any(SomeEntity.class));

    Assert.assertEquals(ID, actual.getId());
    Assert.assertEquals(NAME, actual.getName()); // TODO
    Assert.assertEquals(DESCRIPTION, actual.getDescription());
  }


  /**
   * Test method for {@link org.drdeesw.commons.services.impl.AbstractJpaCrudServiceImpl#createAndFlush(java.util.Collection)}.
   */
  @Test
  public void testCreateAndFlush()
  {
    fail("Not yet implemented");
  }


  /**
   * Test method for {@link org.drdeesw.commons.services.impl.AbstractJpaCrudServiceImpl#createFlush(org.drdeesw.commons.models.pojos.UniquePojo)}.
   */
  @Test
  public void testCreateFlush()
  {
    fail("Not yet implemented");
  }


  /**
   * Test method for {@link org.drdeesw.commons.services.impl.AbstractJpaCrudServiceImpl#delete(org.drdeesw.commons.models.pojos.UniquePojo)}.
   */
  @Test
  public void testDelete()
  {
    fail("Not yet implemented");
  }


  /**
   * Test method for {@link org.drdeesw.commons.services.impl.AbstractJpaCrudServiceImpl#findById(java.io.Serializable)}.
   */
  @Test
  public void testFindById()
  {
    fail("Not yet implemented");
  }


  /**
   * Test method for {@link org.drdeesw.commons.services.impl.AbstractJpaCrudServiceImpl#findByQuery(org.springframework.util.MultiValueMap)}.
   */
  @Test
  public void testFindByQueryMultiValueMapOfStringString()
  {
    fail("Not yet implemented");
  }


  /**
   * Test method for {@link org.drdeesw.commons.services.impl.AbstractJpaCrudServiceImpl#findByQuery(org.drdeesw.commons.queries.JpqlQuery)}.
   */
  @Test
  public void testFindByQueryQ()
  {
    fail("Not yet implemented");
  }


  /**
   * Test method for {@link org.drdeesw.commons.services.impl.AbstractJpaCrudServiceImpl#findEntities(org.drdeesw.commons.queries.JpqlQuery)}.
   */
  @Test
  public void testFindEntities()
  {
    fail("Not yet implemented");
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
    Assert.assertEquals(NAME, actual.getName()); // TODO
    Assert.assertEquals(DESCRIPTION, actual.getDescription());
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
    SomeEntity[] expected = new SomeEntity[] {entity};
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
    Assert.assertEquals(NAME, actual.getName()); // TODO
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
    SomeEntity[] expected = new SomeEntity[] {entity};
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
    Assert.assertEquals(NAME, actual.getName()); // TODO
  }


  /**
   * Test method for {@link org.drdeesw.commons.services.impl.AbstractJpaCrudServiceImpl#getModelMapper()}.
   */
  @Test
  public void testGetModelMapper()
  {
    fail("Not yet implemented");
  }


  /**
   * Test method for {@link org.drdeesw.commons.services.impl.AbstractJpaCrudServiceImpl#isNotEmpty(java.util.Map)}.
   */
  @Test
  public void testIsNotEmptyMapOfQQ()
  {
    fail("Not yet implemented");
  }


  /**
   * Test method for {@link org.drdeesw.commons.services.impl.AbstractJpaCrudServiceImpl#saveOrUpdateAll(java.util.List, java.util.function.Function, java.util.function.Function, java.lang.String)}.
   */
  @Test
  public void testSaveOrUpdateAll()
  {
    fail("Not yet implemented");
  }


  /**
   * Test method for {@link org.drdeesw.commons.services.impl.AbstractJpaCrudServiceImpl#update(org.drdeesw.commons.models.pojos.UniquePojo)}.
   */
  @Test
  public void testUpdate()
  {
    fail("Not yet implemented");
  }

}
