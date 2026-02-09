/**
 * 
 */
package org.drdeesw.commons.common.models.entities;


import javax.persistence.MappedSuperclass;

import org.drdeesw.commons.common.models.StringUniqueObject;


/**
 * @author gary_kephart
 *
 */
@MappedSuperclass
public abstract class AbstractStringUniqueEntity extends AbstractUniqueEntity<String>
    implements StringUniqueEntity
{
  private static final long serialVersionUID = -9190810275366831598L;


  /**
   * Hibernate
   */
  protected AbstractStringUniqueEntity()
  {
  }


  /**
   * @param that  The object to copy
   */
  protected AbstractStringUniqueEntity(StringUniqueObject that)
  {
    super(that);
  }


}
