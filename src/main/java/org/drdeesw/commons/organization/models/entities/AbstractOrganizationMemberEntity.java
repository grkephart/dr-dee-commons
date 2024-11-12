/**
 * 
 */
package org.drdeesw.commons.organization.models.entities;


import java.time.Instant;
import java.util.Set;

import javax.persistence.Access;
import javax.persistence.AccessType;
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
import org.drdeesw.commons.security.models.SystemUser;
import org.drdeesw.commons.security.models.entities.SystemUserEntity;


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
  private Long                        createdById;
  @Column(name = "creation_date", nullable = false)
  private Instant                     creationDate;
  @Column(name = "enabled")
  private boolean                     enabled;
  @Column(name = "last_update_date")
  private Instant                     lastUpdateDate;
  @Column(name = "last_update_id")
  private Long                        lastUpdateId;
  @ManyToOne
  @JoinColumn(name = "organization_id")
  private OrganizationEntity          organization;
  @Column(name = "organization_id")
  private Long                        organizationId;
  @OneToMany(fetch = FetchType.LAZY, mappedBy = "member")
  private Set<OrganizationMemberRole> roles;
  @ManyToOne
  @JoinColumn(name = "user_id")
  private SystemUserEntity            systemUser;

  /**
   * 
   */
  protected AbstractOrganizationMemberEntity()
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
  public Organization getOrganization()
  {
    return this.organization;
  }


  @Override
  public Set<OrganizationMemberRole> getRoles()
  {
    return roles;
  }


  @Override
  public SystemUser getSystemUser()
  {
    return this.systemUser;
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
  public void setOrganization(
    Organization organization)
  {
    this.organization = (OrganizationEntity)organization;
  }


  @Override
  public void setRoles(
    Set<OrganizationMemberRole> roles)
  {
    this.roles = roles;
  }


  @Override
  public void setSystemUser(
    SystemUser systemUser)
  {
    this.systemUser = (SystemUserEntity)systemUser;
  }

}
