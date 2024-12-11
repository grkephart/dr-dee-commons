/**
 * 
 */
package org.drdeesw.commons.identity.models.pojos;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.drdeesw.commons.common.models.pojos.AbstractNamedLongUniquePojo;
import org.drdeesw.commons.identity.models.Person;
import org.drdeesw.commons.organization.models.Account;

/**
 * 
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "organizations")
public class PersonPojo extends AbstractNamedLongUniquePojo implements Person
{
  private Set<Account> heldAccounts;

  @Override
  public Set<Account> getHeldAccounts()
  {
    return this.heldAccounts;
  }

  @Override
  public void setHeldAccounts(
    Set<Account> heldAccounts)
  {
    this.heldAccounts = heldAccounts;
  }

}
