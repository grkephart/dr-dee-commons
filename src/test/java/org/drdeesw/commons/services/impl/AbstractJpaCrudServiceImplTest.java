/**
 * 
 */
package org.drdeesw.commons.services.impl;


import static org.junit.jupiter.api.Assertions.fail;

import org.drdeesw.commons.models.entities.AbstractUniqueEntity;
import org.drdeesw.commons.models.pojos.AbstractUniquePojo;
import org.drdeesw.commons.repositories.QueryRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * @author gary_kephart
 *
 */
public class AbstractJpaCrudServiceImplTest
{
  @SuppressWarnings("serial")
  public class SomePojo extends AbstractUniquePojo<Long>
  {
    public SomePojo()
    {
      
    }
  }


  @SuppressWarnings("serial")
  public class SomeEntity extends AbstractUniqueEntity<Long>
  {
    public SomeEntity()
    {
      
    }
  }


  public class TestableAbstractJpaCrudServiceImpl
      extends AbstractJpaCrudServiceImpl<SomePojo, SomeEntity, Long>
  {

    public TestableAbstractJpaCrudServiceImpl()
    {
      super(SomePojo.class, SomeEntity.class);
    }


    @Override
    protected void updateEntity(
      SomeEntity entity,
      SomePojo pojo)
    {
    }

  }


  interface SomeRepository
      extends JpaRepository<SomeEntity, Long>, QueryRepository<SomeEntity, Long>
  {

  }

  private TestableAbstractJpaCrudServiceImpl objectUnderTest;
  private SomeRepository                     repository;

  /**
   * @throws java.lang.Exception
   */
  @BeforeEach
  void setUp() throws Exception
  {
    this.repository = Mockito.mock(SomeRepository.class);

    this.objectUnderTest = new TestableAbstractJpaCrudServiceImpl();

    this.objectUnderTest.init(repository);
  }


  /**
   * @throws java.lang.Exception
   */
  @AfterEach
  void tearDown() throws Exception
  {
  }


  /**
   * Test method for {@link org.drdeesw.commons.services.impl.AbstractJpaCrudServiceImpl#create(java.util.Collection)}.
   */
  @Test
  void testCreateCollectionOfP()
  {
    fail("Not yet implemented");
  }


  /**
   * Test method for {@link org.drdeesw.commons.services.impl.AbstractJpaCrudServiceImpl#create(org.drdeesw.commons.models.pojos.UniquePojo)}.
   * @throws Exception 
   */
  @Test
  void testCreateP() throws Exception
  {
    SomePojo pojo = new SomePojo();

    // Arrange
    
    // Act
    SomePojo newPojo = this.objectUnderTest.create(pojo);
    
    // Assert
  }


  /**
   * Test method for {@link org.drdeesw.commons.services.impl.AbstractJpaCrudServiceImpl#createAndFlush(java.util.Collection)}.
   */
  @Test
  void testCreateAndFlush()
  {
    fail("Not yet implemented");
  }


  /**
   * Test method for {@link org.drdeesw.commons.services.impl.AbstractJpaCrudServiceImpl#createFlush(org.drdeesw.commons.models.pojos.UniquePojo)}.
   */
  @Test
  void testCreateFlush()
  {
    fail("Not yet implemented");
  }


  /**
   * Test method for {@link org.drdeesw.commons.services.impl.AbstractJpaCrudServiceImpl#delete(org.drdeesw.commons.models.pojos.UniquePojo)}.
   */
  @Test
  void testDelete()
  {
    fail("Not yet implemented");
  }


  /**
   * Test method for {@link org.drdeesw.commons.services.impl.AbstractJpaCrudServiceImpl#findById(java.io.Serializable)}.
   */
  @Test
  void testFindById()
  {
    fail("Not yet implemented");
  }


  /**
   * Test method for {@link org.drdeesw.commons.services.impl.AbstractJpaCrudServiceImpl#findByQuery(org.springframework.util.MultiValueMap)}.
   */
  @Test
  void testFindByQueryMultiValueMapOfStringString()
  {
    fail("Not yet implemented");
  }


  /**
   * Test method for {@link org.drdeesw.commons.services.impl.AbstractJpaCrudServiceImpl#findByQuery(org.drdeesw.commons.queries.JpqlQuery)}.
   */
  @Test
  void testFindByQueryQ()
  {
    fail("Not yet implemented");
  }


  /**
   * Test method for {@link org.drdeesw.commons.services.impl.AbstractJpaCrudServiceImpl#findEntities(org.drdeesw.commons.queries.JpqlQuery)}.
   */
  @Test
  void testFindEntities()
  {
    fail("Not yet implemented");
  }


  /**
   * Test method for {@link org.drdeesw.commons.services.impl.AbstractJpaCrudServiceImpl#get(java.io.Serializable)}.
   */
  @Test
  void testGetID()
  {
    fail("Not yet implemented");
  }


  /**
   * Test method for {@link org.drdeesw.commons.services.impl.AbstractJpaCrudServiceImpl#get(java.util.Set)}.
   */
  @Test
  void testGetSetOfID()
  {
    fail("Not yet implemented");
  }


  /**
   * Test method for {@link org.drdeesw.commons.services.impl.AbstractJpaCrudServiceImpl#getMap(java.util.Set)}.
   */
  @Test
  void testGetMap()
  {
    fail("Not yet implemented");
  }


  /**
   * Test method for {@link org.drdeesw.commons.services.impl.AbstractJpaCrudServiceImpl#getModelMapper()}.
   */
  @Test
  void testGetModelMapper()
  {
    fail("Not yet implemented");
  }


  /**
   * Test method for {@link org.drdeesw.commons.services.impl.AbstractJpaCrudServiceImpl#isNotEmpty(java.util.Map)}.
   */
  @Test
  void testIsNotEmptyMapOfQQ()
  {
    fail("Not yet implemented");
  }


  /**
   * Test method for {@link org.drdeesw.commons.services.impl.AbstractJpaCrudServiceImpl#saveOrUpdateAll(java.util.List, java.util.function.Function, java.util.function.Function, java.lang.String)}.
   */
  @Test
  void testSaveOrUpdateAll()
  {
    fail("Not yet implemented");
  }


  /**
   * Test method for {@link org.drdeesw.commons.services.impl.AbstractJpaCrudServiceImpl#update(org.drdeesw.commons.models.pojos.UniquePojo)}.
   */
  @Test
  void testUpdate()
  {
    fail("Not yet implemented");
  }

}
