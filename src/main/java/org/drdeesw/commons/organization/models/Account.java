/**
 * 
 */
package org.drdeesw.commons.organization.models;


import org.drdeesw.commons.common.models.Auditable;
import org.drdeesw.commons.common.models.Describable;
import org.drdeesw.commons.common.models.NamedLongUniqueObject;


/**
 * 
 */
public interface Account extends NamedLongUniqueObject, Describable, Auditable
{
  /**
   * Gets the holder of the account.
   * 
   * @return the associated AccountHolder
   */
  AccountHolder getHolder();


  /**
   * Checks if the account is active.
   * 
   * @return true if the account is active, false otherwise
   */
  boolean isActive();


  /**
   * @param accountHolder
   */
  void setHolder(
    AccountHolder accountHolder);


  /**
   * @param active
   */
  void setActive(
    boolean active);
}
