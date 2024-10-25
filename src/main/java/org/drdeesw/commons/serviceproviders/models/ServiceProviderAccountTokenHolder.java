/**
 * 
 */
package org.drdeesw.commons.serviceproviders.models;


import java.time.Instant;

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
   * Returns the accessToken expiry.
   * 
   * @return the accessToken expiry
   */
  Instant getAccessTokenExpiry();


  /**
   * Returns the serviceProviderAccount.
   * 
   * @return the serviceProviderAccount
   */
  ServiceProviderAccount<U> getAccount();


  /**
   * Returns the refreshToken.
   * 
   * @return the refreshToken
   */
  String getRefreshToken();


  /**
   * Returns the refreshToken expiry.
   * 
   * @return the refreshToken expiry
   */
  Instant getRefreshTokenExpiry();


  /**
   * Sets the accessToken.
   * 
   * @param accessToken the accessToken to set
   */
  void setAccessToken(
    String accessToken);


  /**
   * Sets the accessToken expiry.
   * 
   * @param accessTokenExpiry the accessToken expiry to set
   */
  void setAccessTokenExpiry(
    Instant accessTokenExpiry);


  /**
   * Sets the serviceProviderAccount.
   * 
   * @param account the serviceProviderAccount
   */
  void setAccount(
    ServiceProviderAccount<U> account);


  /**
   * Sets the refreshToken.
   * 
   * @param refreshToken the refreshToken
   */
  void setRefreshToken(
    String refreshToken);


  /**
   * Sets the refreshToken expiry.
   * 
   * @param refreshTokenExpiry the refreshToken expiry to set
   */
  void setRefreshTokenExpiry(
    Instant refreshTokenExpiry);
}
