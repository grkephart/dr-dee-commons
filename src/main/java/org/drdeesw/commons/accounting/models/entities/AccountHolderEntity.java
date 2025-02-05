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
@Table(name = "account_holders")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Access(AccessType.PROPERTY)
public class AccountHolderEntity extends AbstractAccountHolderEntity<AccountEntity, UserEntity>
{
  private Set<AccountEntity> heldAccounts;

  @Override
  @OneToMany(mappedBy = "holder", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
  public Set<AccountEntity> getHeldAccounts()
  {
    return heldAccounts;
  }

  @Override
  @Column(name="account_holder_id")
  public Long getId()
  {
    return super.getId();
  }

  @Override
  public void setHeldAccounts(
    Set<AccountEntity> heldAccounts)
  {
    this.heldAccounts = heldAccounts;
  }
}
