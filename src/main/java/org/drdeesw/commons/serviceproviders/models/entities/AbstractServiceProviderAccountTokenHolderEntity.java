/**
 * 
 */
package org.drdeesw.commons.serviceproviders.models.entities;


import java.time.Instant;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import org.drdeesw.commons.common.models.entities.AbstractLongUniqueEntity;
import org.drdeesw.commons.serviceproviders.models.ServiceProviderAccount;
import org.drdeesw.commons.serviceproviders.models.ServiceProviderAccountTokenHolder;


/**
 * 
 */
@SuppressWarnings("serial")
@MappedSuperclass
@Access(AccessType.FIELD)
public abstract class AbstractServiceProviderAccountTokenHolderEntity
    extends AbstractLongUniqueEntity implements ServiceProviderAccountTokenHolder
{
  @Column(name = "access_token")
  private String                       accessToken;
  @Column(name = "access_token_expiry")
  private Instant                      accessTokenExpiry;
  @Column(name = "account_id")
  private ServiceProviderAccountEntity account;
  @Column(name = "refresh_token")
  private String                       refreshToken;
  @Column(name = "refresh_token_expiry")
  private Instant                      refreshTokenExpiry;

  /**
   * 
   */
  protected AbstractServiceProviderAccountTokenHolderEntity()
  {

  }


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
  public ServiceProviderAccount getAccount()
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
    ServiceProviderAccount account)
  {
    this.account = (ServiceProviderAccountEntity)account;
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
