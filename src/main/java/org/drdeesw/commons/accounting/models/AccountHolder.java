/**
 * 
 */
package org.drdeesw.commons.accounting.models;


import java.util.Set;

import org.drdeesw.commons.common.models.Auditable;
import org.drdeesw.commons.common.models.Describable;
import org.drdeesw.commons.common.models.Enableable;
import org.drdeesw.commons.common.models.Named;


/**
 * Represents any entity that can hold accounts, such as:
 *  Person
 *  Organization
 *  Integrating system
 */
public interface AccountHolder extends Named, Auditable, Describable, Enableable
{
  /**
   * Returns the accounts held by the AccountHolder.
   * 
   * @return the accounts held by the AccountHolder
   */
  Set<Account> getHeldAccounts();


  /**
   * Sets the accounts held by the AccountHolder.
   * 
   * @param accounts the accounts held by the AccountHolder
   */
  void setHeldAccounts(
    Set<Account> accounts);

}
