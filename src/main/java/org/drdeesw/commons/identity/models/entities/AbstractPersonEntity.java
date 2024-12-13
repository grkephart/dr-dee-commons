/**
 * 
 */
package org.drdeesw.commons.identity.models.entities;


import java.util.Set;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;

import org.drdeesw.commons.identity.models.Person;
import org.drdeesw.commons.organization.models.Account;
import org.drdeesw.commons.organization.models.entities.AbstractAccountHolderEntity;


/**
 * 
 */
@SuppressWarnings("serial")
@MappedSuperclass
@Access(AccessType.FIELD)
public abstract class AbstractPersonEntity extends AbstractAccountHolderEntity implements Person
{
  @OneToMany(fetch = FetchType.LAZY, mappedBy = "holder", cascade = CascadeType.ALL, orphanRemoval = true)
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
