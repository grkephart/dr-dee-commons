/**
 * 
 */
package org.drdeesw.commons.organization.models;


import java.util.Set;


/**
 * Represents any entity that can hold accounts, such as:
 *  Person
 *  Organization
 *  Integrating system
 *  
 *  An AccountHolder can be a Person or an Organization or an integrating system, but not all at once.
 */
public interface AccountHolder
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
