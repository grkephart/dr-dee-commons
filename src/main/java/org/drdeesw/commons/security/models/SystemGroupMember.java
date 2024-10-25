/**
 * 
 */
package org.drdeesw.commons.security.models;

import org.drdeesw.commons.common.models.LongUniqueObject;

/**
 * Structured to work with JdbcUserDetailsManager.
 * 
 * @author gkephart
 *
 */
public interface SystemGroupMember extends LongUniqueObject
{


  /**
   * @return the system group ID
   */
  public Long getSystemGroupId();


  /**
   * @return the username
   */
  public String getUsername();


  /**
   * @param systemGroupId the role ID to set
   */
  public void setSystemGroupId(
    Long systemGroupId);



  /**
   * @param username the username to set
   */
  public void setUsername(
    String username);

}
