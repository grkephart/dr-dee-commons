package org.drdeesw.commons.serviceproviders.models.entities;


import java.util.Set;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;

import org.drdeesw.commons.accounting.models.entities.AbstractAccountProviderEntity;
import org.drdeesw.commons.security.models.entities.AbstractUserEntity;
import org.drdeesw.commons.serviceproviders.models.ServiceProviderAccountProvider;


@SuppressWarnings("serial")
@MappedSuperclass
@Access(AccessType.PROPERTY)
public abstract class AbstractServiceProviderAccountProviderEntity<//
    U extends AbstractUserEntity<?>, //
    A extends AbstractServiceProviderAccountEntity<U, ?, ?>>
    extends AbstractAccountProviderEntity<U, A> implements ServiceProviderAccountProvider<U, A>
{
  private Set<A> providedAccounts;

  @Override
  @OneToMany(mappedBy = "provider", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
  public Set<A> getProvidedAccounts()
  {
    return providedAccounts;
  }


  @Override
  public void setProvidedAccounts(
    Set<A> providedAccounts)
  {
    this.providedAccounts = providedAccounts;
  }

}
