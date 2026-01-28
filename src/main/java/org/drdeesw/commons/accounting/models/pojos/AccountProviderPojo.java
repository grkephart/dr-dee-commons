/**
 * 
 */
package org.drdeesw.commons.accounting.models.pojos;


import org.drdeesw.commons.security.models.pojos.UserPojo;


/**
 * AccountProviderPojo is a POJO that represents an account provider. It is used to provide a specific type of account.
 *  
 * Note that the definition of AccountProviderPojo and AccountHolderPojo are 
 * different because an AccountHolder holds any type of account, while an 
 * AccountProvider provides specific types of accounts.
 */
@SuppressWarnings("serial")
public class AccountProviderPojo extends AbstractAccountProviderPojo<UserPojo, AccountPojo>
{
  public AccountProviderPojo()
  {
    super();
  }


  public AccountProviderPojo(Long id)
  {
    super(id);
  }
}
