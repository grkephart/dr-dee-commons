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
   * Returns the organization's internal ID of the account.
   * It could be an account number or a username or email or GUID.
   * 
   * @return  the organization's internal ID of the account
   */
  String getInternalId();


  /**
   * Checks if the account is active.
   * 
   * @return true if the account is active, false otherwise
   */
  boolean isActive();


  /**
   * @param active
   */
  void setActive(
    boolean active);


  /**
   * @param accountHolder
   */
  void setHolder(
    AccountHolder accountHolder);


  /**
   * Sets the organization's internal ID of the account.
   * It could be an account number or a username or email or GUID.
   * 
   * @param internalId the organization's internal ID of the account to set
   */
  void setInternalId(
    String internalId);
}
