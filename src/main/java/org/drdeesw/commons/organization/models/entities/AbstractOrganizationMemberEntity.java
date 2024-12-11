/**
 * 
 */
package org.drdeesw.commons.organization.models.entities;


import java.time.Instant;
import java.util.Set;
import java.util.stream.Collectors;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;

import org.drdeesw.commons.common.models.entities.AbstractLongUniqueEntity;
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
@Access(AccessType.FIELD)
public abstract class AbstractOrganizationMemberEntity<O extends AbstractOrganizationEntity>
    extends AbstractLongUniqueEntity implements OrganizationMember
{
  @ManyToOne
  @JoinColumn(name = "created_by_id", nullable = false)
  private UserEntity                        createdBy;
  @Column(name = "creation_date", nullable = false)
  private Instant                           creationDate;
  @Column(name = "enabled")
  private boolean                           enabled;
  @Column(name = "last_update_date")
  private Instant                           lastUpdateDate;
  @ManyToOne
  @JoinColumn(name = "last_update_id")
  private UserEntity                        lastUpdatedBy;
  @ManyToOne
  @JoinColumn(name = "organization_id", nullable = false)
  private OrganizationEntity                organization;
  @OneToMany(fetch = FetchType.LAZY, mappedBy = "member", cascade = CascadeType.ALL, orphanRemoval = true)
  private Set<OrganizationMemberRoleEntity> memberRoles;
  @ManyToOne
  @JoinColumn(name = "user_id", nullable = false)
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
  public Organization getOrganization()
  {
    return (Organization)this.organization;
  }


  @Override
  public Set<OrganizationMemberRole> getMemberRoles()
  {
    return this.memberRoles.stream()//
        .map(member -> (OrganizationMemberRole)member)//
        .collect(Collectors.toSet());
  }


  @Override
  public User getUser()
  {
    return (User)this.user;
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
  public void setOrganization(
    Organization organization)
  {
    this.organization = (OrganizationEntity)organization;
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
  public void setUser(
    User user)
  {
    this.user = (UserEntity)user;
  }

}
