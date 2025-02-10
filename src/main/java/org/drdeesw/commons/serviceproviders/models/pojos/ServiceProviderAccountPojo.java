/**
 * 
 */
package org.drdeesw.commons.serviceproviders.models.pojos;


import org.drdeesw.commons.accounting.models.pojos.AccountHolderPojo;
import org.drdeesw.commons.accounting.models.pojos.AccountPojo;
import org.drdeesw.commons.security.models.pojos.UserPojo;
import org.drdeesw.commons.serviceproviders.models.ServiceProviderAccount;
import org.drdeesw.commons.serviceproviders.models.ServiceProviderAccountTokenHolder;


/**
 * 
 */
@SuppressWarnings("serial")
public class ServiceProviderAccountPojo
    extends AccountPojo<UserPojo<?>, AccountHolderPojo<UserPojo<?>>, ServiceProviderPojo>
    implements ServiceProviderAccount<UserPojo<?>, AccountHolderPojo<UserPojo<?>>, ServiceProviderPojo>
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

  //  @Override
  //  public ServiceProviderPojo getServiceProvider()
  //  {
  //    return (ServiceProviderPojo)super.getProvider();
  //  }


  @Override
  public ServiceProviderAccountTokenHolderPojo getTokenHolder()
  {
    return tokenHolder;
  }


  @Override
  public void setTokenHolder(
    ServiceProviderAccountTokenHolder<?> tokenHolder)
  {
    this.tokenHolder = (ServiceProviderAccountTokenHolderPojo)tokenHolder;
  }

}
