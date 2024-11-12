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
   * @return the system group
   */
  public SystemGroup getSystemGroup();


  /**
   * @return the username
   */
  public String getUsername();


  /**
   * @param systemGroup the group to set
   */
  public void setSystemGroup(
    SystemGroup systemGroup);



  /**
   * @param username the username to set
   */
  public void setUsername(
    String username);

}
