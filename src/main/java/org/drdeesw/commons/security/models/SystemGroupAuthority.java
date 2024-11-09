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
   * Returns the authority granted to the group.
   * 
   * @return authority the authority granted to the group.
   */
  String getAuthority();


  /**
   * Returns the group id.
   * 
   * @return groupId the group id
   */
  Long getSystemGroupId();


  /**
   * Setss the authority granted to the group.
   * 
   * @param authority the authority granted to the group.
   */
  void setAuthority(
    String authority);


  /**
   * Sets the group id.
   * 
   * @param systemGroupId the group id
   */
  void setSystemGroupId(
    Long systemGroupId);
}
