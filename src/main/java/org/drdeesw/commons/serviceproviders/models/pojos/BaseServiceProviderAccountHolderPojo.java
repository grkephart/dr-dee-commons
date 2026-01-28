package org.drdeesw.commons.serviceproviders.models.pojos;


import org.drdeesw.commons.accounting.models.pojos.BaseAccountHolderPojo;
import org.drdeesw.commons.security.models.pojos.BaseUserPojo;
import org.drdeesw.commons.serviceproviders.models.ServiceProviderAccountHolder;


/**
 * A holder of service provider accounts.
 * 
 * @param <U>
 * @param <HA>
 */
public interface BaseServiceProviderAccountHolderPojo<//
    U extends BaseUserPojo<?>, //
    HA extends BaseServiceProviderAccountPojo<U, ?, ?>> //
    extends ServiceProviderAccountHolder<U, HA>, BaseAccountHolderPojo<U, HA>
{

}
