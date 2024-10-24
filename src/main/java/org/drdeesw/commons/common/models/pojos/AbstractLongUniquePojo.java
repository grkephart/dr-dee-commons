/**
 * 
 */
package org.drdeesw.commons.common.models.pojos;


import org.drdeesw.commons.common.models.LongUniqueObject;


/**
 * @author gary_kephart
 *
 */
public abstract class AbstractLongUniquePojo extends AbstractUniquePojo<Long>
    implements LongUniqueObject
{
  private static final long serialVersionUID = -9190810275366831598L;


  /**
   * Hibernate
   */
  protected AbstractLongUniquePojo()
  {
  }


  /**
   * @param that
   */
  protected AbstractLongUniquePojo(LongUniqueObject that)
  {
    super(that);
  }


  /**
   * @param id
   */
  protected AbstractLongUniquePojo(Long id)
  {
    super(id);
  }


  /**
   * @param that
   */
  public void update(
    AbstractLongUniquePojo that)
  {
    super.update(that);
  }

}
