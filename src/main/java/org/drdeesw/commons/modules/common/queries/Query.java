/**
 * 
 */
package org.drdeesw.commons.modules.common.queries;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Objects;


/**
 * @author gkephart
 *
 */
public class Query<T>
{
  public static final String   DEFAULT_ALIAS            = "x";
  public static final boolean  DEFAULT_CASE_INSENSITIVE = true;

  private String               alias;
  private boolean              caseInsensitive;
  private Class<T>             clazz;
  private List<Condition>      conditions;
  private ArrayList<Condition> mandatoryConditions;
  private Match                match;
  private Integer              maxResults;
  private List<Ordering>       orderings;
  private Boolean              performCount;
  private Integer              start;

  /**
   * @param clazz
   */
  public Query(Class<T> clazz)
  {
    this(clazz, Match.MATCH_ALL);
  }


  /**
   * @param clazz
   * @param match
   */
  public Query(Class<T> clazz, Match match)
  {
    this.alias = DEFAULT_ALIAS;
    this.clazz = clazz;
    this.conditions = new ArrayList<Condition>();
    this.mandatoryConditions = new ArrayList<Condition>();
    this.match = match;
    this.orderings = new ArrayList<>();
  }


  /**
   * Converts a POJO query (PQ) of class P to an entity query of type T.
   * 
   * @param <PQ>
   * @param entityClass
   * @param that
   */
  public <PQ extends JpqlQuery<?>> Query(Class<T> entityClass, PQ that)
  {
    this.alias = that.getAlias();
    this.caseInsensitive = that.isCaseInsensitive();
    this.clazz = entityClass;
    this.conditions = new ArrayList<Condition>(that.getConditions());
    this.mandatoryConditions = new ArrayList<Condition>(that.getMandatoryConditions());
    this.match = that.getMatch();
    this.maxResults = that.getMaxResults();
    this.orderings = new ArrayList<>(that.getOrderings());
    this.performCount = that.isPerformCount();
    this.start = that.getStart();
  }


  /**
   * @param <Q>
   * @param condition
   * @return
   */
  public <Q extends Query<T>> Q add(
    Condition condition)
  {
    String fieldName = condition.getFieldName();

    if (fieldName != null)
    {
      condition.setFieldName(this.alias + "." + fieldName);
    }

    this.conditions.add(condition);

    return cast();
  }


  /**
   * @param propertyName
   * @param value
   * @return
   */
  public <Q extends Query<T>> Q addMandatoryCondition(
    String propertyName,
    Object value)
  {
    if (propertyName != null && value != null)
    {
      Operator operator = Operator.byLhs(propertyName);

      // Check for LHS bracket operator

      if (operator == null)
        operator = this.caseInsensitive ? Operator.IEQUALS : Operator.EQUALS;
      else
        propertyName = propertyName.substring(0, propertyName.indexOf("[")); // remove operator from propertyName

      boolean added = addMandatoryCondition(propertyName, operator, value, false);

      if (!added)
        throw new RuntimeException(
            "mandatory condition not added: " + propertyName + " = " + value);
    }

    return cast();
  }


  /**
   * @param propertyName
   * @param operator
   * @param value
   * @return
   */
  public <Q extends Query<T>> Q addMandatoryCondition(
    String propertyName,
    Operator operator,
    Object value)
  {
    boolean added = addMandatoryCondition(propertyName, operator, value, false);

    if (!added)
      throw new RuntimeException("mandatory condition not added: " + propertyName + " = " + value);

    return cast();
  }


  /**
   * @param propertyName
   * @param operator
   * @param value
   * @param isRef
   * @return
   */
  private boolean addMandatoryCondition(
    String propertyName,
    Operator operator,
    Object value,
    boolean isRef)
  {
    return this.mandatoryConditions.add(new Condition(propertyName, operator, value, isRef));
  }


  /**
   * @param name
   * @param ascending
   */
  public <Q extends Query<T>> Q addOrdering(
    String name,
    boolean ascending)
  {
    this.orderings.add(new Ordering(name, ascending));

    return cast();
  }


  /**
   * @param <Q>
   * @param conditions
   * @return
   */
  public <Q extends Query<T>> Q and(
    Condition... conditions)
  {
    add(Condition.and(conditions));

    return cast();
  }


  /**
   * @param <Q>
   * @return
   */
  @SuppressWarnings("unchecked")
  protected <Q extends Query<T>> Q cast()
  {
    return (Q)this;
  }


  /**
   * @return
   */
  public boolean conditionsPresent()
  {
    return !this.conditions.isEmpty();
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
    Query other = (Query)obj;
    return Objects.equals(alias, other.alias) && caseInsensitive == other.caseInsensitive
           && Objects.equals(clazz, other.clazz) && Objects.equals(conditions, other.conditions)
           && Objects.equals(mandatoryConditions, other.mandatoryConditions) && match == other.match
           && Objects.equals(maxResults, other.maxResults)
           && Objects.equals(orderings, other.orderings)
           && Objects.equals(performCount, other.performCount)
           && Objects.equals(start, other.start);
  }


  /**
   * @param fieldName
   * @param value
   * @return
   */
  public <Q extends Query<T>> Q equals(
    String fieldName,
    Object value)
  {
    add(Condition.equals(fieldName, value));

    return cast();
  }


  /**
   * @param propertyName
   * @param value
   * @param isRef true if the value is actually a reference to another attribute (e.g. x.a = y.b) versus a literal value
   * @return
   */
  public <Q extends Query<T>> Q equals(
    String propertyName,
    Object value,
    boolean isRef)
  {
    if (propertyName != null && value != null)
      add(Condition.equals(propertyName, value, isRef));

    return cast();
  }


  /**
   * @param subquery
   * @return
   */
  public <Q extends Query<T>> Q exists(
    Query<?> subquery)
  {
    if (subquery != null)
      add(Condition.exists(subquery));

    return cast();
  }


  /**
   * @param <Q>
   * @param fieldName
   * @param value
   * @return
   */
  public <Q extends Query<T>> Q ge(
    String fieldName,
    Object value)
  {
    add(Condition.ge(fieldName, value));

    return cast();
  }


  /**
   * @return the alias
   */
  public String getAlias()
  {
    return this.alias;
  }


  /**
   * @return the clazz's simple name
   */
  public String getClassSimpleName()
  {
    return this.clazz.getSimpleName();
  }


  /**
   * @return the conditions
   */
  public List<Condition> getConditions()
  {
    return this.conditions;
  }


  /**
   * @return the mandatoryConditions
   */
  public ArrayList<Condition> getMandatoryConditions()
  {
    return mandatoryConditions;
  }


  /**
   * @return the match
   */
  public Match getMatch()
  {
    return match;
  }


  /**
   * @return the maxResults
   */
  public Integer getMaxResults()
  {
    return maxResults;
  }


  /**
   * @param defaultValue
   * @return
   */
  public int getMaxResults(
    int defaultValue)
  {
    return this.maxResults == null ? defaultValue : this.maxResults;
  }


  /**
   * @return the orderings
   */
  public List<Ordering> getOrderings()
  {
    return orderings;
  }


  /**
   * @return the start
   */
  public Integer getStart()
  {
    return start;
  }


  /**
   * @param defValue
   * @return
   */
  public int getStart(
    int defValue)
  {
    return this.start == null ? defValue : this.start;
  }


  /**
   * @param fieldName
   * @param value
   * @return
   */
  public <Q extends Query<T>> Q gt(
    String fieldName,
    Object value)
  {
    add(Condition.gt(fieldName, value));

    return cast();
  }


  /* (non-Javadoc)
   * @see java.lang.Object#hashCode()
   */
  @Override
  public int hashCode()
  {
    return Objects.hash(alias, caseInsensitive, clazz, conditions, mandatoryConditions, match,
      maxResults, orderings, performCount, start);
  }


  /**
   * @return
   */
  public boolean hasMandatoryConditions()
  {
    return !this.mandatoryConditions.isEmpty();
  }


  /**
   * @param fieldName
   * @param value
   * @return
   */
  public <Q extends Query<T>> Q iequals(
    String fieldName,
    Object value)
  {
    add(Condition.iequals(fieldName, value));

    return cast();
  }


  /**
   * @param fieldName
   * @param value
   * @return
   */
  public <Q extends Query<T>> Q ilike(
    String fieldName,
    String value)
  {
    add(Condition.ilike(fieldName, value));

    return cast();
  }


  /**
   * @param fieldName
   * @param value
   * @return
   */
  public <Q extends Query<T>> Q in(
    String fieldName,
    Collection<?> value)
  {
    add(Condition.in(fieldName, value));

    return cast();
  }


  /**
   * @param fieldName
   * @param values
   * @return
   */
  public <Q extends Query<T>> Q in(
    String fieldName,
    Object... values)
  {
    add(Condition.in(fieldName, Arrays.asList(values)));

    return cast();
  }


  /**
   * @return the caseInsensitive
   */
  public boolean isCaseInsensitive()
  {
    return caseInsensitive;
  }


  /**
   * @param fieldName
   * @return
   */
  public <Q extends Query<T>> Q isNotNull(
    String fieldName)
  {
    add(Condition.isNotNull(fieldName));

    return cast();
  }


  /**
   * @param fieldName
   * @return
   */
  public <Q extends Query<T>> Q isNull(
    String fieldName)
  {
    add(Condition.isNull(fieldName));

    return cast();
  }


  /**
   * @return the performCount
   */
  public boolean isPerformCount()
  {
    return Boolean.TRUE.equals(this.performCount);
  }


  /**
   * @param fieldName
   * @param value
   * @return
   */
  public <Q extends Query<T>> Q like(
    String fieldName,
    String value)
  {
    add(Condition.like(fieldName, value));

    return cast();
  }


  /**
   * @param fieldName
   * @param value
   * @return
   */
  public <Q extends Query<T>> Q lt(
    String fieldName,
    Object value)
  {
    add(Condition.lt(fieldName, value));

    return cast();
  }


  /**
   * @param fieldName
   * @param value
   * @return
   */
  public <Q extends Query<T>> Q notEquals(
    String fieldName,
    Object value)
  {
    add(Condition.notEquals(fieldName, value));

    return cast();
  }


  /**
   * @param subquery
   * @return
   */
  public <Q extends Query<T>> Q notExists(
    Query<?> subquery)
  {
    if (subquery != null)
      add(Condition.notExists(subquery));

    return cast();
  }


  /**
   * @param <Q>
   * @param conditions
   * @return
   */
  public <Q extends Query<T>> Q or(
    Condition... conditions)
  {
    add(Condition.or(conditions));

    return cast();
  }


  /**
   * @param alias the alias to set
   */
  public <Q extends Query<T>> Q setAlias(
    String alias)
  {
    this.alias = alias;

    return cast();
  }


  /**
   * @param caseInsensitive the caseInsensitive to set
   */
  public void setCaseInsensitive(
    boolean caseInsensitive)
  {
    this.caseInsensitive = caseInsensitive;
  }


  /**
   * @param match the match to set
   */
  public void setMatch(
    Match match)
  {
    this.match = match;
  }


  /**
   * @param maxResults
   */
  public <Q extends Query<T>> Q setMaxResults(
    Integer maxResults)
  {
    this.maxResults = maxResults;

    return cast();
  }


  /**
   * @param performCount
   */
  public <Q extends Query<T>> Q setPerformCount(
    Boolean performCount)
  {
    this.performCount = performCount;

    return cast();
  }


  /**
   * @param start
   */
  public <Q extends Query<T>> Q setStart(
    Integer start)
  {
    this.start = start;

    return cast();
  }


  /**
   * @param <Q>
   * @return
   */
  public <Q extends Query<T>> Q uniqueResult()
  {
    setPerformCount(false);
    setMaxResults(1);

    return cast();
  }
}
