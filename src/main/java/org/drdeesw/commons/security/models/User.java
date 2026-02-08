/**
 * 
 */
package org.drdeesw.commons.security.models;


import org.drdeesw.commons.accounting.models.Account;
import org.drdeesw.commons.common.models.NamedLongUniqueObject;


/**
 * Represents an authenticated principal in the system.
 *
 * A User is an individual identity that can authenticate (username/password)
 * and be granted permissions either directly (via Authorities) or indirectly
 * through Group membership.
 *
 * In Spring Security's JDBC model, a User maps to the {@code users} table and
 * is the root security subject evaluated during authentication.
 *
 * Users typically represent people or system accounts, not roles or
 * permissions.
 *
 * Examples:
 * <ul>
 * <li>alice</li>
 * <li>bob</li>
 * <li>system_batch_job</li>
 * </ul>
 *
 * It allows an entity to access a service through its account. A user must have
 * an account, but an account may not have a user. “Includes authentication
 * attributes (e.g., username, password) and participates in authorization via
 * Authorities and Group membership.” May integrate with external systems via
 * OAuth2 or other APIs.
 * 
 * Structured to work with JdbcUserDetailsManager.
 * 
 * @author gary_kephart
 *
 */
public interface User<A extends Account<?, ?, ?>> extends NamedLongUniqueObject
{

  /**
   * Associates the user with an account. This is a deliberate domain operation,
   * not a casual mutation.
   */
  void changeAccount(A account);


  /**
   * Returns the account associated with the user.
   * 
   * @return the account associated with the user
   */
  A getAccount();


  /**
   * Returns the username of the user.
   * 
   * @return the username of the user
   */
  String getUsername();


  /**
   * Returns true if the user is enabled, or false if the user is disabled.
   * 
   * @return true if the user is enabled, or false if the user is disabled
   */
  boolean isEnabled();

  /**
   * Sets the enabled status of the user.
   * 
   * @param enabled the enabled to set
   */
  void setEnabled(boolean enabled);

}
