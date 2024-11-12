/**
 * 
 */
package org.drdeesw.commons.organization.models.entities;


import java.time.Instant;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;

import org.drdeesw.commons.common.models.entities.AbstractLongUniqueEntity;
import org.drdeesw.commons.organization.models.OrganizationMember;
import org.drdeesw.commons.organization.models.OrganizationMemberRole;
import org.drdeesw.commons.organization.models.OrganizationRole;


/**
 * 
 */
@SuppressWarnings("serial")
@MappedSuperclass
@Access(AccessType.FIELD)
public abstract class AbstractOrganizationMemberRoleEntity extends AbstractLongUniqueEntity
    implements OrganizationMemberRole
{
  @Column(name = "created_by_id", nullable = false)
  private Long                     createdById;
  @Column(name = "creation_date", nullable = false)
  private Instant                  creationDate;
  @Column(name = "enabled")
  private boolean                  enabled;
  @Column(name = "last_update_date")
  private Instant                  lastUpdateDate;
  @Column(name = "last_update_id")
  private Long                     lastUpdateId;
  @ManyToOne
  @JoinColumn(name = "role_id")
  private OrganizationRoleEntity   role;
  @ManyToOne
  @JoinColumn(name = "member_id")
  private OrganizationMemberEntity member;

  /**
   * 
   */
  protected AbstractOrganizationMemberRoleEntity()
  {
    super();
  }


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
  public OrganizationRole getRole()
  {
    return this.role;
  }


  @Override
  public OrganizationMember getMember()
  {
    return this.member;
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
  public void setRole(
    OrganizationRole role)
  {
    this.role = (OrganizationRoleEntity)role;
  }


  @Override
  public void setMember(
    OrganizationMember member)
  {
    this.member = (OrganizationMemberEntity)member;
  }

}
