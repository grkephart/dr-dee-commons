package org.drdeesw.commons.serviceproviders.models;


import org.drdeesw.commons.accounting.models.AccountHolder;
import org.drdeesw.commons.security.models.User;


/**
 * A holder of service provider accounts.
 * 
 * @param <U>
 * @param <HA>
 */
public interface ServiceProviderAccountHolder<//
    U extends User<?>, //
    HA extends ServiceProviderAccount<U, ?, ?>> //
    extends AccountHolder<U, HA>
{

}
