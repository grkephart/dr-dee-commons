/**
 * 
 */
package org.drdeesw.commons.organization.models.pojos;


import org.drdeesw.commons.accounting.models.pojos.AccountPojo;
import org.drdeesw.commons.organization.models.OrganizationAccount;


/**
 * 
 */
@SuppressWarnings("serial")
public class OrganizationAccountPojo extends AccountPojo implements OrganizationAccount
{
  public OrganizationAccountPojo()
  {

  }


  protected OrganizationAccountPojo(OrganizationPojo organization, String internalId)
  {
    super(organization, internalId);
  }

}
