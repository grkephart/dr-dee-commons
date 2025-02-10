/**
 * 
 */
package org.drdeesw.commons.accounting.models.entities;


import java.util.Set;

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

import org.drdeesw.commons.security.models.entities.UserEntity;


/**
 * 
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "account_providers")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Access(AccessType.PROPERTY)
public class AccountProviderEntity extends AbstractAccountProviderEntity<UserEntity, AccountEntity>
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
  public Set<AccountEntity> getProvidedAccounts()
  {
    return providedAccounts;
  }

  @Override
  public void setProvidedAccounts(
    Set<AccountEntity> accounts)
  {
    this.providedAccounts = accounts;
  }
}
