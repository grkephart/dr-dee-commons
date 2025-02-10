/**
 * 
 */
package org.drdeesw.commons.organization.models.pojos;


import java.time.Instant;
import java.util.Set;

import org.drdeesw.commons.common.models.pojos.AbstractNamedLongUniquePojo;
import org.drdeesw.commons.organization.models.OrganizationRole;
import org.drdeesw.commons.security.models.pojos.UserPojo;


/**
 * ChatGPT's version as of 2025-02-09 9:20 PM PST
 */
@SuppressWarnings("serial")
public class OrganizationRolePojo<//
    U extends UserPojo<?>, //
    O extends OrganizationPojo<U, ?, ?, ?, ?, ?>, //
    M extends OrganizationMemberRolePojo<U, ?, ?>> //
    extends AbstractNamedLongUniquePojo implements OrganizationRole<U, O, M>
{
  private U       createdBy;
  private Instant creationDate;
  private String  description;
  private boolean enabled;
  private Instant lastUpdateDate;
  private U       lastUpdatedBy;
  private Set<M>  members;
  private O       organization;

  @Override
  public U getCreatedBy()
  {
    return this.createdBy;
  }


  @Override
  public Instant getCreationDate()
  {
    return this.creationDate;
  }


  @Override
  public String getDescription()
  {
    return description;
  }


  @Override
  public Instant getLastUpdateDate()
  {
    return this.lastUpdateDate;
  }


  @Override
  public U getLastUpdatedBy()
  {
    return this.lastUpdatedBy;
  }


  @Override
  public Set<M> getMemberRoles()
  {
    return this.members;
  }


  @Override
  public O getOrganization()
  {
    return this.organization;
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
  public void setDescription(
    String description)
  {
    this.description = description;
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
    Set<M> members)
  {
    this.members = members;
  }


  @Override
  public void setOrganization(
    O organization)
  {
    this.organization = organization;
  }
}