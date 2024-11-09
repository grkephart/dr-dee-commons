/**
 * 
 */
package org.drdeesw.commons.security.models;


import org.drdeesw.commons.common.models.LongUniqueObject;
import org.drdeesw.commons.serviceproviders.models.ServiceProviderAccountHolder;


/**
 * Structured to work with JdbcUserDetailsManager.
 * 
 * @author gary_kephart
 *
 */
public interface SystemUser extends LongUniqueObject, ServiceProviderAccountHolder
{


  /**
   * Returns the username of the user.
   * 
   * @return the username of the user
   */
  public String getUsername();


  /**
   * Returns true if the user is enabled, or false if the user is disabled.
   * 
   * @return true if the user is enabled, or false if the user is disabled
   */
  public boolean isEnabled();


  /**
   * Sets the enabled status of the user.
   * 
   * @param enabled the enabled to set
   */
  public void setEnabled(
    boolean enabled);



  /**
   * Sets the username of the user.
   * 
   * @param username the username to set
   */
  public void setUsername(
    String username);

}
