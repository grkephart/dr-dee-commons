/**
 * 
 */
package org.drdeesw.commons.organization.models.pojos;


import java.time.Instant;
import java.util.Set;

import org.drdeesw.commons.common.models.pojos.AbstractLongUniquePojo;
import org.drdeesw.commons.organization.models.OrganizationMember;
import org.drdeesw.commons.security.models.pojos.UserPojo;


/**
 * 
 */
@SuppressWarnings("serial")
public class OrganizationMemberPojo<//
    U extends UserPojo<?>, //
    R extends OrganizationMemberRolePojo<U, ?, ?>, //
    O extends OrganizationPojo<U, ?, ?, ?, ?, ?>> //
    extends AbstractLongUniquePojo implements OrganizationMember<U, R, O>
{
  private U       createdBy;
  private Instant creationDate;
  private boolean enabled;
  private Instant lastUpdateDate;
  private U       lastUpdatedBy;
  private O       organization;
  private Set<R>  roles;
  private U       user;

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
