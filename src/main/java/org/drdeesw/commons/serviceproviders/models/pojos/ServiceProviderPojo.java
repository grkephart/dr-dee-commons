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
  private String                  description;
  private ServiceProviderTypePojo type;

  /**
   * @return the authenticationType
   */
  public AuthenticationType getAuthenticationType()
  {
    return authenticationType;
  }


  /**
   * @return the description
   */
  public String getDescription()
  {
    return description;
  }


  /**
   * @return the type
   */
  @Override
  public ServiceProviderTypePojo getType()
  {
    return type;
  }


  /**
   * @param authenticationType the authenticationType to set
   */
  public void setAuthenticationType(
    AuthenticationType authenticationType)
  {
    this.authenticationType = authenticationType;
  }


  /**
   * @param description the description to set
   */
  public void setDescription(
    String description)
  {
    this.description = description;
  }


  /**
   * @param type the type to set
   */
  @Override
  public void setType(
    ServiceProviderType type)
  {
    this.type = (ServiceProviderTypePojo)type;
  }


  /**
   * @param type the type to set
   */
  public void setType(
    ServiceProviderTypePojo type)
  {
    this.type = type;
  }
}
