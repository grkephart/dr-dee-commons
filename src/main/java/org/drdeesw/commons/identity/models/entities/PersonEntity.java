/**
 * 
 */
package org.drdeesw.commons.identity.models.entities;


import java.util.HashSet;
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

import org.drdeesw.commons.accounting.models.entities.AccountEntity;


/**
 * 
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "persons")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Access(AccessType.PROPERTY)
public class PersonEntity extends AbstractPersonEntity<AccountEntity>
{
  private Set<AccountEntity> heldAccounts = new HashSet<>();

  @Override
  @Column(name = "person_id")
  public Long getId()
  {
    return super.getId();
  }


  @Override
  @OneToMany(fetch = FetchType.LAZY, mappedBy = "holder", cascade = CascadeType.ALL, orphanRemoval = true)
  public Set<AccountEntity> getHeldAccounts()
  {
    return this.heldAccounts;
  }


  @Override
  public void setHeldAccounts(
    Set<AccountEntity> accounts)
  {
    this.heldAccounts = accounts;
  }

}
