/**
 * 
 */
package org.drdeesw.commons.queries;


import static org.junit.jupiter.api.Assertions.fail;

import java.util.List;

import org.drdeesw.commons.models.SomePojo;
import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


/**
 * @author gary_kephart
 *
 */
class QueryTest
{

  private static final String FIELD_NAME = "name";
  private static final String NAME       = "35gfbd  r";
  private static final String DEF_ALIAS  = "x";
  private static final int    DEF_VALUE  = 1;

  /**
   * @throws java.lang.Exception
   */
  @BeforeEach
  void setUp() throws Exception
  {
  }


  /**
   * @throws java.lang.Exception
   */
  @AfterEach
  void tearDown() throws Exception
  {
  }


  /**
   * Test method for {@link org.drdeesw.commons.queries.Query#Query(java.lang.Class)}.
   */
  @Test
  void testQueryClassOfT()
  {
    fail("Not yet implemented");
  }


  /**
   * Test method for {@link org.drdeesw.commons.queries.Query#Query(java.lang.Class, org.drdeesw.commons.queries.Match)}.
   */
  @Test
  void testQueryClassOfTMatch()
  {
    fail("Not yet implemented");
  }


  /**
   * Test method for {@link org.drdeesw.commons.queries.Query#Query(java.lang.Class, org.drdeesw.commons.queries.JpqlQuery)}.
   */
  @Test
  void testQueryClassOfTPQ()
  {
    fail("Not yet implemented");
  }


  /**
   * Test method for {@link org.drdeesw.commons.queries.Query#add(org.drdeesw.commons.queries.Condition)}.
   */
  @Test
  void testAdd()
  {
    fail("Not yet implemented");
  }


  /**
   * Test method for {@link org.drdeesw.commons.queries.Query#addMandatoryCondition(java.lang.String, java.lang.Object)}.
   */
  @Test
  void testAddMandatoryConditionStringObject()
  {
    fail("Not yet implemented");
  }


  /**
   * Test method for {@link org.drdeesw.commons.queries.Query#addMandatoryCondition(java.lang.String, org.drdeesw.commons.queries.Operator, java.lang.Object)}.
   */
  @Test
  void testAddMandatoryConditionStringOperatorObject()
  {
    fail("Not yet implemented");
  }


  /**
   * Test method for {@link org.drdeesw.commons.queries.Query#addOrdering(java.lang.String, boolean)}.
   */
  @Test
  void testAddOrdering()
  {
    fail("Not yet implemented");
  }


  /**
   * Test method for {@link org.drdeesw.commons.queries.Query#and(org.drdeesw.commons.queries.Condition[])}.
   */
  @Test
  void testAnd()
  {
    fail("Not yet implemented");
  }


  /**
   * Test method for {@link org.drdeesw.commons.queries.Query#conditionsPresent()}.
   */
  @Test
  void testConditionsPresent()
  {
    fail("Not yet implemented");
  }


  /**
   * Test method for {@link org.drdeesw.commons.queries.Query#equals(java.lang.String, java.lang.Object)}.
   */
  @Test
  void testEqualsStringObject()
  {
    Query<SomePojo> objectUnderTest = new Query<>(SomePojo.class);

    // Arrange

    // Act
    Query<SomePojo> self = objectUnderTest.equals(FIELD_NAME, NAME);

    // Assert

    Assert.assertEquals(self, objectUnderTest);

    List<Condition> conditions = objectUnderTest.getConditions();
    Assert.assertEquals(1, conditions.size());
    Assert.assertEquals(DEF_ALIAS + "." + FIELD_NAME, conditions.get(0).getFieldName());
    Assert.assertEquals(Operator.EQUALS, conditions.get(0).getOperator());
    Assert.assertEquals(NAME, conditions.get(0).getValue());
    Assert.assertEquals(null, conditions.get(0).getValue2());
  }


  /**
   * Test method for {@link org.drdeesw.commons.queries.Query#equals(java.lang.String, java.lang.Object, boolean)}.
   */
  @Test
  void testEqualsStringObjectBoolean()
  {
    fail("Not yet implemented");
  }


  /**
   * Test method for {@link org.drdeesw.commons.queries.Query#exists(org.drdeesw.commons.queries.Query)}.
   */
  @Test
  void testExists()
  {
    fail("Not yet implemented");
  }


  /**
   * Test method for {@link org.drdeesw.commons.queries.Query#ge(java.lang.String, java.lang.Object)}.
   */
  @Test
  void testGe()
  {
    Query<SomePojo> objectUnderTest = new Query<>(SomePojo.class);

    // Arrange

    // Act
    Query<SomePojo> self = objectUnderTest.ge(FIELD_NAME, NAME);

    // Assert

    Assert.assertEquals(self, objectUnderTest);

    List<Condition> conditions = objectUnderTest.getConditions();
    Assert.assertEquals(1, conditions.size());
    Assert.assertEquals(DEF_ALIAS + "." + FIELD_NAME, conditions.get(0).getFieldName());
    Assert.assertEquals(Operator.GE, conditions.get(0).getOperator());
    Assert.assertEquals(NAME, conditions.get(0).getValue());
    Assert.assertEquals(null, conditions.get(0).getValue2());
  }


  /**
   * Test method for {@link org.drdeesw.commons.queries.Query#getAlias()}.
   */
  @Test
  void testGetAlias()
  {
    Query<SomePojo> objectUnderTest = new Query<>(SomePojo.class);

    // Arrange

    // Act

    // Assert
    Assert.assertEquals(DEF_ALIAS, objectUnderTest.getAlias());
  }


  /**
   * Test method for {@link org.drdeesw.commons.queries.Query#getClassSimpleName()}.
   */
  @Test
  void testGetClassSimpleName()
  {
    fail("Not yet implemented");
  }


  /**
   * Test method for {@link org.drdeesw.commons.queries.Query#getMandatoryConditions()}.
   */
  @Test
  void testGetMandatoryConditions()
  {
    fail("Not yet implemented");
  }


  /**
   * Test method for {@link org.drdeesw.commons.queries.Query#getMatch()}.
   */
  @Test
  void testGetMatch()
  {
    fail("Not yet implemented");
  }


  /**
   * Test method for {@link org.drdeesw.commons.queries.Query#getMaxResults()}.
   */
  @Test
  void testGetMaxResults()
  {
    fail("Not yet implemented");
  }


  /**
   * Test method for {@link org.drdeesw.commons.queries.Query#getMaxResults(int)}.
   */
  @Test
  void testGetMaxResultsInt()
  {
    fail("Not yet implemented");
  }


  /**
   * Test method for {@link org.drdeesw.commons.queries.Query#getOrderings()}.
   */
  @Test
  void testGetOrderings()
  {
    fail("Not yet implemented");
  }


  /**
   * Test method for {@link org.drdeesw.commons.queries.Query#getStart()}.
   */
  @Test
  void testGetStart()
  {
    Query<SomePojo> objectUnderTest = new Query<>(SomePojo.class);

    // Arrange

    // Act

    // Assert
    Assert.assertEquals(Integer.valueOf(0), objectUnderTest.getStart());
  }


  /**
   * Test method for {@link org.drdeesw.commons.queries.Query#getStart(int)}.
   */
  @Test
  void testGetStartInt()
  {
    Query<SomePojo> objectUnderTest = new Query<>(SomePojo.class);

    // Arrange

    // Act

    // Assert
    Assert.assertEquals(0, objectUnderTest.getStart(DEF_VALUE));
  }


  /**
   * Test method for {@link org.drdeesw.commons.queries.Query#gt(java.lang.String, java.lang.Object)}.
   */
  @Test
  void testGt()
  {
    Query<SomePojo> objectUnderTest = new Query<>(SomePojo.class);

    // Arrange

    // Act
    Query<SomePojo> self = objectUnderTest.gt(FIELD_NAME, NAME);

    // Assert

    Assert.assertEquals(self, objectUnderTest);

    List<Condition> conditions = objectUnderTest.getConditions();
    Assert.assertEquals(1, conditions.size());
    Assert.assertEquals(DEF_ALIAS + "." + FIELD_NAME, conditions.get(0).getFieldName());
    Assert.assertEquals(Operator.GT, conditions.get(0).getOperator());
    Assert.assertEquals(NAME, conditions.get(0).getValue());
    Assert.assertEquals(null, conditions.get(0).getValue2());
  }


  /**
   * Test method for {@link org.drdeesw.commons.queries.Query#hasMandatoryConditions()}.
   */
  @Test
  void testHasMandatoryConditions()
  {
    fail("Not yet implemented");
  }


  /**
   * Test method for {@link org.drdeesw.commons.queries.Query#iequals(java.lang.String, java.lang.Object)}.
   */
  @Test
  void testIequals()
  {
    Query<SomePojo> objectUnderTest = new Query<>(SomePojo.class);

    // Arrange

    // Act
    Query<SomePojo> self = objectUnderTest.iequals(FIELD_NAME, NAME);

    // Assert

    Assert.assertEquals(self, objectUnderTest);

    List<Condition> conditions = objectUnderTest.getConditions();
    Assert.assertEquals(1, conditions.size());
    Assert.assertEquals(DEF_ALIAS + "." + FIELD_NAME, conditions.get(0).getFieldName());
    Assert.assertEquals(Operator.IEQUALS, conditions.get(0).getOperator());
    Assert.assertEquals(NAME, conditions.get(0).getValue());
    Assert.assertEquals(null, conditions.get(0).getValue2());
  }


  /**
   * Test method for {@link org.drdeesw.commons.queries.Query#ilike(java.lang.String, java.lang.String)}.
   */
  @Test
  void testIlike()
  {
    Query<SomePojo> objectUnderTest = new Query<>(SomePojo.class);

    // Arrange

    // Act
    Query<SomePojo> self = objectUnderTest.ilike(FIELD_NAME, NAME);

    // Assert

    Assert.assertEquals(self, objectUnderTest);

    List<Condition> conditions = objectUnderTest.getConditions();
    Assert.assertEquals(1, conditions.size());
    Assert.assertEquals(DEF_ALIAS + "." + FIELD_NAME, conditions.get(0).getFieldName());
    Assert.assertEquals(Operator.ILIKE, conditions.get(0).getOperator());
    Assert.assertEquals(NAME, conditions.get(0).getValue());
    Assert.assertEquals(null, conditions.get(0).getValue2());
  }


  /**
   * Test method for {@link org.drdeesw.commons.queries.Query#in(java.lang.String, java.util.Collection)}.
   */
  @Test
  void testInStringCollectionOfQ()
  {
    fail("Not yet implemented");
  }


  /**
   * Test method for {@link org.drdeesw.commons.queries.Query#in(java.lang.String, java.lang.Object[])}.
   */
  @Test
  void testInStringObjectArray()
  {
    fail("Not yet implemented");
  }


  /**
   * Test method for {@link org.drdeesw.commons.queries.Query#isCaseInsensitive()}.
   */
  @Test
  void testIsCaseInsensitive()
  {
    fail("Not yet implemented");
  }


  /**
   * Test method for {@link org.drdeesw.commons.queries.Query#isNotNull(java.lang.String)}.
   */
  @Test
  void testIsNotNull()
  {
    Query<SomePojo> objectUnderTest = new Query<>(SomePojo.class);

    // Arrange

    // Act
    Query<SomePojo> self = objectUnderTest.isNotNull(FIELD_NAME);

    // Assert

    Assert.assertEquals(self, objectUnderTest);

    List<Condition> conditions = objectUnderTest.getConditions();
    Assert.assertEquals(1, conditions.size());
    Assert.assertEquals(DEF_ALIAS + "." + FIELD_NAME, conditions.get(0).getFieldName());
    Assert.assertEquals(Operator.IS_NOT_NULL, conditions.get(0).getOperator());
    Assert.assertEquals(null, conditions.get(0).getValue());
    Assert.assertEquals(null, conditions.get(0).getValue2());
  }


  /**
   * Test method for {@link org.drdeesw.commons.queries.Query#isNull(java.lang.String)}.
   */
  @Test
  void testIsNull()
  {
    Query<SomePojo> objectUnderTest = new Query<>(SomePojo.class);

    // Arrange

    // Act
    Query<SomePojo> self = objectUnderTest.isNull(FIELD_NAME);

    // Assert

    Assert.assertEquals(self, objectUnderTest);

    List<Condition> conditions = objectUnderTest.getConditions();
    Assert.assertEquals(1, conditions.size());
    Assert.assertEquals(DEF_ALIAS + "." + FIELD_NAME, conditions.get(0).getFieldName());
    Assert.assertEquals(Operator.IS_NULL, conditions.get(0).getOperator());
    Assert.assertEquals(null, conditions.get(0).getValue());
    Assert.assertEquals(null, conditions.get(0).getValue2());
  }


  /**
   * Test method for {@link org.drdeesw.commons.queries.Query#isPerformCount()}.
   */
  @Test
  void testIsPerformCount()
  {
    fail("Not yet implemented");
  }


  /**
   * Test method for {@link org.drdeesw.commons.queries.Query#like(java.lang.String, java.lang.String)}.
   */
  @Test
  void testLike()
  {
    Query<SomePojo> objectUnderTest = new Query<>(SomePojo.class);

    // Arrange

    // Act
    Query<SomePojo> self = objectUnderTest.like(FIELD_NAME, NAME);

    // Assert

    Assert.assertEquals(self, objectUnderTest);

    List<Condition> conditions = objectUnderTest.getConditions();
    Assert.assertEquals(1, conditions.size());
    Assert.assertEquals(DEF_ALIAS + "." + FIELD_NAME, conditions.get(0).getFieldName());
    Assert.assertEquals(Operator.LIKE, conditions.get(0).getOperator());
    Assert.assertEquals(NAME, conditions.get(0).getValue());
    Assert.assertEquals(null, conditions.get(0).getValue2());
  }


  /**
   * Test method for {@link org.drdeesw.commons.queries.Query#lt(java.lang.String, java.lang.Object)}.
   */
  @Test
  void testLt()
  {
    Query<SomePojo> objectUnderTest = new Query<>(SomePojo.class);

    // Arrange

    // Act
    Query<SomePojo> self = objectUnderTest.lt(FIELD_NAME, NAME);

    // Assert

    Assert.assertEquals(self, objectUnderTest);

    List<Condition> conditions = objectUnderTest.getConditions();
    Assert.assertEquals(1, conditions.size());
    Assert.assertEquals(DEF_ALIAS + "." + FIELD_NAME, conditions.get(0).getFieldName());
    Assert.assertEquals(Operator.LT, conditions.get(0).getOperator());
    Assert.assertEquals(NAME, conditions.get(0).getValue());
    Assert.assertEquals(null, conditions.get(0).getValue2());
  }


  /**
   * Test method for {@link org.drdeesw.commons.queries.Query#notEquals(java.lang.String, java.lang.Object)}.
   */
  @Test
  void testNotEquals()
  {
    Query<SomePojo> objectUnderTest = new Query<>(SomePojo.class);

    // Arrange

    // Act
    Query<SomePojo> self = objectUnderTest.notEquals(FIELD_NAME, NAME);

    // Assert

    Assert.assertEquals(self, objectUnderTest);

    List<Condition> conditions = objectUnderTest.getConditions();
    Assert.assertEquals(1, conditions.size());
    Assert.assertEquals(DEF_ALIAS + "." + FIELD_NAME, conditions.get(0).getFieldName());
    Assert.assertEquals(Operator.NOT_EQUALS, conditions.get(0).getOperator());
    Assert.assertEquals(NAME, conditions.get(0).getValue());
    Assert.assertEquals(null, conditions.get(0).getValue2());
  }


  /**
   * Test method for {@link org.drdeesw.commons.queries.Query#notExists(org.drdeesw.commons.queries.Query)}.
   */
  @Test
  void testNotExists()
  {
    fail("Not yet implemented");
  }


  /**
   * Test method for {@link org.drdeesw.commons.queries.Query#or(org.drdeesw.commons.queries.Condition[])}.
   */
  @Test
  void testOr()
  {
    fail("Not yet implemented");
  }


  /**
   * Test method for {@link org.drdeesw.commons.queries.Query#setAlias(java.lang.String)}.
   */
  @Test
  void testSetAlias()
  {
    fail("Not yet implemented");
  }


  /**
   * Test method for {@link org.drdeesw.commons.queries.Query#setCaseInsensitive(boolean)}.
   */
  @Test
  void testSetCaseInsensitive()
  {
    fail("Not yet implemented");
  }


  /**
   * Test method for {@link org.drdeesw.commons.queries.Query#setMatch(org.drdeesw.commons.queries.Match)}.
   */
  @Test
  void testSetMatch()
  {
    fail("Not yet implemented");
  }


  /**
   * Test method for {@link org.drdeesw.commons.queries.Query#setMaxResults(java.lang.Integer)}.
   */
  @Test
  void testSetMaxResults()
  {
    fail("Not yet implemented");
  }


  /**
   * Test method for {@link org.drdeesw.commons.queries.Query#setPerformCount(java.lang.Boolean)}.
   */
  @Test
  void testSetPerformCount()
  {
    fail("Not yet implemented");
  }


  /**
   * Test method for {@link org.drdeesw.commons.queries.Query#setStart(java.lang.Integer)}.
   */
  @Test
  void testSetStart()
  {
    fail("Not yet implemented");
  }


  /**
   * Test method for {@link org.drdeesw.commons.queries.Query#uniqueResult()}.
   */
  @Test
  void testUniqueResult()
  {
    fail("Not yet implemented");
  }

}
