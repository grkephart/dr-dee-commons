/**
 * 
 */
package org.drdeesw.commons.security.models;


import org.drdeesw.commons.accounting.models.Account;
import org.drdeesw.commons.common.models.NamedLongUniqueObject;


/**
 * Represents an entity interacting with your system.
 * It allows an entity to access a service through its account.
 * A user must have an account, but an account may not have a user.
 * Includes authentication and authorization attributes (e.g., username, password, memberRoles). 
 * May integrate with external systems via OAuth2 or other APIs.
 * Structured to work with JdbcUserDetailsManager.
 * 
 * @author gary_kephart
 *
 */
public interface User<A extends Account<?,?,?>> extends NamedLongUniqueObject
{

  /** Returns the account associated with the user.
   * 
   * @return the account associated with the user
   */
  A getAccount();


  /**
   * Returns the username of the user.
   * 
   * @return the username of the user
   */
  public String getUsername();


  /**
   * Returns true if the user is enabled, or false if the user is disabled.
   * 
   * @return true if the user is enabled, or false if the user is disabled
   */
  public boolean isEnabled();


  /**
   * Sets the account associated with the user.
   * 
   * @param account the account to set
   */
  void setAccount(
    A account);


  /**
   * Sets the enabled status of the user.
   * 
   * @param enabled the enabled to set
   */
  public void setEnabled(
    boolean enabled);


  /**
   * Sets the username of the user.
   * 
   * @param username the username to set
   */
  public void setUsername(
    String username);

}
