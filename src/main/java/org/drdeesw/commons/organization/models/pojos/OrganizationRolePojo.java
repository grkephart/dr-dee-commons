/**
 * 
 */
package org.drdeesw.commons.organization.models.pojos;


import java.time.Instant;
import java.util.Set;

import org.drdeesw.commons.common.models.pojos.AbstractNamedLongUniquePojo;
import org.drdeesw.commons.organization.models.Organization;
import org.drdeesw.commons.organization.models.OrganizationMemberRole;
import org.drdeesw.commons.organization.models.OrganizationRole;
import org.drdeesw.commons.security.models.User;


/**
 * 
 */
@SuppressWarnings("serial")
public class OrganizationRolePojo extends AbstractNamedLongUniquePojo implements OrganizationRole
{
  private User                        createdBy;
  private Instant                     creationDate;
  private String                      description;
  private boolean                     enabled;
  private Instant                     lastUpdateDate;
  private User                        lastUpdatedBy;
  private Set<OrganizationMemberRole> members;
  private OrganizationPojo            organization;

  @Override
  public User getCreatedBy()
  {
    return this.createdBy;
  }


  @Override
  public Instant getCreationDate()
  {
    return this.creationDate;
  }


  @Override
  public String getDescription()
  {
    return description;
  }


  @Override
  public Instant getLastUpdatedDate()
  {
    return this.lastUpdateDate;
  }


  @Override
  public User getLastUpdatedBy()
  {
    return this.lastUpdatedBy;
  }


  @Override
  public Set<OrganizationMemberRole> getMemberRoles()
  {
    return members;
  }


  @Override
  public Organization getOrganization()
  {
    return organization;
  }


  @Override
  public boolean isEnabled()
  {
    return this.enabled;
  }


  @Override
  public void setCreatedBy(
    User createdBy)
  {
    this.createdBy = createdBy;
  }


  @Override
  public void setCreationDate(
    Instant creationDate)
  {
    this.creationDate = creationDate;
  }


  @Override
  public void setDescription(
    String description)
  {
    this.description = description;
  }


  @Override
  public void setEnabled(
    boolean enabled)
  {
    this.enabled = enabled;
  }


  @Override
  public void setLastUpdatedDate(
    Instant lastUpdateDate)
  {
    this.lastUpdateDate = lastUpdateDate;
  }


  @Override
  public void setLastUpdatedBy(
    User lastUpdateId)
  {
    this.lastUpdatedBy = lastUpdateId;
  }


  @Override
  public void setMemberRoles(
    Set<OrganizationMemberRole> members)
  {
    this.members = members;
  }


  @Override
  public void setOrganization(
    Organization organization)
  {
    this.organization = (OrganizationPojo)organization;
  }
}
