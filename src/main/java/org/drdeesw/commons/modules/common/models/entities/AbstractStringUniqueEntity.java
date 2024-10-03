/**
 * 
 */
package org.drdeesw.commons.modules.common.models.entities;


import javax.persistence.MappedSuperclass;

import org.drdeesw.commons.modules.common.models.StringUniqueObject;


/**
 * @author gary_kephart
 *
 */
@MappedSuperclass
public abstract class AbstractStringUniqueEntity extends AbstractUniqueEntity<String>
    implements StringUniqueObject
{
  private static final long serialVersionUID = -9190810275366831598L;


  /**
   * Hibernate
   */
  protected AbstractStringUniqueEntity()
  {
  }


  /**
   * @param that
   */
  protected AbstractStringUniqueEntity(StringUniqueObject that)
  {
    super(that);
  }


  /**
   * @param id
   */
  protected AbstractStringUniqueEntity(String id)
  {
    super(id);
  }


  /**
   * @param that
   */
  public void update(
    AbstractStringUniqueEntity that)
  {
    super.update(that);
  }

}
