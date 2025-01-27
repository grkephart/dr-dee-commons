/**
 * 
 */
package org.drdeesw.commons.organization.models.entities;


import java.time.Instant;
import java.util.HashSet;
import java.util.Optional;
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

import org.drdeesw.commons.accounting.models.Account;
import org.drdeesw.commons.common.models.EmbeddedAuditable;
import org.drdeesw.commons.common.models.entities.AbstractNamedLongUniqueEntity;
import org.drdeesw.commons.organization.models.Organization;
import org.drdeesw.commons.organization.models.OrganizationMember;
import org.drdeesw.commons.organization.models.OrganizationRole;
import org.drdeesw.commons.organization.models.OrganizationStatus;
import org.drdeesw.commons.organization.models.OrganizationType;
import org.drdeesw.commons.security.models.User;
import org.drdeesw.commons.security.models.entities.UserEntity;


/**
 * 
 */
@SuppressWarnings("serial")
@MappedSuperclass
@Access(AccessType.PROPERTY)
public abstract class AbstractOrganizationEntity<A extends Account<?, Organization<A>, ?>> extends AbstractNamedLongUniqueEntity
    implements Organization<A>
{
  @Embedded
  private EmbeddedAuditable             audit;
  private Set<OrganizationEntity>       children;
  private String                        description;
  private boolean                       enabled          = true;
  private Set<OrganizationMemberEntity> members          = new HashSet<>();
  private OrganizationEntity            parent;
  private Set<OrganizationRoleEntity>   roles            = new HashSet<>();
  private OrganizationStatus            status;
  private OrganizationType              type;

  /**
   * Hibernate constructor
   */
  protected AbstractOrganizationEntity()
  {

  }


  /**
   * Unit test constructor
   */
  protected AbstractOrganizationEntity(EmbeddedAuditable audit)
  {
    this.audit = audit;
  }


  @OneToMany(mappedBy = "parent", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
  public Set<OrganizationEntity> getChildrenInternal()
  {
    return children;
  }


  @Override
  public Set<Organization<?>> getChildren()
  {
    return children == null ? Set.of() : new HashSet<>(children);
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
  @Column(name = "description", length = 255)
  public String getDescription()
  {
    return this.description;
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


  @OneToMany(mappedBy = "organization", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
  public Set<OrganizationMemberEntity> getMembersInternal()
  {
    return members;
  }


  @Override
  public Set<OrganizationMember> getMembers()
  {
    return members == null ? Set.of() : new HashSet<>(members);
  }


  @Override
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "parent_organization_id")
  public OrganizationEntity getParent()
  {
    return this.parent;
  }


  @OneToMany(mappedBy = "organization", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
  public Set<OrganizationRoleEntity> getRolesInternal()
  {
    return roles;
  }


  @Override
  public Set<OrganizationRole> getRoles()
  {
    return roles == null ? Set.of() : new HashSet<>(this.roles);
  }


  @Override
  @Column(name = "status")
  public OrganizationStatus getStatus()
  {
    return this.status;
  }


  @Override
  @Column(name = "type")
  public OrganizationType getType()
  {
    return this.type;
  }


  @Override
  @Column(name = "is_enabled", nullable = false)
  public boolean isEnabled()
  {
    return this.enabled;
  }


  @Override
  public void setChildren(
    Set<Organization<?>> children)
  {
    this.children = Optional.ofNullable(children)
        .map(a -> a.stream().map(OrganizationEntity.class::cast).collect(Collectors.toSet()))
        .orElse(null);
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
    this.audit.setLastUpdateDate(lastUpdateDate);
  }


  @Override
  public void setLastUpdatedBy(
    User lastUpdatedBy)
  {
    this.audit.setLastUpdatedBy((UserEntity)lastUpdatedBy);
  }


  @Override
  public void setMembers(
    Set<OrganizationMember> members)
  {
    this.members = Optional.ofNullable(members)
        .map(a -> a.stream().map(OrganizationMemberEntity.class::cast).collect(Collectors.toSet()))
        .orElse(null);
  }


  @Override
  public void setParent(
    Organization<?> parent)
  {
    this.parent = (OrganizationEntity)parent;
  }




  @Override
  public void setRoles(
    Set<OrganizationRole> roles)
  {
    this.roles = Optional.ofNullable(roles)
        .map(a -> a.stream().map(OrganizationRoleEntity.class::cast).collect(Collectors.toSet()))
        .orElse(null);
  }


  @Override
  public void setStatus(
    OrganizationStatus status)
  {
    this.status = status;
  }


  @Override
  public void setType(
    OrganizationType type)
  {
    this.type = type;
  }

}
