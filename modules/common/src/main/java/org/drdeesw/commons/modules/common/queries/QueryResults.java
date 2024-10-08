/**
 * 
 */
package org.drdeesw.commons.modules.common.queries;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

import org.drdeesw.commons.modules.common.queries.datatables.DataTablesJpqlQuery;


/**
 * @author gkephart
 *
 */
public class QueryResults<T> implements Iterable<T>
{
  private Integer  draw;
  private Query<T> query;
  private List<T>  records;
  private int      totalRecords;

  /**
   * @param draw
   * @param totalRecords
   */
  public QueryResults(Integer draw, int size, int totalRecords)
  {
    this.draw = draw;
    this.records = new ArrayList<T>(size);
    this.query = null;
    this.totalRecords = totalRecords;
  }


  /**
   * @param draw
   * @param values
   */
  public QueryResults(Integer draw, List<T> values)
  {
    this.draw = draw;
    this.records = values;
    this.totalRecords = values.size();
  }


  /**
   * @param values
   */
  public QueryResults(Integer draw, T[] values)
  {
    this.draw = draw;
    this.records = (List<T>)Arrays.asList(values);
    this.totalRecords = values.length;
  }


  /**
   * @param values
   */
  public QueryResults(Integer draw, T[] values, int totalRecords)
  {
    this.draw = draw;
    this.records = (List<T>)Arrays.asList(values);
    this.totalRecords = totalRecords;
  }


  /**
   * @param values
   */
  public QueryResults(List<T> values)
  {
    this.records = new ArrayList<T>(values);
    this.totalRecords = values.size();
  }


  /**
   * @param resultList
   * @param totalRecords
   */
  public QueryResults(List<T> resultList, int totalRecords, DataTablesJpqlQuery<T> query)
  {
    this.records = resultList;
    this.totalRecords = totalRecords;
    this.query = query;
    this.draw = query == null ? -1 : query.getDraw();
  }


  /**
   * @param resultList
   * @param size
   * @param draw
   */
  public QueryResults(List<T> resultList, int size, Integer draw)
  {
    this.records = resultList;
    this.totalRecords = size;
    this.draw = draw;
  }


  /**
   * @param resultList
   * @param totalRecords
   * @param query
   */
  public QueryResults(List<T> resultList, int totalRecords, Query<T> query)
  {
    this.records = resultList;
    this.totalRecords = totalRecords;
    this.query = query;

    if (this.query instanceof DataTablesJpqlQuery)
    {
      this.draw = ((DataTablesJpqlQuery<T>)query).getDraw();
    }
  }


  /**
   * @param values
   */
  public QueryResults(T[] values)
  {
    this.records = (List<T>)Arrays.asList(values);
    this.totalRecords = values.length;
  }


  /**
   * @param obj
   */
  public void add(
    T obj)
  {
    this.records.add(obj);
  }


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
    QueryResults other = (QueryResults)obj;
    return Objects.equals(draw, other.draw) && Objects.equals(query, other.query)
           && Objects.equals(records, other.records) && totalRecords == other.totalRecords;
  }


  /**
   * @param index
   * @return
   */
  public T get(
    int index)
  {
    return this.records.get(index);
  }


  /**
   * @return the draw
   */
  public Integer getDraw()
  {
    return draw;
  }


  /**
   * @return the query
   */
  public Query<T> getQuery()
  {
    return query;
  }


  /**
   * @return the records
   */
  public List<T> getRecords()
  {
    return records;
  }


  /**
   * For DataTables JQuery plugin.
   * 
   * @return
   */
  public int getRecordsTotal()
  {
    return this.totalRecords;
  }


  public int getSize()
  {
    return this.records == null ? 0 : this.records.size();
  }


  /**
   * @return the totalRecords
   */
  public int getTotalRecords()
  {
    return totalRecords;
  }


  @Override
  public int hashCode()
  {
    return Objects.hash(draw, query, records, totalRecords);
  }


  /**
   * @return
   */
  public boolean isEmpty()
  {
    return this.records == null || this.records.isEmpty();
  }


  /* (non-Javadoc)
   * @see java.lang.Iterable#iterator()
   */
  @Override
  public Iterator<T> iterator()
  {
    return this.records == null ? null : this.records.iterator();
  }


  /**
   * @param draw the draw to set
   */
  public void setDraw(
    Integer draw)
  {
    this.draw = draw;
  }


  /**
   * @param query the query to set
   */
  public void setQuery(
    Query<T> query)
  {
    this.query = query;
  }


  /**
   * @param records the records to set
   */
  public void setRecords(
    List<T> records)
  {
    this.records = records;
  }


  /**
   * @param totalRecords the totalRecords to set
   */
  public void setTotalRecords(
    int totalRecords)
  {
    this.totalRecords = totalRecords;
  }


  /**
   * @return
   */
  public T uniqueResult()
  {
    if (this.records != null && this.records.size() == 1)
      return this.records.get(0);
    else
      return null;
  }
}
