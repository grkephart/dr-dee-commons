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
@Access(AccessType.FIELD)
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
   * Constructs a copy of the given object.
   * 
   * @param that the object to copy
   */
  protected AbstractUniqueEntity(UniqueObject<ID> that)
  {
    // intentionally does NOT copy id
  }


  /**
   * @param <T> the type of the object
   * @return the object
   */
  @SuppressWarnings("unchecked")
  protected <T extends AbstractUniqueEntity<ID>> T cast()
  {
    return (T) this;
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
    if (obj == null || getClass() != obj.getClass()) return false;
    
    @SuppressWarnings("unchecked")
    AbstractUniqueEntity<ID> other = (AbstractUniqueEntity<ID>) obj;
    
    // transient entities are never equal
    if (this.id == null || other.id == null) return false;

    return this.id.equals(other.id);
  }


  /**
   * Returns the ID of the object. Subclasses need to specify the Column
   * annotation in their getId() method.
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


  /*
   * (non-Javadoc)
   * 
   * @see java.lang.Object#hashCode()
   */
  @Override
  public int hashCode()
  {
    return getClass().hashCode();
  }


  /*
   * (non-Javadoc)
   * 
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString()
  {
    return "{class:" + this.getClass().getSimpleName() + ",id:" + this.id + "}";
  }
}
