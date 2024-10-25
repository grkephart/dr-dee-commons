/**
 * 
 */
package org.drdeesw.commons.serviceproviders.models.entities;


import javax.persistence.Entity;
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
@Entity
@Table(name = "service_provider_accounts")
@SuppressWarnings("serial")
public class ServiceProviderAccountEntity extends AbstractNamedLongUniqueEntity
    implements ServiceProviderAccount
{
  @ManyToOne
  private ServiceProviderEntity                   serviceProvider;
  @ManyToOne
  private ServiceProviderAccountTokenHolderEntity tokenHolder;
  @ManyToOne
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
