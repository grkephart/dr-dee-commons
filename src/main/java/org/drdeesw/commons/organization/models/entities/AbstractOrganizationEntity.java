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

import org.drdeesw.commons.accounting.models.entities.AbstractAccountEntity;
import org.drdeesw.commons.common.models.EmbeddedAuditable;
import org.drdeesw.commons.common.models.entities.AbstractNamedLongUniqueEntity;
import org.drdeesw.commons.organization.models.Organization;
import org.drdeesw.commons.organization.models.OrganizationStatus;
import org.drdeesw.commons.organization.models.OrganizationType;
import org.drdeesw.commons.security.models.entities.AbstractUserEntity;


/**
 * 
 */
@SuppressWarnings("serial")
@MappedSuperclass
@Access(AccessType.PROPERTY)
public abstract class AbstractOrganizationEntity<//
    U extends AbstractUserEntity<?>, //
    PC extends AbstractOrganizationEntity<U, PC, HA, PA, M, R>, //
    HA extends AbstractAccountEntity<U, ?, ?>, //
    PA extends AbstractOrganizationAccountEntity<U, ?, ?>, //
    M extends AbstractOrganizationMemberEntity<U, ?, ?>, //
    R extends AbstractOrganizationRoleEntity<U, ?, ?>> //
    extends AbstractNamedLongUniqueEntity implements Organization<U, PC, HA, PA, M, R>
{
  @Embedded
  private EmbeddedAuditable<U>   audit;
  private Set<PC>                children         = new HashSet<>();
  private String                 description;
  private boolean                enabled          = true;
  private Set<HA>                heldAccounts     = new HashSet<>();
  private Set<M>                 members          = new HashSet<>();
  private PC                     parent;
  private Set<PA>                providedAccounts = new HashSet<>();
  private Set<R>                 roles            = new HashSet<>();
  private OrganizationStatus     status;
  private OrganizationTypeEntity type;

  /**
   * Hibernate constructor
   */
  protected AbstractOrganizationEntity()
  {

  }


  /**
   * Unit test constructor
   */
  protected AbstractOrganizationEntity(EmbeddedAuditable<U> audit)
  {
    this.audit = audit;
  }


  @Override
  @OneToMany(mappedBy = "parent", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
  public Set<PC> getChildren()
  {
    return children;
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
  @Column(name = "description", length = 255)
  public String getDescription()
  {
    return this.description;
  }


  @Override
  @OneToMany(mappedBy = "holder", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
  public Set<HA> getHeldAccounts()
  {
    return heldAccounts;
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
  @OneToMany(mappedBy = "organization", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
  public Set<M> getMembers()
  {
    return members == null ? Set.of() : new HashSet<>(members);
  }


  @Override
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "parent_organization_id")
  public PC getParent()
  {
    return this.parent;
  }


  @Override
  @OneToMany(mappedBy = "provider", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
  public Set<PA> getProvidedAccounts()
  {
    return providedAccounts;
  }


  @Override
  @OneToMany(mappedBy = "organization", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
  public Set<R> getRoles()
  {
    return roles;
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
    Set<PC> children)
  {
    this.children = children//
        .stream()//
        .map(child -> (PC)child)//
        .collect(Collectors.toSet());
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
  public void setHeldAccounts(
    Set<HA> accounts)
  {
    this.heldAccounts = accounts;
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
  public void setMembers(
    Set<M> members)
  {
    this.members = members;
  }


  @Override
  public void setParent(
    PC parent)
  {
    this.parent = (PC)parent;
  }


  @Override
  public void setProvidedAccounts(
    Set<PA> accounts)
  {
    this.providedAccounts = accounts;
  }


  @Override
  public void setRoles(
    Set<R> roles)
  {
    this.roles = roles;
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
    this.type = (OrganizationTypeEntity)type;
  }

}
