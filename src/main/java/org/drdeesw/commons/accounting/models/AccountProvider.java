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
 * 
 */
public interface AccountProvider<A extends Account<?, ?, ?>, U extends User<?>>
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
