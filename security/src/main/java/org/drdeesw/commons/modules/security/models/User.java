/**
 * 
 */
package org.drdeesw.commons.modules.security.models;


import org.drdeesw.commons.common.models.LongUniqueObject;


/**
 * Structured to work with JdbcUserDetailsManager.
 * 
 * @author gary_kephart
 *
 */
public interface User extends LongUniqueObject
{

  @Override
  public Long getId();


  /**
   * The email address is the username
   * @return
   */
  public String getUsername();


  /**
   * @return the enabled
   */
  public boolean isEnabled();


  /**
   * @param enabled the enabled to set
   */
  public void setEnabled(
    boolean enabled);



  /**
   * @param username
   */
  public void setUsername(
    String username);

}
