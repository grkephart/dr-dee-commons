/**
 * 
 */
package org.drdeesw.commons.accounting.models.pojos;


import org.drdeesw.commons.security.models.pojos.UserPojo;


/**
 * A concrete implementation of the {@link AbstractAccountPojo} class.
 */
@SuppressWarnings("serial")
public class AccountPojo
    extends AbstractAccountPojo<UserPojo, AccountHolderPojo, AccountProviderPojo>
{

  public AccountPojo()
  {
  }


  public AccountPojo(AccountHolderPojo holder, String internalId)
  {
    super(holder, internalId);
  }
}
