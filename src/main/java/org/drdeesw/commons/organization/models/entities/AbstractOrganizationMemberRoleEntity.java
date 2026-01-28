/**
 * 
 */
package org.drdeesw.commons.organization.models.entities;


import java.time.Instant;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;

import org.drdeesw.commons.common.models.EmbeddedAuditable;
import org.drdeesw.commons.common.models.entities.AbstractNamedLongUniqueEntity;
import org.drdeesw.commons.organization.models.OrganizationMemberRole;
import org.drdeesw.commons.security.models.entities.AbstractUserEntity;


/**
 * 
 */
@SuppressWarnings("serial")
@MappedSuperclass
@Access(AccessType.PROPERTY)
public abstract class AbstractOrganizationMemberRoleEntity<//
    U extends AbstractUserEntity<?>, //
    M extends AbstractOrganizationMemberEntity<U, ?, ?>, //
    R extends AbstractOrganizationRoleEntity<U, ?, ?>> //
    extends AbstractNamedLongUniqueEntity implements OrganizationMemberRole<U, M, R>
{
  @Embedded
  private EmbeddedAuditable<U> audit;
  private boolean              enabled = true;
  private M                    member;
  private R                    role;

  /**
   * 
   */
  protected AbstractOrganizationMemberRoleEntity()
  {
    super();
  }


  @Override
  public U getCreatedBy()
  {
    return this.audit.getCreatedBy();
  }


  @Override
  public Instant getCreationDate()
  {
    return this.audit.getCreationDate();
  }


  @Override
  public Instant getLastUpdateDate()
  {
    return this.audit.getLastUpdateDate();
  }


  @Override
  public U getLastUpdatedBy()
  {
    return this.audit.getLastUpdatedBy();
  }


  @Override
  @ManyToOne
  @JoinColumn(name = "member_id")
  public M getMember()
  {
    return this.member;
  }


  @Override
  @ManyToOne
  @JoinColumn(name = "role_id")
  public R getRole()
  {
    return this.role;
  }


  @Override
  @Column(name = "is_enabled", nullable = false)
  public boolean isEnabled()
  {
    return this.enabled;
  }


  @Override
  public void setCreatedBy(
    U createdBy)
  {
    this.audit.setCreatedBy(createdBy);
  }


  @Override
  public void setCreationDate(
    Instant creationDate)
  {
    this.audit.setCreationDate(creationDate);
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
    this.audit.setLastUpdateDate(lastUpdateDate);
  }


  @Override
  public void setLastUpdatedBy(
    U lastUpdatedBy)
  {
    this.audit.setLastUpdatedBy(lastUpdatedBy);
  }


  @Override
  public void setMember(
    M member)
  {
    this.member = member;
  }


  @Override
  public void setRole(
    R role)
  {
    this.role = role;
  }

}
