/**
 * 
 */
package org.drdeesw.commons.serviceproviders.models.pojos;


import org.drdeesw.commons.common.models.pojos.AbstractNamedLongUniquePojo;
import org.drdeesw.commons.security.models.pojos.UserPojo;
import org.drdeesw.commons.serviceproviders.models.ServiceProvider;
import org.drdeesw.commons.serviceproviders.models.ServiceProviderAccount;
import org.drdeesw.commons.serviceproviders.models.ServiceProviderAccountTokenHolder;


/**
 * 
 */
@SuppressWarnings("serial")
public class ServiceProviderAccountPojo<U extends UserPojo> extends AbstractNamedLongUniquePojo
    implements ServiceProviderAccount<U>
{
  private ServiceProviderPojo                      serviceProvider;
  private ServiceProviderAccountTokenHolderPojo<U> tokenHolder;
  private U                                        user;

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
  public ServiceProviderAccountTokenHolderPojo<U> getTokenHolder()
  {
    return tokenHolder;
  }


  /**
   * @return the user
   */
  public U getUser()
  {
    return user;
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
    ServiceProviderAccountTokenHolder<U> tokenHolder)
  {
    this.tokenHolder = (ServiceProviderAccountTokenHolderPojo<U>)tokenHolder;
  }


  /**
   * @param user the user to set
   */
  public void setUser(
    U user)
  {
    this.user = user;
  }

}
