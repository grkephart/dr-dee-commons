/**
 * 
 */
package org.drdeesw.commons.accounting.models.pojos;


import java.time.Instant;
import java.util.Set;

import org.drdeesw.commons.accounting.models.AccountProvider;
import org.drdeesw.commons.common.models.pojos.AbstractNamedLongUniquePojo;
import org.drdeesw.commons.security.models.pojos.UserPojo;


/**
 * 
 * Note that the definition of AccountProviderPojo and AccountHolderPojo are 
 * different because an Account Holder holds any type of account, while an 
 * Account Provider provides specific types of accounts.
 * 
 */
@SuppressWarnings("serial")
public abstract class AccountProviderPojo<//
    U extends UserPojo<?>, //
    A extends AccountPojo<U, ?, ?>> //
    extends AbstractNamedLongUniquePojo implements AccountProvider<U, A>
{
  private U       createdBy;
  private Instant creationDate;
  private String  description;
  private boolean enabled;
  private Instant lastUpdateDate;
  private U       lastUpdatedBy;
  private Set<A>  providedAccounts;

  @Override
  public U getCreatedBy()
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
  public Instant getLastUpdateDate()
  {
    return this.lastUpdateDate;
  }


  @Override
  public U getLastUpdatedBy()
  {
    return this.lastUpdatedBy;
  }


  @Override
  public Set<A> getProvidedAccounts()
  {
    return (Set<A>)this.providedAccounts;
  }


  @Override
  public boolean isEnabled()
  {
    return this.enabled;
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


  @Override
  public void setProvidedAccounts(
    Set<A> providedAccounts)
  {
    this.providedAccounts = (Set<A>)providedAccounts;
  }

}
