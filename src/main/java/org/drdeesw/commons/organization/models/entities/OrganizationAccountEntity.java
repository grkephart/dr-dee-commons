/**
 * 
 */
package org.drdeesw.commons.organization.models.entities;


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


@SuppressWarnings("serial")
@Entity
@Table(name = "organization_accounts")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Access(AccessType.PROPERTY)
public class OrganizationAccountEntity
    extends AbstractOrganizationAccountEntity<AccountHolderEntity, OrganizationEntity, UserEntity>
{
  private AccountHolderEntity holder;
  private OrganizationEntity  provider;
  private UserEntity          user;

  @Override
  @ManyToOne(targetEntity = AccountHolderEntity.class, optional = false)
  @JoinColumn(name = "holder_id", nullable = false)
  public AccountHolderEntity getHolder()
  {
    return this.holder;
  }


  @Override
  @Column(name = "organization_account_id")
  public Long getId()
  {
    return super.getId();
  }


  @Override
  @ManyToOne(targetEntity = AccountProviderEntity.class, optional = false)
  @JoinColumn(name = "provider_id", nullable = false)
  public OrganizationEntity getProvider()
  {
    return this.provider;
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
    OrganizationEntity accountProvider)
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
