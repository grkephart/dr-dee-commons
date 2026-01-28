/**
 * 
 */
package org.drdeesw.commons.serviceproviders.models.pojos;


import org.drdeesw.commons.accounting.models.pojos.BaseAccountPojo;
import org.drdeesw.commons.security.models.pojos.BaseUserPojo;
import org.drdeesw.commons.serviceproviders.models.ServiceProviderAccount;


/**
 * 
 */
public interface BaseServiceProviderAccountPojo<//
    U extends BaseUserPojo<?>, //
    H extends BaseServiceProviderAccountHolderPojo<U, ?>, //
    P extends BaseServiceProviderAccountProviderPojo<U, ?>>
    extends ServiceProviderAccount<U, H, P>, BaseAccountPojo<U, H, P>
{

}
