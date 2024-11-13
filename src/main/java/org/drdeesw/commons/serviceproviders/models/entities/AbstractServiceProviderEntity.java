/**
 * 
 */
package org.drdeesw.commons.serviceproviders.models.entities;


import java.util.Set;
import java.util.stream.Collectors;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;

import org.drdeesw.commons.common.models.entities.AbstractNamedLongUniqueEntity;
import org.drdeesw.commons.serviceproviders.models.AuthenticationType;
import org.drdeesw.commons.serviceproviders.models.ServiceProvider;
import org.drdeesw.commons.serviceproviders.models.ServiceProviderAccount;
import org.drdeesw.commons.serviceproviders.models.ServiceProviderType;


/**
 * 
 */
@SuppressWarnings("serial")
@MappedSuperclass
@Access(AccessType.FIELD)
public abstract class AbstractServiceProviderEntity extends AbstractNamedLongUniqueEntity
    implements ServiceProvider
{
  @OneToMany(fetch = FetchType.LAZY, mappedBy = "serviceProvider")
  private Set<ServiceProviderAccountEntity> accounts;
  @Column(name = "authentication_type")
  private AuthenticationType                authenticationType;
  @Column(name = "client_registration_Id")
  private String                            clientRegistrationId;
  @Column(name = "description")
  private String                            description;
  @ManyToOne
  @JoinColumn(name = "type_id")
  private ServiceProviderTypeEntity         type;

  /**
   * 
   */
  protected AbstractServiceProviderEntity()
  {

  }


  /**
   * @return the accounts
   */
  public Set<ServiceProviderAccount> getAccounts()
  {
    return this.accounts.stream()//
        .map(member -> (ServiceProviderAccountEntity)member)//
        .collect(Collectors.toSet());
  }


  @Override
  public AuthenticationType getAuthenticationType()
  {
    return authenticationType;
  }


  /**
   * @return the clientRegistrationId
   */
  public String getClientRegistrationId()
  {
    return clientRegistrationId;
  }


  @Override
  public String getDescription()
  {
    return description;
  }


  @Override
  public ServiceProviderType getType()
  {
    return type;
  }


  /**
   * @param accounts the accounts to set
   */
  public void setAccounts(
    Set<ServiceProviderAccount> accounts)
  {
    this.accounts = accounts.stream()//
        .map(member -> (ServiceProviderAccountEntity)member)//
        .collect(Collectors.toSet());
  }


  @Override
  public void setAuthenticationType(
    AuthenticationType authenticationType)
  {
    this.authenticationType = authenticationType;
  }


  /**
   * @param clientRegistrationId the clientRegistrationId to set
   */
  public void setClientRegistrationId(
    String clientRegistrationId)
  {
    this.clientRegistrationId = clientRegistrationId;
  }


  @Override
  public void setDescription(
    String description)
  {
    this.description = description;
  }


  @Override
  public void setType(
    ServiceProviderType type)
  {
    this.type = (ServiceProviderTypeEntity)type;
  }


  /**
   * @param type the type to set
   */
  public void setType(
    ServiceProviderTypeEntity type)
  {
    this.type = type;
  }

}
