package org.drdeesw.commons.organization.models;


import org.drdeesw.commons.accounting.models.AccountHolder;
import org.drdeesw.commons.security.models.User;


/**
 * A holder of organization accounts.
 * 
 * @param <U>
 * @param <HA>
 */
<<<<<<< HEAD
public interface OrganizationAccountHolder<A extends OrganizationAccount<?, ?>>
    extends UniqueObject<Long>
=======
public interface OrganizationAccountHolder<//
    U extends User<?>, //
    HA extends OrganizationAccount<U, ?, ?>> //
    extends AccountHolder<U, HA>
>>>>>>> branch 'master' of https://github.com/grkephart/dr-dee-commons.git
{

}
