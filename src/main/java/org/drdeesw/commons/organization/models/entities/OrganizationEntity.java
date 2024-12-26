/**
 * 
 */
package org.drdeesw.commons.organization.models.entities;


import java.util.Collections;
import java.util.Set;
import java.util.stream.Collectors;

import javax.persistence.AttributeOverride;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.drdeesw.commons.accounting.models.Account;
import org.drdeesw.commons.organization.models.Organization;
import org.drdeesw.commons.organization.models.OrganizationAccount;
import org.drdeesw.commons.organization.models.OrganizationMember;
import org.drdeesw.commons.organization.models.OrganizationRole;


/**
 * 
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "organizations")
@Inheritance(strategy = InheritanceType.JOINED)
@AttributeOverride(name = "id", column = @Column(name = "organization_id"))
public class OrganizationEntity
    extends AbstractOrganizationEntity
{
  @OneToMany(fetch = FetchType.LAZY, mappedBy = "parent", cascade = CascadeType.ALL, orphanRemoval = true)
  private Set<OrganizationEntity>        children;
  @OneToMany(fetch = FetchType.LAZY, mappedBy = "holder", cascade = CascadeType.ALL, orphanRemoval = true)
  private Set<OrganizationAccountEntity> heldAccounts;
  @OneToMany(fetch = FetchType.LAZY, mappedBy = "organization", cascade = CascadeType.ALL, orphanRemoval = true)
  private Set<OrganizationMember>        members;
  @ManyToOne
  @JoinColumn(name = "parent_id")
  private OrganizationEntity             parent;
  @OneToMany(fetch = FetchType.LAZY, mappedBy = "provider", cascade = CascadeType.ALL, orphanRemoval = true)
  private Set<OrganizationAccountEntity> providedAccounts;
  @OneToMany(fetch = FetchType.LAZY, mappedBy = "organization", cascade = CascadeType.ALL, orphanRemoval = true)
  private Set<OrganizationRole>          roles;

  @Override
  public Set<Organization> getChildren()
  {
    if (this.children == null)
    {
      return Collections.emptySet();
    }

    return this.children.stream()//
        .map(account -> (OrganizationEntity)account)//
        .collect(Collectors.toSet());
  }


  @Override
  public Set<Account> getHeldAccounts()
  {
    if (this.heldAccounts == null)
    {
      return Collections.emptySet();
    }

    return this.heldAccounts.stream()//
        .map(account -> (OrganizationAccount)account)//
        .collect(Collectors.toSet());
  }


  @Override
  public Set<OrganizationMember> getMembers()
  {
    return this.members;
  }


  @Override
  public Organization getParent()
  {
    return parent;
  }


  @Override
  public Set<Account> getProvidedAccounts()
  {
    if (this.providedAccounts == null)
    {
      return Collections.emptySet();
    }

    return this.providedAccounts.stream()//
        .map(account -> (OrganizationAccount)account)//
        .collect(Collectors.toSet());
  }


  @Override
  public Set<OrganizationRole> getRoles()
  {
    return this.roles;
  }


  @Override
  public void setChildren(
    Set<Organization> children)
  {
    this.children = children.stream()//
        .map(account -> (OrganizationEntity)account)//
        .collect(Collectors.toSet());
  }


  @Override
  public void setHeldAccounts(
    Set<Account> accounts)
  {
    this.heldAccounts = accounts.stream()//
        .map(account -> (OrganizationAccountEntity)account)//
        .collect(Collectors.toSet());
  }


  @Override
  public void setMembers(
    Set<OrganizationMember> members)
  {
    this.members = members;
  }


  @Override
  public void setParent(
    Organization parent)
  {
    this.parent = (OrganizationEntity)parent;
  }


  @Override
  public void setProvidedAccounts(
    Set<Account> providedAccounts)
  {
    this.providedAccounts = providedAccounts//
        .stream()//
        .map(account -> (OrganizationAccountEntity)account)//
        .collect(Collectors.toSet());
  }


  @Override
  public void setRoles(
    Set<OrganizationRole> roles)
  {
    this.roles = roles;
  }
}
