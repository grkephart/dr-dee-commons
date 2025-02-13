/**
 * 
 */
package org.drdeesw.commons.security.models.pojos;


import org.drdeesw.commons.accounting.models.pojos.AbstractAccountPojo;
import org.drdeesw.commons.common.models.pojos.AbstractNamedLongUniquePojo;
import org.drdeesw.commons.security.models.User;


@SuppressWarnings("serial")
public abstract class AbstractUserPojo<//
    A extends AbstractAccountPojo<?, ?, ?>> //
    extends AbstractNamedLongUniquePojo implements User<A>
{
  protected A       account;
  protected boolean enabled;
  protected String  username;

  protected AbstractUserPojo()
  {
  }


  protected AbstractUserPojo(Long id)
  {
    super(id);
  }


  protected AbstractUserPojo(String username)
  {
    this.username = username;
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


  @Override
  public void setAccount(
    A account)
  {
    this.account = account;
  }


  @Override
  public void setEnabled(
    boolean enabled)
  {
    this.enabled = enabled;
  }


  @Override
  public void setUsername(
    String username)
  {
    this.username = username;
  }
}
