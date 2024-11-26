package org.drdeesw.commons.organization.models.entities;


import java.util.Set;

import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;

import org.drdeesw.commons.organization.models.OrganizationAccount;
import org.drdeesw.commons.organization.models.OrganizationAccountHolder;


@MappedSuperclass
public abstract class AbstractOrganizationAccountHolderEntity<A extends OrganizationAccount>
    implements OrganizationAccountHolder<A>
{
  @OneToMany(mappedBy = "holder")
  private Set<A> accounts;

  @Override
  public Set<A> getAccounts()
  {
    return accounts;
  }


  @Override
  public void setAccounts(
    Set<A> accounts)
  {
    this.accounts = accounts;
  }
}
