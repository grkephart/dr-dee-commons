/**
 * 
 */
package org.drdeesw.commons.organization.models.pojos;


import java.time.Instant;

import org.drdeesw.commons.common.models.pojos.AbstractLongUniquePojo;
import org.drdeesw.commons.organization.models.OrganizationMember;


/**
 * 
 */
@SuppressWarnings("serial")
public class OrganizationMemberPojo extends AbstractLongUniquePojo implements OrganizationMember
{
  private Long    createdById;
  private Instant creationDate;
  private boolean enabled;
  private Instant lastUpdateDate;
  private Long    lastUpdateId;
  private Long    organizationId;
  private Long    roleId;
  private Long    systemUserId;

  /**
   * @return the createdById
   */
  public Long getCreatedById()
  {
    return createdById;
  }


  /**
   * @return the creationDate
   */
  public Instant getCreationDate()
  {
    return creationDate;
  }


  /**
   * @return the lastUpdateDate
   */
  public Instant getLastUpdateDate()
  {
    return lastUpdateDate;
  }


  /**
   * @return the lastUpdateId
   */
  public Long getLastUpdateId()
  {
    return lastUpdateId;
  }


  @Override
  public Long getOrganizationId()
  {
    return this.organizationId;
  }


  @Override
  public Long getRoleId()
  {
    return this.roleId;
  }


  @Override
  public Long getSystemUserId()
  {
    return this.systemUserId;
  }


  @Override
  public boolean isEnabled()
  {
    return this.enabled;
  }


  /**
   * @param createdById the createdById to set
   */
  public void setCreatedById(
    Long createdById)
  {
    this.createdById = createdById;
  }


  /**
   * @param creationDate the creationDate to set
   */
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


  /**
   * @param lastUpdateDate the lastUpdateDate to set
   */
  public void setLastUpdateDate(
    Instant lastUpdateDate)
  {
    this.lastUpdateDate = lastUpdateDate;
  }


  /**
   * @param lastUpdateId the lastUpdateId to set
   */
  public void setLastUpdateId(
    Long lastUpdateId)
  {
    this.lastUpdateId = lastUpdateId;
  }


  @Override
  public void setOrganizationId(
    Long organizationId)
  {
    this.organizationId = organizationId;
  }


  /**
   * @param roleId the roleId to set
   */
  public void setRoleId(
    Long roleId)
  {
    this.roleId = roleId;
  }


  @Override
  public void setSystemUserId(
    Long systemUserId)
  {
    this.systemUserId = systemUserId;
  }

}
