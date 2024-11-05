/**
 * 
 */
package org.drdeesw.commons.serviceproviders.models;


import org.drdeesw.commons.common.models.Describable;
import org.drdeesw.commons.common.models.NamedLongUniqueObject;


/**
 * 
 */
public interface ServiceProvider extends NamedLongUniqueObject, Describable
{
  /**
   * Returns the authentication type of the service provider.
   * 
   * @return the authentication type
   */
  AuthenticationType getAuthenticationType();


  /**
   * Returns the OAuth2 client registration ID for the service provider.
   * 
   * @return the OAuth2 client registration ID for the service provider
   */
  String getClientRegistrationId();


  /**
   * Returns the type of the service provider.
   * 
   * @return the type
   */
  ServiceProviderType getType();


  /**
   * Sets the authentication type of the service provider.
   * 
   * @param authenticationType the authentication type
   */
  void setAuthenticationType(
    AuthenticationType authenticationType);


  /**
   * Sets the OAuth2 client registration ID for the service provider.
   * 
   */
  void setClientRegistrationId(
    String clientRegistrationId);


  /**
   * Sets the type of the service provider.
   * 
   * @param type the type
   */
  void setType(
    ServiceProviderType type);
}
