/**
 * 
 */
package org.drdeesw.commons.organization.models;


import org.drdeesw.commons.accounting.models.Account;
import org.drdeesw.commons.accounting.models.AccountHolder;
import org.drdeesw.commons.security.models.User;


/**
 * Represents an account provided by an organization. Contains account information.
 * 
 * Gary's version as of 2025-02-09 10:23 PM PST
 */
public interface OrganizationAccount<//
    U extends User<?>, //
    H extends AccountHolder<U, ?>, //
    P extends OrganizationAccountProvider<U, ?>> //
    extends Account<U, H, P>
{

}
