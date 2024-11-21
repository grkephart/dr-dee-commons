/**
 * 
 */
package org.drdeesw.commons.security.models.pojos;


import org.drdeesw.commons.common.models.pojos.AbstractLongUniquePojo;
import org.drdeesw.commons.security.models.Group;
import org.drdeesw.commons.security.models.GroupMember;


/**
 * Structured to work with JdbcUserDetailsManager.
 * 
 * @author gkephart
 *
 */
@SuppressWarnings("serial")
public class GroupMemberPojo extends AbstractLongUniquePojo implements GroupMember
{
  private Group group;
  private String      username;

  /**
   * Hibernate
   */
  public GroupMemberPojo()
  {
  }


  /**
   * @return the group
   */
  public Group getGroup()
  {
    return group;
  }


  /**
   * @return the username
   */
  public String getUsername()
  {
    return username;
  }


  /**
   * @param group the group to set
   */
  public void setGroup(
    Group group)
  {
    this.group = group;
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
