/**
 * 
 */
package org.drdeesw.commons.models.security;


import org.drdeesw.commons.models.base.UniqueObject;


/**
 * 
 */
public interface GroupAuthority extends UniqueObject<Long>
{
  /**
   * @return authority
   */
  String getAuthority();


  /**
   * @return groupId
   */
  Long getGroupId();


  /**
   * @param authority
   */
  void setAuthority(
    String authority);


  /**
   * @param groupId
   */
  void setGroupId(
    Long groupId);
}
