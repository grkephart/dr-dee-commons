/**
 * 
 */
package org.drdeesw.commons.modules.common.models.pojos;


import org.drdeesw.commons.modules.common.models.StringUniqueObject;


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
   * @param that
   */
  protected AbstractStringUniquePojo(StringUniqueObject that)
  {
    super(that);
  }


  /**
   * @param id
   */
  protected AbstractStringUniquePojo(String id)
  {
    super(id);
  }


  /**
   * @param that
   */
  public void update(
    AbstractStringUniquePojo that)
  {
    super.update(that);
  }

}
