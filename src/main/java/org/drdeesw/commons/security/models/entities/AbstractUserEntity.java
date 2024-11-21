/**
 * 
 */
package org.drdeesw.commons.security.models.entities;


import java.util.Collections;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;

import org.drdeesw.commons.common.models.entities.AbstractLongUniqueEntity;
import org.drdeesw.commons.security.models.User;
import org.drdeesw.commons.serviceproviders.models.ServiceProviderAccount;
import org.drdeesw.commons.serviceproviders.models.entities.ServiceProviderAccountEntity;


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
public abstract class AbstractUserEntity extends AbstractLongUniqueEntity implements User
{
  @OneToMany(fetch = FetchType.LAZY, mappedBy = "serviceProvider")
  private Set<ServiceProviderAccountEntity> accounts;

  /**
   * true if the user is enabled
   */
  @Column(name = "enabled")
  private boolean                           enabled;

  /**
   * perhaps the email address
   */
  @Column(name = "username")
  private String                            username;

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
        .stream()//
        .map(account -> (ServiceProviderAccount) account)//
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
        .map(account -> (ServiceProviderAccountEntity)account)//
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
