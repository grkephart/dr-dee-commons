/**
 * 
 */
package org.drdeesw.commons.accounting.models.pojos;


import org.drdeesw.commons.security.models.pojos.UserPojo;


/**
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
