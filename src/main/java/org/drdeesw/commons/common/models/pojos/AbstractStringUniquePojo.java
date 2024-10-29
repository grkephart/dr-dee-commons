/**
 * 
 */
package org.drdeesw.commons.common.models.pojos;


import org.drdeesw.commons.common.models.StringUniqueObject;


/**
 * @author gary_kephart
 *
 */
public abstract class AbstractStringUniquePojo extends AbstractUniquePojo<String>
    implements StringUniqueObject
{
  private static final long serialVersionUID = -9190810275366831598L;


  /**
   * Hibernate
   */
  protected AbstractStringUniquePojo()
  {
  }


  /**
   * @param that the object to copy
   */
  protected AbstractStringUniquePojo(StringUniqueObject that)
  {
    super(that);
  }


  /**
   * @param id  the unique id
   */
  protected AbstractStringUniquePojo(String id)
  {
    super(id);
  }


  /**
   * @param that the object to copy
   */
  public void update(
    AbstractStringUniquePojo that)
  {
    super.update(that);
  }

}
