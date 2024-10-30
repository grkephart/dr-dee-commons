/**
 * 
 */
package org.drdeesw.commons.organization.models.entities;


import java.time.Instant;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import org.drdeesw.commons.common.models.entities.AbstractLongUniqueEntity;
import org.drdeesw.commons.organization.models.OrganizationMember;


/**
 * 
 */
@SuppressWarnings("serial")
@MappedSuperclass
@Access(AccessType.FIELD)
public abstract class AbstractOrganizationMemberEntity extends AbstractLongUniqueEntity
    implements OrganizationMember
{
  @Column(name = "created_by_id", nullable = false)
  private Long    createdById;
  @Column(name = "creation_date", nullable = false)
  private Instant creationDate;
  @Column(name = "enabled")
  private boolean enabled;
  @Column(name = "last_update_date")
  private Instant lastUpdateDate;
  @Column(name = "last_update_id")
  private Long    lastUpdateId;
  @Column(name = "organization_id")
  private Long    organizationId;
  @Column(name = "organization_role_id")
  private Long    roleId;
  @Column(name = "user_id")
  private Long    systemUserId;
  /**
   * 
   */
  protected AbstractOrganizationMemberEntity()
  {
    super();
  }


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
