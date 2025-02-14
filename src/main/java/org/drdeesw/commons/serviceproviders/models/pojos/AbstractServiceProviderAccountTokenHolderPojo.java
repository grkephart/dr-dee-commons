/**
 * 
 */
package org.drdeesw.commons.serviceproviders.models.pojos;


import java.time.Instant;

import org.drdeesw.commons.common.models.pojos.AbstractLongUniquePojo;
import org.drdeesw.commons.serviceproviders.models.ServiceProviderAccountTokenHolder;


/**
 * 
 */
@SuppressWarnings("serial")
public class AbstractServiceProviderAccountTokenHolderPojo//
    extends AbstractLongUniquePojo
    implements ServiceProviderAccountTokenHolder<ServiceProviderAccountPojo>
{
  private String                     accessToken;
  private Instant                    accessTokenExpiry;
  private ServiceProviderAccountPojo account;
  private String                     refreshToken;
  private Instant                    refreshTokenExpiry;

  @Override
  public String getAccessToken()
  {
    return accessToken;
  }


  @Override
  public Instant getAccessTokenExpiry()
  {
    return accessTokenExpiry;
  }


  @Override
  public ServiceProviderAccountPojo getAccount()
  {
    return account;
  }


  @Override
  public String getRefreshToken()
  {
    return refreshToken;
  }


  @Override
  public Instant getRefreshTokenExpiry()
  {
    return refreshTokenExpiry;
  }


  @Override
  public void setAccessToken(
    String accessToken)
  {
    this.accessToken = accessToken;
  }


  @Override
  public void setAccessTokenExpiry(
    Instant accessTokenExpiry)
  {
    this.accessTokenExpiry = accessTokenExpiry;
  }


  @Override
  public void setAccount(
    ServiceProviderAccountPojo account)
  {
    this.account = account;
  }


  @Override
  public void setRefreshToken(
    String refreshToken)
  {
    this.refreshToken = refreshToken;
  }


  @Override
  public void setRefreshTokenExpiry(
    Instant refreshTokenExpiry)
  {
    this.refreshTokenExpiry = refreshTokenExpiry;
  }

}
