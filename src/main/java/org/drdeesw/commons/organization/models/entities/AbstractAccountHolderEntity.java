/**
 * 
 */
package org.drdeesw.commons.organization.models.entities;


import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.drdeesw.commons.common.models.entities.AbstractLongUniqueEntity;
import org.drdeesw.commons.identity.models.Person;
import org.drdeesw.commons.identity.models.entities.PersonEntity;
import org.drdeesw.commons.organization.models.Account;
import org.drdeesw.commons.organization.models.AccountHolder;
import org.drdeesw.commons.organization.models.Organization;
import org.drdeesw.commons.security.models.User;
import org.drdeesw.commons.security.models.entities.UserEntity;


/**
 * 
 */
@SuppressWarnings("serial")
@MappedSuperclass
@Access(AccessType.FIELD)
public abstract class AbstractAccountHolderEntity extends AbstractLongUniqueEntity
    implements AccountHolder
{
  @OneToMany
  private Set<AccountEntity> accounts;

  @OneToOne
  private OrganizationEntity organization;

  @OneToOne
  private PersonEntity       person;

  @OneToOne
  private UserEntity         user;

  public AbstractAccountHolderEntity()
  {
  }

  public AbstractAccountHolderEntity(Long id)
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
        .map(account -> (AccountEntity)account)//
        .collect(Collectors.toSet());
  }


  @Override
  public void setOrganization(
    Organization organization)
  {
    this.organization = (OrganizationEntity)organization;
  }


  @Override
  public void setPerson(
    Person person)
  {
    this.person = (PersonEntity)person;
  }


  @Override
  public void setUser(
    User user)
  {
    this.user = (UserEntity)user;
  }

}
