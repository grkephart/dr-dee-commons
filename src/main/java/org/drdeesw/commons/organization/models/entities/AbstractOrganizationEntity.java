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
import org.drdeesw.commons.serviceproviders.models.ServiceProviderAccount;
import org.drdeesw.commons.serviceproviders.models.entities.ServiceProviderAccountEntity;


/**
 * 
 */
@SuppressWarnings("serial")
@MappedSuperclass
@Access(AccessType.FIELD)
public abstract class AbstractOrganizationEntity extends AbstractNamedLongUniqueEntity
    implements Organization
{
  @Embedded
  private EmbeddedAuditable                 audit;

  @OneToMany(mappedBy = "parent", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
  private Set<OrganizationEntity>           children;

  // Describable property
  @Column(name = "description", length = 255)
  private String                            description;

  // Enableable property
  @Column(name = "is_enabled", nullable = false)
  private boolean                           enabled                         = true;

  @OneToMany(mappedBy = "accountHolder", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
  private Set<AccountEntity>                heldAccounts                    = new HashSet<>();

  @OneToMany(mappedBy = "accountHolder", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
  private Set<OrganizationAccountEntity>    heldOrganizationAccounts        = new HashSet<>();

  @OneToMany(mappedBy = "accountHolder", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
  private Set<ServiceProviderAccountEntity> heldServiceProviderAccounts     = new HashSet<>();

  @OneToMany(mappedBy = "organization", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
  private Set<OrganizationMemberEntity>     members                         = new HashSet<>();

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "parent_organization_id")
  private OrganizationEntity                parent;

  @OneToMany(mappedBy = "accountProvider", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
  private Set<AccountEntity>                providedAccounts                = new HashSet<>();

  @OneToMany(mappedBy = "accountProvider", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
  private Set<OrganizationAccountEntity>    providedOrganizationAccounts    = new HashSet<>();

  @OneToMany(mappedBy = "accountProvider", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
  private Set<ServiceProviderAccountEntity> providedServiceProviderAccounts = new HashSet<>();

  @OneToMany(mappedBy = "organization", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
  private Set<OrganizationRoleEntity>       roles                           = new HashSet<>();

  @Column(name = "status")
  private OrganizationStatus                status;

  @Column(name = "type")
  private OrganizationType                  type;

  /**
   * Hibernate constructor
   */
  protected AbstractOrganizationEntity()
  {

  }


  @Override
  public Set<Organization> getChildren()
  {
    return new HashSet<>(children);
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
  public String getDescription()
  {
    return this.description;
  }


  @Override
  public Set<Account> getHeldAccounts()
  {
    return new HashSet<>(heldAccounts);
  }


  @Override
  public Set<OrganizationAccount> getHeldOrganizationAccounts()
  {
    return new HashSet<>(heldOrganizationAccounts);
  }


  @Override
  public Set<ServiceProviderAccount> getHeldServiceProviderAccounts()
  {
    return new HashSet<>(heldServiceProviderAccounts);
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
  public Set<OrganizationMember> getMembers()
  {
    return new HashSet<>(members);
  }


  @Override
  public Organization getParent()
  {
    return this.parent;
  }


  @Override
  public Set<Account> getProvidedAccounts()
  {
    return new HashSet<>(this.providedAccounts);
  }


  @Override
  public Set<OrganizationAccount> getProvidedOrganizationAccounts()
  {
    return new HashSet<>(this.providedOrganizationAccounts);
  }


  @Override
  public Set<ServiceProviderAccount> getProvidedServiceProviderAccounts()
  {
    return new HashSet<>(this.providedServiceProviderAccounts);
  }


  @Override
  public Set<OrganizationRole> getRoles()
  {
    return new HashSet<>(this.roles);
  }


  @Override
  public OrganizationStatus getStatus()
  {
    return this.status;
  }


  @Override
  public OrganizationType getType()
  {
    return this.type;
  }


  @Override
  public boolean isEnabled()
  {
    return this.enabled;
  }


  @Override
  public void setChildren(
    Set<Organization> children)
  {
    this.children = children.stream().map(account -> (OrganizationEntity)account)
        .collect(Collectors.toSet());
  }


  @Override
  public void setCreatedBy(
    User createdBy)
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
    Set<Account> accounts)
  {
    this.heldAccounts = accounts.stream().map(account -> (AccountEntity)account)
        .collect(Collectors.toSet());
  }


  @Override
  public void setHeldOrganizationAccounts(
    Set<OrganizationAccount> accounts)
  {
    this.heldOrganizationAccounts = accounts.stream()
        .map(account -> (OrganizationAccountEntity)account).collect(Collectors.toSet());
  }


  @Override
  public void setHeldServiceProviderAccounts(
    Set<ServiceProviderAccount> accounts)
  {
    this.heldServiceProviderAccounts = accounts.stream()
        .map(account -> (ServiceProviderAccountEntity)account).collect(Collectors.toSet());
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
    this.audit.setLastUpdatedBy(lastUpdatedBy);
  }


  @Override
  public void setMembers(
    Set<OrganizationMember> members)
  {
    this.members = members.stream().map(member -> (OrganizationMemberEntity)member)
        .collect(Collectors.toSet());
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
    this.providedAccounts = accounts.stream().map(account -> (AccountEntity)account)
        .collect(Collectors.toSet());
  }


  @Override
  public void setProvidedOrganizationAccounts(
    Set<OrganizationAccount> accounts)
  {
    this.providedOrganizationAccounts = accounts.stream()
        .map(account -> (OrganizationAccountEntity)account).collect(Collectors.toSet());
  }


  @Override
  public void setProvidedServiceProviderAccounts(
    Set<ServiceProviderAccount> accounts)
  {
    this.providedServiceProviderAccounts = accounts.stream()
        .map(account -> (ServiceProviderAccountEntity)account).collect(Collectors.toSet());
  }


  @Override
  public void setRoles(
    Set<OrganizationRole> roles)
  {
    this.roles = roles.stream().map(role -> (OrganizationRoleEntity)role)
        .collect(Collectors.toSet());
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
