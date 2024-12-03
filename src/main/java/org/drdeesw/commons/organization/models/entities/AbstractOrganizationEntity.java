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

import org.drdeesw.commons.common.models.Named;
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
public abstract class AbstractOrganizationEntity extends AbstractAccountHolderEntity
    implements Organization
{
  @OneToMany(fetch = FetchType.LAZY, mappedBy = "organization", cascade = CascadeType.ALL, orphanRemoval = true)
  private Set<AccountEntity>            accounts;
  @OneToMany(fetch = FetchType.LAZY, mappedBy = "parent", cascade = CascadeType.ALL, orphanRemoval = true)
  private Set<OrganizationEntity>       children;
  @ManyToOne
  @JoinColumn(name = "created_by_id", nullable = false)
  private UserEntity                    createdBy;
  @Column(name = "creation_date", nullable = false)
  private Instant                       creationDate;
  @Column(name = "description")
  private String                        description;
  @ManyToOne
  @JoinColumn(name = "last_updated_by_id")
  private UserEntity                    lastUpdatedBy;
  @Column(name = "last_updated_date")
  private Instant                       lastUpdatedDate;
  @OneToMany(fetch = FetchType.LAZY, mappedBy = "organization", cascade = CascadeType.ALL, orphanRemoval = true)
  private Set<OrganizationMemberEntity> members;
  @Column(name = "name")
  private String                        name;
  @ManyToOne
  @JoinColumn(name = "parent_id")
  private OrganizationEntity            parent;
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
  public Set<Account> getAccounts()
  {
    return this.accounts.stream()//
        .map(child -> (Account)child)//
        .collect(Collectors.toSet());
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
  public User getLastUpdatedBy()
  {
    return (User)this.lastUpdatedBy;
  }


  @Override
  public Instant getLastUpdatedDate()
  {
    return this.lastUpdatedDate;
  }


  @Override
  public Set<OrganizationMember> getMembers()
  {
    return this.members.stream()//
        .map(member -> (OrganizationMember)member)//
        .collect(Collectors.toSet());
  }


  @Override
  public String getName()
  {
    return this.name;
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
  public void setAccounts(
    Set<Account> accounts)
  {
    this.accounts = accounts.stream()//
        .map(account -> (AccountEntity)account)//
        .collect(Collectors.toSet());
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
  public void setLastUpdatedBy(
    User lastUpdatedBy)
  {
    this.lastUpdatedBy = (UserEntity)lastUpdatedBy;
  }


  @Override
  public void setLastUpdatedDate(
    Instant lastUpdateDate)
  {
    this.lastUpdatedDate = lastUpdateDate;
  }


  @Override
  public void setMembers(
    Set<OrganizationMember> members)
  {
    this.members = members.stream()//
        .map(member -> (OrganizationMemberEntity)member)//
        .collect(Collectors.toSet());
  }


  @Override
  public <NO extends Named> NO setName(
    String name)
  {
    this.name = name;

    return (NO)this;
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
