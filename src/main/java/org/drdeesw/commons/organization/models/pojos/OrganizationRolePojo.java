/**
 * 
 */
package org.drdeesw.commons.organization.models.pojos;


import org.drdeesw.commons.common.models.pojos.AbstractNamedLongUniquePojo;
import org.drdeesw.commons.organization.models.Organization;
import org.drdeesw.commons.organization.models.OrganizationRole;


/**
 * 
 */
@SuppressWarnings("serial")
public class OrganizationRolePojo extends AbstractNamedLongUniquePojo implements OrganizationRole
{
  private String           description;
  private OrganizationPojo organization;

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
    this.organization = (OrganizationPojo)organization;
  }
}
