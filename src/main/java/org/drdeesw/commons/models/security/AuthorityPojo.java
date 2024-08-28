package org.drdeesw.commons.models.security;


import org.drdeesw.commons.models.pojos.AbstractNamedUniquePojo;


/**
 * Structured to work with JdbcUserDetailsManager.
 * 
 * @author gary_kephart
 *
 */
@SuppressWarnings("serial")
public class AuthorityPojo extends AbstractNamedUniquePojo<Long> implements Authority
{
  private String authority;
  private String username;

  /**
   * Hibernate
   */
  protected AuthorityPojo()
  {
  }


  protected AuthorityPojo(Long id)
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
