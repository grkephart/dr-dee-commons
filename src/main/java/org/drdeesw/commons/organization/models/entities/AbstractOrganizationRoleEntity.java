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


/**
 * 
 */
@SuppressWarnings("serial")
@MappedSuperclass
@Access(AccessType.FIELD)
public abstract class AbstractOrganizationRoleEntity extends AbstractNamedLongUniqueEntity
    implements OrganizationRole
{
  @Column(name = "created_by_id")
  private Long                              createdById;
  @Column(name = "creation_date")
  private Instant                           creationDate;
  @Column(name = "description")
  private String                            description;
  @Column(name = "enabled")
  private boolean                           enabled;
  @Column(name = "last_update_date")
  private Instant                           lastUpdateDate;
  @Column(name = "last_update_id")
  private Long                              lastUpdateId;
  @ManyToOne
  @JoinColumn(name = "organization_id")
  private OrganizationEntity                organization;
  @OneToMany(fetch = FetchType.LAZY, mappedBy = "member")
  private Set<OrganizationMemberRoleEntity> members;

  /**
   * 
   */
  protected AbstractOrganizationRoleEntity()
  {

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
  public String getDescription()
  {
    return description;
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
  public Organization getOrganization()
  {
    return organization;
  }


  @Override
  public Set<OrganizationMemberRole> getMembers()
  {
    return this.members.stream()//
        .map(member -> (OrganizationMemberRole)member)//
        .collect(Collectors.toSet());
  }


  @Override
  public boolean isEnabled()
  {
    return enabled;
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
  public void setOrganization(
    Organization organization)
  {
    this.organization = (OrganizationEntity)organization;
  }


  @Override
  public void setMembers(
    Set<OrganizationMemberRole> members)
  {
    this.members = members.stream()//
        .map(member -> (OrganizationMemberRoleEntity)member)//
        .collect(Collectors.toSet());
  }
}
