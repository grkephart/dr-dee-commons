/**
 * 
 */
package org.drdeesw.commons.serviceproviders.models.pojos;


import org.drdeesw.commons.common.models.pojos.AbstractLongUniquePojo;
import org.drdeesw.commons.serviceproviders.models.ServiceProvider;
import org.drdeesw.commons.serviceproviders.models.ServiceProviderAccount;
import org.drdeesw.commons.serviceproviders.models.ServiceProviderAccountHolder;
import org.drdeesw.commons.serviceproviders.models.ServiceProviderAccountTokenHolder;


/**
 * 
 */
@SuppressWarnings("serial")
public class ServiceProviderAccountPojo extends AbstractLongUniquePojo
    implements ServiceProviderAccount
{
  private ServiceProviderAccountHolder          accountHolder;
  private String                                description;
  private String                                internalId;
  private ServiceProviderPojo                   serviceProvider;
  private ServiceProviderAccountTokenHolderPojo tokenHolder;

  @Override
  public ServiceProviderAccountHolder getAccountHolder()
  {
    return accountHolder;
  }


  @Override
  public String getDescription()
  {
    return description;
  }


  @Override
  public String getInternalId()
  {
    return internalId;
  }


  @Override
  public ServiceProvider getServiceProvider()
  {
    return serviceProvider;
  }


  @Override
  public ServiceProviderAccountTokenHolderPojo getTokenHolder()
  {
    return tokenHolder;
  }


  @Override
  public void setAccountHolder(
    ServiceProviderAccountHolder accountHolder)
  {
    this.accountHolder = accountHolder;
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
    this.serviceProvider = (ServiceProviderPojo)serviceProvider;
  }


  @Override
  public void setTokenHolder(
    ServiceProviderAccountTokenHolder tokenHolder)
  {
    this.tokenHolder = (ServiceProviderAccountTokenHolderPojo)tokenHolder;
  }

}
