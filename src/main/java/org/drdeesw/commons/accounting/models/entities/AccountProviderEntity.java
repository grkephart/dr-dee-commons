/**
 * 
 */
package org.drdeesw.commons.accounting.models.entities;


import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.drdeesw.commons.accounting.models.Account;


/**
 * 
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "account_providers")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Access(AccessType.PROPERTY)
public class AccountProviderEntity extends AbstractAccountProviderEntity
{
  private Set<AccountEntity> providedAccounts;

  @Override
  @Column(name="account_provider_id")
  public Long getId()
  {
    return super.getId();
  }

  @Override
  @OneToMany(fetch = FetchType.LAZY, mappedBy = "provider", cascade = CascadeType.ALL, orphanRemoval = true)
  public Set<Account> getProvidedAccounts()
  {
    return new HashSet<>(providedAccounts);
  }


  @Override
  public void setProvidedAccounts(
    Set<Account> providedAccounts)
  {
    this.providedAccounts = providedAccounts//
        .stream()//
        .map(account -> (AccountEntity)account)//
        .collect(Collectors.toSet());
  }
}
