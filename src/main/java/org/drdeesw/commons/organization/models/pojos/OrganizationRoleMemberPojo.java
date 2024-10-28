/**
 * 
 */
package org.drdeesw.commons.organization.models.pojos;


import java.time.Instant;

import org.drdeesw.commons.common.models.pojos.AbstractLongUniquePojo;
import org.drdeesw.commons.organization.models.OrganizationRoleMember;


/**
 * 
 */
@SuppressWarnings("serial")
public class OrganizationRoleMemberPojo extends AbstractLongUniquePojo
    implements OrganizationRoleMember
{
  private Long    createdById;
  private Instant creationDate;
  private boolean enabled;
  private Instant lastUpdateDate;
  private Long    lastUpdateId;
  private Long    organizationRoleId;
  private Long    systemUserId;

  /**
   * @return the createdById
   */
  @Override
  public Long getCreatedById()
  {
    return createdById;
  }


  /**
   * @return the creationDate
   */
  @Override
  public Instant getCreationDate()
  {
    return creationDate;
  }


  /**
   * @return the lastUpdateDate
   */
  @Override
  public Instant getLastUpdateDate()
  {
    return lastUpdateDate;
  }


  /**
   * @return the lastUpdateId
   */
  @Override
  public Long getLastUpdateId()
  {
    return lastUpdateId;
  }


  @Override
  public Long getOrganizationRoleId()
  {
    return this.organizationRoleId;
  }


  /**
   * @return the systemUserId
   */
  @Override
  public Long getSystemUserId()
  {
    return systemUserId;
  }


  @Override
  public boolean isEnabled()
  {
    return this.enabled;
  }


  /**
   * @param createdById the createdById to set
   */
  @Override
  public void setCreatedById(
    Long createdById)
  {
    this.createdById = createdById;
  }


  /**
   * @param creationDate the creationDate to set
   */
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


  /**
   * @param lastUpdateDate the lastUpdateDate to set
   */
  @Override
  public void setLastUpdateDate(
    Instant lastUpdateDate)
  {
    this.lastUpdateDate = lastUpdateDate;
  }


  /**
   * @param lastUpdateId the lastUpdateId to set
   */
  @Override
  public void setLastUpdateId(
    Long lastUpdateId)
  {
    this.lastUpdateId = lastUpdateId;
  }


  /**
   * @param organizationRoleId the organizationRoleId to set
   */
  @Override
  public void setOrganizationRoleId(
    Long organizationRoleId)
  {
    this.organizationRoleId = organizationRoleId;
  }


  @Override
  public void setSystemUserId(
    Long systemUserId)
  {
    this.systemUserId = systemUserId;
  }

}
