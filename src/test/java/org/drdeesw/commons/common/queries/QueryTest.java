/**
 * 
 */
package org.drdeesw.commons.common.queries;


import static org.junit.jupiter.api.Assertions.fail;

import java.util.List;

import org.drdeesw.commons.security.models.pojos.SystemGroupMemberPojo;
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
   * Test method for {@link org.drdeesw.commons.queries.Query#addMandatoryCondition(java.lang.String, java.lang.Object)}.
   */
  // TODO @Test
  void testAddMandatoryConditionStringObject()
  {
    fail("Not yet implemented");
  }


  /**
   * Test method for {@link org.drdeesw.commons.queries.Query#addMandatoryCondition(java.lang.String, org.drdeesw.commons.queries.Operator, java.lang.Object)}.
   */
  // TODO @Test
  void testAddMandatoryConditionStringOperatorObject()
  {
    fail("Not yet implemented");
  }


  /**
   * Test method for {@link org.drdeesw.commons.queries.Query#and(org.drdeesw.commons.queries.Condition[])}.
   */
  // TODO @Test
  void testAnd()
  {
    fail("Not yet implemented");
  }


  /**
   * Test method for {@link org.drdeesw.commons.queries.Query#equals(java.lang.String, java.lang.Object)}.
   */
  @Test
  void testEqualsStringObject()
  {
    Query<SystemGroupMemberPojo> objectUnderTest = new Query<>(SystemGroupMemberPojo.class);

    // Arrange

    // Act
    Query<SystemGroupMemberPojo> self = objectUnderTest.equals(FIELD_NAME, NAME);

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
   * Test method for {@link org.drdeesw.commons.queries.Query#exists(org.drdeesw.commons.queries.Query)}.
   */
  // TODO @Test
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
    Query<SystemGroupMemberPojo> objectUnderTest = new Query<>(SystemGroupMemberPojo.class);

    // Arrange

    // Act
    Query<SystemGroupMemberPojo> self = objectUnderTest.ge(FIELD_NAME, NAME);

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
    Query<SystemGroupMemberPojo> objectUnderTest = new Query<>(SystemGroupMemberPojo.class);

    // Arrange

    // Act

    // Assert
    Assert.assertEquals(DEF_ALIAS, objectUnderTest.getAlias());
  }


  /**
   * Test method for {@link org.drdeesw.commons.queries.Query#getMaxResults(int)}.
   */
  // TODO @Test
  void testGetMaxResultsInt()
  {
    fail("Not yet implemented");
  }


  /**
   * Test method for {@link org.drdeesw.commons.queries.Query#getStart()}.
   */
  @Test
  void testGetStart()
  {
    Query<SystemGroupMemberPojo> objectUnderTest = new Query<>(SystemGroupMemberPojo.class);

    // Arrange

    // Act

    // Assert
    Assert.assertEquals(null, objectUnderTest.getStart());
  }


  /**
   * Test method for {@link org.drdeesw.commons.queries.Query#getStart(int)}.
   */
  @Test
  void testGetStartInt()
  {
    Query<SystemGroupMemberPojo> objectUnderTest = new Query<>(SystemGroupMemberPojo.class);

    // Arrange

    // Act

    // Assert
    Assert.assertEquals(DEF_VALUE, objectUnderTest.getStart(DEF_VALUE));
  }


  /**
   * Test method for {@link org.drdeesw.commons.queries.Query#gt(java.lang.String, java.lang.Object)}.
   */
  @Test
  void testGt()
  {
    Query<SystemGroupMemberPojo> objectUnderTest = new Query<>(SystemGroupMemberPojo.class);

    // Arrange

    // Act
    Query<SystemGroupMemberPojo> self = objectUnderTest.gt(FIELD_NAME, NAME);

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
   * Test method for {@link org.drdeesw.commons.queries.Query#iequals(java.lang.String, java.lang.Object)}.
   */
  @Test
  void testIequals()
  {
    Query<SystemGroupMemberPojo> objectUnderTest = new Query<>(SystemGroupMemberPojo.class);

    // Arrange

    // Act
    Query<SystemGroupMemberPojo> self = objectUnderTest.iequals(FIELD_NAME, NAME);

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
    Query<SystemGroupMemberPojo> objectUnderTest = new Query<>(SystemGroupMemberPojo.class);

    // Arrange

    // Act
    Query<SystemGroupMemberPojo> self = objectUnderTest.ilike(FIELD_NAME, NAME);

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
   * Test method for {@link org.drdeesw.commons.queries.Query#isNotNull(java.lang.String)}.
   */
  @Test
  void testIsNotNull()
  {
    Query<SystemGroupMemberPojo> objectUnderTest = new Query<>(SystemGroupMemberPojo.class);

    // Arrange

    // Act
    Query<SystemGroupMemberPojo> self = objectUnderTest.isNotNull(FIELD_NAME);

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
    Query<SystemGroupMemberPojo> objectUnderTest = new Query<>(SystemGroupMemberPojo.class);

    // Arrange

    // Act
    Query<SystemGroupMemberPojo> self = objectUnderTest.isNull(FIELD_NAME);

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
   * Test method for {@link org.drdeesw.commons.queries.Query#like(java.lang.String, java.lang.String)}.
   */
  @Test
  void testLike()
  {
    Query<SystemGroupMemberPojo> objectUnderTest = new Query<>(SystemGroupMemberPojo.class);

    // Arrange

    // Act
    Query<SystemGroupMemberPojo> self = objectUnderTest.like(FIELD_NAME, NAME);

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
    Query<SystemGroupMemberPojo> objectUnderTest = new Query<>(SystemGroupMemberPojo.class);

    // Arrange

    // Act
    Query<SystemGroupMemberPojo> self = objectUnderTest.lt(FIELD_NAME, NAME);

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
    Query<SystemGroupMemberPojo> objectUnderTest = new Query<>(SystemGroupMemberPojo.class);

    // Arrange

    // Act
    Query<SystemGroupMemberPojo> self = objectUnderTest.notEquals(FIELD_NAME, NAME);

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
   * Test method for {@link org.drdeesw.commons.queries.Query#or(org.drdeesw.commons.queries.Condition[])}.
   */
  // TODO @Test
  void testOr()
  {
    fail("Not yet implemented");
  }


  /**
   * Test method for {@link org.drdeesw.commons.queries.Query#setMatch(org.drdeesw.commons.queries.Match)}.
   */
  // TODO @Test
  void testSetMatch()
  {
    fail("Not yet implemented");
  }


  /**
   * Test method for {@link org.drdeesw.commons.queries.Query#uniqueResult()}.
   */
  // TODO @Test
  void testUniqueResult()
  {
    fail("Not yet implemented");
  }

}
