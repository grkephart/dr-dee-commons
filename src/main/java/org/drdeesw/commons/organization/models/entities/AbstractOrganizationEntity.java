/**
 * 
 */
package org.drdeesw.commons.organization.models.entities;


import java.time.Instant;
import java.util.Set;
import java.util.stream.Collectors;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;

import org.drdeesw.commons.common.models.entities.AbstractNamedLongUniqueEntity;
import org.drdeesw.commons.organization.models.Account;
import org.drdeesw.commons.organization.models.Organization;
import org.drdeesw.commons.organization.models.OrganizationMember;
import org.drdeesw.commons.organization.models.OrganizationRole;
import org.drdeesw.commons.organization.models.OrganizationStatus;
import org.drdeesw.commons.organization.models.OrganizationType;
import org.drdeesw.commons.security.models.User;
import org.drdeesw.commons.security.models.entities.UserEntity;


/**
 * 
 */
@SuppressWarnings("serial")
@MappedSuperclass
@Access(AccessType.FIELD)
public abstract class AbstractOrganizationEntity extends AbstractNamedLongUniqueEntity
    implements Organization
{

  @OneToMany(fetch = FetchType.LAZY, mappedBy = "parent", cascade = CascadeType.ALL, orphanRemoval = true)
  private Set<OrganizationEntity>       children;
  @ManyToOne
  @JoinColumn(name = "created_by_id", nullable = false)
  private UserEntity                    createdBy;
  @Column(name = "creation_date", nullable = false)
  private Instant                       creationDate;
  @Column(name = "description")
  private String                        description;
  @OneToMany(fetch = FetchType.LAZY, mappedBy = "holder", cascade = CascadeType.ALL, orphanRemoval = true)
  private Set<AccountEntity>            heldAccounts;
  @ManyToOne
  @JoinColumn(name = "last_updated_by_id")
  private UserEntity                    lastUpdatedBy;
  @Column(name = "last_updated_date")
  private Instant                       lastUpdatedDate;
  @OneToMany(fetch = FetchType.LAZY, mappedBy = "organization", cascade = CascadeType.ALL, orphanRemoval = true)
  private Set<OrganizationMemberEntity> members;
  @ManyToOne
  @JoinColumn(name = "parent_id")
  private OrganizationEntity            parent;
  @OneToMany(fetch = FetchType.LAZY, mappedBy = "provider", cascade = CascadeType.ALL, orphanRemoval = true)
  private Set<AccountEntity>            providedAccounts;
  @OneToMany(fetch = FetchType.LAZY, mappedBy = "organization", cascade = CascadeType.ALL, orphanRemoval = true)
  private Set<OrganizationRoleEntity>   roles;
  @Column(name = "status")
  private OrganizationStatus            status;
  @ManyToOne
  @JoinColumn(name = "type_id")
  private OrganizationTypeEntity        type;
  /**
   * 
   */
  protected AbstractOrganizationEntity()
  {
    super();
  }


  @Override
  public Set<Organization> getChildren()
  {
    return this.children.stream()//
        .map(child -> (Organization)child)//
        .collect(Collectors.toSet());
  }


  @Override
  public User getCreatedBy()
  {
    return (User)this.createdBy;
  }


  @Override
  public Instant getCreationDate()
  {
    return this.creationDate;
  }


  @Override
  public String getDescription()
  {
    return description;
  }


  @Override
  public Set<Account> getHeldAccounts()
  {
    return this.heldAccounts.stream()//
        .map(heldAccount -> (Account)heldAccount)//
        .collect(Collectors.toSet());
  }


  @Override
  public Instant getLastUpdateDate()
  {
    return this.lastUpdatedDate;
  }


  @Override
  public User getLastUpdatedBy()
  {
    return (User)this.lastUpdatedBy;
  }


  @Override
  public Set<OrganizationMember> getMembers()
  {
    return this.members.stream()//
        .map(member -> (OrganizationMember)member)//
        .collect(Collectors.toSet());
  }


  /**
   * @return the parent
   */
  @Override
  public Organization getParent()
  {
    return (Organization)parent;
  }


  @Override
  public Set<Account> getProvidedAccounts()
  {
     return this.providedAccounts.stream()//
        .map(providedAccount -> (Account)providedAccount)//
        .collect(Collectors.toSet());
  
  }


  @Override
  public Set<OrganizationRole> getRoles()
  {
    return this.roles.stream()//
        .map(role -> (OrganizationRole)role)//
        .collect(Collectors.toSet());
  }


  /**
   * @return the status
   */
  @Override
  public OrganizationStatus getStatus()
  {
    return status;
  }


  /**
   * @return the type
   */
  @Override
  public OrganizationType getType()
  {
    return type;
  }


  @Override
  public void setChildren(
    Set<Organization> children)
  {
    this.children = children.stream()//
        .map(child -> (OrganizationEntity)child)//
        .collect(Collectors.toSet());
  }


  @Override
  public void setCreatedBy(
    User createdBy)
  {
    this.createdBy = (UserEntity)createdBy;
  }


  @Override
  public void setCreationDate(
    Instant creationDate)
  {
    this.creationDate = creationDate;
  }


  @Override
  public void setDescription(
    String description)
  {
    this.description = description;
  }


  @Override
  public void setHeldAccounts(
    Set<Account> heldAccounts)
  {
    this.heldAccounts = heldAccounts.stream()//
        .map(heldAccount -> (AccountEntity)heldAccount)//
        .collect(Collectors.toSet());
  }


  @Override
  public void setLastUpdateDate(
    Instant lastUpdateDate)
  {
    this.lastUpdatedDate = lastUpdateDate;
  }


  @Override
  public void setLastUpdatedBy(
    User lastUpdatedBy)
  {
    this.lastUpdatedBy = (UserEntity)lastUpdatedBy;
  }


  @Override
  public void setMembers(
    Set<OrganizationMember> members)
  {
    this.members = members.stream()//
        .map(member -> (OrganizationMemberEntity)member)//
        .collect(Collectors.toSet());
  }


  /**
   * @param parent the parent to set
   */
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
    this.providedAccounts = providedAccounts.stream()//
        .map(providedAccount -> (AccountEntity)providedAccount)//
        .collect(Collectors.toSet());
  }


  @Override
  public void setRoles(
    Set<OrganizationRole> roles)
  {
    this.roles = roles.stream()//
        .map(member -> (OrganizationRoleEntity)member)//
        .collect(Collectors.toSet());
  }


  /**
   * @param status the status to set
   */
  @Override
  public void setStatus(
    OrganizationStatus status)
  {
    this.status = status;
  }


  /**
   * @param type the type to set
   */
  @Override
  public void setType(
    OrganizationType type)
  {
    this.type = (OrganizationTypeEntity)type;
  }

}
