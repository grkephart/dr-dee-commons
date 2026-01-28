package org.drdeesw.commons.organization.models.pojos;


import java.time.Instant;
import java.util.Set;

import org.drdeesw.commons.common.models.pojos.AbstractLongUniquePojo;
import org.drdeesw.commons.security.models.pojos.BaseUserPojo;


@SuppressWarnings("serial")
public abstract class AbstractOrganizationMemberPojo<//
    U extends BaseUserPojo<?>, //
    O extends BaseOrganizationPojo<U, ?, ?, ?, ?, ?>, //
    MR extends BaseOrganizationMemberRolePojo<U, ?, ?>> //
    extends AbstractLongUniquePojo implements BaseOrganizationMemberPojo<U, O, MR>
{
  private U       createdBy;
  private Instant creationDate;
  private boolean enabled;
  private Instant lastUpdateDate;
  private U       lastUpdatedBy;
  private O       organization;
  private Set<MR>  memberRoles;
  private U       user;

  protected AbstractOrganizationMemberPojo()
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
  public Set<MR> getMemberRoles()
  {
    return this.memberRoles;
  }


  @Override
  public O getOrganization()
  {
    return this.organization;
  }


  @Override
  public U getUser()
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
  public void setMemberRoles(
    Set<MR> memberRoles)
  {
    this.memberRoles = memberRoles;
  }


  @Override
  public void setOrganization(
    O organization)
  {
    this.organization = organization;
  }


  @Override
  public void setUser(
    U user)
  {
    this.user = user;
  }
}
