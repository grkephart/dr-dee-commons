/**
 * 
 */
package org.drdeesw.commons.organization.models;


import java.util.Optional;
import java.util.Set;

import org.drdeesw.commons.common.models.LongUniqueObject;
import org.drdeesw.commons.identity.models.Person;
import org.drdeesw.commons.security.models.User;


/**
 * Represents any entity that can hold accounts, such as:
 *  Person
 *  User
 *  Organization
 *  
 *  An AccountHolder can be a Person, a User, or an Organization, but not all at once.
 */
public interface AccountHolder extends LongUniqueObject
{
  /**
   * @return
   */
  Set<Account> getAccounts();


  /**
   * @return
   */
  Optional<Organization> getOrganization();


  /**
   * @return
   */
  Optional<Person> getPerson();


  /**
   * @return
   */
  Optional<User> getUser();


  /**
   * @param accounts
   */
  void setAccounts(
    Set<Account> accounts);
  
  /**
   * @param organization
   */
  void setOrganization(
    Organization organization);


  /**
   * @param person
   */
  void setPerson(
    Person person);


  /**
   * @param user
   */
  void setUser(
    User user);
}
