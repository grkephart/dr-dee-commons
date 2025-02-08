/**
 * 
 */
package org.drdeesw.commons.organization.models.pojos;


import org.drdeesw.commons.accounting.models.pojos.AccountHolderPojo;
import org.drdeesw.commons.accounting.models.pojos.AccountPojo;
import org.drdeesw.commons.organization.models.OrganizationAccount;
import org.drdeesw.commons.security.models.pojos.UserPojo;


/**
 * 
 */
@SuppressWarnings("serial")
public class OrganizationAccountPojo extends AccountPojo
    implements OrganizationAccount<AccountHolderPojo<OrganizationAccountPojo, UserPojo>,  OrganizationAccountProviderPojo, UserPojo>
{
  public OrganizationAccountPojo()
  {

  }


  protected OrganizationAccountPojo(OrganizationPojo organization, String internalId)
  {
    super(organization, internalId);
  }

}
