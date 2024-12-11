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
import org.drdeesw.commons.security.models.User;
import org.drdeesw.commons.security.models.entities.UserEntity;


/**
 * 
 */
@SuppressWarnings("serial")
@MappedSuperclass
@Access(AccessType.FIELD)
public abstract class AbstractOrganizationMemberRoleEntity extends AbstractLongUniqueEntity
    implements OrganizationMemberRole
{
  @ManyToOne
  @JoinColumn(name = "created_by_id", nullable = false)
  private UserEntity               createdBy;
  @Column(name = "creation_date", nullable = false)
  private Instant                  creationDate;
  @Column(name = "enabled")
  private boolean                  enabled;
  @Column(name = "last_update_date")
  private Instant                  lastUpdateDate;
  @ManyToOne
  @JoinColumn(name = "last_update_id")
  private UserEntity               lastUpdatedBy;
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
  public User getCreatedBy()
  {
    return (User)createdBy;
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
  public User getLastUpdatedBy()
  {
    return (User)lastUpdatedBy;
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
  public void setCreatedBy(
    User createdBy)
  {
    this.createdBy = (UserEntity)createdBy;
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
    User lastUpdatedBy)
  {
    this.lastUpdatedBy = (UserEntity)lastUpdatedBy;
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
