/**
 * 
 */
package org.drdeesw.commons.organization.models.pojos;


import java.time.Instant;

import org.drdeesw.commons.common.models.pojos.AbstractLongUniquePojo;
import org.drdeesw.commons.organization.models.OrganizationMember;
import org.drdeesw.commons.organization.models.OrganizationMemberRole;
import org.drdeesw.commons.organization.models.OrganizationRole;
import org.drdeesw.commons.security.models.User;


/**
 * 
 */
@SuppressWarnings("serial")
public class OrganizationMemberRolePojo extends AbstractLongUniquePojo
    implements OrganizationMemberRole
{
  private User                   createdBy;
  private Instant                creationDate;
  private boolean                enabled;
  private Instant                lastUpdateDate;
  private User                   lastUpdatedBy;
  private OrganizationMemberPojo member;
  private OrganizationRolePojo   role;

  @Override
  public User getCreatedBy()
  {
    return createdBy;
  }


  @Override
  public Instant getCreationDate()
  {
    return creationDate;
  }


  @Override
  public Instant getLastUpdatedDate()
  {
    return lastUpdateDate;
  }


  @Override
  public User getLastUpdatedBy()
  {
    return lastUpdatedBy;
  }


  @Override
  public OrganizationMemberPojo getMember()
  {
    return this.member;
  }


  @Override
  public OrganizationRole getRole()
  {
    return this.role;
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
    User lastUpdatedBy)
  {
    this.lastUpdatedBy = lastUpdatedBy;
  }


  @Override
  public void setMember(
    OrganizationMember member)
  {
    this.member = (OrganizationMemberPojo)member;
  }


  @Override
  public void setRole(
    OrganizationRole role)
  {
    this.role = (OrganizationRolePojo)role;
  }

}
