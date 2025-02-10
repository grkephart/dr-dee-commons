/**
 * 
 */
package org.drdeesw.commons.organization.models.pojos;


import org.drdeesw.commons.accounting.models.pojos.AccountHolderPojo;
import org.drdeesw.commons.accounting.models.pojos.AccountProviderPojo;
import org.drdeesw.commons.security.models.pojos.UserPojo;


/**
 * ChatGPT's version as of 2025-02-09 10:18 PM PST
 * 
 */
@SuppressWarnings("serial")
public class OrganizationAccountProviderPojo<//
    U extends UserPojo<?>, //
    A extends OrganizationAccountPojo<U, AccountHolderPojo<U>, OrganizationAccountProviderPojo<U, ?>>> //
    extends AccountProviderPojo<U, A>
{

}
