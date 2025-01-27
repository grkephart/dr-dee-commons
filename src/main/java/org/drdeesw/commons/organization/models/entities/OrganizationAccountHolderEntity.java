/**
 * 
 */
package org.drdeesw.commons.organization.models.entities;


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


/**
 * 
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "organization_account_holders")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Access(AccessType.PROPERTY)
public class OrganizationAccountHolderEntity
    extends AbstractOrganizationAccountHolderEntity<OrganizationAccountEntity>
{

  private Set<OrganizationAccountEntity> heldAccounts;

  /**
   * Hibernate constructor
   */
  public OrganizationAccountHolderEntity()
  {

  }


  @Override
  @OneToMany(mappedBy = "holder", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
  public Set<OrganizationAccountEntity> getHeldAccounts()
  {
    return heldAccounts;
  }


  @Override
  @Column(name = "account_holder_id")
  public Long getId()
  {
    return super.getId();
  }


  @Override
  public void setHeldAccounts(
    Set<OrganizationAccountEntity> heldAccounts)
  {
    this.heldAccounts = heldAccounts;
  }

}
