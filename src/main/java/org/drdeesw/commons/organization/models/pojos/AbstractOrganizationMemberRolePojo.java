package org.drdeesw.commons.organization.models.pojos;


import java.time.Instant;

import org.drdeesw.commons.common.models.pojos.AbstractLongUniquePojo;
import org.drdeesw.commons.organization.models.OrganizationMemberRole;
import org.drdeesw.commons.security.models.pojos.AbstractUserPojo;


@SuppressWarnings("serial")
public abstract class AbstractOrganizationMemberRolePojo<//
    U extends AbstractUserPojo<?>, //
    M extends AbstractOrganizationMemberPojo<U, ?, ?>, // Organization Member
    R extends AbstractOrganizationRolePojo<U, ?, ?>> // Organization Role
    extends AbstractLongUniquePojo implements OrganizationMemberRole<U, M, R>
{
  protected U       createdBy;
  protected Instant creationDate;
  protected boolean enabled;
  protected Instant lastUpdateDate;
  protected U       lastUpdatedBy;
  protected M       member;
  protected R       role;

  protected AbstractOrganizationMemberRolePojo()
  {
  }


  @Override
  public U getCreatedBy()
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
  public U getLastUpdatedBy()
  {
    return lastUpdatedBy;
  }


  @Override
  public M getMember()
  {
    return this.member;
  }


  @Override
  public R getRole()
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
    U createdBy)
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
  public void setLastUpdateDate(
    Instant lastUpdateDate)
  {
    this.lastUpdateDate = lastUpdateDate;
  }


  @Override
  public void setLastUpdatedBy(
    U lastUpdatedBy)
  {
    this.lastUpdatedBy = lastUpdatedBy;
  }


  @Override
  public void setMember(
    M member)
  {
    this.member = member;
  }


  @Override
  public void setRole(
    R role)
  {
    this.role = role;
  }
}
