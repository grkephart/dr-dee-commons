/**
 * 
 */
package org.drdeesw.commons.organization.models;

import org.drdeesw.commons.accounting.models.Account;
import org.drdeesw.commons.accounting.models.AccountHolder;
import org.drdeesw.commons.accounting.models.AccountProvider;
import org.drdeesw.commons.security.models.User;

/**
 * Represents a organization account. Contains account information and tokens.
 */
public interface OrganizationAccount<H extends AccountHolder<?>, P extends AccountProvider<?>, U extends User> extends Account<H,P,U>
{

}
