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
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;

import org.drdeesw.commons.accounting.models.Account;
import org.drdeesw.commons.common.models.entities.AbstractNamedLongUniqueEntity;
import org.drdeesw.commons.organization.models.OrganizationAccount;
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
  private AuthenticationType                      authenticationType;

  private String                                  clientRegistrationId;
  @OneToMany(fetch = FetchType.LAZY, mappedBy = "provider", cascade = CascadeType.ALL, orphanRemoval = true)
  private Set<ServiceProviderAccountEntity>       providedAccounts;
  @ManyToOne
  @JoinColumn(name = "token_holder_id")
  private ServiceProviderAccountTokenHolderEntity tokenHolder;

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
    // TODO Auto-generated method stub
    return null;
  }


  @Override
  public Instant getCreationDate()
  {
    // TODO Auto-generated method stub
    return null;
  }


  @Override
  public String getDescription()
  {
    // TODO Auto-generated method stub
    return null;
  }


  @Override
  public Instant getLastUpdateDate()
  {
    // TODO Auto-generated method stub
    return null;
  }


  @Override
  public User getLastUpdatedBy()
  {
    // TODO Auto-generated method stub
    return null;
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
    // TODO Auto-generated method stub
    return null;
  }


  @Override
  public Set<ServiceProviderAccount> getProvidedServiceProviderAccounts()
  {
    // TODO Auto-generated method stub
    return null;
  }


  /**
   * @return the tokenHolder
   */
  public ServiceProviderAccountTokenHolderEntity getTokenHolder()
  {
    return tokenHolder;
  }


  @Override
  public boolean isEnabled()
  {
    // TODO Auto-generated method stub
    return false;
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
    // TODO Auto-generated method stub

  }


  @Override
  public void setCreationDate(
    Instant creationDate)
  {
    // TODO Auto-generated method stub

  }


  @Override
  public void setDescription(
    String description)
  {
    // TODO Auto-generated method stub

  }


  @Override
  public void setEnabled(
    boolean enabled)
  {
    // TODO Auto-generated method stub

  }


  @Override
  public void setLastUpdateDate(
    Instant lastUpdateDate)
  {
    // TODO Auto-generated method stub

  }


  @Override
  public void setLastUpdatedBy(
    User lastUpdatedBy)
  {
    // TODO Auto-generated method stub

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
    // TODO Auto-generated method stub

  }


  @Override
  public void setProvidedServiceProviderAccounts(
    Set<ServiceProviderAccount> accounts)
  {
    // TODO Auto-generated method stub

  }


  /**
   * @param tokenHolder the tokenHolder to set
   */
  public void setTokenHolder(
    ServiceProviderAccountTokenHolderEntity tokenHolder)
  {
    this.tokenHolder = tokenHolder;
  }

}
