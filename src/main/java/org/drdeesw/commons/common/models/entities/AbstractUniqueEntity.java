/**
 * 
 */
package org.drdeesw.commons.common.models.entities;


import java.io.Serializable;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.drdeesw.commons.common.models.UniqueObject;
import org.hibernate.annotations.GenericGenerator;


/**
 * Represents a unique object.
 * 
 * @author gary_kephart
 *
 */
@SuppressWarnings("serial")
@MappedSuperclass
@Access(AccessType.PROPERTY) // Use getter/setter for access
public abstract class AbstractUniqueEntity<ID extends Serializable> implements UniqueEntity<ID>
{
  private ID id;

  /**
   * The default constructor.
   */
  protected AbstractUniqueEntity()
  {
  }


  /**
   * Constructs an object with the given id.
   * 
   * @param id the ID of the object to construct
   */
  protected AbstractUniqueEntity(ID id)
  {
    this.id = id;
  }


  /**
   * Constructs a copy of the given object.
   * 
   * @param that the object to copy
   */
  protected AbstractUniqueEntity(UniqueObject<ID> that)
  {
    this.id = that.getId();
  }


  /**
   * @param <T> the type of the object
   * @return the object
   */
  @SuppressWarnings("unchecked")
  protected <T extends AbstractUniqueEntity<ID>> T cast()
  {
    return (T)this;
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
    @SuppressWarnings("unchecked")
    AbstractUniqueEntity<ID> other = (AbstractUniqueEntity<ID>)obj;
    if (this.id == null)
    {
      if (other.id != null)
        return false;
    }
    else if (!id.equals(other.id))
      return false;
    return true;
  }


  /**
   * @param value1 the first value to compare
   * @param value2 the second value to compare
   * @return true if the values are equal, false otherwise
   */
  public boolean equalsWithNullCheck(
    Object value1,
    Object value2)
  {
    return (value1 == null && value2 == null)
           || (value1 != null && value2 != null && value1.equals(value2));
  }


  /**
   * Returns the ID of the object.
   * Subclasses need to specify the Column annotation in their getId() method.
   * 
   * @return the unique id of the object.
   */
  @Override
  @Id
  @GenericGenerator(name = "native", strategy = "native")
  @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
  @Column(name = "id")
  public ID getId()
  {
    return this.id;
  }


  /* (non-Javadoc)
   * @see java.lang.Object#hashCode()
   */
  @Override
  public int hashCode()
  {
    final int prime = 31;
    int result = 1;

    result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());

    return result;
  }


  /* (non-Javadoc)
   * @see com.dr_dee_sw.commons.dto.UniqueObject#setId(java.io.Serializable)
   */
  @Override
  public void setId(
    ID id)
  {
    this.id = id;
  }


  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString()
  {
    return "{class:" + this.getClass().getSimpleName() + ",id:" + this.id + "}";
  }


  /**
   * @param that the object
   */
  public void update(
    AbstractUniqueEntity<ID> that)
  {
    this.id = that.id;
  }
}
