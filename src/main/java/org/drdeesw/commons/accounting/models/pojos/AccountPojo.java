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
public abstract class AccountPojo<U extends User<?>> extends AbstractNamedLongUniquePojo
    implements Account<AccountHolder<?, U>, AccountProvider<?, U>, U>
{
  private AccountHolderPojo<AccountPojo<U>, U>   accountHolder;
  private boolean                                active;
  private UserPojo                               createdBy;
  private Instant                                creationDate;
  private String                                 description;
  private String                                 internalId;
  private UserPojo                               lastUpdatedBy;
  private Instant                                lastUpdatedDate;
  private AccountProviderPojo<AccountPojo<U>, U> provider;
  private UserPojo                               user;

  public AccountPojo()
  {
  }


  public AccountPojo(AccountProviderPojo<AccountPojo<U>, UserPojo> provider, String internalId)
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
  public AccountHolderPojo<AccountPojo<U>, UserPojo> getHolder()
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
  public AccountProviderPojo<AccountPojo<U>, UserPojo> getProvider()
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
    AccountHolderPojo<AccountPojo<U>, UserPojo> accountHolder)
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
    UserPojo lastUpdatedBy)
  {
    this.lastUpdatedBy = lastUpdatedBy;
  }


  @Override
  public void setProvider(
    AccountProviderPojo<AccountPojo<U>, UserPojo> provider)
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
