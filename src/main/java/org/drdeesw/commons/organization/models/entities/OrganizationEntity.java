/**
 * 
 */
package org.drdeesw.commons.organization.models.entities;


import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import javax.persistence.AttributeOverride;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.drdeesw.commons.organization.models.Account;
import org.drdeesw.commons.organization.models.Organization;


/**
 * 
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "organizations")
@AttributeOverride(name = "id", column = @Column(name = "organization_id"))
public class OrganizationEntity extends AbstractOrganizationEntity implements Organization
{
  @OneToMany(mappedBy = "holder", cascade = CascadeType.ALL)
  private Set<AbstractAccountEntity> heldAccounts     = new HashSet<>();

  @OneToMany(mappedBy = "provider", cascade = CascadeType.ALL, orphanRemoval = true)
  private Set<AbstractAccountEntity> providedAccounts = new HashSet<>();

  @ManyToOne
  @JoinColumn(name = "parent_id")
  private OrganizationEntity         parent;

  @Override
  public Set<Account> getHeldAccounts()
  {
    return new HashSet<>(heldAccounts);
  }


  @Override
  public Organization getParent()
  {
    return parent;
  }


  @Override
  public Set<Account> getProvidedAccounts()
  {
    return new HashSet<>(providedAccounts);
  }


  @Override
  public void setHeldAccounts(
    Set<Account> accounts)
  {
    this.heldAccounts = accounts//
        .stream()//
        .map(account -> (AbstractAccountEntity)account).collect(Collectors.toSet());
  }


  @Override
  public void setParent(
    Organization parent)
  {
    this.parent = (OrganizationEntity)parent;
  }


  @Override
  public void setProvidedAccounts(
    Set<Account> accounts)
  {
    this.providedAccounts = accounts.stream().map(account -> (AbstractAccountEntity)account)
        .collect(Collectors.toSet());
  }
}
