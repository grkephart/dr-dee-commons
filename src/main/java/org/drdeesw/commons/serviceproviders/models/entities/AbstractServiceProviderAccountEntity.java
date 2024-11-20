/**
 * 
 */
package org.drdeesw.commons.serviceproviders.models.entities;


import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;

import org.drdeesw.commons.common.models.entities.AbstractLongUniqueEntity;
import org.drdeesw.commons.serviceproviders.models.ServiceProvider;
import org.drdeesw.commons.serviceproviders.models.ServiceProviderAccount;
import org.drdeesw.commons.serviceproviders.models.ServiceProviderAccountTokenHolder;


/**
 * 
 */
@SuppressWarnings("serial")
@MappedSuperclass
@Access(AccessType.FIELD)
public abstract class AbstractServiceProviderAccountEntity extends AbstractLongUniqueEntity
    implements ServiceProviderAccount
{
  @Column(name = "account_holder_id")
  private Long                                    accountHolderId;
  @Column(name = "description")
  private String                                  description;
  @Column(name = "internal_id")
  private String                                  internalId;
  @ManyToOne
  @JoinColumn(name = "service_provider_id")
  private ServiceProviderEntity                   serviceProvider;
  @ManyToOne
  @JoinColumn(name = "token_holder_id")
  private ServiceProviderAccountTokenHolderEntity tokenHolder;

  /**
   * 
   */
  protected AbstractServiceProviderAccountEntity()
  {

  }


  @Override
  public Long getAccountHolderId()
  {
    return this.accountHolderId;
  }


  @Override
  public String getDescription()
  {
    return description;
  }


  @Override
  public String getInternalId()
  {
    return this.internalId;
  }


  @Override
  public ServiceProvider getServiceProvider()
  {
    return this.serviceProvider;
  }


  @Override
  public ServiceProviderAccountTokenHolder getTokenHolder()
  {
    return this.tokenHolder;
  }


  @Override
  public void setAccountHolderId(
    Long accountHolderId)
  {
    this.accountHolderId = accountHolderId;
  }


  @Override
  public void setDescription(
    String description)
  {
    this.description = description;
  }


  @Override
  public void setInternalId(
    String internalId)
  {
    this.internalId = internalId;
  }


  @Override
  public void setServiceProvider(
    ServiceProvider serviceProvider)
  {
    this.serviceProvider = (ServiceProviderEntity)serviceProvider;
  }


  @Override
  public void setTokenHolder(
    ServiceProviderAccountTokenHolder tokenHolder)
  {
    this.tokenHolder = (ServiceProviderAccountTokenHolderEntity)tokenHolder;
  }

}
