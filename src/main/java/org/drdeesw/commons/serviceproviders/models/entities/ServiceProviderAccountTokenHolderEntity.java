/**
 * 
 */
package org.drdeesw.commons.serviceproviders.models.entities;


import java.time.Instant;

import org.drdeesw.commons.common.models.entities.AbstractLongUniqueEntity;
import org.drdeesw.commons.serviceproviders.models.ServiceProviderAccount;
import org.drdeesw.commons.serviceproviders.models.ServiceProviderAccountTokenHolder;


/**
 * 
 */
@SuppressWarnings("serial")
public class ServiceProviderAccountTokenHolderEntity extends AbstractLongUniqueEntity
    implements ServiceProviderAccountTokenHolder
{
  private String                       accessToken;
  private Instant                      accessTokenExpiry;
  private ServiceProviderAccountEntity account;
  private String                       refreshToken;
  private Instant                      refreshTokenExpiry;

  /**
   * @return the accessToken
   */
  public String getAccessToken()
  {
    return accessToken;
  }


  /**
   * @return the accessTokenExpiry
   */
  public Instant getAccessTokenExpiry()
  {
    return accessTokenExpiry;
  }


  /**
   * @return the account
   */
  public ServiceProviderAccount getAccount()
  {
    return account;
  }


  /**
   * @return the refreshToken
   */
  public String getRefreshToken()
  {
    return refreshToken;
  }


  /**
   * @return the refreshTokenExpiry
   */
  public Instant getRefreshTokenExpiry()
  {
    return refreshTokenExpiry;
  }


  /**
   * @param accessToken the accessToken to set
   */
  public void setAccessToken(
    String accessToken)
  {
    this.accessToken = accessToken;
  }


  /**
   * @param accessTokenExpiry the accessTokenExpiry to set
   */
  public void setAccessTokenExpiry(
    Instant accessTokenExpiry)
  {
    this.accessTokenExpiry = accessTokenExpiry;
  }


  /**
  * @param account the account to set
  */
  public void setAccount(
    ServiceProviderAccount account)
  {
    this.account = (ServiceProviderAccountEntity)account;
  }


  /**
  * @param refreshToken the refreshToken to set
  */
  public void setRefreshToken(
    String refreshToken)
  {
    this.refreshToken = refreshToken;
  }


  /**
  * @param refreshTokenExpiry the refreshTokenExpiry to set
  */
  public void setRefreshTokenExpiry(
    Instant refreshTokenExpiry)
  {
    this.refreshTokenExpiry = refreshTokenExpiry;
  }

}
