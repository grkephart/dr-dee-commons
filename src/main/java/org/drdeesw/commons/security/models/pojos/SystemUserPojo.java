/**
 * 
 */
package org.drdeesw.commons.security.models.pojos;


import org.drdeesw.commons.common.models.pojos.AbstractLongUniquePojo;
import org.drdeesw.commons.security.models.SystemUser;


/**
 * Structured to work with JdbcUserDetailsManager.
 * 
 * @author gary_kephart
 *
 */
@SuppressWarnings("serial")
public class SystemUserPojo extends AbstractLongUniquePojo implements SystemUser
{
  private boolean enabled;
  private String  username;

  /**
   * Hibernate
   */
  public SystemUserPojo()
  {
  }


  public SystemUserPojo(Long id)
  {
    super(id);
  }


  /**
   * For testing.
   * 
   * @param username
   */
  public SystemUserPojo(String username)
  {
    this.username = username;
  }


  @Override
  public AccountType getAccountType()
  {
    return AccountType.USER;
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
