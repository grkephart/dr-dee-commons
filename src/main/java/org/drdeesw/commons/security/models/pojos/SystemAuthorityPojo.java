package org.drdeesw.commons.security.models.pojos;


import org.drdeesw.commons.common.models.pojos.AbstractNamedUniquePojo;
import org.drdeesw.commons.security.models.SystemAuthority;


/**
 * Structured to work with JdbcUserDetailsManager.
 * 
 * @author gary_kephart
 *
 */
@SuppressWarnings("serial")
public class SystemAuthorityPojo extends AbstractNamedUniquePojo<Long> implements SystemAuthority
{
  private String authority;
  private String username;

  /**
   * Hibernate
   */
  protected SystemAuthorityPojo()
  {
  }


  protected SystemAuthorityPojo(Long id)
  {
    super(id);
  }


  @Override
  public String getAuthority()
  {
    return this.authority;
  }


  @Override
  public String getUsername()
  {
    return this.username;
  }


  @Override
  public void setAuthority(
    String authority)
  {
    this.authority = authority;
  }


  @Override
  public void setUsername(
    String username)
  {
    this.username = username;
  }

}
