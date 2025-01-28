/**
 * 
 */
package org.drdeesw.commons.organization.models.pojos;


import java.time.Instant;

import org.drdeesw.commons.common.models.pojos.AbstractLongUniquePojo;
import org.drdeesw.commons.organization.models.OrganizationMemberRole;
import org.drdeesw.commons.security.models.User;
import org.drdeesw.commons.security.models.pojos.UserPojo;


/**
 * 
 */
@SuppressWarnings("serial")
public class OrganizationMemberRolePojo extends AbstractLongUniquePojo
    implements OrganizationMemberRole<OrganizationMemberPojo, OrganizationRolePojo>
{
  private UserPojo               createdBy;
  private Instant                creationDate;
  private boolean                enabled;
  private Instant                lastUpdateDate;
  private UserPojo               lastUpdatedBy;
  private OrganizationMemberPojo member;
  private OrganizationRolePojo   role;

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
  public OrganizationMemberPojo getMember()
  {
    return this.member;
  }


  @Override
  public OrganizationRolePojo getRole()
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
  public void setMember(
    OrganizationMemberPojo member)
  {
    this.member = (OrganizationMemberPojo)member;
  }


  @Override
  public void setRole(
    OrganizationRolePojo role)
  {
    this.role = (OrganizationRolePojo)role;
  }

}
