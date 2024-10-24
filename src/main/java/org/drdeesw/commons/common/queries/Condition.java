/**
 * 
 */
package org.drdeesw.commons.common.queries;


import java.text.DateFormat;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.Objects;


/**
 * @author gkephart
 *
 */
public class Condition
{
  /**
   * @param conditions the set of conditions to "and" together
   * @return a new "equals" condition
   */
  public static Condition and(
    Condition[] conditions)
  {
    return new Condition(conditions, Operator.AND);
  }


  /**
   * @param fieldName the name of the field to compare against.
   * @param value that value that the field must equal
   * @return a new "equals" condition
   */
  public static Condition equals(
    String fieldName,
    Object value)
  {
    return new Condition(fieldName, Operator.EQUALS, value);
  }


  /**
   * @param propertyName the name of the property to compare against
   * @param value that value that the field must equal
   * @param isRef true if the value is a reference
   * @return a new "equals" condition
   */
  public static Condition equals(
    String propertyName,
    Object value,
    boolean isRef)
  {
    return new Condition(propertyName, Operator.EQUALS, value, isRef);
  }


  /**
   * Returns a new "exists" condition
   * @param subquery the subquery to check for existence
   * @return a new "exists" condition
   */
  public static Condition exists(
    Query<?> subquery)
  {
    return new Condition(Operator.EXISTS, subquery);
  }


  /**
   * Returns a condition that checks if the field is greater than or equal to the value.
   * 
   * @param fieldName the name of the field to compare against
   * @param value the value to compare against
   * @return a new "greater than or equal to" condition
   */
  public static Condition ge(
    String fieldName,
    Object value)
  {
    return new Condition(fieldName, Operator.GE, value);
  }


  /**
   * Returns a condition that checks if the field is greater than the value.
   * 
   * @param fieldName the name of the field to compare against 
   * @param value the value to compare against
   * @return a new "greater than" condition
   */
  public static Condition gt(
    String fieldName,
    Object value)
  {
    return new Condition(fieldName, Operator.GT, value);
  }


  /**
   * Returns a condition that checks if the field is "ilike" the value.
   * 
   * @param fieldName the name of the field to compare against
   * @param value the value to compare against
   * @return a new "ilike" condition
   */
  public static Condition iequals(
    String fieldName,
    Object value)
  {
    return new Condition(fieldName, Operator.IEQUALS, value);
  }


  /**
   * Returns a condition that checks if the field is "ilike" the value.
   * 
   * @param fieldName the name of the field to compare against
   * @param value the value to compare against
   * @return a new "ilike condition
   */
  public static Condition ilike(
    String fieldName,
    String value)
  {
    return new Condition(fieldName, Operator.ILIKE, value);
  }


  /**
   * Returns a condition that checks if the field is less than or equal to the value.
   * 
   * @param fieldName the name of the field to compare against
   * @param value the value to compare against
   * @return a new "less than or equal to" condition
   */
  public static Condition in(
    String fieldName,
    Collection<?> value)
  {
    return new Condition(fieldName, Operator.IN, value);
  }


  /**
   * Returns a condition that checks if the field is not null
   * 
   * @param fieldName the name of the field to compare against
   * @return a new "is not null" condition
   */
  public static Condition isNotNull(
    String fieldName)
  {
    return new Condition(fieldName, Operator.IS_NOT_NULL);
  }


  /**
   * Returns a condition that checks if the field is null
   * 
   * @param fieldName the name of the field to compare against
   * @return a new "is null" condition
   */
  public static Condition isNull(
    String fieldName)
  {
    return new Condition(fieldName, Operator.IS_NULL);
  }


  /**
   * Returns a condition that checks if the field is like the value.
   * 
   * @param fieldName the name of the field to compare against
   * @param value the value to compare against
   * @return a new "like" condition
   */
  static Condition like(
    String fieldName,
    String value)
  {
    return new Condition(fieldName, Operator.LIKE, value);
  }


  /**
   * Returns a condition that checks if the field is less than to the value.
   * 
   * @param fieldName the name of the field to compare against
   * @param value the value to compare against
   * @return a new "less than" condition
   */
  public static Condition lt(
    String fieldName,
    Object value)
  {
    return new Condition(fieldName, Operator.LT, value);
  }


  /**
   * Returns a condition that checks if the field is not equal to the value.
   * 
   * @param fieldName the name of the field to compare against
   * @param value the value to compare against
   * @return a new "not equals" condition
   */
  public static Condition notEquals(
    String fieldName,
    Object value)
  {
    return new Condition(fieldName, Operator.NOT_EQUALS, value);
  }


  /**
   * Returns a condition that checks if the field does not exist in the collection.
   * 
   * @param subquery the subquery to check for existence
   * @return a new "not exists" condition
   */
  public static Condition notExists(
    Query<?> subquery)
  {
    return new Condition(Operator.NOT_EXISTS, subquery);
  }


  /**
   * Returns a condition that ors together the conditions.
   * 
   * @param conditions the set of conditions to "or" together
   * @return a new "or" condition
   */
  public static Condition or(
    Condition[] conditions)
  {
    return new Condition(conditions, Operator.OR);
  }

  private Condition[] conditions;
  private String      fieldName;
  private Operator    operator;
  private boolean     ref;
  private Query<?>    subquery;
  private Object      value;
  private Object      value2;
  
  
  /**
   * @param conditions the set of conditions in the group
   * 
   * @param operator the operator to use to combine the conditions
   */
  public Condition(Condition[] conditions, Operator operator)
  {
    this.conditions = conditions;
    this.operator = operator;
    this.ref = false;
  }


  public Condition(Operator operator, Query<?> subquery)
  {
    this.subquery = subquery;
    this.operator = operator;
    this.ref = false;
  }


  /**
   * 
   * @param fieldName the name of the field to compare against
   * @param operator the operator to use
   */
  public Condition(String fieldName, Operator operator)
  {
    super();
    this.fieldName = fieldName;
    this.operator = operator;
    this.ref = false;
  }


  /**
   * @param fieldName the name of the field to compare against
   * @param operator the operator to use
   * @param value the value to compare against
   * @param value2 the second value to compare against
   */
  public Condition(String fieldName, Operator operator, Date value, Date value2)
  {
    super();
    this.fieldName = fieldName;
    this.operator = operator;
    this.value = value;
    this.value2 = value2;
    this.ref = false;
  }


  /**
   * @param fieldName the name of the field to compare against
   * @param operator the operator to use
   * @param value the value to compare against
   * @param df the date format
   */
  public Condition(String fieldName, Operator operator, Date value, DateFormat df)
  {
    super();
    this.fieldName = fieldName;
    this.operator = operator;
    this.value = value;
    this.ref = false;
  }


  /**
   * @param fieldName the name of the field to compare against
   * @param operator the operator to use
   * @param value the value to compare against
   */
  public Condition(String fieldName, Operator operator, Object value)
  {
    super();
    this.fieldName = fieldName;
    this.operator = operator;
    this.value = value;
    this.ref = false;
  }


  /**
   * @param fieldName the name of the field to compare against
   * @param operator the operator to use
   * @param value the value to compare against
   * @param ref true if the value is a reference
   */
  public Condition(String fieldName, Operator operator, Object value, boolean ref)
  {
    super();
    this.fieldName = fieldName;
    this.operator = operator;
    this.value = value;
    this.value2 = null;
    this.ref = ref;
  }


  /**
   * @param fieldName the name of the field to compare against
   * @param operator the operator to use
   * @param value the value to compare against
   * @param value2 the second value to compare against
   */
  public Condition(String fieldName, Operator operator, Object value, Object value2)
  {
    super();
    this.fieldName = fieldName;
    this.operator = operator;
    this.value = value;
    this.value2 = value2;
    this.ref = false;
  }


  /* (non-Javadoc)
   * @see java.lang.Object#equals(java.lang.Object)
   */
  @Override
  public boolean equals(
    Object obj)
  {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Condition other = (Condition)obj;
    return Arrays.equals(conditions, other.conditions) && Objects.equals(fieldName, other.fieldName)
           && Objects.equals(operator, other.operator) && ref == other.ref
           && Objects.equals(subquery, other.subquery) && Objects.equals(value, other.value)
           && Objects.equals(value2, other.value2);
  }


  /**
   * @return the conditions
   */
  public Condition[] getConditions()
  {
    return conditions;
  }


  /**
   * @return the fieldName
   */
  public String getFieldName()
  {
    return fieldName;
  }


  /**
   * @return the operator
   */
  public Operator getOperator()
  {
    return operator;
  }


  /**
   * @return the subquery
   */
  public Query<?> getSubquery()
  {
    return subquery;
  }


  /**
   * @return the value
   */
  public Object getValue()
  {
    return value;
  }


  /**
   * @return the value2
   */
  public Object getValue2()
  {
    return value2;
  }


  /* (non-Javadoc)
   * @see java.lang.Object#hashCode()
   */
  @Override
  public int hashCode()
  {
    final int prime = 31;
    int result = 1;
    result = prime * result + Arrays.hashCode(conditions);
    result = prime * result + Objects.hash(fieldName, operator, ref, subquery, value, value2);
    return result;
  }


  /**
   * @return the ref
   */
  public boolean isRef()
  {
    return ref;
  }


  /**
   * @param conditions the conditions to set
   */
  public void setConditions(
    Condition[] conditions)
  {
    this.conditions = conditions;
  }


  /**
   * @param fieldName the fieldName to set
   */
  public void setFieldName(
    String fieldName)
  {
    this.fieldName = fieldName;
  }


  /**
   * @param operator the operator to set
   */
  public void setOperator(
    Operator operator)
  {
    this.operator = operator;
  }


  /**
   * @param ref the ref to set
   */
  public void setRef(
    boolean ref)
  {
    this.ref = ref;
  }


  /**
   * @param subquery the subquery to set
   */
  public void setSubquery(
    Query<?> subquery)
  {
    this.subquery = subquery;
  }


  /**
   * @param value the value to set
   */
  public void setValue(
    Object value)
  {
    this.value = value;
  }


  /**
   * @param value2 the value2 to set
   */
  public void setValue2(
    Object value2)
  {
    this.value2 = value2;
  }

}
