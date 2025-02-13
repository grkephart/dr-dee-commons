package org.drdeesw.commons.organization.models.pojos;


import java.time.Instant;
import java.util.Set;

import org.drdeesw.commons.common.models.pojos.AbstractLongUniquePojo;
import org.drdeesw.commons.organization.models.OrganizationMember;
import org.drdeesw.commons.security.models.pojos.AbstractUserPojo;


@SuppressWarnings("serial")
public abstract class AbstractOrganizationMemberPojo<//
    U extends AbstractUserPojo<?>, //
    O extends AbstractOrganizationPojo<U, ?, ?, ?, ?, ?>, //
    MR extends AbstractOrganizationMemberRolePojo<U, ?, ?>> //
    extends AbstractLongUniquePojo implements OrganizationMember<U, O, MR>
{
  protected U       createdBy;
  protected Instant creationDate;
  protected boolean enabled;
  protected Instant lastUpdateDate;
  protected U       lastUpdatedBy;
  protected O       organization;
  protected Set<MR>  memberRoles;
  protected U       user;

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
