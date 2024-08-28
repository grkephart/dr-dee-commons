/**
 * 
 */
package org.drdeesw.commons.models.security;


import org.drdeesw.commons.models.pojos.AbstractNamedLongUniquePojo;


/**
 * Structured to work with JdbcUserDetailsManager.
 * 
 * @author gary_kephart
 *
 */
@SuppressWarnings("serial")
public class UserPojo extends AbstractNamedLongUniquePojo implements User
{
  private boolean enabled;
  private String  roleNames;
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
   * @param name
   * @param email
   */
  public UserPojo(String name, String username)
  {
    super(name);
    this.username = username;
  }


  /**
   * For when logging in reveals a new user.
   * 
   * @param name
   * @param username
   * @param enabled
   */
  public UserPojo(String name, String username, boolean enabled)
  {
    super(name);
    this.enabled = enabled;
    this.username = username;
  }


  public UserPojo(UserEntity that)
  {
    super(that);
    this.enabled = that.isEnabled();
    this.roleNames = that.getRoleNames();
    this.username = that.getUsername();
  }


  @Override
  public Long getId()
  {
    return super.getId();
  }


  /**
   * @return the roleNames
   */
  public String getRoleNames()
  {
    return roleNames;
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


  /**
   * @param roleNames the roleNames to set
   */
  public void setRoleNames(
    String roleNames)
  {
    this.roleNames = roleNames;
  }


  public void setUsername(
    String email)
  {
    this.username = email;
  }
}
