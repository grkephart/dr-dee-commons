/**
 * 
 */
package org.drdeesw.commons.modules.security.models.pojos;


import org.drdeesw.commons.modules.common.models.pojos.AbstractLongUniquePojo;
import org.drdeesw.commons.modules.security.models.GroupMember;


/**
 * Structured to work with JdbcUserDetailsManager.
 * 
 * @author gkephart
 *
 */
@SuppressWarnings("serial")
public class GroupMemberPojo extends AbstractLongUniquePojo implements GroupMember
{
  private Long   groupId;
  private String username;

  /**
   * Hibernate
   */
  public GroupMemberPojo()
  {
  }


  /**
   * @return the groupId
   */
  public Long getGroupId()
  {
    return groupId;
  }


  /**
   * @return the username
   */
  public String getUsername()
  {
    return username;
  }


  /**
   * @param groupId the groupId to set
   */
  public void setGroupId(
    Long groupId)
  {
    this.groupId = groupId;
  }


  /**
   * @param username the username to set
   */
  public void setUsername(
    String username)
  {
    this.username = username;
  }

}
