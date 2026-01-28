package org.drdeesw.commons.organization.models.entities;


import java.util.Set;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;

import org.drdeesw.commons.accounting.models.entities.AbstractAccountProviderEntity;
import org.drdeesw.commons.organization.models.OrganizationAccountProvider;
import org.drdeesw.commons.security.models.entities.AbstractUserEntity;


@SuppressWarnings("serial")
@MappedSuperclass
@Access(AccessType.PROPERTY)
public abstract class AbstractOrganizationAccountProviderEntity<//
    U extends AbstractUserEntity<?>, //
    A extends AbstractOrganizationAccountEntity<U, ?, ?>>
    extends AbstractAccountProviderEntity<U, A> implements OrganizationAccountProvider<U, A>
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
