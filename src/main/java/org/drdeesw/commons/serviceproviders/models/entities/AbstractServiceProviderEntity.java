/**
 * 
 */
package org.drdeesw.commons.serviceproviders.models.entities;


import java.time.Instant;
import java.util.Collections;
import java.util.Set;
import java.util.stream.Collectors;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.FetchType;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;

import org.drdeesw.commons.accounting.models.Account;
import org.drdeesw.commons.common.models.EmbeddedAuditable;
import org.drdeesw.commons.common.models.entities.AbstractNamedLongUniqueEntity;
import org.drdeesw.commons.organization.models.OrganizationAccount;
import org.drdeesw.commons.organization.models.entities.OrganizationAccountEntity;
import org.drdeesw.commons.security.models.User;
import org.drdeesw.commons.serviceproviders.models.AuthenticationType;
import org.drdeesw.commons.serviceproviders.models.ServiceProvider;
import org.drdeesw.commons.serviceproviders.models.ServiceProviderAccount;


/**
 * 
 */
@SuppressWarnings("serial")
@MappedSuperclass
@Access(AccessType.FIELD)
public abstract class AbstractServiceProviderEntity extends AbstractNamedLongUniqueEntity
    implements ServiceProvider
{
  @Embedded
  private EmbeddedAuditable                 audit;

  @Column(name = "authentication_type")
  private AuthenticationType                authenticationType;

  @Column(name = "client_registration_id", length = 255)
  private String                            clientRegistrationId;

  @Column(name = "description", length = 255)
  private String                            description;

  @Column(name = "is_enabled", nullable = false)
  private boolean                           enabled;

  @OneToMany(fetch = FetchType.LAZY, mappedBy = "provider", cascade = CascadeType.ALL, orphanRemoval = true)
  private Set<ServiceProviderAccountEntity> providedAccounts;

  @OneToMany(fetch = FetchType.LAZY, mappedBy = "provider", cascade = CascadeType.ALL, orphanRemoval = true)
  private Set<OrganizationAccountEntity>    providedOrganizationAccounts;

  @OneToMany(fetch = FetchType.LAZY, mappedBy = "provider", cascade = CascadeType.ALL, orphanRemoval = true)
  private Set<ServiceProviderAccountEntity> providedServiceProviderAccounts;

  /**
   * Hibernate constructor
   */
  protected AbstractServiceProviderEntity()
  {

  }


  @Override
  public AuthenticationType getAuthenticationType()
  {
    return this.authenticationType;
  }


  @Override
  public String getClientRegistrationId()
  {
    return this.clientRegistrationId;
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
    if (this.providedAccounts == null)
    {
      return Collections.emptySet();
    }

    return this.providedAccounts.stream()//
        .map(account -> (ServiceProviderAccount)account)//
        .collect(Collectors.toSet());
  }


  @Override
  public Set<OrganizationAccount> getProvidedOrganizationAccounts()
  {
    if (this.providedOrganizationAccounts == null)
    {
      return Collections.emptySet();
    }

    return this.providedOrganizationAccounts.stream()//
        .map(account -> (OrganizationAccount)account)//
        .collect(Collectors.toSet());
  }


  @Override
  public Set<ServiceProviderAccount> getProvidedServiceProviderAccounts()
  {
    if (this.providedServiceProviderAccounts == null)
    {
      return Collections.emptySet();
    }

    return this.providedServiceProviderAccounts.stream()//
        .map(account -> (ServiceProviderAccount)account)//
        .collect(Collectors.toSet());
  }


  @Override
  public boolean isEnabled()
  {
    return this.enabled;
  }


  @Override
  public void setAuthenticationType(
    AuthenticationType authenticationType)
  {
    this.authenticationType = authenticationType;
  }


  @Override
  public void setClientRegistrationId(
    String clientRegistrationId)
  {
    this.clientRegistrationId = clientRegistrationId;
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
    Set<Account> providedAccounts)
  {
    this.providedAccounts = providedAccounts//
        .stream()//
        .map(account -> (ServiceProviderAccountEntity)account)//
        .collect(Collectors.toSet());
  }


  @Override
  public void setProvidedOrganizationAccounts(
    Set<OrganizationAccount> accounts)
  {
    this.providedOrganizationAccounts = accounts//
        .stream()//
        .map(account -> (OrganizationAccountEntity)account)//
        .collect(Collectors.toSet());
  }


  @Override
  public void setProvidedServiceProviderAccounts(
    Set<ServiceProviderAccount> accounts)
  {
    this.providedServiceProviderAccounts = accounts//
        .stream()//
        .map(account -> (ServiceProviderAccountEntity)account)//
        .collect(Collectors.toSet());
  }

}
