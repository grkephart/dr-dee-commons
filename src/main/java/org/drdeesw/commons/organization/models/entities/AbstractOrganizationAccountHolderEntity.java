package org.drdeesw.commons.organization.models.entities;


import java.util.Set;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;

import org.drdeesw.commons.accounting.models.entities.AbstractAccountHolderEntity;
import org.drdeesw.commons.organization.models.OrganizationAccountHolder;
import org.drdeesw.commons.security.models.entities.AbstractUserEntity;


@SuppressWarnings("serial")
@MappedSuperclass
@Access(AccessType.PROPERTY)
public abstract class AbstractOrganizationAccountHolderEntity<//
    U extends AbstractUserEntity<?>, //
    A extends AbstractOrganizationAccountEntity<U, ?, ?>> //
    extends AbstractAccountHolderEntity<U, A> implements OrganizationAccountHolder<U, A>
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
