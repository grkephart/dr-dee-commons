/**
 * 
 */
package org.drdeesw.commons.organization.models.pojos;


import org.drdeesw.commons.accounting.models.pojos.AccountPojo;
import org.drdeesw.commons.security.models.pojos.UserPojo;


/**
 *
 */
@SuppressWarnings("serial")
public class OrganizationPojo extends
    AbstractOrganizationPojo<UserPojo, OrganizationPojo, AccountPojo, OrganizationAccountPojo, OrganizationMemberPojo, OrganizationRolePojo>
{
  public OrganizationPojo()
  {
  }
}