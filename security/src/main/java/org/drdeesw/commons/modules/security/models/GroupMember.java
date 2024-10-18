/**
 * 
 */
package org.drdeesw.commons.modules.security.models;

import org.drdeesw.commons.modules.common.models.LongUniqueObject;

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
