/**
 * 
 */
package org.drdeesw.commons.accounting.models.entities;


import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.drdeesw.commons.accounting.models.AccountHolder;
import org.drdeesw.commons.accounting.models.AccountProvider;


/**
 * 
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "accounts")
@AttributeOverride(name = "id", column = @Column(name = "account_id"))
public class AccountEntity extends AbstractAccountEntity
{
  @ManyToOne(targetEntity = AccountHolderEntity.class, optional = false)
  @JoinColumn(name = "holder_id", nullable = false)
  private AccountHolderEntity   holder;

  @ManyToOne(targetEntity = AccountProviderEntity.class, optional = false)
  @JoinColumn(name = "provider_id", nullable = false)
  private AccountProviderEntity provider;

  @Override
  public AccountHolder getHolder()
  {
    return holder;
  }


  @Override
  public AccountProvider getProvider()
  {
    return this.provider;
  }


  @Override
  public void setHolder(
    AccountHolder accountHolder)
  {
    this.holder = (AccountHolderEntity)accountHolder;
  }


  @Override
  public void setProvider(
    AccountProvider accountProvider)
  {
    this.provider = (AccountProviderEntity)accountProvider;
  }

}
