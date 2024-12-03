/**
 * 
 */
package org.drdeesw.commons.organization.models.pojos;


import java.time.Instant;
import java.util.Set;
import java.util.stream.Collectors;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.drdeesw.commons.common.models.Named;
import org.drdeesw.commons.organization.models.Account;
import org.drdeesw.commons.organization.models.Organization;
import org.drdeesw.commons.organization.models.OrganizationMember;
import org.drdeesw.commons.organization.models.OrganizationRole;
import org.drdeesw.commons.organization.models.OrganizationStatus;
import org.drdeesw.commons.organization.models.OrganizationType;
import org.drdeesw.commons.security.models.User;


/**
 * 
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "organizations")
public class OrganizationPojo extends AccountHolderPojo implements Organization
{
  private Set<OrganizationAccountPojo> accounts;
  private Set<Organization>            children;
  private User                         createdBy;
  private Instant                      creationDate;
  private String                       description;
  private Instant                      lastUpdateDate;
  private User                         lastUpdatedBy;
  private Set<OrganizationMember>      members;
  private String                       name;
  private Organization                 parent;
  private Set<OrganizationRole>        roles;
  private OrganizationStatus           status;
  private OrganizationType             type;

  @Override
  public Set<Account> getAccounts()
  {
    return this.accounts.stream()//
        .map(account -> (Account)account)//
        .collect(Collectors.toSet());
  }


  @Override
  public Set<Organization> getChildren()
  {
    return children;
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
  public User getLastUpdatedBy()
  {
    return this.lastUpdatedBy;
  }


  @Override
  public Instant getLastUpdatedDate()
  {
    return this.lastUpdateDate;
  }


  @Override
  public Set<OrganizationMember> getMembers()
  {
    return members;
  }


  @Override
  public String getName()
  {
    return name;
  }


  @Override
  public Organization getParent()
  {
    return parent;
  }


  @Override
  public Set<OrganizationRole> getRoles()
  {
    return this.roles;
  }


  @Override
  public OrganizationStatus getStatus()
  {
    return status;
  }


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
        .map(account -> (OrganizationAccountPojo)account)//
        .collect(Collectors.toSet());
  }


  @Override
  public void setChildren(
    Set<Organization> children)
  {
    this.children = children;
  }


  @Override
  public void setCreatedBy(
    User createdBy)
  {
    this.createdBy = createdBy;
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
    User lastUpdateId)
  {
    this.lastUpdatedBy = lastUpdateId;
  }


  @Override
  public void setLastUpdatedDate(
    Instant lastUpdateDate)
  {
    this.lastUpdateDate = lastUpdateDate;
  }


  @Override
  public void setMembers(
    Set<OrganizationMember> members)
  {
    this.members = members;
  }


  @Override
  public <NO extends Named> NO setName(
    String name)
  {
    this.name = name;
    return (NO)this;
  }


  @Override
  public void setParent(
    Organization parent)
  {
    this.parent = parent;
  }


  @Override
  public void setRoles(
    Set<OrganizationRole> roles)
  {
    this.roles = roles;
  }


  @Override
  public void setStatus(
    OrganizationStatus status)
  {
    this.status = status;
  }


  @Override
  public void setType(
    OrganizationType type)
  {
    this.type = type;
  }
}
