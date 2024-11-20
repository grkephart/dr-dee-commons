/**
 * 
 */
package org.drdeesw.commons.serviceproviders.models.entities;


import java.time.Instant;
import java.util.Set;
import java.util.stream.Collectors;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.FetchType;
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
  @OneToMany(fetch = FetchType.LAZY, mappedBy = "organization")
  private Set<ServiceProviderAccountEntity> accounts;
  @Column(name = "authentication_type")
  private AuthenticationType                authenticationType;
  @Column(name = "client_registration_Id")
  private String                            clientRegistrationId;
  @Column(name = "created_by_id", nullable = false)
  private Long                              createdById;
  @Column(name = "creation_date", nullable = false)
  private Instant                           creationDate;
  @Column(name = "description")
  private String                            description;
  @Column(name = "last_update_date")
  private Instant                           lastUpdateDate;
  @Column(name = "last_update_id")
  private Long                              lastUpdateId;
  private ServiceProviderTypeEntity         type;

  /**
   * 
   */
  protected AbstractServiceProviderEntity()
  {
    super();
  }


  @Override
  public AccountHolderType getAccountHolderType()
  {
    return AccountHolderType.ORGANIZATION;
  }


  public Set<ServiceProviderAccount> getAccounts()
  {
    return this.accounts.stream()//
        .map(account -> (ServiceProviderAccount)account)//
        .collect(Collectors.toSet());
  }


  @Override
  public AuthenticationType getAuthenticationType()
  {
    return authenticationType;
  }


  @Override
  public String getClientRegistrationId()
  {
    return clientRegistrationId;
  }


  @Override
  public Long getCreatedById()
  {
    return createdById;
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
  public Instant getLastUpdateDate()
  {
    return lastUpdateDate;
  }


  @Override
  public Long getLastUpdateId()
  {
    return lastUpdateId;
  }


  public ServiceProviderType getType()
  {
    return type;
  }


  @Override
  public void setAccounts(
    Set<ServiceProviderAccount> accounts)
  {
    this.accounts = accounts.stream()//
        .map(account -> (ServiceProviderAccountEntity)account)//
        .collect(Collectors.toSet());

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
  public void setCreatedById(
    Long createdById)
  {
    this.createdById = createdById;
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
  public void setLastUpdateDate(
    Instant lastUpdateDate)
  {
    this.lastUpdateDate = lastUpdateDate;
  }


  @Override
  public void setLastUpdateId(
    Long lastUpdateId)
  {
    this.lastUpdateId = lastUpdateId;
  }


  public void setType(
    ServiceProviderType type)
  {
    this.type = (ServiceProviderTypeEntity)type;
  }

}
