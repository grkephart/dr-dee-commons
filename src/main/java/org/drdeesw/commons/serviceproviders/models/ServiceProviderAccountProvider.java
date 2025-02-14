package org.drdeesw.commons.serviceproviders.models;


import org.drdeesw.commons.accounting.models.AccountProvider;
import org.drdeesw.commons.security.models.User;


/**
 * A holder of service provider accounts.
 * 
 * @param <U>
 * @param <HA>
 */
public interface ServiceProviderAccountProvider<//
    U extends User<?>, //
    PA extends ServiceProviderAccount<U, ?, ?>> //
    extends AccountProvider<U, PA>
{

}
