/**
 * 
 */
package org.drdeesw.commons.organization.models.pojos;


import java.time.Instant;

import org.drdeesw.commons.common.models.pojos.AbstractLongUniquePojo;
import org.drdeesw.commons.organization.models.OrganizationMember;
import org.drdeesw.commons.organization.models.OrganizationMemberRole;
import org.drdeesw.commons.organization.models.OrganizationRole;


/**
 * 
 */
@SuppressWarnings("serial")
public class OrganizationMemberRolePojo extends AbstractLongUniquePojo
    implements OrganizationMemberRole
{
  private Long                   createdById;
  private Instant                creationDate;
  private boolean                enabled;
  private Instant                lastUpdateDate;
  private Long                   lastUpdateId;
  private OrganizationMemberPojo member;
  private OrganizationRolePojo   role;

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
