/**
 * 
 */
package org.drdeesw.commons.serviceproviders.models.entities;


import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.drdeesw.commons.common.models.entities.AbstractNamedLongUniqueEntity;
import org.drdeesw.commons.serviceproviders.models.ServiceProvider;
import org.drdeesw.commons.serviceproviders.models.ServiceProviderAccount;
import org.drdeesw.commons.serviceproviders.models.ServiceProviderAccountHolder;
import org.drdeesw.commons.serviceproviders.models.ServiceProviderAccountTokenHolder;


/**
 * 
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "service_provider_accounts")
@AttributeOverride(name = "id", column = @Column(name = "service_provider_account_id"))
@Access(AccessType.FIELD)
public class ServiceProviderAccountEntity extends AbstractNamedLongUniqueEntity
    implements ServiceProviderAccount
{
  @ManyToOne
  @JoinColumn(name = "service_provider_id")
  private ServiceProviderEntity                   serviceProvider;
  @ManyToOne
  @JoinColumn(name = "token_holder_id")
  private ServiceProviderAccountTokenHolderEntity tokenHolder;
  @ManyToOne
  @JoinColumn(name = "account_holder_id")
  private ServiceProviderAccountHolder            accountHolder;

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
  public ServiceProviderAccountHolder getAccountHolder()
  {
    return this.accountHolder;
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


  @Override
  public void setAccountHolder(
    ServiceProviderAccountHolder accountHolder)
  {
    this.accountHolder = accountHolder;
  }

}
