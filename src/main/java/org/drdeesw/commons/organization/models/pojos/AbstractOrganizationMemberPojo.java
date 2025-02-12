package org.drdeesw.commons.organization.models.pojos;


import java.time.Instant;
import java.util.Set;

import org.drdeesw.commons.common.models.pojos.AbstractLongUniquePojo;
import org.drdeesw.commons.organization.models.OrganizationMember;
import org.drdeesw.commons.security.models.pojos.UserPojo;


@SuppressWarnings("serial")
public abstract class AbstractOrganizationMemberPojo<//
    U extends UserPojo<?>, //
    R extends AbstractOrganizationMemberRolePojo<U, ? extends AbstractOrganizationMemberPojo<U, R, O>, ? extends AbstractOrganizationRolePojo<U, O, ?>>, //
    O extends AbstractOrganizationPojo<U, ?, ?, ?, ?, R>> //
    extends AbstractLongUniquePojo implements OrganizationMember<R, O, U>
{
  protected U       createdBy;
  protected Instant creationDate;
  protected boolean enabled;
  protected Instant lastUpdateDate;
  protected U       lastUpdatedBy;
  protected O       organization;
  protected Set<R>  roles;
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
  public Set<R> getMemberRoles()
  {
    return this.roles;
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
    Set<R> roles)
  {
    this.roles = roles;
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
