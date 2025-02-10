/**
 * 
 */
package org.drdeesw.commons.organization.models.pojos;


import java.time.Instant;

import org.drdeesw.commons.common.models.pojos.AbstractNamedLongUniquePojo;
import org.drdeesw.commons.organization.models.OrganizationMemberRole;
import org.drdeesw.commons.security.models.pojos.UserPojo;


/**
 * 
 */
@SuppressWarnings("serial")
public class OrganizationMemberRolePojo<//
    U extends UserPojo<?>, //
    M extends OrganizationMemberPojo<U, ?, ?>, //
    R extends OrganizationRolePojo<U, ?, ?>> //
    extends AbstractNamedLongUniquePojo implements OrganizationMemberRole<U, M, R>
{
  private U       createdBy;
  private Instant creationDate;
  private boolean enabled;
  private Instant lastUpdateDate;
  private U       lastUpdatedBy;
  private M       member;
  private R       role;

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
