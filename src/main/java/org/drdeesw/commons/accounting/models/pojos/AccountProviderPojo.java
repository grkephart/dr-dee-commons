/**
 * 
 */
package org.drdeesw.commons.accounting.models.pojos;


import java.util.Set;

import org.drdeesw.commons.accounting.models.Account;
import org.drdeesw.commons.accounting.models.AccountProvider;
import org.drdeesw.commons.common.models.entities.AbstractNamedLongUniqueEntity;


/**
 * 
 */
@SuppressWarnings("serial")
public abstract class AccountProviderPojo extends AbstractNamedLongUniqueEntity
    implements AccountProvider
{
  private String       description;
  private Set<Account> providedAccounts;

  @Override
  public String getDescription()
  {
    return this.description;
  }


  @Override
  public Set<Account> getProvidedAccounts()
  {
    return this.providedAccounts;
  }


  @Override
  public void setDescription(
    String description)
  {
    this.description = description;
  }


  @Override
  public void setProvidedAccounts(
    Set<Account> providedAccounts)
  {
    this.providedAccounts = providedAccounts;
  }

}
