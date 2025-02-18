/**
 * 
 */
package org.drdeesw.commons.common.models.pojos;


import org.drdeesw.commons.common.models.NamedLongUniqueObject;


/**
 * @author gary_kephart
 *
 */
public class AbstractNamedLongUniquePojo extends AbstractNamedUniquePojo<Long>
    implements NamedLongUniquePojo
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
   * @param that the object to copy
   */
  public AbstractNamedLongUniquePojo(AbstractNamedLongUniquePojo that)
  {
    super(that);
  }


  /**
   * @param id the id
   * @param name the name
   */
  public AbstractNamedLongUniquePojo(Long id, String name)
  {
    super(id, name);
  }


  /**
   * @param id the id
   */
  public AbstractNamedLongUniquePojo(Long id)
  {
    super(id);
  }


  /**
   * @param name the name
   */
  public AbstractNamedLongUniquePojo(String name)
  {
    super(name);
  }


  /**
   * @param that the object to copy
   */
  public AbstractNamedLongUniquePojo(NamedLongUniqueObject that)
  {
    super(that);
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
