package org.drdeesw.commons.modules.common.queries;

public enum Match {
  MATCH_ALL("AND"), //
  MATCH_ANY("OR");

  private String sql;

  /**
   * @param string
   */
  Match(String sql)
  {
    this.sql = sql;
  }


  /**
   * @return the sql
   */
  public String getSql()
  {
    return sql;
  }
}