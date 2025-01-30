/**
 * 
 */
package org.drdeesw.commons.accounting.models.pojos;


import java.time.Instant;

import org.drdeesw.commons.accounting.models.Account;
import org.drdeesw.commons.common.models.pojos.AbstractNamedLongUniquePojo;
import org.drdeesw.commons.security.models.User;
import org.drdeesw.commons.security.models.pojos.UserPojo;


/**
 * 
 */
@SuppressWarnings("serial")
public abstract class AccountPojo extends AbstractNamedLongUniquePojo
    implements Account<AccountHolderPojo, AccountProviderPojo<?>, UserPojo>
{
  private AccountHolderPojo      accountHolder;
  private boolean                active;
  private UserPojo               createdBy;
  private Instant                creationDate;
  private String                 description;
  private String                 internalId;
  private UserPojo               lastUpdatedBy;
  private Instant                lastUpdatedDate;
  private AccountProviderPojo<?> provider;
  private UserPojo               user;

  public AccountPojo()
  {
  }


  public AccountPojo(AccountProviderPojo<?> provider, String internalId)
  {
    this.provider = provider;
    this.internalId = internalId;
  }


  public AccountPojo(String internalId)
  {
    this.internalId = internalId;
  }


  @Override
  public UserPojo getCreatedBy()
  {
    return this.createdBy;
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
  public AccountHolderPojo getHolder()
  {
    return accountHolder;
  }


  @Override
  public String getInternalId()
  {
    return this.internalId;
  }


  @Override
  public Instant getLastUpdateDate()
  {
    return lastUpdatedDate;
  }


  @Override
  public UserPojo getLastUpdatedBy()
  {
    return this.lastUpdatedBy;
  }


  @Override
  public AccountProviderPojo<?> getProvider()
  {
    return provider;
  }


  @Override
  public UserPojo getUser()
  {
    return this.user;
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
  public void setCreatedBy(
    User<?> createdBy)
  {
    this.createdBy = (UserPojo)createdBy;
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
    AccountHolderPojo accountHolder)
  {
    this.accountHolder = accountHolder;
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
    User<?> lastUpdatedBy)
  {
    this.lastUpdatedBy = (UserPojo)lastUpdatedBy;
  }


  @Override
  public void setProvider(
    AccountProviderPojo<?> provider)
  {
    this.provider = provider;
  }


  @Override
  public void setUser(
    UserPojo user)
  {
    this.user = user;
  }

}
