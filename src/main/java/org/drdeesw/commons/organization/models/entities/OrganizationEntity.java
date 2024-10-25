/**
 * 
 */
package org.drdeesw.commons.organization.models.entities;


import javax.persistence.Entity;
import javax.persistence.Table;

import org.drdeesw.commons.common.models.entities.AbstractNamedLongUniqueEntity;
import org.drdeesw.commons.organization.models.Organization;


/**
 * 
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "organizations")
public class OrganizationEntity extends AbstractNamedLongUniqueEntity implements Organization
{

  private String      description;

  @Override
  public AccountType getAccountType()
  {
    return AccountType.ORGANIZATION;
  }


  @Override
  public String getDescription()
  {
    return description;
  }


  @Override
  public void setDescription(
    String description)
  {
    this.description = description;
  }
}
