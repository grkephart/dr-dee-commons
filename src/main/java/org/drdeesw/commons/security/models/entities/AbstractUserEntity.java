/**
 * 
 */
package org.drdeesw.commons.security.models.entities;


import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;

import org.drdeesw.commons.accounting.models.Account;
import org.drdeesw.commons.accounting.models.entities.AccountEntity;
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
public abstract class AbstractUserEntity extends AbstractNamedLongUniqueEntity implements User
{
  private AccountEntity account;

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


  protected AbstractUserEntity(User that)
  {
    super(that);
    this.account = (AccountEntity)that.getAccount();
    this.enabled = that.isEnabled();
    this.username = that.getUsername();
  }


  /**
   * @return the account
   */
  @Override
  @OneToOne(targetEntity = AccountEntity.class, optional = false)
  @JoinColumn(name = "account_id")
  public AccountEntity getAccount()
  {
    return account;
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


  /**
   * @param account the account to set
   */
  @Override
  public void setAccount(
    Account account)
  {
    this.account = (AccountEntity)account;
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
