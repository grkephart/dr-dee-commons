/**
 * 
 */
package org.drdeesw.commons.accounting.models.pojos;


import java.util.Set;

import org.drdeesw.commons.accounting.models.AccountProvider;
import org.drdeesw.commons.common.models.entities.AbstractNamedLongUniqueEntity;


/**
 * 
 */
@SuppressWarnings("serial")
public abstract class AccountProviderPojo extends AbstractNamedLongUniqueEntity
    implements AccountProvider<AccountPojo>
{
  private String       description;
  private Set<AccountPojo> providedAccounts;

  @Override
  public String getDescription()
  {
    return this.description;
  }


  @Override
  public Set<AccountPojo> getProvidedAccounts()
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
    Set<AccountPojo> providedAccounts)
  {
    this.providedAccounts = providedAccounts;
  }

}
