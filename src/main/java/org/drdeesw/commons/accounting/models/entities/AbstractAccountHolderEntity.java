/**
 * 
 */
package org.drdeesw.commons.accounting.models.entities;


import java.time.Instant;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Embedded;
import javax.persistence.FetchType;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;

import org.drdeesw.commons.accounting.models.Account;
import org.drdeesw.commons.accounting.models.AccountHolder;
import org.drdeesw.commons.common.models.EmbeddedAuditable;
import org.drdeesw.commons.common.models.entities.AbstractNamedLongUniqueEntity;
import org.drdeesw.commons.organization.models.OrganizationAccount;
import org.drdeesw.commons.organization.models.entities.OrganizationAccountEntity;
import org.drdeesw.commons.security.models.User;
import org.drdeesw.commons.security.models.entities.UserEntity;
import org.drdeesw.commons.serviceproviders.models.ServiceProviderAccount;
import org.drdeesw.commons.serviceproviders.models.entities.ServiceProviderAccountEntity;


/**
 * 
 */
@SuppressWarnings("serial")
@MappedSuperclass
@DiscriminatorColumn(name = "holder_type", discriminatorType = DiscriminatorType.STRING)
@Access(AccessType.PROPERTY)
public abstract class AbstractAccountHolderEntity extends AbstractNamedLongUniqueEntity
    implements AccountHolder
{
  @Embedded
  private EmbeddedAuditable                 audit;
  private String                            description;
  private boolean                           enabled;
  private Set<AccountEntity>                heldAccounts;
  private Set<OrganizationAccountEntity>    heldOrganizationAccounts    = new HashSet<>();
  private Set<ServiceProviderAccountEntity> heldServiceProviderAccounts = new HashSet<>();

  public AbstractAccountHolderEntity()
  {
  }


  public AbstractAccountHolderEntity(Long id)
  {
    super(id);
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
    return description;
  }


  /**
   * This exists solely to satisfy Hibernate's requirement for a concrete relationship mapping.
   * The business logic does not use it.
   * 
   * @return the held accounts
   */
  @OneToMany(mappedBy = "holder", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
  public Set<AccountEntity> getHeldAccountsInternal()
  {
    return heldAccounts;
  }


  @Override
  public Set<Account> getHeldAccounts()
  {
    return heldAccounts == null ? Set.of() : new HashSet<>(heldAccounts);
  }


  /**
   * This exists solely to satisfy Hibernate's requirement for a concrete relationship mapping.
   * The business logic does not use it.
   * 
   * @return the held accounts
   */
  @OneToMany(mappedBy = "holder", cascade = CascadeType.ALL, orphanRemoval = true)
  public Set<OrganizationAccountEntity> getHeldOrganizationAccountsInternal()
  {
    return heldOrganizationAccounts;
  }


  @Override
  public Set<OrganizationAccount> getHeldOrganizationAccounts()
  {
    return heldOrganizationAccounts == null ? Set.of() : new HashSet<>(heldOrganizationAccounts);
  }


  @OneToMany(mappedBy = "holder", cascade = CascadeType.ALL, orphanRemoval = true)
  public Set<ServiceProviderAccountEntity> getHeldServiceProviderAccountsInternal()
  {
    return heldServiceProviderAccounts;
  }


  @Override
  public Set<ServiceProviderAccount> getHeldServiceProviderAccounts()
  {
    return heldServiceProviderAccounts == null ? Set.of()
                                               : new HashSet<>(heldServiceProviderAccounts);
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
  @Column(name = "is_enabled", nullable = false)
  public boolean isEnabled()
  {
    return enabled;
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
  public void setHeldAccounts(
    Set<Account> heldAccounts)
  {
    // Convert Set<Account> to Set<AccountEntity>
    this.heldAccounts = heldAccounts == null ? null
                                             : heldAccounts.stream()
                                                 .map(account -> (AccountEntity)account) // Ensure each item is cast to AccountEntity
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
    this.audit.setLastUpdatedBy((UserEntity)lastUpdatedBy);
  }
}
