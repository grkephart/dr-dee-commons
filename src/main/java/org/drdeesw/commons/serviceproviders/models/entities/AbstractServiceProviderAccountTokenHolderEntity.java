/**
 * 
 */
package org.drdeesw.commons.serviceproviders.models.entities;


import java.time.Instant;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;

import org.drdeesw.commons.common.models.entities.AbstractLongUniqueEntity;
import org.drdeesw.commons.serviceproviders.models.ServiceProviderAccountTokenHolder;


/**
 * 
 */
@SuppressWarnings("serial")
@MappedSuperclass
@Access(AccessType.PROPERTY)
public abstract class AbstractServiceProviderAccountTokenHolderEntity<//
    A extends AbstractServiceProviderAccountEntity<?, ?, ?>> //
    extends AbstractLongUniqueEntity implements ServiceProviderAccountTokenHolder<A>
{
  private String  accessToken;
  private Instant accessTokenExpiry;
  private A       account;
  private String  refreshToken;
  private Instant refreshTokenExpiry;

  /**
   * 
   */
  protected AbstractServiceProviderAccountTokenHolderEntity()
  {

  }


  @Override
  @Column(name = "access_token")
  public String getAccessToken()
  {
    return accessToken;
  }


  @Override
  @Column(name = "access_token_expiry")
  public Instant getAccessTokenExpiry()
  {
    return accessTokenExpiry;
  }


  @Override
  @ManyToOne
  @JoinColumn(name = "account_id", nullable = false)
  public A getAccount()
  {
    return account;
  }


  @Override
  @Column(name = "refresh_token")
  public String getRefreshToken()
  {
    return refreshToken;
  }


  @Override
  @Column(name = "refresh_token_expiry")
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
    A account)
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
