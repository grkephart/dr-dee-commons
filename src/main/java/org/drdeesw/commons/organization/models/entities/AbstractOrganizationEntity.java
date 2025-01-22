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
import org.drdeesw.commons.accounting.models.entities.AccountEntity;
import org.drdeesw.commons.common.models.EmbeddedAuditable;
import org.drdeesw.commons.common.models.entities.AbstractNamedLongUniqueEntity;
import org.drdeesw.commons.organization.models.Organization;
import org.drdeesw.commons.organization.models.OrganizationAccount;
import org.drdeesw.commons.organization.models.OrganizationMember;
import org.drdeesw.commons.organization.models.OrganizationRole;
import org.drdeesw.commons.organization.models.OrganizationStatus;
import org.drdeesw.commons.organization.models.OrganizationType;
import org.drdeesw.commons.security.models.User;
import org.drdeesw.commons.security.models.entities.UserEntity;
import org.drdeesw.commons.serviceproviders.models.ServiceProviderAccount;
import org.drdeesw.commons.serviceproviders.models.entities.ServiceProviderAccountEntity;


/**
 * 
 */
@SuppressWarnings("serial")
@MappedSuperclass
@Access(AccessType.PROPERTY)
public abstract class AbstractOrganizationEntity extends AbstractNamedLongUniqueEntity
    implements Organization
{
  @Embedded
  private EmbeddedAuditable                 audit;
  private Set<OrganizationEntity>           children;
  private String                            description;
  private boolean                           enabled                         = true;
  private Set<AccountEntity>                heldAccounts                    = new HashSet<>();
  private Set<OrganizationAccountEntity>    heldOrganizationAccounts        = new HashSet<>();
  private Set<ServiceProviderAccountEntity> heldServiceProviderAccounts     = new HashSet<>();
  private Set<OrganizationMemberEntity>     members                         = new HashSet<>();
  private OrganizationEntity                parent;
  private Set<AccountEntity>                providedAccounts                = new HashSet<>();
  private Set<OrganizationAccountEntity>    providedOrganizationAccounts    = new HashSet<>();
  private Set<ServiceProviderAccountEntity> providedServiceProviderAccounts = new HashSet<>();
  private Set<OrganizationRoleEntity>       roles                           = new HashSet<>();
  private OrganizationStatus                status;
  private OrganizationType                  type;

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
  public Set<Organization> getChildren()
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


  @OneToMany(mappedBy = "holder", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
  public Set<AccountEntity> getHeldAccountsInternal()
  {
    return heldAccounts;
  }


  @Override
  public Set<Account> getHeldAccounts()
  {
    return heldAccounts == null ? Set.of() : new HashSet<>(heldAccounts);
  }


  @OneToMany(mappedBy = "holder", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
  public Set<OrganizationAccountEntity> getHeldOrganizationAccountsInternal()
  {
    return heldOrganizationAccounts;
  }


  @Override
  public Set<OrganizationAccount> getHeldOrganizationAccounts()
  {
    return heldOrganizationAccounts == null ? Set.of() : new HashSet<>(heldOrganizationAccounts);
  }


  @OneToMany(mappedBy = "holder", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
  public Set<ServiceProviderAccountEntity> getHeldServiceProviderAccountsInternal()
  {
    return heldServiceProviderAccounts;
  }


  @Override
  public Set<ServiceProviderAccount> getHeldServiceProviderAccounts()
  {
    return heldServiceProviderAccounts == null ? Set.of() : new HashSet<>(heldServiceProviderAccounts);
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


  @Deprecated // Use typed methods instead
  @OneToMany(mappedBy = "provider", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
  public Set<AccountEntity> getProvidedAccountsInternal()
  {
    return providedAccounts;
  }


  @Deprecated // Use typed methods instead
  @Override
  public Set<Account> getProvidedAccounts()
  {
    return providedAccounts == null ? Set.of() : new HashSet<>(this.providedAccounts);
  }


  @OneToMany(mappedBy = "provider", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
  public Set<OrganizationAccountEntity> getProvidedOrganizationAccountsInternal()
  {
    return providedOrganizationAccounts;
  }


  @Override
  public Set<OrganizationAccount> getProvidedOrganizationAccounts()
  {
    return providedOrganizationAccounts == null ? Set.of() : new HashSet<>(this.providedOrganizationAccounts);
  }


  @OneToMany(mappedBy = "provider", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
  public Set<ServiceProviderAccountEntity> getProvidedServiceProviderAccountsInternal()
  {
    return providedServiceProviderAccounts;
  }


  @Override
  public Set<ServiceProviderAccount> getProvidedServiceProviderAccounts()
  {
    return providedServiceProviderAccounts == null ? Set.of() : new HashSet<>(this.providedServiceProviderAccounts);
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
    Set<Organization> children)
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


  @Deprecated // Use typed methods instead
  @Override
  public void setHeldAccounts(
    Set<Account> accounts)
  {
    this.heldAccounts = Optional.ofNullable(accounts)
        .map(a -> a.stream().map(AccountEntity.class::cast).collect(Collectors.toSet()))
        .orElse(null);
  }


  @Override
  public void setHeldOrganizationAccounts(
    Set<OrganizationAccount> accounts)
  {
    this.heldOrganizationAccounts = Optional.ofNullable(accounts)
        .map(a -> a.stream().map(OrganizationAccountEntity.class::cast).collect(Collectors.toSet()))
        .orElse(null);
  }


  @Override
  public void setHeldServiceProviderAccounts(
    Set<ServiceProviderAccount> accounts)
  {
    this.heldServiceProviderAccounts = Optional.ofNullable(accounts)
        .map(
          a -> a.stream().map(ServiceProviderAccountEntity.class::cast).collect(Collectors.toSet()))
        .orElse(null);
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
    Organization parent)
  {
    this.parent = (OrganizationEntity)parent;
  }


  @Override
  public void setProvidedAccounts(
    Set<Account> accounts)
  {
    this.providedAccounts = Optional.ofNullable(accounts)
        .map(a -> a.stream().map(AccountEntity.class::cast).collect(Collectors.toSet()))
        .orElse(null);
  }


  @Override
  public void setProvidedOrganizationAccounts(
    Set<OrganizationAccount> accounts)
  {
    this.providedOrganizationAccounts = Optional.ofNullable(accounts)
        .map(a -> a.stream().map(OrganizationAccountEntity.class::cast).collect(Collectors.toSet()))
        .orElse(null);
  }


  @Override
  public void setProvidedServiceProviderAccounts(
    Set<ServiceProviderAccount> accounts)
  {
    this.providedServiceProviderAccounts = Optional.ofNullable(accounts)
        .map(
          a -> a.stream().map(ServiceProviderAccountEntity.class::cast).collect(Collectors.toSet()))
        .orElse(null);
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
