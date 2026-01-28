/**
 * 
 */
package org.drdeesw.commons.accounting.models.pojos;


import org.drdeesw.commons.security.models.pojos.UserPojo;


/**
 * AccountHolderPojo is a POJO that represents an account holder. It is used to hold any type of account.
 * 
 * Note that the definition of AccountProviderPojo and AccountHolderPojo are 
 * different because an AccountHolder holds any type of account, while an 
 * AccountProvider provides specific types of accounts.
 */
@SuppressWarnings("serial")
public class AccountHolderPojo extends AbstractAccountHolderPojo<UserPojo, AccountPojo>
{
  public AccountHolderPojo()
  {
    super();
  }


  public AccountHolderPojo(Long id)
  {
    super(id);
  }
}
