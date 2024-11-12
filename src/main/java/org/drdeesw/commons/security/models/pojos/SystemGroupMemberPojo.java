/**
 * 
 */
package org.drdeesw.commons.security.models.pojos;


import org.drdeesw.commons.common.models.pojos.AbstractLongUniquePojo;
import org.drdeesw.commons.security.models.SystemGroup;
import org.drdeesw.commons.security.models.SystemGroupMember;


/**
 * Structured to work with JdbcUserDetailsManager.
 * 
 * @author gkephart
 *
 */
@SuppressWarnings("serial")
public class SystemGroupMemberPojo extends AbstractLongUniquePojo implements SystemGroupMember
{
  private SystemGroup systemGroup;
  private String      username;

  /**
   * Hibernate
   */
  public SystemGroupMemberPojo()
  {
  }


  /**
   * @return the systemGroup
   */
  public SystemGroup getSystemGroup()
  {
    return systemGroup;
  }


  /**
   * @return the username
   */
  public String getUsername()
  {
    return username;
  }


  /**
   * @param systemGroup the systemGroup to set
   */
  public void setSystemGroup(
    SystemGroup systemGroup)
  {
    this.systemGroup = systemGroup;
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
