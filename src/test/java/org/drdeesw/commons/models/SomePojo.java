package org.drdeesw.commons.models;


import org.drdeesw.commons.models.pojos.AbstractNamedUniquePojo;


@SuppressWarnings("serial")
public class SomePojo extends AbstractNamedUniquePojo<Long> implements SomeModel
{
  private String description;

  /**
   * 
   */
  public SomePojo()
  {

  }


  /* (non-Javadoc)
   * @see org.drdeesw.commons.models.SomeModel#getDescription()
   */
  @Override
  public String getDescription()
  {
    return this.description;
  }


  /* (non-Javadoc)
   * @see org.drdeesw.commons.models.SomeModel#setDescription(java.lang.String)
   */
  @Override
  public void setDescription(
    String description)
  {
    this.description = description;
  }
}