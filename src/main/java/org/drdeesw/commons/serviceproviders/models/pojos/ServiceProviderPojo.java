/**
 * 
 */
package org.drdeesw.commons.serviceproviders.models.pojos;


import org.drdeesw.commons.common.models.pojos.AbstractNamedLongUniquePojo;
import org.drdeesw.commons.serviceproviders.models.AuthenticationType;
import org.drdeesw.commons.serviceproviders.models.ServiceProvider;
import org.drdeesw.commons.serviceproviders.models.ServiceProviderType;


/**
 * 
 */
@SuppressWarnings("serial")
public class ServiceProviderPojo extends AbstractNamedLongUniquePojo implements ServiceProvider
{
  private AuthenticationType      authenticationType;
  private String                  clientRegistrationId;
  private String                  description;
  private ServiceProviderTypePojo type;

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
  public String getDescription()
  {
    return description;
  }


  @Override
  public ServiceProviderTypePojo getType()
  {
    return type;
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


  @Override
  public void setDescription(
    String description)
  {
    this.description = description;
  }


  @Override
  public void setType(
    ServiceProviderType type)
  {
    this.type = (ServiceProviderTypePojo)type;
  }

}
