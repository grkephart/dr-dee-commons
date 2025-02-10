/**
 * 
 */
package org.drdeesw.commons.serviceproviders.models.pojos;


import org.drdeesw.commons.accounting.models.pojos.AccountProviderPojo;
import org.drdeesw.commons.security.models.pojos.UserPojo;
import org.drdeesw.commons.serviceproviders.models.AuthenticationType;
import org.drdeesw.commons.serviceproviders.models.ServiceProvider;


/**
 * 
 */
@SuppressWarnings("serial")
public class ServiceProviderPojo
    extends AccountProviderPojo<UserPojo<?>, ServiceProviderAccountPojo>
    implements ServiceProvider<UserPojo<?>, ServiceProviderAccountPojo>
{
  private AuthenticationType authenticationType;
  private String             clientRegistrationId;

  @Override
  public AuthenticationType getAuthenticationType()
  {
    return authenticationType;
  }


  @Override
  public String getClientRegistrationId()
  {
    return this.clientRegistrationId;
  }


  @Override
  public void setAuthenticationType(
    AuthenticationType authenticationType)
  {
    this.authenticationType = authenticationType;
  }


  @Override
  public void setClientRegistrationId(
    String clientRegistrationId)
  {
    this.clientRegistrationId = clientRegistrationId;
  }

}
