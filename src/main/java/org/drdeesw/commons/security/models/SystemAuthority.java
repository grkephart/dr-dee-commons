/**
 * 
 */
package org.drdeesw.commons.security.models;


import org.drdeesw.commons.common.models.UniqueObject;


/**
 * 
 */
public interface SystemAuthority extends UniqueObject<Long>
{
  /**
   * Returns the authority.
   * 
   * @return the authority
   */
  String getAuthority();


  /**
   * Returns the username.
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
