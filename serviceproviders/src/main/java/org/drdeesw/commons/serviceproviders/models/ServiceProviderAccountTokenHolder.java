/**
 * 
 */
package org.drdeesw.commons.serviceproviders.models;


import org.drdeesw.commons.common.models.LongUniqueObject;
import org.drdeesw.commons.security.models.User;


/**
 * 
 */
public interface ServiceProviderAccountTokenHolder<U extends User> extends LongUniqueObject
{
  /**
   * Returns the accessToken.
   * 
   * @return the accessToken
   */
  String getAccessToken();


  /**
   * Returns the refreshToken.
   * 
   * @return the refreshToken
   */
  String getRefreshToken();


  /**
   * Returns the serviceProviderAccount.
   * 
   * @return the serviceProviderAccount
   */
  ServiceProviderAccount<U> getServiceProviderAccount();


  /**
   * Sets the accessToken.
   * 
   * @param accessToken the accessToken to set
   */
  void setAccessToken(
    String accessToken);


  /**
   * Sets the refreshToken.
   * 
   * @param refreshToken the refreshToken
   */
  void setRefreshToken(
    String refreshToken);


  /**
   * Sets the serviceProviderAccount.
   * 
   * @param serviceProviderAccount the serviceProviderAccount
   */
  void setServiceProviderAccount(
    ServiceProviderAccount<U> serviceProviderAccount);
}
