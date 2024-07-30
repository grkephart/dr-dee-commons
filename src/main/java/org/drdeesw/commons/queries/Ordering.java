/**
 * 
 */
package org.drdeesw.commons.queries;


import java.util.Objects;

import org.drdeesw.commons.models.base.DataTransferObject;


/**
 * @author gary_kephart
 *
 */
public class Ordering implements DataTransferObject
{
  private static final long serialVersionUID = 4169694001533857765L;
  private boolean           ascending;
  private String            name;

  public Ordering()
  {
    super();
  }


  /**
   * @param name
   * @param ascending
   */
  public Ordering(String name, boolean ascending)
  {
    super();
    this.name = name;
    this.ascending = ascending;
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
    Ordering other = (Ordering)obj;
    return ascending == other.ascending && Objects.equals(name, other.name);
  }


  /**
   * @return the name
   */
  public String getName()
  {
    return name;
  }


  /* (non-Javadoc)
   * @see java.lang.Object#hashCode()
   */
  @Override
  public int hashCode()
  {
    return Objects.hash(ascending, name);
  }


  /**
   * @return the ascending
   */
  public boolean isAscending()
  {
    return ascending;
  }


  /**
   * @param ascending the ascending to set
   */
  public void setAscending(
    boolean ascending)
  {
    this.ascending = ascending;
  }


  /**
   * @param name the name to set
   */
  public void setName(
    String name)
  {
    this.name = name;
  }


  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString()
  {
    return "Ordering [name=" + name + ", ascending=" + ascending + "]";
  }
}
