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
@Table(name = "organization_account_providers")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Access(AccessType.PROPERTY)
public class OrganizationAccountProviderEntity
    extends AbstractOrganizationAccountProviderEntity<OrganizationAccountEntity>
{

  private Set<OrganizationAccountEntity> providedAccounts;

  /**
   * Hibernate constructor
   */
  public OrganizationAccountProviderEntity()
  {

  }


  @Override
  @OneToMany(mappedBy = "provider", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
  public Set<OrganizationAccountEntity> getProvidedAccounts()
  {
    return providedAccounts;
  }


  @Override
  @Column(name = "account_provider_id")
  public Long getId()
  {
    return super.getId();
  }


  @Override
  public void setProvidedAccounts(
    Set<OrganizationAccountEntity> providedAccounts)
  {
    this.providedAccounts = providedAccounts;
  }

}
