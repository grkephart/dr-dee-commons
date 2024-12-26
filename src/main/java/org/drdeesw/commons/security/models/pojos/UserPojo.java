/**
 * 
 */
package org.drdeesw.commons.security.models.pojos;


import org.drdeesw.commons.accounting.models.Account;
import org.drdeesw.commons.accounting.models.pojos.AccountPojo;
import org.drdeesw.commons.common.models.pojos.AbstractNamedLongUniquePojo;
import org.drdeesw.commons.security.models.User;


/**
 * Structured to work with JdbcUserDetailsManager.
 * 
 * @author gary_kephart
 *
 */
@SuppressWarnings("serial")
public class UserPojo extends AbstractNamedLongUniquePojo implements User
{
  private AccountPojo account;
  private boolean     enabled;
  private String      username;

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
   * @param username the username
   */
  public UserPojo(String username)
  {
    this.username = username;
  }


  @Override
  public Account getAccount()
  {
    return this.account;
  }


  @Override
  public Long getId()
  {
    return super.getId();
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


  @Override
  public void setAccount(
    Account account)
  {
    this.account = (AccountPojo)account;
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
