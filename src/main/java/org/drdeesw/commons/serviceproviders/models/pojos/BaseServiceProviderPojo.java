/**
 * 
 */
package org.drdeesw.commons.serviceproviders.models.pojos;


import org.drdeesw.commons.accounting.models.pojos.BaseAccountProviderPojo;
import org.drdeesw.commons.security.models.pojos.BaseUserPojo;
import org.drdeesw.commons.serviceproviders.models.ServiceProvider;


/**
 * 
 */
public interface BaseServiceProviderPojo<//
    U extends BaseUserPojo<?>, //
    A extends BaseServiceProviderAccountPojo<U, ?, ?>>
    extends ServiceProvider<U, A>, BaseAccountProviderPojo<U, A>
{
}
