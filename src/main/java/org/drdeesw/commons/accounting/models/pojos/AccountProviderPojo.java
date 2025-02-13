/**
 * 
 */
package org.drdeesw.commons.accounting.models.pojos;


import org.drdeesw.commons.security.models.pojos.UserPojo;


/**
 * 
 * Note that the definition of AccountProviderPojo and AccountHolderPojo are 
 * different because an Account Holder holds any type of account, while an 
 * Account Provider provides specific types of accounts.
 * 
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
