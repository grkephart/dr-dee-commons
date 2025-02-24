/**
 * 
 */
package org.drdeesw.commons.organization.models.pojos;


import org.drdeesw.commons.security.models.pojos.UserPojo;


/**
 * ChatGPT's version as of 2025-02-09 11:17 PM PST
 */
@SuppressWarnings("serial")
public class OrganizationAccountPojo extends
    AbstractOrganizationAccountPojo<UserPojo, OrganizationAccountHolderPojo, OrganizationAccountProviderPojo>
{
  public OrganizationAccountPojo()
  {
  }


  public OrganizationAccountPojo(OrganizationAccountHolderPojo holder, String internalId)
  {
    super(holder, internalId);
  }
}