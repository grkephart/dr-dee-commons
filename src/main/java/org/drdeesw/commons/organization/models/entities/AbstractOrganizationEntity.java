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


/**
 * 
 */
@SuppressWarnings("serial")
@MappedSuperclass
@Access(AccessType.FIELD)
public abstract class AbstractOrganizationEntity<A extends OrganizationAccountEntity<?>> extends AbstractNamedLongUniqueEntity
    implements Organization<A>
{
  @OneToMany(fetch = FetchType.LAZY, mappedBy = "organization")
  private Set<OrganizationAccount<?>> accounts;
  @Column(name = "created_by_id", nullable = false)
  private Long                           createdById;
  @Column(name = "creation_date", nullable = false)
  private Instant                        creationDate;
  @Column(name = "description")
  private String                         description;
  @Column(name = "last_update_date")
  private Instant                        lastUpdateDate;
  @Column(name = "last_update_id")
  private Long                           lastUpdateId;
  @OneToMany(fetch = FetchType.LAZY, mappedBy = "organization")
  private Set<OrganizationMemberEntity>  members;
  @Column(name = "parent_id")
  private AbstractOrganizationEntity<?>             parent;
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


  @Override
  public AccountHolderType getAccountHolderType()
  {
    return AccountHolderType.ORGANIZATION;
  }


  @Override
  public Set<A> getAccounts()
  {
    return this.accounts.stream()//
        .map(account -> (A)account)//
        .collect(Collectors.toSet());
  }


  @Override
  public Long getCreatedById()
  {
    return this.createdById;
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
  public Instant getLastUpdateDate()
  {
    return this.lastUpdateDate;
  }


  @Override
  public Long getLastUpdateId()
  {
    return this.lastUpdateId;
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
  public Organization<?> getParent()
  {
    return parent;
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
    Set<OrganizationAccount<?>> accounts)
  {
    this.accounts = accounts.stream()//
    .map(account -> (OrganizationAccount<?>)account)//
    .collect(Collectors.toSet());

  }
  

  @Override
  public void setCreatedById(
    Long createdById)
  {
    this.createdById = createdById;
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
  public void setLastUpdateDate(
    Instant lastUpdateDate)
  {
    this.lastUpdateDate = lastUpdateDate;
  }


  @Override
  public void setLastUpdateId(
    Long lastUpdateId)
  {
    this.lastUpdateId = lastUpdateId;
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
    Organization<?> parent)
  {
    this.parent = (AbstractOrganizationEntity<?>)parent;
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
