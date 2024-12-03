/**
 * 
 */
package org.drdeesw.commons.serviceproviders.models.pojos;


import org.drdeesw.commons.organization.models.pojos.OrganizationAccountPojo;
import org.drdeesw.commons.serviceproviders.models.ServiceProvider;
import org.drdeesw.commons.serviceproviders.models.ServiceProviderAccount;
import org.drdeesw.commons.serviceproviders.models.ServiceProviderAccountTokenHolder;


/**
 * 
 */
@SuppressWarnings("serial")
public class ServiceProviderAccountPojo extends OrganizationAccountPojo
    implements ServiceProviderAccount
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
  public ServiceProvider getServiceProvider()
  {
    return (ServiceProvider)super.getOrganization();
  }


  @Override
  public ServiceProviderAccountTokenHolderPojo getTokenHolder()
  {
    return tokenHolder;
  }


  @Override
  public void setServiceProvider(
    ServiceProvider serviceProvider)
  {
    super.setOrganization(serviceProvider);
  }


  @Override
  public void setTokenHolder(
    ServiceProviderAccountTokenHolder tokenHolder)
  {
    this.tokenHolder = (ServiceProviderAccountTokenHolderPojo)tokenHolder;
  }

}
