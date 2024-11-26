/**
 * 
 */
package org.drdeesw.commons.organization.models.entities;


import java.time.Instant;
import java.util.Set;
import java.util.stream.Collectors;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;

import org.drdeesw.commons.common.models.entities.AbstractNamedLongUniqueEntity;
import org.drdeesw.commons.organization.models.Organization;
import org.drdeesw.commons.organization.models.OrganizationAccount;
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
public abstract class AbstractOrganizationEntity<A extends OrganizationAccount>
    extends AbstractNamedLongUniqueEntity implements Organization<A>
{
  @OneToMany(fetch = FetchType.LAZY, mappedBy = "organization")
  private Set<OrganizationAccountEntity> accounts;
  @OneToMany(fetch = FetchType.LAZY, mappedBy = "parent")
  private Set<OrganizationEntity>        children;
  @ManyToOne
  @JoinColumn(name = "created_by_id", nullable = false)
  private UserEntity                     createdBy;
  @Column(name = "creation_date", nullable = false)
  private Instant                        creationDate;
  @Column(name = "description")
  private String                         description;
  @Column(name = "last_updated_date")
  private Instant                        lastUpdatedDate;
  @ManyToOne
  @JoinColumn(name = "last_updated_by_id")
  private UserEntity                     lastUpdatedBy;
  @OneToMany(fetch = FetchType.LAZY, mappedBy = "organization")
  private Set<OrganizationMemberEntity>  members;
  @ManyToOne
  @JoinColumn(name = "parent_id")
  private OrganizationEntity             parent;
  @OneToMany(fetch = FetchType.LAZY, mappedBy = "organization")
  private Set<OrganizationRoleEntity>    roles;
  @Column(name = "status")
  private OrganizationStatus             status;
  @ManyToOne
  @JoinColumn(name = "type_id")
  private OrganizationTypeEntity         type;

  /**
   * 
   */
  protected AbstractOrganizationEntity()
  {
    super();
  }


  @SuppressWarnings("unchecked")
  @Override
  public Set<A> getAccounts()
  {
    return this.accounts.stream()//
        .map(account -> (A)account)//
        .collect(Collectors.toSet());
  }


  @SuppressWarnings("unchecked")
  @Override
  public Set<Organization<A>> getChildren()
  {
    return this.children.stream()//
        .map(child -> (Organization<A>)child)//
        .collect(Collectors.toSet());
  }


  @Override
  public User getCreatedBy()
  {
    return this.createdBy;
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
  public Instant getLastUpdatedDate()
  {
    return this.lastUpdatedDate;
  }


  @Override
  public User getLastUpdatedBy()
  {
    return this.lastUpdatedBy;
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
  @SuppressWarnings("unchecked")
  @Override
  public Organization<A> getParent()
  {
    return (Organization<A>)parent;
  }


  @Override
  public Set<OrganizationRole> getRoles()
  {
    return this.roles.stream()//
        .map(member -> (OrganizationRole)member)//
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
    Set<A> accounts)
  {
    this.accounts = accounts.stream()//
        .map(account -> (OrganizationAccountEntity)account)//
        .collect(Collectors.toSet());

  }


  @Override
  public void setChildren(
    Set<Organization<A>> children)
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
  public void setLastUpdatedDate(
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
    Organization<A> parent)
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
