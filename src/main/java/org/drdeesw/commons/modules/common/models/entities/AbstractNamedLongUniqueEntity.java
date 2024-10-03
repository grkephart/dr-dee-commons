/**
 * 
 */
package org.drdeesw.commons.modules.common.models.entities;

import javax.persistence.MappedSuperclass;

import org.drdeesw.commons.modules.common.models.NamedLongUniqueObject;

/**
 * @author gary_kephart
 *
 */
@MappedSuperclass
public class AbstractNamedLongUniqueEntity extends AbstractNamedUniqueEntity<Long>
    implements NamedLongUniqueObject
{
  private static final long serialVersionUID = 6902141588206147324L;

  /**
   * 
   */
  public AbstractNamedLongUniqueEntity()
  {
    super();
  }


  /**
   * @param that
   */
  public AbstractNamedLongUniqueEntity(NamedLongUniqueObject that)
  {
    super(that);
  }


  /**
   * @param id
   * @param name
   */
  public AbstractNamedLongUniqueEntity(Long id, String name)
  {
    super(id, name);
  }


  /**
   * @param id
   */
  public AbstractNamedLongUniqueEntity(Long id)
  {
    super(id);
  }


  /**
   * @param name
   */
  public AbstractNamedLongUniqueEntity(String name)
  {
    super(name);
  }


  /**
   *
   */
  @Override
  public Long getId()
  {
    return super.getId();
  }


  /**
   *
   */
  @Override
  public void setId(
    Long id)
  {
    super.setId(id);
  }
}
