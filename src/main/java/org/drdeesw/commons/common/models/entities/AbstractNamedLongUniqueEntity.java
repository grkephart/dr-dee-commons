/**
 * 
 */
package org.drdeesw.commons.common.models.entities;

import javax.persistence.MappedSuperclass;

import org.drdeesw.commons.common.models.NamedLongUniqueObject;

/**
 * @author gary_kephart
 *
 */
@MappedSuperclass
public class AbstractNamedLongUniqueEntity extends AbstractNamedUniqueEntity<Long>
    implements NamedLongUniqueEntity
{
  private static final long serialVersionUID = 6902141588206147324L;

  /**
   * 
   */
  protected AbstractNamedLongUniqueEntity()
  {
    super();
  }


  /**
   * @param that the object to copy
   */
  protected AbstractNamedLongUniqueEntity(NamedLongUniqueObject that)
  {
    super(that);
  }


  /**
   * @param id the id
   * @param name the name
   */
  protected AbstractNamedLongUniqueEntity(Long id, String name)
  {
    super(id, name);
  }


  /**
   * @param id the id
   */
  protected AbstractNamedLongUniqueEntity(Long id)
  {
    super(id);
  }


  /**
   * @param name the name
   */
  protected AbstractNamedLongUniqueEntity(String name)
  {
    super(name);
  }


}
