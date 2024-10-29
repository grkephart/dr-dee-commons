/**
 * 
 */
package org.drdeesw.commons.common.queries.datatables;


import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Objects;

import org.drdeesw.commons.common.queries.Condition;
import org.drdeesw.commons.common.queries.JpqlQuery;
import org.drdeesw.commons.common.queries.Match;
import org.springframework.util.MultiValueMap;


/**
 * @author gkephart
 *
 */
public class DataTablesJpqlQuery<T> extends JpqlQuery<T>
{
  private Integer draw;

  /**
   * Defaults to MATCH_ANY.
   * 
   * @param clazz The entity class
   */
  public DataTablesJpqlQuery(Class<T> clazz)
  {
    super(clazz, Match.MATCH_ANY);
  }


  /**
   * Defaults to MATCH_ANY.
   * 
   * @param clazz The entity class
   * @param model The DataTables model
   */
  public DataTablesJpqlQuery(Class<T> clazz, JQueryDataTableParamModel model)
  {
    this(clazz, model, Match.MATCH_ANY);
  }


  /**
   * @param clazz The entity class
   * @param model The DataTable model
   * @param match The match type
   */
  public DataTablesJpqlQuery(Class<T> clazz, JQueryDataTableParamModel model, Match match)
  {
    super(clazz, match);
    String searchValue = model.getSearchValue();
    Boolean searchRegex = model.getSearchRegex();
    boolean[] columnSearchable = model.getColumnSearchable();
    String[] columnNames = model.getColumnNames();
    String[] columnData = model.getColumnData();
    boolean[] columnOrderables = model.getColumnOrderables();
    int[] orderColumns = model.getOrderColumns();
    boolean[] orderDirs = model.getOrderDirs();
    String[] columnSearchValues = model.getColumnSearchValues(); // Search value to apply to this specific column.
    boolean searchValueExists = searchValue != null && searchValue.length() > 0;
    boolean columnSearchValuesExist = columnSearchValues != null && columnSearchValues.length > 0;

    this.draw = model.getDraw();
    super.setCaseInsensitive(
      model.getSearchCaseInsensitive() == null ? DEFAULT_CASE_INSENSITIVE
                                               : model.getSearchCaseInsensitive().booleanValue());

    super.setStart(model.getStart());
    super.setMaxResults(model.getLength());
    super.setPerformCount(model.isPerformCount());

    if (searchValueExists)
    {
      // Do not escape single quotes here. This is done in JpqlQuery

      for (int x = 0; x < columnNames.length; x++)
      {
        if (columnSearchable[x])
        {
          String columnName = columnData[x];

          if (Boolean.TRUE.equals(searchRegex))
            ilike(columnName, searchValue);
          else
            iequals(columnName, searchValue);
        }
      }
    }

    // All of the columnSearchValues need to be grouped together as part of 
    // an AND condition, but separate from the global searchValue, with which
    // they will be OR'd.
    if (columnSearchValuesExist)
    {
      List<Condition> columnSearchConditions = new ArrayList<>();

      for (int x = 0; x < columnSearchValues.length; x++)
      {
        if (columnSearchable[x])
        {
          String columnSearchValue = columnSearchValues[x];
          // Do not escape single quotes here. This is done in JpqlQuery
          String trimmedValue = columnSearchValue == null ? null : columnSearchValue.trim();

          if (trimmedValue != null && trimmedValue.length() > 0)
          {
            String columnName = columnData[x];

            if (Boolean.TRUE.equals(searchRegex))
              columnSearchConditions.add(Condition.ilike(columnName, trimmedValue));
            else
              columnSearchConditions.add(Condition.iequals(columnName, trimmedValue));
          }
        } // end if columnSearchable
      } // end loop

      if (!columnSearchConditions.isEmpty())
        and(columnSearchConditions.toArray(new Condition[0]));

    } // end if columnSearchValues

    if (orderColumns != null && orderColumns.length > 0)
    {
      for (int x = 0; x < orderColumns.length; x++)
      {
        int colNumber = orderColumns[x];

        if (columnOrderables[colNumber])
        {
          String data = columnData[colNumber];
          boolean ascending = orderDirs[x];

          super.addOrdering(data, ascending);
        }
      }
    }

    if (!model.getAjaxData().isEmpty())
    {
      for (Entry<String, Object> entry : model.getAjaxData().entrySet())
      {
        addMandatoryCondition(entry.getKey(), entry.getValue());
      }
    }
  }


  /**
   * 
   * @param clazz The entity class
   * @param match The match type
   */
  public DataTablesJpqlQuery(Class<T> clazz, Match match)
  {
    super(clazz, match);
  }


  /**
   * @param clazz The entity class
   * @param allRequestParams The request parameters
   */
  public DataTablesJpqlQuery(Class<T> clazz, MultiValueMap<String, String> allRequestParams)
  {
    this(clazz, DataTablesParamUtility.getParamModel(allRequestParams));
  }


  /**
   * @param clazz The entity class
   * @param allRequestParams The request parameters
   * @param match The match type
   */
  public DataTablesJpqlQuery(Class<T> clazz, MultiValueMap<String, String> allRequestParams,
                             Match match)
  {
    this(clazz, DataTablesParamUtility.getParamModel(allRequestParams), match);
  }


  @SuppressWarnings("rawtypes")
  @Override
  public boolean equals(
    Object obj)
  {
    if (this == obj)
      return true;
    if (!super.equals(obj))
      return false;
    if (getClass() != obj.getClass())
      return false;
    DataTablesJpqlQuery other = (DataTablesJpqlQuery)obj;
    return Objects.equals(draw, other.draw);
  }


  /**
   * @return the draw
   */
  public Integer getDraw()
  {
    return draw;
  }


  @Override
  public int hashCode()
  {
    final int prime = 31;
    int result = super.hashCode();
    result = prime * result + Objects.hash(draw);
    return result;
  }
}
