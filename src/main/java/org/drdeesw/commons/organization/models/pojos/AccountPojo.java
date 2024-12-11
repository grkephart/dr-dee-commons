/**
 * 
 */
package org.drdeesw.commons.organization.models.pojos;


import java.time.Instant;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.MappedSuperclass;

import org.drdeesw.commons.common.models.pojos.AbstractNamedLongUniquePojo;
import org.drdeesw.commons.organization.models.Account;
import org.drdeesw.commons.organization.models.AccountHolder;
import org.drdeesw.commons.organization.models.AccountProvider;
import org.drdeesw.commons.security.models.User;
import org.drdeesw.commons.security.models.pojos.UserPojo;


/**
 * 
 */
@SuppressWarnings("serial")
@MappedSuperclass
@Access(AccessType.FIELD)
public abstract class AccountPojo extends AbstractNamedLongUniquePojo implements Account
{
  private AccountHolderPojo accountHolder;
  private boolean           active;
  private UserPojo          createdBy;
  private Instant           creationDate;
  private String            description;
  private String            internalId;
  private Instant           lastUpdatedDate;
  private UserPojo          lastUpdatedBy;
  private AccountProvider   provider;

  public AccountPojo()
  {
  }


  public AccountPojo(String internalId)
  {
    this.internalId = internalId;
  }



  public AccountPojo(AccountProvider provider, String internalId)
  {
    this.provider = provider;
    this.internalId = internalId;
  }


  @Override
  public User getCreatedBy()
  {
    return (User)this.createdBy;
  }


  @Override
  public Instant getCreationDate()
  {
    return this.creationDate;
  }


  @Override
  public String getDescription()
  {
    return this.description;
  }


  @Override
  public AccountHolder getHolder()
  {
    return accountHolder;
  }


  @Override
  public String getInternalId()
  {
    return this.internalId;
  }


  /**
   * @return the lastUpdateDate
   */
  public Instant getLastUpdateDate()
  {
    return lastUpdatedDate;
  }


  @Override
  public User getLastUpdatedBy()
  {
    return (User)this.lastUpdatedBy;
  }


  @Override
  public Instant getLastUpdateDate()
  {
    return this.lastUpdatedDate;
  }


  public AccountProvider getProvider()
  {
    return provider;
  }


  @Override
  public boolean isActive()
  {
    return this.active;
  }


  public void setAccountHolder(
    AccountHolderPojo accountHolder)
  {
    this.accountHolder = accountHolder;
  }


  @Override
  public void setActive(
    boolean active)
  {
    this.active = active;
  }


  @Override
  public void setCreatedBy(
    User createdBy)
  {
    this.createdBy = (UserPojo)createdBy;
  }


  public void setCreatedBy(
    UserPojo createdBy)
  {
    this.createdBy = createdBy;
  }


  @Override
  public void setCreationDate(
    Instant creationDate)
  {
    this.creationDate = creationDate;
  }


  @Override
  public void setDescription(
    String description)
  {
    this.description = description;
  }


  @Override
  public void setHolder(
    AccountHolder accountHolder)
  {
    this.accountHolder = (AccountHolderPojo)accountHolder;
  }


  @Override
  public void setInternalId(
    String internalId)
  {
    this.internalId = internalId;
  }


  /**
   * @param lastUpdateDate the lastUpdateDate to set
   */
  public void setLastUpdateDate(
    Instant lastUpdateDate)
  {
    this.lastUpdatedDate = lastUpdateDate;
  }


  @Override
  public void setLastUpdatedBy(
    User lastUpdatedBy)
  {
    this.lastUpdatedBy = (UserPojo)lastUpdatedBy;
  }



  @Override
  public void setLastUpdateDate(
    Instant lastUpdatedDate)
  {
    this.lastUpdatedDate = lastUpdatedDate;
  }


  public void setProvider(
    AccountProvider provider)
  {
    this.provider = provider;
  }

}
