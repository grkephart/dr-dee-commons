/**
 * 
 */
package org.drdeesw.commons.modules.security.models;


import org.drdeesw.commons.modules.common.models.UniqueObject;


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
