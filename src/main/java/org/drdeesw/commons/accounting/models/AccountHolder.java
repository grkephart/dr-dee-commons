/**
 * 
 */
package org.drdeesw.commons.accounting.models;


import java.util.Set;

import org.drdeesw.commons.common.models.Auditable;
import org.drdeesw.commons.common.models.Describable;
import org.drdeesw.commons.common.models.Enableable;
import org.drdeesw.commons.common.models.NamedLongUniqueObject;


/**
 * Represents any entity that can hold accounts, such as:
 *  Person
 *  Organization
 *  Integrating system
 */
public interface AccountHolder<A extends Account<?,?,?>> extends NamedLongUniqueObject, Auditable, Describable, Enableable
{
  /**
   * Returns the accounts held by the AccountHolder.
   * 
   * @return the accounts held by the AccountHolder
   */
  Set<A> getHeldAccounts();


  /**
   * Sets the accounts held by the AccountHolder.
   * 
   * @param accounts the accounts held by the AccountHolder
   */
  void setHeldAccounts(
    Set<A> accounts);

}
