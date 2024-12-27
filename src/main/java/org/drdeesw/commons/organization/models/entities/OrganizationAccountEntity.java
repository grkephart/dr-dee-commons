/**
 * 
 */
package org.drdeesw.commons.organization.models.entities;


import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "organization_accounts")
@Inheritance(strategy = InheritanceType.JOINED)
@AttributeOverride(name = "id", column = @Column(name = "organization_account_id"))
public class OrganizationAccountEntity extends AbstractOrganizationAccountEntity
{
  @ManyToOne(targetEntity = AccountHolderEntity.class, optional = false)
  @JoinColumn(name = "holder_id", nullable = false)
  private AccountHolderEntity holder;

  @ManyToOne(targetEntity = AccountProviderEntity.class, optional = false)
  @JoinColumn(name = "provider_id", nullable = false)
  private OrganizationEntity  provider;

  /**
   * Hibernate constructor
   */
  protected OrganizationAccountEntity()
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
    this.provider = (OrganizationEntity)accountProvider;
  }

}
