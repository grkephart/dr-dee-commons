/**
 * 
 */
package org.drdeesw.commons.serviceproviders.models;


import org.drdeesw.commons.common.models.NamedLongUniqueObject;


/**
 * 
 */
public interface ServiceProvider extends NamedLongUniqueObject
{
  /**
   * Returns the authentication type of the service provider.
   * 
   * @return the authentication type
   */
  AuthenticationType getAuthenticationType();


  /**
   * Returns the description of the service provider.
   * 
   * @return the description
   */
  String getDescription();


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
   * Sets the description of the service provider.
   * 
   * @param description the description
   */
  void setDescription(
    String description);


  /**
   * Sets the type of the service provider.
   * 
   * @param type the type
   */
  void setType(
    ServiceProviderType type);
}
