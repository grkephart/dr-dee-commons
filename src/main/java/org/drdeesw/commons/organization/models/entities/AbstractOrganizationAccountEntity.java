/**
 * 
 */
package org.drdeesw.commons.organization.models.entities;


import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;

import org.drdeesw.commons.accounting.models.AccountHolder;
import org.drdeesw.commons.accounting.models.AccountProvider;
import org.drdeesw.commons.accounting.models.entities.AccountHolderEntity;
import org.drdeesw.commons.accounting.models.entities.AccountProviderEntity;
import org.drdeesw.commons.common.models.entities.AbstractNamedLongUniqueEntity;
import org.drdeesw.commons.organization.models.OrganizationAccount;
import org.drdeesw.commons.security.models.User;
import org.drdeesw.commons.security.models.entities.UserEntity;


/**
 * 
 */
@SuppressWarnings("serial")
@MappedSuperclass
@Access(AccessType.FIELD)
public abstract class AbstractOrganizationAccountEntity extends AbstractNamedLongUniqueEntity
    implements OrganizationAccount
{

  @Column(name = "is_active", nullable = false)
  private boolean             active;

  @ManyToOne(targetEntity = AccountHolderEntity.class, optional = false)
  @JoinColumn(name = "holder_id", nullable = false)
  private AccountHolderEntity holder;

  @Column(name = "internal_id")
  private String              internalId;

  @ManyToOne(targetEntity = AccountProviderEntity.class, optional = false)
  @JoinColumn(name = "provider_id", nullable = false)
  private OrganizationEntity  provider;

  @OneToOne
  @JoinColumn(name = "user_id")
  private UserEntity          user;

  /**
   * Hibernate constructor
   */
  protected AbstractOrganizationAccountEntity()
  {

  }


  @Override
  public AccountHolder getHolder()
  {
    return this.holder;
  }


  @Override
  public String getInternalId()
  {
    return this.internalId;
  }


  @Override
  public AccountProvider getProvider()
  {
    return this.provider;
  }


  @Override
  public User getUser()
  {
    return user;
  }


  @Override
  public boolean isActive()
  {
    return this.active;
  }


  @Override
  public void setActive(
    boolean active)
  {
    this.active = active;
  }


  @Override
  public void setHolder(
    AccountHolder accountHolder)
  {
    this.holder = (AccountHolderEntity)accountHolder;
  }


  @Override
  public void setInternalId(
    String internalId)
  {
    this.internalId = internalId;
  }


  @Override
  public void setProvider(
    AccountProvider accountProvider)
  {
    this.provider = (OrganizationEntity)accountProvider;
  }


  @Override
  public void setUser(
    User user)
  {
    this.user = (UserEntity)user;
  }

}
