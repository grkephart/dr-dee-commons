/**
 * 
 */
package org.drdeesw.commons.models.security;


import org.drdeesw.commons.models.base.UniqueObject;


/**
 * 
 */
public interface Authority extends UniqueObject<Long>
{
  /**
   * @return
   */
  String getAuthority();


  /**
   * @return
   */
  String getUsername();


  /**
   * @param authority
   */
  void setAuthority(
    String authority);


  /**
   * @param username
   */
  void setUsername(
    String username);
}
