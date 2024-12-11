/**
 * 
 */
package org.drdeesw.commons.organization.models.pojos;


import java.util.Set;
import java.util.stream.Collectors;

import javax.persistence.OneToMany;

import org.drdeesw.commons.common.models.pojos.AbstractLongUniquePojo;
import org.drdeesw.commons.organization.models.Account;
import org.drdeesw.commons.organization.models.AccountHolder;


/**
 * 
 */
@SuppressWarnings("serial")
public class AccountHolderPojo extends AbstractLongUniquePojo implements AccountHolder
{
  @OneToMany
  private Set<AccountPojo> heldAccounts;

  public AccountHolderPojo()
  {
    super();
  }


  public AccountHolderPojo(Long id)
  {
    super(id);
  }


  @Override
  public Set<Account> getHeldAccounts()
  {
    return this.heldAccounts.stream()//
        .map(account -> (Account)account)//
        .collect(Collectors.toSet());
  }


  @Override
  public void setHeldAccounts(
    Set<Account> accounts)
  {
    this.heldAccounts = accounts.stream()//
        .map(account -> (AccountPojo)account)//
        .collect(Collectors.toSet());
  }

}
