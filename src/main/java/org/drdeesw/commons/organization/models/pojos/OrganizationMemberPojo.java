/**
 * 
 */
package org.drdeesw.commons.organization.models.pojos;


import java.time.Instant;
import java.util.Set;

import org.drdeesw.commons.common.models.pojos.AbstractLongUniquePojo;
import org.drdeesw.commons.organization.models.OrganizationMember;
import org.drdeesw.commons.security.models.User;
import org.drdeesw.commons.security.models.pojos.UserPojo;


/**
 * 
 */
@SuppressWarnings("serial")
public class OrganizationMemberPojo extends AbstractLongUniquePojo
    implements OrganizationMember<OrganizationMemberRolePojo, OrganizationPojo, UserPojo>
{
  private UserPojo                        createdBy;
  private Instant                         creationDate;
  private boolean                         enabled;
  private Instant                         lastUpdateDate;
  private UserPojo                        lastUpdatedBy;
  private OrganizationPojo                organization;
  private Set<OrganizationMemberRolePojo> roles;
  private UserPojo                        user;

  @Override
  public UserPojo getCreatedBy()
  {
    return createdBy;
  }


  @Override
  public Instant getCreationDate()
  {
    return creationDate;
  }


  @Override
  public Instant getLastUpdateDate()
  {
    return lastUpdateDate;
  }


  @Override
  public UserPojo getLastUpdatedBy()
  {
    return lastUpdatedBy;
  }


  @Override
  public Set<OrganizationMemberRolePojo> getMemberRoles()
  {
    return this.roles;
  }


  @Override
  public OrganizationPojo getOrganization()
  {
    return this.organization;
  }


  @Override
  public UserPojo getUser()
  {
    return this.user;
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
    Set<OrganizationMemberRolePojo> roles)
  {
    this.roles = roles;
  }


  @Override
  public void setOrganization(
    OrganizationPojo organization)
  {
    this.organization = organization;
  }


  @Override
  public void setUser(
    UserPojo user)
  {
    this.user = user;
  }

}
