/**
 * 
 */
package org.drdeesw.commons.serviceproviders.models.entities;


import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import javax.persistence.AttributeOverride;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.drdeesw.commons.accounting.models.Account;
import org.drdeesw.commons.accounting.models.entities.AccountEntity;
import org.drdeesw.commons.serviceproviders.models.AuthenticationType;


/**
 * 
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "service_providers")
@Inheritance(strategy = InheritanceType.JOINED)
@AttributeOverride(name = "id", column = @Column(name = "service_provider_id"))
public class ServiceProviderEntity extends AbstractServiceProviderEntity
{
  private AuthenticationType authenticationType;
  private String             clientRegistrationId;
  @OneToMany(fetch = FetchType.LAZY, mappedBy = "provider", cascade = CascadeType.ALL, orphanRemoval = true)
  private Set<AccountEntity> providedAccounts;

  public ServiceProviderEntity()
  {
    super();
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
  public Set<Account> getProvidedAccounts()
  {
    return new HashSet<>(providedAccounts);
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
  public void setProvidedAccounts(
    Set<Account> providedAccounts)
  {
    this.providedAccounts = providedAccounts//
        .stream()//
        .map(account -> (AccountEntity)account)//
        .collect(Collectors.toSet());
  }

}
