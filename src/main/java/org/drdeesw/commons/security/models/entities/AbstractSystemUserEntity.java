/**
 * 
 */
package org.drdeesw.commons.security.models.entities;


import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import org.drdeesw.commons.common.models.entities.AbstractLongUniqueEntity;
import org.drdeesw.commons.security.models.SystemUser;


/**
 * Structured to work with JdbcUserDetailsManager.
 * This is an abstract class so that subclasses can define the schema and table names.
 * 
 * @author gary_kephart
 *
 */
@SuppressWarnings("serial")
@MappedSuperclass
@Access(AccessType.FIELD)
public abstract class AbstractSystemUserEntity extends AbstractLongUniqueEntity implements SystemUser
{
  /**
   * true if the user is enabled
   */
  @Column(name = "enabled")
  private boolean enabled;

  /**
   * perhaps the email address
   */
  @Column(name = "username")
  private String  username;

  /**
   * Hibernate
   */
  protected AbstractSystemUserEntity()
  {
  }


  protected AbstractSystemUserEntity(Long id)
  {
    super(id);
  }


  /**
   * For testing.
   * 
   * @param username perhaps the email address
   */
  public AbstractSystemUserEntity(String username)
  {
    this.username = username;
  }


  /**
   * For when logging in reveals a new user.
   * 
   * @param username
   * @param enabled
   */
  public AbstractSystemUserEntity(String username, boolean enabled)
  {
    this.enabled = enabled;
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
