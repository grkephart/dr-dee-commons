/**
 * 
 */
package org.drdeesw.commons.identity.models.entities;

import java.util.Collections;
import java.util.Set;
import java.util.stream.Collectors;

import javax.persistence.AttributeOverride;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.drdeesw.commons.accounting.models.Account;
import org.drdeesw.commons.accounting.models.entities.AccountEntity;

/**
 * 
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "persons")
@AttributeOverride(name = "id", column = @Column(name = "person_id"))
public class PersonEntity extends AbstractPersonEntity
{
  @OneToMany(fetch = FetchType.LAZY, mappedBy = "holder", cascade = CascadeType.ALL, orphanRemoval = true)
  private Set<AccountEntity> heldAccounts;

  @Override
  public Set<Account> getHeldAccounts()
  {
    if (this.heldAccounts == null)
    {
      return Collections.emptySet();
    }

    return this.heldAccounts.stream()//
        .map(account -> (Account)account)//
        .collect(Collectors.toSet());
  }

  @Override
  public void setHeldAccounts(
    Set<Account> accounts)
  {
    this.heldAccounts = accounts.stream()//
        .map(account -> (AccountEntity)account)//
        .collect(Collectors.toSet());
  }

}
