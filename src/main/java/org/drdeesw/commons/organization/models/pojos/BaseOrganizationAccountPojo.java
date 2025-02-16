/**
 * 
 */
package org.drdeesw.commons.organization.models.pojos;

import org.drdeesw.commons.organization.models.OrganizationAccount;
import org.drdeesw.commons.security.models.pojos.BaseUserPojo;
import org.springframework.security.access.method.P;

/**
 * 
 */
public interface BaseOrganizationAccountPojo<//
    U extends BaseUserPojo<?>, //
    H extends BaseOrganizationAccountHolderPojo<U, ?>, //
    P extends BaseOrganizationAccountProviderPojo<U, ?>> extends OrganizationAccount<U, H, P>
{

}
