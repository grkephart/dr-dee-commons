/**
 * 
 */
package org.drdeesw.commons.security.models;


import org.drdeesw.commons.common.models.UniqueObject;


/**
 * 
 */
public interface SystemGroupAuthority extends UniqueObject<Long>
{
  /**
   * @return authority
   */
  String getAuthority();


  /**
   * @return groupId
   */
  Long getSystemGroupId();


  /**
   * @param authority
   */
  void setAuthority(
    String authority);


  /**
   * @param systemGroupId
   */
  void setSystemGroupId(
    Long systemGroupId);
}
