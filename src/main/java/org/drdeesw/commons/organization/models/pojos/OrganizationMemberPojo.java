/**
 * 
 */
package org.drdeesw.commons.organization.models.pojos;


import java.time.Instant;
import java.util.Set;
import java.util.stream.Collectors;

import org.drdeesw.commons.common.models.pojos.AbstractLongUniquePojo;
import org.drdeesw.commons.organization.models.Organization;
import org.drdeesw.commons.organization.models.OrganizationMember;
import org.drdeesw.commons.organization.models.OrganizationMemberRole;
import org.drdeesw.commons.security.models.User;
import org.drdeesw.commons.security.models.pojos.UserPojo;


/**
 * 
 */
@SuppressWarnings("serial")
public class OrganizationMemberPojo extends AbstractLongUniquePojo implements OrganizationMember
{
  private Long                            createdById;
  private Instant                         creationDate;
  private boolean                         enabled;
  private Instant                         lastUpdateDate;
  private Long                            lastUpdateId;
  private OrganizationPojo                organization;
  private Set<OrganizationMemberRolePojo> roles;
  private UserPojo                  systemUser;

  @Override
  public Long getCreatedById()
  {
    return createdById;
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
  public Long getLastUpdateId()
  {
    return lastUpdateId;
  }


  @Override
  public Organization getOrganization()
  {
    return this.organization;
  }


  @Override
  public Set<OrganizationMemberRole> getMemberRoles()
  {
    return this.roles.stream()//
        .map(member -> (OrganizationMemberRole)member)//
        .collect(Collectors.toSet());
  }


  @Override
  public User getSystemUser()
  {
    return this.systemUser;
  }


  @Override
  public boolean isEnabled()
  {
    return this.enabled;
  }


  @Override
  public void setCreatedById(
    Long createdById)
  {
    this.createdById = createdById;
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
  public void setLastUpdateId(
    Long lastUpdateId)
  {
    this.lastUpdateId = lastUpdateId;
  }


  @Override
  public void setOrganization(
    Organization organization)
  {
    this.organization = (OrganizationPojo)organization;
  }


  @Override
  public void setMemberRoles(
    Set<OrganizationMemberRole> roles)
  {
    this.roles = roles.stream()//
        .map(role -> (OrganizationMemberRolePojo)role)//
        .collect(Collectors.toSet());
  }


  @Override
  public void setSystemUser(
    User systemUser)
  {
    this.systemUser = (UserPojo)systemUser;
  }

}
