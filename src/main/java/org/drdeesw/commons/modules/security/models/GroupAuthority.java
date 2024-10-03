/**
 * 
 */
package org.drdeesw.commons.modules.security.models;


import org.drdeesw.commons.modules.common.models.UniqueObject;


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
