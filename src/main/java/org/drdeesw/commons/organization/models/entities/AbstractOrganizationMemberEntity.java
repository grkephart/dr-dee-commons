/**
 * 
 */
package org.drdeesw.commons.organization.models.entities;


import java.time.Instant;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

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
import org.drdeesw.commons.organization.models.Organization;
import org.drdeesw.commons.organization.models.OrganizationMember;
import org.drdeesw.commons.organization.models.OrganizationMemberRole;
import org.drdeesw.commons.security.models.User;
import org.drdeesw.commons.security.models.entities.UserEntity;


/**
 * 
 */
@SuppressWarnings("serial")
@MappedSuperclass
@Access(AccessType.PROPERTY)
public abstract class AbstractOrganizationMemberEntity extends AbstractNamedLongUniqueEntity
    implements OrganizationMember
{
  @Embedded
  private EmbeddedAuditable                 audit;
  private boolean                           enabled;
  private Set<OrganizationMemberRoleEntity> memberRoles;
  private OrganizationEntity                organization;
  private UserEntity                        user;

  /**
   * 
   */
  protected AbstractOrganizationMemberEntity()
  {
    super();
  }


  @Override
  public User getCreatedBy()
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
  public User getLastUpdatedBy()
  {
    return this.audit.getLastUpdatedBy();
  }


  @Override
  public Set<OrganizationMemberRole> getMemberRoles()
  {
    return memberRoles == null ? Set.of() : new HashSet<>(this.memberRoles);
  }


  @OneToMany(fetch = FetchType.LAZY, mappedBy = "member", cascade = CascadeType.ALL, orphanRemoval = true)
  public Set<OrganizationMemberRoleEntity> getMemberRolesInternal()
  {
    return this.memberRoles;
  }


  @Override
  @ManyToOne
  @JoinColumn(name = "organization_id", nullable = false)
  public OrganizationEntity getOrganization()
  {
    return this.organization;
  }


  @Override
  @ManyToOne
  @JoinColumn(name = "user_id", nullable = false)
  public UserEntity getUser()
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
    User createdBy)
  {
    this.audit.setCreatedBy((UserEntity)createdBy);
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
    User lastUpdatedBy)
  {
    this.audit.setLastUpdatedBy((UserEntity)lastUpdatedBy);
  }


  @Override
  public void setMemberRoles(
    Set<OrganizationMemberRole> roles)
  {
    this.memberRoles = roles.stream()//
        .map(role -> (OrganizationMemberRoleEntity)role)//
        .collect(Collectors.toSet());
  }


  @Override
  public void setOrganization(
    Organization organization)
  {
    this.organization = (OrganizationEntity)organization;
  }


  @Override
  public void setUser(
    User user)
  {
    this.user = (UserEntity)user;
  }

}
