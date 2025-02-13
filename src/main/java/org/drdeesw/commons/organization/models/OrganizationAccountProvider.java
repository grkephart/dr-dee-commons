package org.drdeesw.commons.organization.models;


import org.drdeesw.commons.accounting.models.AccountProvider;
import org.drdeesw.commons.security.models.User;


/**
 * A provider of organization accounts. May be a duplicate of Organization.
 * 
 * @param <U>
 * @param <HA>
 */
public interface OrganizationAccountProvider<//
    U extends User<?>, //
    PA extends OrganizationAccount<U, ?, ?>> //
    extends AccountProvider<U, PA>
{

}
