/**
 * 
 */
package org.drdeesw.commons.serviceproviders.models.entities;


import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import org.drdeesw.commons.accounting.models.AccountHolder;
import org.drdeesw.commons.accounting.models.AccountProvider;
import org.drdeesw.commons.accounting.models.entities.AccountHolderEntity;
import org.drdeesw.commons.accounting.models.entities.AccountProviderEntity;


/**
 * 
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "service_provider_accounts")
@Inheritance(strategy = InheritanceType.JOINED)
@AttributeOverride(name = "id", column = @Column(name = "service_provider_account_id"))
public class ServiceProviderAccountEntity extends AbstractServiceProviderAccountEntity
{
  private AccountHolderEntity   holder;
  private AccountProviderEntity provider;

  /**
   * Hibernate constructor
   */
  public ServiceProviderAccountEntity()
  {

  }


  @Override
  public AccountHolder getHolder()
  {
    return this.holder;
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
