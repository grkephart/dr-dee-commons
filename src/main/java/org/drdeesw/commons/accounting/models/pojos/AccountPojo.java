/**
 * 
 */
package org.drdeesw.commons.accounting.models.pojos;


import java.time.Instant;

import org.drdeesw.commons.accounting.models.Account;
import org.drdeesw.commons.accounting.models.AccountHolder;
import org.drdeesw.commons.accounting.models.AccountProvider;
import org.drdeesw.commons.common.models.pojos.AbstractNamedLongUniquePojo;
import org.drdeesw.commons.security.models.User;
import org.drdeesw.commons.security.models.pojos.UserPojo;


/**
 * 
 */
@SuppressWarnings("serial")
public class AccountPojo extends AbstractNamedLongUniquePojo implements Account
{
  private AccountHolder   accountHolder;
  private boolean         active;
  private UserPojo        createdBy;
  private Instant         creationDate;
  private String          description;
  private String          internalId;
  private UserPojo        lastUpdatedBy;
  private Instant         lastUpdatedDate;
  private AccountProvider provider;
  private UserPojo        user;

  public AccountPojo()
  {
  }


  public AccountPojo(AccountProvider provider, String internalId)
  {
    this.provider = provider;
    this.internalId = internalId;
  }


  public AccountPojo(String internalId)
  {
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


  public AccountProvider getProvider()
  {
    return provider;
  }


  @Override
  public User getUser()
  {
    return this.user;
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
    this.accountHolder = (AccountHolder)accountHolder;
  }


  @Override
  public void setInternalId(
    String internalId)
  {
    this.internalId = internalId;
  }


  @Override
  public void setLastUpdateDate(
    Instant lastUpdatedDate)
  {
    this.lastUpdatedDate = lastUpdatedDate;
  }


  @Override
  public void setLastUpdatedBy(
    User lastUpdatedBy)
  {
    this.lastUpdatedBy = (UserPojo)lastUpdatedBy;
  }


  public void setProvider(
    AccountProvider provider)
  {
    this.provider = provider;
  }


  @Override
  public void setUser(
    User user)
  {
    this.user = (UserPojo)user;
  }

}
