/**
 * 
 */
package org.drdeesw.commons.common.models.entities;


import javax.persistence.MappedSuperclass;

import org.drdeesw.commons.common.models.LongUniqueObject;


/**
 * @author gary_kephart
 *
 */
@MappedSuperclass
public abstract class AbstractLongUniqueEntity extends AbstractUniqueEntity<Long>
    implements LongUniqueEntity
{
  private static final long serialVersionUID = -9190810275366831598L;


  /**
   * Hibernate
   */
  protected AbstractLongUniqueEntity()
  {
  }


  /**
   * @param that the entity to copy
   */
  protected AbstractLongUniqueEntity(LongUniqueObject that)
  {
    super(that);
  }


  /**
   * @param id the ID of the entity
   */
  protected AbstractLongUniqueEntity(Long id)
  {
    super(id);
  }


  /**
   * @param that the entity to copy
   */
  public void update(
    AbstractLongUniqueEntity that)
  {
    super.update(that);
  }

}
