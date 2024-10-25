/**
 * 
 */
package org.drdeesw.commons.security.models.pojos;


import org.drdeesw.commons.common.models.pojos.AbstractLongUniquePojo;
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
  private Long   systemGroupId;
  private String username;

  /**
   * Hibernate
   */
  public SystemGroupMemberPojo()
  {
  }


  /**
   * @return the systemGroupId
   */
  public Long getSystemGroupId()
  {
    return systemGroupId;
  }


  /**
   * @return the username
   */
  public String getUsername()
  {
    return username;
  }


  /**
   * @param systemGroupId the systemGroupId to set
   */
  public void setSystemGroupId(
    Long systemGroupId)
  {
    this.systemGroupId = systemGroupId;
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
