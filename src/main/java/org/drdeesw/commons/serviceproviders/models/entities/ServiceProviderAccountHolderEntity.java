/**
 * 
 */
package org.drdeesw.commons.serviceproviders.models.entities;


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

import org.drdeesw.commons.organization.models.Account;
import org.drdeesw.commons.organization.models.entities.AccountEntity;


/**
 * 
 */

@SuppressWarnings("serial")
@Entity
@Table(name = "service_provider_account_holders")
@AttributeOverride(name = "id", column = @Column(name = "service_provider_account_holder_id"))
public class ServiceProviderAccountHolderEntity extends AbstractServiceProviderAccountHolderEntity
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
