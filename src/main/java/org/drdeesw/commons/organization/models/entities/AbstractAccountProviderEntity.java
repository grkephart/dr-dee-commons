/**
 * 
 */
package org.drdeesw.commons.organization.models.entities;


import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import org.drdeesw.commons.common.models.entities.AbstractNamedLongUniqueEntity;
import org.drdeesw.commons.organization.models.AccountProvider;


/**
 * 
 */
@SuppressWarnings("serial")
@MappedSuperclass
@Access(AccessType.FIELD)
public abstract class AbstractAccountProviderEntity extends AbstractNamedLongUniqueEntity
    implements AccountProvider
{
  @Column(name = "description")
  private String                     description;

  @Override
  public String getDescription()
  {
    return this.description;
  }


  @Override
  public void setDescription(
    String description)
  {
    this.description = description;
  }

}
