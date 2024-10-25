/**
 * 
 */
package org.drdeesw.commons.serviceproviders.models.entities;


import javax.persistence.Entity;
import javax.persistence.Table;

import org.drdeesw.commons.common.models.entities.AbstractNamedLongUniqueEntity;
import org.drdeesw.commons.security.models.User;
import org.drdeesw.commons.serviceproviders.models.ServiceProvider;
import org.drdeesw.commons.serviceproviders.models.ServiceProviderAccount;
import org.drdeesw.commons.serviceproviders.models.ServiceProviderAccountTokenHolder;


/**
 * 
 */
@Entity
@Table(name = "service_provider_accounts")
@SuppressWarnings("serial")
public class ServiceProviderAccountEntity<U extends User> extends AbstractNamedLongUniqueEntity
    implements ServiceProviderAccount<U>
{
  private ServiceProviderEntity                      serviceProvider;
  private ServiceProviderAccountTokenHolderEntity<U> tokenHolder;
  private U                                          user;

  @Override
  public ServiceProvider getServiceProvider()
  {
    return this.serviceProvider;
  }


  @Override
  public ServiceProviderAccountTokenHolder<U> getTokenHolder()
  {
    return this.tokenHolder;
  }


  @Override
  public U getUser()
  {
    return this.user;
  }


  @Override
  public void setServiceProvider(
    ServiceProvider serviceProvider)
  {
    this.serviceProvider = (ServiceProviderEntity)serviceProvider;
  }


  @Override
  public void setTokenHolder(
    ServiceProviderAccountTokenHolder<U> tokenHolder)
  {
    this.tokenHolder = (ServiceProviderAccountTokenHolderEntity<U>)tokenHolder;
  }


  @Override
  public void setUser(
    U user)
  {
    this.user = user;
  }

}
