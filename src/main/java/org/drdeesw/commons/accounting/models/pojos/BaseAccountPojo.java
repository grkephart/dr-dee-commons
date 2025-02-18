/**
 * 
 */
package org.drdeesw.commons.accounting.models.pojos;


import org.drdeesw.commons.accounting.models.Account;
import org.drdeesw.commons.common.models.pojos.NamedLongUniquePojo;
import org.drdeesw.commons.security.models.pojos.BaseUserPojo;


public interface BaseAccountPojo<//
    U extends BaseUserPojo<?>, //
    H extends BaseAccountHolderPojo<U, ?>, //
    P extends BaseAccountProviderPojo<U, ?>> //
    extends Account<U, H, P>, NamedLongUniquePojo
{

}
