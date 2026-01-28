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
public interface GroupMember<G extends Group> extends LongUniqueObject
{


  /**
   * @return the system group
   */
  public G getGroup();


  /**
   * @return the username
   */
  public String getUsername();


  /**
   * @param group the group to set
   */
  public void setGroup(
    G group);



  /**
   * @param username the username to set
   */
  public void setUsername(
    String username);

}
