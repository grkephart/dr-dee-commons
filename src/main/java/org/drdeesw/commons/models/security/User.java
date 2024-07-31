/**
 * 
 */
package org.drdeesw.commons.models.security;


import org.drdeesw.commons.models.base.NamedLongUniqueObject;


/**
 * Structured to work with JdbcUserDetailsManager.
 * 
 * @author gary_kephart
 *
 */
public interface User extends NamedLongUniqueObject
{

  @Override
  public Long getId();


  /**
   * @return the roleNames
   */
  public String getRoleNames();


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
   * @param roleNames the roleNames to set
   */
  public void setRoleNames(
    String roleNames);


  public void setUsername(
    String email);

}
