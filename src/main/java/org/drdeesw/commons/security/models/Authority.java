/**
 * 
 */
package org.drdeesw.commons.security.models;


import org.drdeesw.commons.common.models.UniqueObject;


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
