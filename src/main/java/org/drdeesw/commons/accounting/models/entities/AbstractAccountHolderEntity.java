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
import javax.persistence.FetchType;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.drdeesw.commons.accounting.models.Account;
import org.drdeesw.commons.accounting.models.AccountHolder;
import org.drdeesw.commons.common.models.entities.AbstractNamedLongUniqueEntity;
import org.drdeesw.commons.organization.models.OrganizationAccount;
import org.drdeesw.commons.organization.models.entities.OrganizationAccountEntity;
import org.drdeesw.commons.security.models.User;
import org.drdeesw.commons.serviceproviders.models.ServiceProviderAccount;
import org.drdeesw.commons.serviceproviders.models.entities.ServiceProviderAccountEntity;


/**
 * 
 */
@SuppressWarnings("serial")
@MappedSuperclass
@DiscriminatorColumn(name = "holder_type", discriminatorType = DiscriminatorType.STRING)
@Access(AccessType.FIELD)
public abstract class AbstractAccountHolderEntity extends AbstractNamedLongUniqueEntity
    implements AccountHolder
{
  @Column(name = "created_by_id", updatable = false, nullable = false)
  private User                              createdBy;

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "creation_date", updatable = false, nullable = false)
  private Instant                           creationDate;

  @Column(name = "description", length = 255)
  private String                            description;

  @Column(name = "enabled")
  private boolean                           enabled;

  @OneToMany(mappedBy = "accountHolder", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
  private Set<AbstractAccountEntity>        heldAccounts;

  @OneToMany(mappedBy = "accountHolder", cascade = CascadeType.ALL, orphanRemoval = true)
  private Set<OrganizationAccountEntity>    heldOrganizationAccounts    = new HashSet<>();

  @OneToMany(mappedBy = "accountHolder", cascade = CascadeType.ALL, orphanRemoval = true)
  private Set<ServiceProviderAccountEntity> heldServiceProviderAccounts = new HashSet<>();

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "last_update_date", nullable = false)
  private Instant                           lastUpdateDate;

  @Column(name = "last_updated_by_id", nullable = false)
  private User                              lastUpdatedBy;

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
    return createdBy;
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
  public Set<Account> getHeldAccounts()
  {
    if (heldAccounts == null)
    {
      return Set.of();
    }
    return heldAccounts.stream().map(account -> (Account)account).collect(Collectors.toSet());
  }


  @Override
  public Set<OrganizationAccount> getHeldOrganizationAccounts()
  {
    if (heldOrganizationAccounts == null)
    {
      return Set.of();
    }
    return heldOrganizationAccounts.stream().map(account -> (OrganizationAccount)account)
        .collect(Collectors.toSet());

  }


  @Override
  public Set<ServiceProviderAccount> getHeldServiceProviderAccounts()
  {

    if (heldServiceProviderAccounts == null)
    {
      return Set.of();
    }
    return heldServiceProviderAccounts.stream().map(account -> (ServiceProviderAccount)account)
        .collect(Collectors.toSet());
  }


  @Override
  public Instant getLastUpdateDate()
  {
    return lastUpdateDate;
  }


  @Override
  public User getLastUpdatedBy()
  {
    return lastUpdatedBy;
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
    this.createdBy = createdBy;
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
  public void setHeldAccounts(
    Set<Account> accounts)
  {
    if (accounts == null)
    {
      this.heldAccounts = null;
    }
    else
    {
      this.heldAccounts = accounts.stream().map(account -> (AbstractAccountEntity)account)
          .collect(Collectors.toSet());
    }
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
    this.lastUpdateDate = lastUpdateDate;
  }


  @Override
  public void setLastUpdatedBy(
    User lastUpdatedBy)
  {
    this.lastUpdatedBy = lastUpdatedBy;
  }
}
