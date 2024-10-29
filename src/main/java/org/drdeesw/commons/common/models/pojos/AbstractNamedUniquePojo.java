package org.drdeesw.commons.common.models.pojos;


import java.io.Serializable;

import org.drdeesw.commons.common.models.NamedObject;
import org.drdeesw.commons.common.models.NamedUniqueObject;


/**
 * @author gary_kephart
 *
 * @param <ID> the ID class
 */
public abstract class AbstractNamedUniquePojo<ID extends Serializable> extends
    AbstractUniquePojo<ID> implements Comparable<NamedObject>, NamedUniqueObject<ID>
{
  private static final long serialVersionUID = -6603247573392458671L;
  private String            name;


  /**
   * 
   */
  protected AbstractNamedUniquePojo()
  {
  }


  /**
   * @param id the id
   */
  protected AbstractNamedUniquePojo(ID id)
  {
    super(id);
  }


  /**
   * @param id the id
   * @param name the name
   */
  protected AbstractNamedUniquePojo(ID id, String name)
  {
    super(id);
    this.name = name;
  }


  /**
   * @param name the name
   */
  protected AbstractNamedUniquePojo(String name)
  {
    this.name = name;
  }


  /**
   * @param that the object to copy
   */
  protected AbstractNamedUniquePojo(AbstractNamedUniquePojo<ID> that)
  {
    super(that);
    this.name = that.getName();
  }



  /**
   * @param that the object to copy
   */
  public AbstractNamedUniquePojo(NamedUniqueObject<ID> that)
  {
    super(that);
    this.name = that.getName();
  }


  /* (non-Javadoc)
   * @see java.lang.Comparable#compareTo(java.lang.Object)
   */
  @Override
  public int compareTo(
    NamedObject o)
  {
    NamedObject that = (NamedObject)o;

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


  /* (non-Javadoc)
   * @see java.lang.Object#equals(java.lang.Object)
   */
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
    @SuppressWarnings("unchecked")
    AbstractNamedUniquePojo<ID> other = (AbstractNamedUniquePojo<ID>)obj;
    if (this.name == null)
    {
      if (other.name != null)
        return false;
    }
    else if (!this.name.equals(other.name))
      return false;
    return true;
  }


  /**
   * 
   */
  @Override
  public String getName()
  {
    return this.name;
  }


  /* (non-Javadoc)
   * @see java.lang.Object#hashCode()
   */
  @Override
  public int hashCode()
  {
    final int prime = 31;
    int result = super.hashCode();
    result = prime * result + ((this.name == null) ? 0 : this.name.hashCode());
    return result;
  }


  /* (non-Javadoc)
   * @see com.dr_dee_sw.commons.dto.RenameableObject#setName(java.lang.String)
   */
  @SuppressWarnings("unchecked")
  @Override
  public <NO extends NamedObject> NO setName(
    String name)
  {
    this.name = name;

    return (NO)cast();
  }



  /* (non-Javadoc)
   * @see com.dr_dee_sw.commons.dto.AbstractUniqueObject#toString()
   */
  @Override
  public String toString()
  {
    return "{class:" + this.getClass().getSimpleName() + ",id:" + getId() + ",name:'" + this.name
           + "'}";
  }


  /**
   * @param that the object to update
   */
  public void update(
    AbstractNamedUniquePojo<ID> that)
  {
    super.update(that);
    this.name = that.name;
  }


}
