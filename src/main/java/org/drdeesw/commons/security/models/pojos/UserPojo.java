/**
 * 
 */
package org.drdeesw.commons.security.models.pojos;


import java.util.Collections;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import org.drdeesw.commons.common.models.pojos.AbstractLongUniquePojo;
import org.drdeesw.commons.security.models.User;
import org.drdeesw.commons.serviceproviders.models.ServiceProviderAccount;
import org.drdeesw.commons.serviceproviders.models.pojos.ServiceProviderAccountPojo;


/**
 * Structured to work with JdbcUserDetailsManager.
 * 
 * @author gary_kephart
 *
 */
@SuppressWarnings("serial")
public class UserPojo extends AbstractLongUniquePojo implements User
{
  private Set<ServiceProviderAccountPojo> accounts;
  private boolean                         enabled;
  private String                          username;

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
  public AccountHolderType getAccountHolderType()
  {
    return AccountHolderType.USER;
  }


  @Override
  public Set<ServiceProviderAccount> getAccounts()
  {
    return Optional.ofNullable(this.accounts)//
        .orElse(Collections.emptySet())//
        .stream()
        .map(account -> (ServiceProviderAccount)account)//
        .collect(Collectors.toSet());
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
  public void setAccounts(
    Set<ServiceProviderAccount> accounts)
  {
    this.accounts = accounts.stream()//
        .map(account -> (ServiceProviderAccountPojo)account)//
        .collect(Collectors.toSet());
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
