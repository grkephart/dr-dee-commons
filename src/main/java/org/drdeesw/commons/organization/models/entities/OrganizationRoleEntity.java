/**
 * 
 */
package org.drdeesw.commons.organization.models.entities;


import javax.persistence.Entity;
import javax.persistence.Table;

import org.drdeesw.commons.common.models.entities.AbstractNamedLongUniqueEntity;
import org.drdeesw.commons.organization.models.Organization;
import org.drdeesw.commons.organization.models.OrganizationRole;


/**
 * 
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "organization_roles")
public class OrganizationRoleEntity extends AbstractNamedLongUniqueEntity
    implements OrganizationRole
{
  private String             description;
  private OrganizationEntity organization;

  @Override
  public String getDescription()
  {
    return description;
  }


  @Override
  public Organization getOrganization()
  {
    return organization;
  }


  @Override
  public void setDescription(
    String description)
  {
    this.description = description;
  }


  @Override
  public void setOrganization(
    Organization organization)
  {
    this.organization = (OrganizationEntity)organization;
  }
}
