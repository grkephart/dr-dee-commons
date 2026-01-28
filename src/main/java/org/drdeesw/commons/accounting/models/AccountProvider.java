/**
 * 
 */
package org.drdeesw.commons.accounting.models;


import java.util.Set;

import org.drdeesw.commons.common.models.Auditable;
import org.drdeesw.commons.common.models.Describable;
import org.drdeesw.commons.common.models.Enableable;
import org.drdeesw.commons.common.models.NamedLongUniqueObject;
import org.drdeesw.commons.security.models.User;


/**
 * Represents any entity that can provide accounts, such as: Organization, ServiceProvider, etc.
 *
 * @param <U> the type of user that can audit the AccountProvider
 * @param <A> the type of account that the AccountProvider can provide
 */
public interface AccountProvider<//
    U extends User<?>, //
    A extends Account<U, ?, ?>> //
    extends NamedLongUniqueObject, Auditable<U>, Describable, Enableable
{
  /**
   * Returns the accounts provided by the AccountProvider.
   * 
   * @return the accounts provided by the AccountProvider
   */
  Set<A> getProvidedAccounts();


  /**
   * Sets the accounts provided by the AccountProvider.
   * 
   * @param providedAccounts the accounts provided by the AccountProvider.
   */
  void setProvidedAccounts(
    Set<A> providedAccounts);

}
