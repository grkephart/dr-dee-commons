/**
 * 
 */
package org.drdeesw.commons.security.models.entities;


import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import org.drdeesw.commons.accounting.models.Account;
import org.drdeesw.commons.common.models.entities.AbstractNamedLongUniqueEntity;
import org.drdeesw.commons.security.models.User;


/**
 * Structured to work with JdbcUserDetailsManager.
 * This is an abstract class so that subclasses can define the schema and table names.
 * 
 * @author gary_kephart
 *
 */
@SuppressWarnings("serial")
@MappedSuperclass
@Access(AccessType.PROPERTY)
public abstract class AbstractUserEntity<A extends Account<?,?,?>> extends AbstractNamedLongUniqueEntity implements User<A>
{
  /**
   * true if the user is enabled
   */
  private boolean       enabled;

  /**
   * perhaps the email address
   */
  private String        username;

  /**
   * Hibernate
   */
  protected AbstractUserEntity()
  {
  }


  protected AbstractUserEntity(Long id)
  {
    super(id);
  }


  /**
   * For testing.
   * 
   * @param username perhaps the email address
   */
  public AbstractUserEntity(String username)
  {
    this.username = username;
  }


  /**
   * For when logging in reveals a new user.
   * 
   * @param username the username of the user
   * @param enabled whether the user is enabled or not
   */
  public AbstractUserEntity(String username, boolean enabled)
  {
    this.enabled = enabled;
    this.username = username;
  }


  protected AbstractUserEntity(User<?> that)
  {
    super(that);
    this.enabled = that.isEnabled();
    this.username = that.getUsername();
  }


  @Override
  public Long getId()
  {
    return super.getId();
  }


  @Override
  @Column(name = "username")
  public String getUsername()
  {
    return username;
  }


  @Override
  @Column(name = "is_enabled", nullable = false)
  public boolean isEnabled()
  {
    return enabled;
  }


  @Override
  public void setEnabled(
    boolean enabled)
  {
    this.enabled = enabled;
  }


  @Override
  public void setUsername(
    String email)
  {
    this.username = email;
  }

}
