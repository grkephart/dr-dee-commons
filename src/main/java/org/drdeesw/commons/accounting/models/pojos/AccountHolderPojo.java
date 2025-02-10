/**
 * 
 */
package org.drdeesw.commons.accounting.models.pojos;


import java.time.Instant;
import java.util.Set;

import org.drdeesw.commons.accounting.models.AccountHolder;
import org.drdeesw.commons.common.models.pojos.AbstractNamedLongUniquePojo;
import org.drdeesw.commons.security.models.pojos.UserPojo;


/**
 * Note that the definition of AccountProviderPojo and AccountHolderPojo are 
 * different because an Account Holder holds any type of account, while an 
 * Account Provider provides specific types of accounts.
 * 
 */
@SuppressWarnings("serial")
public abstract class AccountHolderPojo<U extends UserPojo<?>> extends AbstractNamedLongUniquePojo
    implements AccountHolder<U, AccountPojo<U, ?, ?>>
{
  private U                         createdBy;
  private Instant                   creationDate;
  private String                    description;
  private boolean                   enabled;
  private Set<AccountPojo<U, ?, ?>> heldAccounts;
  private Instant                   lastUpdateDate;
  private U                         lastUpdatedBy;

  public AccountHolderPojo()
  {
    super();
  }


  public AccountHolderPojo(Long id)
  {
    super(id);
  }


  @Override
  public U getCreatedBy()
  {
    return createdBy;
  }


  @Override
  public Instant getCreationDate()
  {
    return creationDate;
  }


  @Override
  public String getDescription()
  {
    return description;
  }


  @Override
  public Set<AccountPojo<U, ?, ?>> getHeldAccounts()
  {
    return this.heldAccounts;
  }


  @Override
  public Instant getLastUpdateDate()
  {
    return lastUpdateDate;
  }


  @Override
  public U getLastUpdatedBy()
  {
    return lastUpdatedBy;
  }


  @Override
  public boolean isEnabled()
  {
    return enabled;
  }


  @Override
  public void setCreatedBy(
    U createdBy)
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
  public void setEnabled(
    boolean enabled)
  {
    this.enabled = enabled;
  }


  @Override
  public void setHeldAccounts(
    Set<AccountPojo<U, ?, ?>> accounts)
  {
    this.heldAccounts = accounts;
  }


  @Override
  public void setLastUpdateDate(
    Instant lastUpdateDate)
  {
    this.lastUpdateDate = lastUpdateDate;
  }


  @Override
  public void setLastUpdatedBy(
    U lastUpdatedBy)
  {
    this.lastUpdatedBy = lastUpdatedBy;
  }

}
