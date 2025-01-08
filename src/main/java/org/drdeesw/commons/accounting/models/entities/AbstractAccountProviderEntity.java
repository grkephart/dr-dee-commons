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
import org.drdeesw.commons.accounting.models.AccountProvider;
import org.drdeesw.commons.common.models.EmbeddedAuditable;
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
@DiscriminatorColumn(name = "provider_type", discriminatorType = DiscriminatorType.STRING)
@Access(AccessType.FIELD)
public abstract class AbstractAccountProviderEntity extends AbstractNamedLongUniqueEntity
    implements AccountProvider
{
  @Embedded
  private EmbeddedAuditable                 audit;

  @Column(name = "description", length = 255)
  private String                            description;

  @Column(name = "is_enabled", nullable = false)
  private boolean                           enabled;

  @OneToMany(mappedBy = "accountProvider", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
  private Set<AccountEntity>        providedAccounts;

  @OneToMany(mappedBy = "accountHolder", cascade = CascadeType.ALL, orphanRemoval = true)
  private Set<OrganizationAccountEntity>    providedOrganizationAccounts    = new HashSet<>();

  @OneToMany(mappedBy = "accountHolder", cascade = CascadeType.ALL, orphanRemoval = true)
  private Set<ServiceProviderAccountEntity> providedServiceProviderAccounts = new HashSet<>();

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
    return description;
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
  public Set<Account> getProvidedAccounts()
  {
    if (providedAccounts == null)
    {
      return Set.of();
    }
    return providedAccounts.stream().map(account -> (Account)account).collect(Collectors.toSet());
  }


  @Override
  public Set<OrganizationAccount> getProvidedOrganizationAccounts()
  {

    if (providedOrganizationAccounts == null)
    {
      return Set.of();
    }

    return providedOrganizationAccounts.stream().map(account -> (OrganizationAccount)account)
        .collect(Collectors.toSet());
  }


  @Override
  public Set<ServiceProviderAccount> getProvidedServiceProviderAccounts()
  {

    if (providedServiceProviderAccounts == null)
    {
      return Set.of();
    }

    return providedServiceProviderAccounts.stream().map(account -> (ServiceProviderAccount)account)
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
  public void setProvidedAccounts(
    Set<Account> accounts)
  {
    if (accounts == null)
    {
      this.providedAccounts = null;
    }
    else
    {
      this.providedAccounts = accounts.stream().map(account -> (AccountEntity)account)
          .collect(Collectors.toSet());
    }
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
}
