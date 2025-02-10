/**
 * 
 */
package org.drdeesw.commons.organization.models.pojos;


import org.drdeesw.commons.accounting.models.pojos.AccountHolderPojo;
import org.drdeesw.commons.accounting.models.pojos.AccountPojo;
import org.drdeesw.commons.accounting.models.pojos.AccountProviderPojo;
import org.drdeesw.commons.organization.models.OrganizationAccount;
import org.drdeesw.commons.security.models.pojos.UserPojo;


/**
 * ChatGPT's version as of 2025-02-09 11:17 PM PST
 */
@SuppressWarnings("serial")
public class OrganizationAccountPojo<//
    U extends UserPojo<?>, // Matches U from OrganizationAccount
    H extends AccountHolderPojo<U>, // Matches H from OrganizationAccount
    P extends AccountProviderPojo<U, ?>> // Matches P from OrganizationAccount
    extends AccountPojo<U, H, P> implements OrganizationAccount<U, H, P>
{
  public OrganizationAccountPojo()
  {

  }


  protected OrganizationAccountPojo(H holder, String internalId)
  {
    super(holder, internalId);
  }

}
