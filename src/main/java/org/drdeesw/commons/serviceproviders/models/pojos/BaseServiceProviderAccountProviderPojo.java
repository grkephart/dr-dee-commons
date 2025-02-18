package org.drdeesw.commons.serviceproviders.models.pojos;


import org.drdeesw.commons.accounting.models.pojos.BaseAccountProviderPojo;
import org.drdeesw.commons.security.models.pojos.BaseUserPojo;
import org.drdeesw.commons.serviceproviders.models.ServiceProviderAccountProvider;


/**
 * A holder of service provider accounts.
 * 
 * @param <U>
 * @param <HA>
 */
public interface BaseServiceProviderAccountProviderPojo<//
    U extends BaseUserPojo<?>, //
    PA extends BaseServiceProviderAccountPojo<U, ?, ?>> //
    extends ServiceProviderAccountProvider<U, PA>, BaseAccountProviderPojo<U, PA>
{

}
