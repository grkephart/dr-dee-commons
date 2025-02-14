package org.drdeesw.commons.serviceproviders.models.entities;


import java.util.Set;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;

import org.drdeesw.commons.accounting.models.entities.AbstractAccountHolderEntity;
import org.drdeesw.commons.security.models.entities.AbstractUserEntity;
import org.drdeesw.commons.serviceproviders.models.ServiceProviderAccountHolder;


@SuppressWarnings("serial")
@MappedSuperclass
@Access(AccessType.PROPERTY)
public abstract class AbstractServiceProviderAccountHolderEntity<//
    U extends AbstractUserEntity<?>, //
    A extends AbstractServiceProviderAccountEntity<U, ?, ?>> //
    extends AbstractAccountHolderEntity<U, A> implements ServiceProviderAccountHolder<U, A>
{

  private Set<A> heldAccounts;

  @Override
  @OneToMany(mappedBy = "holder", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
  public Set<A> getHeldAccounts()
  {
    return heldAccounts;
  }


  @Override
  public void setHeldAccounts(
    Set<A> heldAccounts)
  {
    this.heldAccounts = heldAccounts;
  }

}
