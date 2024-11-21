/**
 * 
 */
package org.drdeesw.commons.security.models;


import org.drdeesw.commons.common.models.UniqueObject;


/**
 * 
 */
public interface GroupAuthority extends UniqueObject<Long>
{
  /**
   * Returns the authority granted to the group.
   * 
   * @return authority the authority granted to the group.
   */
  String getAuthority();


  /**
   * Returns the group.
   * 
   * @return the group
   */
  Group getGroup();


  /**
   * Setss the authority granted to the group.
   * 
   * @param authority the authority granted to the group.
   */
  void setAuthority(
    String authority);


  /**
   * Sets the group.
   * 
   * @param group the group
   */
  void setGroup(
    Group group);
}
