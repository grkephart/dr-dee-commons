package org.drdeesw.commons.models;


import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Table;

import org.drdeesw.commons.models.entities.AbstractNamedUniqueEntity;


@SuppressWarnings("serial")
@Table(name = "some_entities")
@Access(AccessType.FIELD)
public class SomeEntity extends AbstractNamedUniqueEntity<Long> implements SomeModel
{
  @Column(name="description")
  private String description;

  public SomeEntity()
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