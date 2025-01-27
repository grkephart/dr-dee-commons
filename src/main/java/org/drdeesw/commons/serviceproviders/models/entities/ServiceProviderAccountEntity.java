/**
 * 
 */
package org.drdeesw.commons.serviceproviders.models.entities;


import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.drdeesw.commons.accounting.models.entities.AccountHolderEntity;
import org.drdeesw.commons.accounting.models.entities.AccountProviderEntity;
import org.drdeesw.commons.security.models.entities.UserEntity;
import org.drdeesw.commons.serviceproviders.models.ServiceProviderAccountTokenHolder;


/**
 * 
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "service_provider_accounts")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Access(AccessType.PROPERTY)
public class ServiceProviderAccountEntity extends
    AbstractServiceProviderAccountEntity<AccountHolderEntity, ServiceProviderEntity, UserEntity>
{
  private AccountHolderEntity                     holder;
  private ServiceProviderEntity                   provider;
  private ServiceProviderAccountTokenHolderEntity tokenHolder;
  private UserEntity                              user;

  @Override
  @ManyToOne(targetEntity = AccountHolderEntity.class, optional = false)
  @JoinColumn(name = "account_holder_id", nullable = false)
  public AccountHolderEntity getHolder()
  {
    return this.holder;
  }


  @Override
  @Column(name = "service_provider_account_id")
  public Long getId()
  {
    return super.getId();
  }


  @Override
  @ManyToOne(targetEntity = AccountProviderEntity.class, optional = false)
  @JoinColumn(name = "account_provider_id", nullable = false)
  public ServiceProviderEntity getProvider()
  {
    return this.provider;
  }


  @Override
  @ManyToOne
  @JoinColumn(name = "token_holder_id", nullable = false)
  public ServiceProviderAccountTokenHolderEntity getTokenHolder()
  {
    return this.tokenHolder;
  }


  @Override
  @OneToOne
  @JoinColumn(name = "user_id")
  public UserEntity getUser()
  {
    return user;
  }


  @Override
  public void setHolder(
    AccountHolderEntity accountHolder)
  {
    this.holder = accountHolder;
  }


  @Override
  public void setProvider(
    ServiceProviderEntity accountProvider)
  {
    this.provider = accountProvider;
  }


  @Override
  public void setTokenHolder(
    ServiceProviderAccountTokenHolder<?> tokenHolder)
  {
    this.tokenHolder = (ServiceProviderAccountTokenHolderEntity)tokenHolder;
  }


  @Override
  public void setUser(
    UserEntity user)
  {
    this.user = user;
  }


  @Override
  public ServiceProviderEntity getServiceProvider()
  {
    return this.provider;
  }

}
