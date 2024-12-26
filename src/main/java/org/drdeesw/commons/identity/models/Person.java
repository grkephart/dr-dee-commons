/**
 * 
 */
package org.drdeesw.commons.identity.models;

import org.drdeesw.commons.accounting.models.AccountHolder;
import org.drdeesw.commons.common.models.NamedLongUniqueObject;

/**
 * A real-world individual (e.g., John Doe).
 * A person can hold multiple accounts (be an account holder). 
 * A person is not a user, though.
 * A user is a mechanism by which a person can interact with a system via an account.
 * Therefore, an account has a user, and a holder (person).
 */
public interface Person extends NamedLongUniqueObject, AccountHolder
{

}
