/**
 * 
 */
package org.drdeesw.commons.serviceproviders.models.pojos;


import org.drdeesw.commons.organization.models.pojos.AccountPojo;
import org.drdeesw.commons.serviceproviders.models.ServiceProviderAccount;
import org.drdeesw.commons.serviceproviders.models.ServiceProviderAccountTokenHolder;


/**
 * 
 */
@SuppressWarnings("serial")
public class ServiceProviderAccountPojo extends AccountPojo implements ServiceProviderAccount
{
  private ServiceProviderAccountTokenHolderPojo tokenHolder;

  /**
   * 
   */
  public ServiceProviderAccountPojo()
  {
  }


  /**
   * @param serviceProvider the service provider
   * @param internalId the internal id
   */
  public ServiceProviderAccountPojo(ServiceProviderPojo serviceProvider, String internalId)
  {
    super(serviceProvider, internalId);
  }


  @Override
  public ServiceProviderAccountTokenHolderPojo getTokenHolder()
  {
    return tokenHolder;
  }


  @Override
  public void setTokenHolder(
    ServiceProviderAccountTokenHolder tokenHolder)
  {
    this.tokenHolder = (ServiceProviderAccountTokenHolderPojo)tokenHolder;
  }

}
