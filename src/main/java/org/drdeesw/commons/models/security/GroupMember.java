/**
 * 
 */
package org.drdeesw.commons.models.security;

import org.drdeesw.commons.models.base.LongUniqueObject;

/**
 * Structured to work with JdbcUserDetailsManager.
 * 
 * @author gkephart
 *
 */
public interface GroupMember extends LongUniqueObject
{


  /**
   * @return the group ID
   */
  public Long getGroupId();


  /**
   * @return the username
   */
  public String getUsername();


  /**
   * @param groupId the role ID to set
   */
  public void setGroupId(
    Long groupId);



  /**
   * @param username the username to set
   */
  public void setUsername(
    String username);

}
