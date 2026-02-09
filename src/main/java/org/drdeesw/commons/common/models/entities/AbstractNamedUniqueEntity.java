package org.drdeesw.commons.common.models.entities;


import java.io.Serializable;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import org.drdeesw.commons.common.models.Named;
import org.drdeesw.commons.common.models.NamedUniqueObject;


/**
 * @author gary_kephart
 *
 * @param <ID> the ID class
 */
@SuppressWarnings("serial")
@MappedSuperclass
@Access(value = AccessType.PROPERTY)
public abstract class AbstractNamedUniqueEntity<ID extends Serializable> extends AbstractUniqueEntity<ID>
    implements Comparable<Named>, NamedUniqueEntity<ID>, UniqueEntity<ID>
{
  @Column(name = "authority")
  private String name;


  /**
   * 
   */
  protected AbstractNamedUniqueEntity()
  {
  }



  /**
   * @param name the name of the entity
   */
  protected AbstractNamedUniqueEntity(String name)
  {
    this.name = name;
  }


  /**
   * @param that the entity to copy
   */
  protected AbstractNamedUniqueEntity(NamedUniqueObject<ID> that)
  {
    super(that);
    this.name = that.getName();
  }


  /*
   * (non-Javadoc)
   * 
   * @see java.lang.Comparable#compareTo(java.lang.Object)
   */
  @Override
  public int compareTo(Named o)
  {
    Named that = (Named) o;

    if (this.getName() == null && that.getName() == null)
      return 0;
    else if (this.getName() == null)
      return -1;
    else if (that.getName() == null)
      return 1;
    else
    {
      return this.getName().compareTo(that.getName());
    }
  }


  /*
   * (non-Javadoc)
   * 
   * @see java.lang.Object#equals(java.lang.Object)
   */
  @Override
  public boolean equals(Object obj)
  {
    if (this == obj)
      return true;
    if (!super.equals(obj))
      return false;
    if (getClass() != obj.getClass())
      return false;
    @SuppressWarnings("unchecked")
    AbstractNamedUniqueEntity<ID> other = (AbstractNamedUniqueEntity<ID>) obj;
    if (this.name == null)
    {
      if (other.name != null)
        return false;
    } else if (!this.name.equals(other.name))
      return false;
    return true;
  }


  /**
   * Subclasses can specify the Column annotation.
   */
  @Override
  @Column(name = "name")
  public String getName()
  {
    return this.name;
  }


  /*
   * (non-Javadoc)
   * 
   * @see java.lang.Object#hashCode()
   */
  @Override
  public int hashCode()
  {
    final int prime  = 31;
    int       result = super.hashCode();
    result = prime * result + ((this.name == null) ? 0 : this.name.hashCode());
    return result;
  }


  /*
   * (non-Javadoc)
   * 
   * @see com.dr_dee_sw.commons.dto.RenameableObject#setName(java.lang.String)
   */
  @Override
  public void setName(String name)
  {
    this.name = name;
  }


  /*
   * (non-Javadoc)
   * 
   * @see com.dr_dee_sw.commons.dto.AbstractUniqueObject#toString()
   */
  @Override
  public String toString()
  {
    return "{class:" + this.getClass().getSimpleName() + ",id:" + getId() + ",name:'" + this.name + "'}";
  }


}
