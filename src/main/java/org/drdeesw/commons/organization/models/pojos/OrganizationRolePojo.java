/**
 * 
 */
package org.drdeesw.commons.organization.models.pojos;


import java.time.Instant;
import java.util.Set;

import org.drdeesw.commons.common.models.pojos.AbstractNamedLongUniquePojo;
import org.drdeesw.commons.organization.models.OrganizationRole;
import org.drdeesw.commons.security.models.User;
import org.drdeesw.commons.security.models.pojos.UserPojo;


/**
 * 
 */
@SuppressWarnings("serial")
public class OrganizationRolePojo extends AbstractNamedLongUniquePojo
    implements OrganizationRole<OrganizationPojo, OrganizationMemberRolePojo>
{
  private UserPojo                        createdBy;
  private Instant                         creationDate;
  private String                          description;
  private boolean                         enabled;
  private Instant                         lastUpdateDate;
  private UserPojo                        lastUpdatedBy;
  private Set<OrganizationMemberRolePojo> members;
  private OrganizationPojo                organization;

  @Override
  public UserPojo getCreatedBy()
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
  public Instant getLastUpdateDate()
  {
    return this.lastUpdateDate;
  }


  @Override
  public UserPojo getLastUpdatedBy()
  {
    return this.lastUpdatedBy;
  }


  @Override
  public Set<OrganizationMemberRolePojo> getMemberRoles()
  {
    return members;
  }


  @Override
  public OrganizationPojo getOrganization()
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
    User<?> createdBy)
  {
    this.createdBy = (UserPojo)createdBy;
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
  public void setLastUpdateDate(
    Instant lastUpdateDate)
  {
    this.lastUpdateDate = lastUpdateDate;
  }


  @Override
  public void setLastUpdatedBy(
    User<?> lastUpdatedBy)
  {
     this.lastUpdatedBy = (UserPojo)lastUpdatedBy;
  }


  @Override
  public void setMemberRoles(
    Set<OrganizationMemberRolePojo> members)
  {
    this.members = members;
  }


  @Override
  public void setOrganization(
    OrganizationPojo organization)
  {
    this.organization = organization;
  }
}
