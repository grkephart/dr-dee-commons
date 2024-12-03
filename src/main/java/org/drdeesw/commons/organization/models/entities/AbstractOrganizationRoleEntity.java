/**
 * 
 */
package org.drdeesw.commons.organization.models.entities;


import java.time.Instant;
import java.util.Set;
import java.util.stream.Collectors;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;

import org.drdeesw.commons.common.models.entities.AbstractNamedLongUniqueEntity;
import org.drdeesw.commons.organization.models.Organization;
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
public abstract class AbstractOrganizationRoleEntity extends AbstractNamedLongUniqueEntity
    implements OrganizationRole
{
  @ManyToOne
  @JoinColumn(name = "created_by_id")
  private UserEntity                        createdBy;
  @Column(name = "creation_date")
  private Instant                           creationDate;
  @Column(name = "description")
  private String                            description;
  @Column(name = "enabled")
  private boolean                           enabled;
  @Column(name = "last_update_date")
  private Instant                           lastUpdateDate;
  @ManyToOne
  @JoinColumn(name = "last_update_id")
  private UserEntity                        lastUpdatedBy;
  @ManyToOne
  @JoinColumn(name = "organization_id")
  private OrganizationEntity                organization;
  @OneToMany(fetch = FetchType.LAZY, mappedBy = "member")
  private Set<OrganizationMemberRoleEntity> memberRoles;

  /**
   * 
   */
  protected AbstractOrganizationRoleEntity()
  {

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
  public String getDescription()
  {
    return description;
  }


  @Override
  public Instant getLastUpdatedDate()
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
    return organization;
  }


  @Override
  public Set<OrganizationMemberRole> getMemberRoles()
  {
    return this.memberRoles.stream()//
        .map(member -> (OrganizationMemberRole)member)//
        .collect(Collectors.toSet());
  }


  @Override
  public boolean isEnabled()
  {
    return enabled;
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
  public void setDescription(
    String description)
  {
    this.description = description;
  }


  @Override
  public void setEnabled(
    boolean enabled)
  {
    this.enabled = enabled;
  }


  @Override
  public void setLastUpdatedDate(
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
    Set<OrganizationMemberRole> members)
  {
    this.memberRoles = members.stream()//
        .map(member -> (OrganizationMemberRoleEntity)member)//
        .collect(Collectors.toSet());
  }
}
