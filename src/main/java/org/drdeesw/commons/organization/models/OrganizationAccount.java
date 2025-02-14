/**
 * 
 */
package org.drdeesw.commons.organization.models;


import org.drdeesw.commons.accounting.models.Account;
import org.drdeesw.commons.security.models.User;


/**
 * Represents an account provided by an organization. Contains account information.
 * 
 * @param <U> The type of user that owns the account.
 * @param <H> The type of account holder that owns the account.
 * @param <P> The type of organization account provider that provides the account.
 */
public interface OrganizationAccount<//
    U extends User<?>, //
    H extends OrganizationAccountHolder<U, ?>, //
    P extends OrganizationAccountProvider<U, ?>> //
    extends Account<U, H, P>
{

}
