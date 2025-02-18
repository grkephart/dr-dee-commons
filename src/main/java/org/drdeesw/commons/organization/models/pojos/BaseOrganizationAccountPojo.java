/**
 * 
 */
package org.drdeesw.commons.organization.models.pojos;

import org.drdeesw.commons.accounting.models.pojos.BaseAccountHolderPojo;
import org.drdeesw.commons.accounting.models.pojos.BaseAccountPojo;
import org.drdeesw.commons.organization.models.OrganizationAccount;
import org.drdeesw.commons.security.models.pojos.BaseUserPojo;

/**
 * 
 */
public interface BaseOrganizationAccountPojo<//
    U extends BaseUserPojo<?>, //
    H extends BaseAccountHolderPojo<U, ?>, //
    P extends BaseOrganizationAccountProviderPojo<U, ?>> extends BaseAccountPojo<U, H, P>, OrganizationAccount<U, H, P>
{

}
