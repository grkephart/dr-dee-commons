/**
 * 
 */
package org.drdeesw.commons.security.models;


import org.drdeesw.commons.common.models.LongUniqueObject;


/**
 * Represents the permissions or roles granted to a user, defining what actions or resources a user can access.
 */
public interface Authority extends LongUniqueObject
{
  /**
   * Returns the authority.
   * 
   * @return the authority
   */
  String getAuthority();


  /**
   * Returns the username. Ties the authority to a specific user.
   * 
   * @return the username
   */
  String getUsername();


  /**
   * Sets the authority.
   * 
   * @param authority the authority to set
   */
  void setAuthority(
    String authority);


  /**
   * Sets the username.
   * 
   * @param username the username to set
   */
  void setUsername(
    String username);
}
