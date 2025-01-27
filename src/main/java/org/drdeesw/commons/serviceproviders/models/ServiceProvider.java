/**
 * 
 */
package org.drdeesw.commons.serviceproviders.models;


import org.drdeesw.commons.accounting.models.AccountProvider;
import org.drdeesw.commons.common.models.Auditable;
import org.drdeesw.commons.common.models.Describable;
import org.drdeesw.commons.common.models.NamedLongUniqueObject;


/**
 * 
 */
public interface ServiceProvider<A extends ServiceProviderAccount<?,?,?>>
    extends NamedLongUniqueObject, AccountProvider<A>, Auditable, Describable
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
   * Sets the authentication type of the service provider.
   * 
   * @param authenticationType the authentication type
   */
  void setAuthenticationType(
    AuthenticationType authenticationType);


  /**
   * Sets the OAuth2 client registration ID for the service provider.
   * 
   * @param clientRegistrationId the OAuth2 client registration ID for the service
   *                             provider
   */
  void setClientRegistrationId(
    String clientRegistrationId);

}
