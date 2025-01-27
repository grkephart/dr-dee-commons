/**
 * 
 */
package org.drdeesw.commons.organization.models.entities;


import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

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
import org.drdeesw.commons.common.models.EmbeddedAuditable;


/**
 * 
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "organizations")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Access(AccessType.PROPERTY)
public class OrganizationEntity extends AbstractOrganizationEntity<AccountEntity>
{
  private Set<AccountEntity>            heldAccounts     = new HashSet<>();
  private Set<AccountEntity>            providedAccounts = new HashSet<>();

  /**
   * Hibernate constructor
   */
  public OrganizationEntity()
  {

  }


  /**
   * Unit test constructor
   */
  public OrganizationEntity(EmbeddedAuditable audit)
  {
    super(audit);
  }


  @Override
  @Column(name = "organization_id")
  public Long getId()
  {
    return super.getId();
  }


  @Override
  @OneToMany(mappedBy = "holder", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
  public Set<AccountEntity> getHeldAccounts()
  {
    return heldAccounts == null ? Set.of() : new HashSet<>(heldAccounts);
  }


  @Override
  @OneToMany(mappedBy = "provider", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
  public Set<AccountEntity> getProvidedAccounts()
  {
    return providedAccounts == null ? Set.of() : new HashSet<>(this.providedAccounts);
  }


  @Override
  public void setHeldAccounts(
    Set<AccountEntity> accounts)
  {
    this.heldAccounts = accounts;
  }


  @Override
  public void setProvidedAccounts(
    Set<AccountEntity> accounts)
  {
    this.providedAccounts = Optional.ofNullable(accounts)
        .map(a -> a.stream().map(AccountEntity.class::cast).collect(Collectors.toSet()))
        .orElse(null);
  }

}
