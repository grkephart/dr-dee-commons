/**
 * 
 */
package org.drdeesw.commons.serviceproviders.models.pojos;


import org.drdeesw.commons.common.models.pojos.AbstractNamedLongUniquePojo;
import org.drdeesw.commons.serviceproviders.models.ServiceProvider;
import org.drdeesw.commons.serviceproviders.models.ServiceProviderAccount;
import org.drdeesw.commons.serviceproviders.models.ServiceProviderAccountHolder;
import org.drdeesw.commons.serviceproviders.models.ServiceProviderAccountTokenHolder;


/**
 * 
 */
@SuppressWarnings("serial")
public class ServiceProviderAccountPojo extends AbstractNamedLongUniquePojo
    implements ServiceProviderAccount
{
  private ServiceProviderPojo                   serviceProvider;
  private ServiceProviderAccountTokenHolderPojo tokenHolder;
  private ServiceProviderAccountHolder          accountHolder;

  /**
   * @return the serviceProvider
   */
  public ServiceProvider getServiceProvider()
  {
    return serviceProvider;
  }


  /**
   * @return the tokenHolder
   */
  public ServiceProviderAccountTokenHolderPojo getTokenHolder()
  {
    return tokenHolder;
  }


  /**
   * @return the accountHolder
   */
  public ServiceProviderAccountHolder getAccountHolder()
  {
    return accountHolder;
  }


  /**
   * @param serviceProvider the serviceProvider to set
   */
  public void setServiceProvider(
    ServiceProvider serviceProvider)
  {
    this.serviceProvider = (ServiceProviderPojo)serviceProvider;
  }


  /**
   * @param tokenHolder the tokenHolder to set
   */
  public void setTokenHolder(
    ServiceProviderAccountTokenHolder tokenHolder)
  {
    this.tokenHolder = (ServiceProviderAccountTokenHolderPojo)tokenHolder;
  }


  /**
   * @param accountHolder the accountHolder to set
   */
  public void setAccountHolder(
    ServiceProviderAccountHolder accountHolder)
  {
    this.accountHolder = accountHolder;
  }

}
