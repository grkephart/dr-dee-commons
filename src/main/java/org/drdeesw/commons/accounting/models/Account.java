/**
 * 
 */
package org.drdeesw.commons.accounting.models;


import org.drdeesw.commons.common.models.Auditable;
import org.drdeesw.commons.common.models.Describable;
import org.drdeesw.commons.common.models.NamedLongUniqueObject;
import org.drdeesw.commons.security.models.User;


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
   * @return the account's internal ID
   */
  String getInternalId();


  /**
   * Returns the account provider.
   * 
   * @return the accountProvider
   */
  AccountProvider getProvider();


  /**
   * Returns the user of the account.
   * 
   * @return the user of the account
   */
  User getUser();


  /**
   * Checks if the account is active.
   * 
   * @return true if the account is active, false otherwise
   */
  boolean isActive();


  /**
   * Sets the account active or inactive.
   * 
   * @param active
   */
  void setActive(
    boolean active);


  /**
   * Sets the holder of the account.
   * 
   * @param accountHolder
   */
  void setHolder(
    AccountHolder accountHolder);


  /**
   * Sets the account's internal ID.
   * It could be an account number or a username or email or GUID.
   * 
   * @param internalId the account's internal ID to set
   */
  void setInternalId(
    String internalId);
  
  /**
   * Sets the account provider.
   * 
   * @param accountProvider the account provider to set
   */
  void setProvider(
    AccountProvider accountProvider);
  
  /**
   * Sets the user of the account.
   * 
   * @param user the user to set
   */
  void setUser(User user);
  
}
