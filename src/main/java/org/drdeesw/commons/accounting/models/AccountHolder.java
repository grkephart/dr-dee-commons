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
 * Represents any entity that can hold accounts, such as:
 *  Person
 *  Organization
 *  Integrating system
 *  
 * @param <U> the type of user
 * @param <HA> the type of account held by the AccountHolder
 */
public interface AccountHolder<//
    U extends User<?>, //
    HA extends Account<U, ?, ?>> //
    extends NamedLongUniqueObject, Auditable<U>, Describable, Enableable
{
  /**
   * Returns the accounts held by the AccountHolder.
   * 
   * @return the accounts held by the AccountHolder
   */
  Set<HA> getHeldAccounts();


  /**
   * Sets the accounts held by the AccountHolder.
   * 
   * @param accounts the accounts held by the AccountHolder
   */
  void setHeldAccounts(
    Set<HA> accounts);

}
