/**
 * 
 */
package org.drdeesw.commons.organization.models.entities;


import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;

import org.drdeesw.commons.common.models.entities.AbstractNamedLongUniqueEntity;
import org.drdeesw.commons.organization.models.Account;
import org.drdeesw.commons.organization.models.AccountProvider;


/**
 * 
 */
@SuppressWarnings("serial")
@MappedSuperclass
@Access(AccessType.FIELD)
public abstract class AbstractAccountProviderEntity extends AbstractNamedLongUniqueEntity
    implements AccountProvider
{
  @OneToMany(fetch = FetchType.LAZY, mappedBy = "provider", cascade = CascadeType.ALL, orphanRemoval = true)
  private Set<AbstractAccountEntity> providedAccounts;
  @Column(name = "description")
  private String                     description;

  @Override
  public String getDescription()
  {
    return this.description;
  }


  @Override
  public Set<Account> getProvidedAccounts()
  {
    return new HashSet<>(providedAccounts);
  }


  @Override
  public void setDescription(
    String description)
  {
    this.description = description;
  }


  @Override
  public void setProvidedAccounts(
    Set<Account> providedAccounts)
  {
    this.providedAccounts = providedAccounts//
        .stream()//
        .map(account -> (AbstractAccountEntity)account)//
        .collect(Collectors.toSet());
  }

}
