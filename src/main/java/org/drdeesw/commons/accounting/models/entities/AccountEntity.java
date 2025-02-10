/**
 * 
 */
package org.drdeesw.commons.accounting.models.entities;


import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.drdeesw.commons.security.models.entities.UserEntity;


/**
 * 
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "accounts")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Access(AccessType.PROPERTY)
public class AccountEntity
    extends AbstractAccountEntity<UserEntity, AccountHolderEntity, AccountProviderEntity>
{
  private AccountHolderEntity   holder;
  private AccountProviderEntity provider;
  private UserEntity            user;

  /**
   * @return the holder
   */
  public AccountHolderEntity getHolder()
  {
    return holder;
  }


  @Override
  @Column(name = "account_id")
  public Long getId()
  {
    return super.getId();
  }


  /**
   * @return the provider
   */
  public AccountProviderEntity getProvider()
  {
    return provider;
  }


  @Override
  @OneToOne
  @JoinColumn(name = "user_id")
  public UserEntity getUser()
  {
    return user;
  }


  /**
   * @param holder the holder to set
   */
  public void setHolder(
    AccountHolderEntity holder)
  {
    this.holder = holder;
  }


  @Override
  public void setProvider(
    AccountProviderEntity accountProvider)
  {
    this.provider = accountProvider;
  }


  @Override
  public void setUser(
    UserEntity user)
  {
    this.user = user;
  }

}
