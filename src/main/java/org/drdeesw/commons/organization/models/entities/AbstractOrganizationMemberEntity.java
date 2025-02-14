/**
 * 
 */
package org.drdeesw.commons.organization.models.entities;


import java.time.Instant;
import java.util.Set;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;

import org.drdeesw.commons.common.models.EmbeddedAuditable;
import org.drdeesw.commons.common.models.entities.AbstractNamedLongUniqueEntity;
import org.drdeesw.commons.organization.models.OrganizationMember;
import org.drdeesw.commons.security.models.entities.AbstractUserEntity;


/**
 * 
 */
@SuppressWarnings("serial")
@MappedSuperclass
@Access(AccessType.PROPERTY)
public abstract class AbstractOrganizationMemberEntity<//
    U extends AbstractUserEntity<?>, //
    O extends AbstractOrganizationEntity<U, ?, ?, ?, ?, ?>, //
    MR extends AbstractOrganizationMemberRoleEntity<U, ?, ?>> //
    extends AbstractNamedLongUniqueEntity implements OrganizationMember<U, O, MR>
{
  @Embedded
  private EmbeddedAuditable<U>              audit;
  private boolean                           enabled;
  private Set<MR> memberRoles;
  private O                                 organization;
  private U                                 user;

  /**
   * 
   */
  protected AbstractOrganizationMemberEntity()
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
  @OneToMany(mappedBy = "member", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
  public Set<MR> getMemberRoles()
  {
    return memberRoles;
  }


  @Override
  @ManyToOne
  @JoinColumn(name = "organization_id", nullable = false)
  public O getOrganization()
  {
    return this.organization;
  }


  @Override
  @ManyToOne
  @JoinColumn(name = "user_id", nullable = false)
  public U getUser()
  {
    return this.user;
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
  public void setMemberRoles(
    Set<MR> roles)
  {
    this.memberRoles = roles;
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
