/**
 * 
 */
package org.drdeesw.commons.organization.models.entities;


import java.time.Instant;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.drdeesw.commons.common.models.entities.AbstractLongUniqueEntity;
import org.drdeesw.commons.organization.models.OrganizationRoleMember;


/**
 * 
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "organization_role_members")
@AttributeOverride(name = "id", column = @Column(name = "organization_role_member_id"))
@Access(AccessType.FIELD)
public class OrganizationRoleMemberEntity extends AbstractLongUniqueEntity
    implements OrganizationRoleMember
{
  @Column(name = "created_by_id")
  private Long    createdById;
  @Column(name = "creation_date")
  private Instant creationDate;
  @Column(name = "enabled")
  private boolean enabled;
  @Column(name = "last_update_date")
  private Instant lastUpdateDate;
  @Column(name = "last_update_id")
  private Long    lastUpdateId;
  @Column(name = "organization_role_id")
  private Long    organizationRoleId;
  @Column(name = "user_id")
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
  public Long getOrganizationRoleId()
  {
    return this.organizationRoleId;
  }


  /**
   * @return the systemUserId
   */
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


  /**
   * @param organizationRoleId the organizationRoleId to set
   */
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
