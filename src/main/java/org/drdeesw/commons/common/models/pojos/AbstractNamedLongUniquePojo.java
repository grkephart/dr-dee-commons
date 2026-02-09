/**
 * 
 */
package org.drdeesw.commons.common.models.pojos;

/**
 * @author gary_kephart
 *
 */
public abstract class AbstractNamedLongUniquePojo extends AbstractNamedUniquePojo<Long> implements NamedLongUniquePojo
{
  private static final long serialVersionUID = 6902141588206147324L;

  /**
   * 
   */
  public AbstractNamedLongUniquePojo()
  {
    super();
  }


  /**
   * @param name the name
   */
  public AbstractNamedLongUniquePojo(String name)
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
  public void setId(Long id)
  {
    super.setId(id);
  }
}
