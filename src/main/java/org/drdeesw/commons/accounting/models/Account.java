/**
 * 
 */
package org.drdeesw.commons.accounting.models;


import org.drdeesw.commons.common.models.Auditable;
import org.drdeesw.commons.common.models.Describable;
import org.drdeesw.commons.common.models.NamedLongUniqueObject;
import org.drdeesw.commons.security.models.User;


/**
 * An Account is a structured record that represents the formal relationship 
 * between an {@link AccountHolder} and an {@link AccountProvider}, enabling the holder to 
 * access specific services, resources, or privileges offered by the provider.
 * 
 * <p>Accounts may serve diverse purposes, such as:</p>
 * <ul>
 *   <li>Grant access to services (e.g., a Google account for using YouTube APIs).</li>
 *   <li>Manage financial records (e.g., a bank account for transactions).</li>
 *   <li>Establish identity (e.g., user authentication systems).</li>
 * </ul>
 * 
 * <p>An account has the following key participants:</p>
 * <ul>
 *   <li><b>Provider:</b> The entity (service provider, financial institution, or organization) that issues and manages the account.</li>
 *   <li><b>Holder:</b> The entity (individual, organization, or system) that owns or has access to the account.</li>
 * </ul>
 * 
 * An account typically includes the following properties:
 * <ul>
 *   <li>A unique (internal) identifier (e.g., username, email, or GUID) specific to the provider.</li>
 *   <li>A status (e.g., active, suspended, or terminated).</li>
 *   <li>A set of privileges defining allowable actions or services.</li>
 *   <li>A user, an authentication method which allows the holder to access online services provided by the account provider.</li>
 * </ul>
 */
public interface Account<H extends AccountHolder<?>, P extends AccountProvider<?>, U extends User> extends NamedLongUniqueObject, Describable, Auditable
{

  /**
   * Gets the holder of the account.
   * 
   * @return the associated AccountHolder
   */
  H getHolder();


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
  P getProvider();


  /**
   * Returns the user of the account.
   * 
   * @return the user of the account
   */
  U getUser();


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
    H accountHolder);


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
    P accountProvider);
  
  /**
   * Sets the user of the account.
   * 
   * @param user the user to set
   */
  void setUser(U user);
  
}
