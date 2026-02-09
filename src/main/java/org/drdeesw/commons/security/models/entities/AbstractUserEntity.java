/**
 * 
 */
package org.drdeesw.commons.security.models.entities;


import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;

import org.drdeesw.commons.accounting.models.Account;
import org.drdeesw.commons.common.models.entities.AbstractNamedLongUniqueEntity;
import org.drdeesw.commons.security.models.User;


/**
 * Structured to work with JdbcUserDetailsManager. This is an abstract class so
 * that subclasses can define the schema and table names.
 * 
 * @author gary_kephart
 *
 */
@SuppressWarnings("serial")
@MappedSuperclass
@AttributeOverride(name="id",  column=@Column(name="user_id"))
public abstract class AbstractUserEntity<A extends Account<?, ?, ?>> extends AbstractNamedLongUniqueEntity
    implements User<A>
{
  @OneToOne(optional = false)
  @JoinColumn(name = "account_id")
  private A       account;

  @Column(name = "is_enabled", nullable = false)
  private boolean enabled;

  @Column(name = "username")
  private String  username;

  /**
   * Hibernate
   */
  protected AbstractUserEntity()
  {
  }


  protected AbstractUserEntity(AbstractUserEntity<A> copy)
  {
    super(copy);
    this.account = copy.account;
    this.enabled = copy.enabled;
    this.username = copy.username;
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
   * @param enabled  whether the user is enabled or not
   */
  public AbstractUserEntity(String username, boolean enabled)
  {
    this.enabled  = enabled;
    this.username = username;
  }


  protected AbstractUserEntity(User<?> that)
  {
    super(that);
    this.enabled  = that.isEnabled();
    this.username = that.getUsername();
  }


  @Override
  public void changeAccount(A account)
  {
    this.account = account;
  }


  @Override
  public A getAccount()
  {
    return this.account;
  }


  @Override
  public String getUsername()
  {
    return username;
  }


  @Override
  public boolean isEnabled()
  {
    return enabled;
  }

  /**
   * @param account the account to set
   */
  public void setAccount(A account)
  {
    this.account = account;
  }


  @Override
  public void setEnabled(boolean enabled)
  {
    this.enabled = enabled;
  }


  public void setUsername(String username)
  {
    this.username = username;
  }

}
