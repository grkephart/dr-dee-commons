/**
 * 
 */
package org.drdeesw.commons.serviceproviders.models.pojos;


import java.time.Instant;
import java.util.Set;
import java.util.stream.Collectors;

import org.drdeesw.commons.common.models.pojos.AbstractNamedLongUniquePojo;
import org.drdeesw.commons.security.models.User;
import org.drdeesw.commons.security.models.pojos.UserPojo;
import org.drdeesw.commons.serviceproviders.models.AuthenticationType;
import org.drdeesw.commons.serviceproviders.models.ServiceProvider;


/**
 * 
 */
@SuppressWarnings("serial")
public class ServiceProviderPojo extends AbstractNamedLongUniquePojo
    implements ServiceProvider<ServiceProviderAccountPojo>
{
  private AuthenticationType              authenticationType;
  private String                          clientRegistrationId;
  private UserPojo                            createdBy;
  private Instant                         creationDate;
  private String                          description;
  private boolean                         enabled;
  private Instant                         lastUpdateDate;
  private UserPojo                            lastUpdatedBy;
  private Set<ServiceProviderAccountPojo> providedAccounts;

  @Override
  public AuthenticationType getAuthenticationType()
  {
    return authenticationType;
  }


  @Override
  public String getClientRegistrationId()
  {
    return this.clientRegistrationId;
  }


  @Override
  public UserPojo getCreatedBy()
  {
    return this.createdBy;
  }


  @Override
  public Instant getCreationDate()
  {
    return this.creationDate;
  }


  @Override
  public String getDescription()
  {
    return description;
  }


  @Override
  public Instant getLastUpdateDate()
  {
    return this.lastUpdateDate;
  }


  @Override
  public UserPojo getLastUpdatedBy()
  {
    return this.lastUpdatedBy;
  }


  @Override
  public Set<ServiceProviderAccountPojo> getProvidedAccounts()
  {
    return this.providedAccounts.stream()//
        .map(account -> (ServiceProviderAccountPojo)account)//
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
    User<?> createdBy)
  {
    this.createdBy = (UserPojo)createdBy;
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
  public void setLastUpdateDate(
    Instant lastUpdateDate)
  {
    this.lastUpdateDate = lastUpdateDate;
  }


  @Override
  public void setLastUpdatedBy(
    User<?> lastUpdateId)
  {
    this.lastUpdatedBy = (UserPojo)lastUpdateId;
  }


  @Override
  public void setProvidedAccounts(
    Set<ServiceProviderAccountPojo> providedAccounts)
  {
    this.providedAccounts = providedAccounts.stream()//
        .map(account -> (ServiceProviderAccountPojo)account)//
        .collect(Collectors.toSet());

  }

}
