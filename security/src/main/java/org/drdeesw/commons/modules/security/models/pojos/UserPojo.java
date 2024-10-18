/**
 * 
 */
package org.drdeesw.commons.modules.security.models.pojos;


import org.drdeesw.commons.modules.common.models.pojos.AbstractLongUniquePojo;
import org.drdeesw.commons.modules.security.models.User;


/**
 * Structured to work with JdbcUserDetailsManager.
 * 
 * @author gary_kephart
 *
 */
@SuppressWarnings("serial")
public class UserPojo extends AbstractLongUniquePojo implements User
{
  private boolean enabled;
  private String  username;

  /**
   * Hibernate
   */
  public UserPojo()
  {
  }


  public UserPojo(Long id)
  {
    super(id);
  }


  /**
   * For testing.
   * 
   * @param username
   */
  public UserPojo(String username)
  {
    this.username = username;
  }


  @Override
  public Long getId()
  {
    return super.getId();
  }


  /**
   * The email address is the username
   * @return
   */
  public String getUsername()
  {
    return username;
  }


  /**
   * @return the enabled
   */
  public boolean isEnabled()
  {
    return enabled;
  }


  /**
   * @param enabled the enabled to set
   */
  public void setEnabled(
    boolean enabled)
  {
    this.enabled = enabled;
  }


  public void setUsername(
    String email)
  {
    this.username = email;
  }
}
