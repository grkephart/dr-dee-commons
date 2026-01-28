/**
 * 
 */
package org.drdeesw.commons.organization.models.pojos;


import org.drdeesw.commons.accounting.models.pojos.BaseAccountProviderPojo;
import org.drdeesw.commons.organization.models.OrganizationAccountProvider;
import org.drdeesw.commons.security.models.pojos.BaseUserPojo;


/**
 * 
 */
public interface BaseOrganizationAccountProviderPojo<//
    U extends BaseUserPojo<?>, //
    PA extends BaseOrganizationAccountPojo<U, ?, ?>> extends BaseAccountProviderPojo<U, PA>, OrganizationAccountProvider<U, PA>
{

}
