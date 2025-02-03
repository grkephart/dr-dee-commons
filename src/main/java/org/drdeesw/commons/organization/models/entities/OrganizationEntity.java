/**
 * 
 */
package org.drdeesw.commons.organization.models.entities;


import java.util.HashSet;
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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.drdeesw.commons.accounting.models.entities.AccountEntity;
import org.drdeesw.commons.common.models.EmbeddedAuditable;
import org.drdeesw.commons.organization.models.Organization;


/**
 * 
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "organizations")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Access(AccessType.PROPERTY)
public class OrganizationEntity extends
    AbstractOrganizationEntity<OrganizationEntity, AccountEntity, OrganizationAccountEntity, OrganizationMemberEntity, OrganizationRoleEntity>
{
  private Set<OrganizationEntity>        children         = new HashSet<>();
  private Set<AccountEntity>             heldAccounts     = new HashSet<>();
  private Set<OrganizationMemberEntity>  members          = new HashSet<>();
  private OrganizationEntity             parent;
  private Set<OrganizationAccountEntity> providedAccounts = new HashSet<>();
  private Set<OrganizationRoleEntity>    roles            = new HashSet<>();

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
  @OneToMany(mappedBy = "parent", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
  public Set<OrganizationEntity> getChildren()
  {
    return children;
  }


  @Override
  @OneToMany(mappedBy = "holder", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
  public Set<AccountEntity> getHeldAccounts()
  {
    return heldAccounts;
  }


  @Override
  @Column(name = "organization_id")
  public Long getId()
  {
    return super.getId();
  }


  @Override
  @OneToMany(mappedBy = "organization", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
  public Set<OrganizationMemberEntity> getMembers()
  {
    return members == null ? Set.of() : new HashSet<>(members);
  }


  @Override
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "parent_organization_id")
  public OrganizationEntity getParent()
  {
    return this.parent;
  }


  @Override
  @OneToMany(mappedBy = "provider", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
  public Set<OrganizationAccountEntity> getProvidedAccounts()
  {
    return providedAccounts;
  }


  @Override
  @OneToMany(mappedBy = "organization", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
  public Set<OrganizationRoleEntity> getRoles()
  {
    return roles;
  }


  @Override
  public void setChildren(
    Set<OrganizationEntity> children)
  {
    this.children = children//
        .stream()//
        .map(child -> (OrganizationEntity)child)//
        .collect(Collectors.toSet());
  }


  @Override
  public void setHeldAccounts(
    Set<AccountEntity> accounts)
  {
    this.heldAccounts = accounts;
  }


  @Override
  public void setMembers(
    Set<OrganizationMemberEntity> members)
  {
    this.members = members;
  }


  @Override
  public void setParent(
    OrganizationEntity parent)
  {
    this.parent = (OrganizationEntity)parent;
  }


  @Override
  public void setProvidedAccounts(
    Set<OrganizationAccountEntity> accounts)
  {
    this.providedAccounts = accounts;
  }


  @Override
  public void setRoles(
    Set<OrganizationRoleEntity> roles)
  {
    this.roles = roles;
  }

}
