/**
 * 
 */
package org.drdeesw.commons.organization.models.pojos;


import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.drdeesw.commons.common.models.pojos.AbstractLongUniquePojo;
import org.drdeesw.commons.identity.models.Person;
import org.drdeesw.commons.identity.models.pojos.PersonPojo;
import org.drdeesw.commons.organization.models.Account;
import org.drdeesw.commons.organization.models.AccountHolder;
import org.drdeesw.commons.organization.models.Organization;
import org.drdeesw.commons.security.models.User;
import org.drdeesw.commons.security.models.pojos.UserPojo;


/**
 * 
 */
@SuppressWarnings("serial")
@MappedSuperclass
@Access(AccessType.FIELD)
public class AccountHolderPojo extends AbstractLongUniquePojo implements AccountHolder
{
  @OneToMany
  private Set<AccountPojo> accounts;

  @OneToOne
  private OrganizationPojo organization;

  @OneToOne
  private PersonPojo       person;

  @OneToOne
  private UserPojo         user;

  public AccountHolderPojo()
  {
    super();
  }


  public AccountHolderPojo(Long id)
  {
    super(id);
  }


  @Override
  public Set<Account> getAccounts()
  {
    return this.accounts.stream()//
        .map(account -> (Account)account)//
        .collect(Collectors.toSet());
  }


  @Override
  public Optional<Organization> getOrganization()
  {
    return Optional.ofNullable(this.organization);
  }


  @Override
  public Optional<Person> getPerson()
  {
    return Optional.ofNullable(this.person);
  }


  @Override
  public Optional<User> getUser()
  {
    return Optional.ofNullable((User)this.user);
  }


  @Override
  public void setAccounts(
    Set<Account> accounts)
  {
    this.accounts = accounts.stream()//
        .map(account -> (AccountPojo)account)//
        .collect(Collectors.toSet());
  }


  @Override
  public void setOrganization(
    Organization organization)
  {
    this.organization = (OrganizationPojo)organization;
  }


  @Override
  public void setPerson(
    Person person)
  {
    this.person = (PersonPojo)person;
  }


  @Override
  public void setUser(
    User user)
  {
    this.user = (UserPojo)user;
  }

}
