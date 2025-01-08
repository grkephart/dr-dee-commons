/**
 * 
 */
package org.drdeesw.commons.organization.models.pojos;


import java.time.Instant;
import java.util.Set;
import java.util.stream.Collectors;

import org.drdeesw.commons.accounting.models.Account;
import org.drdeesw.commons.accounting.models.pojos.AccountPojo;
import org.drdeesw.commons.common.models.pojos.AbstractNamedLongUniquePojo;
import org.drdeesw.commons.organization.models.Organization;
import org.drdeesw.commons.organization.models.OrganizationAccount;
import org.drdeesw.commons.organization.models.OrganizationMember;
import org.drdeesw.commons.organization.models.OrganizationRole;
import org.drdeesw.commons.organization.models.OrganizationStatus;
import org.drdeesw.commons.organization.models.OrganizationType;
import org.drdeesw.commons.security.models.User;
import org.drdeesw.commons.security.models.pojos.UserPojo;
import org.drdeesw.commons.serviceproviders.models.ServiceProviderAccount;
import org.drdeesw.commons.serviceproviders.models.pojos.ServiceProviderAccountPojo;


/**
 * 
 */
@SuppressWarnings("serial")
public class OrganizationPojo extends AbstractNamedLongUniquePojo implements Organization
{
  private Set<OrganizationPojo>           children;
  private UserPojo                        createdBy;
  private Instant                         creationDate;
  private String                          description;
  private boolean                         enabled;
  private Set<AccountPojo>                heldAccounts;
  private Set<OrganizationAccountPojo>    heldOrganizationAccounts;
  private Set<ServiceProviderAccountPojo> heldServiceProviderAccounts;
  private Instant                         lastUpdateDate;
  private UserPojo                        lastUpdatedBy;
  private Set<OrganizationMemberPojo>     members;
  private OrganizationPojo                parent;
  private Set<AccountPojo>                providedAccounts;
  private Set<OrganizationAccountPojo>    providedOrganizationAccounts;
  private Set<ServiceProviderAccountPojo> providedServiceProviderAccounts;
  private Set<OrganizationRolePojo>       roles;
  private OrganizationStatus              status;
  private OrganizationType                type;

  @Override
  public Set<Organization> getChildren()
  {
    return this.children.stream()//
        .map(account -> (Organization)account)//
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
  public Set<Account> getHeldAccounts()
  {
    return this.heldAccounts.stream()//
        .map(account -> (Account)account)//
        .collect(Collectors.toSet());
  }


  @Override
  public Set<OrganizationAccount> getHeldOrganizationAccounts()
  {
    return this.heldOrganizationAccounts.stream()//
        .map(account -> (OrganizationAccount)account)//
        .collect(Collectors.toSet());
  }


  @Override
  public Set<ServiceProviderAccount> getHeldServiceProviderAccounts()
  {
    return this.heldServiceProviderAccounts.stream()//
        .map(account -> (ServiceProviderAccount)account)//
        .collect(Collectors.toSet());
  }


  @Override
  public Instant getLastUpdateDate()
  {
    return this.lastUpdateDate;
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


  @Override
  public Organization getParent()
  {
    return parent;
  }


  @Override
  public Set<Account> getProvidedAccounts()
  {
    return this.providedAccounts.stream()//
        .map(account -> (Account)account)//
        .collect(Collectors.toSet());
  }


  @Override
  public Set<OrganizationAccount> getProvidedOrganizationAccounts()
  {
    return this.providedOrganizationAccounts.stream()//
        .map(account -> (OrganizationAccount)account)//
        .collect(Collectors.toSet());
  }


  @Override
  public Set<ServiceProviderAccount> getProvidedServiceProviderAccounts()
  {
    return this.providedServiceProviderAccounts.stream()//
        .map(account -> (ServiceProviderAccount)account)//
        .collect(Collectors.toSet());
  }


  @Override
  public Set<OrganizationRole> getRoles()
  {
    return this.roles.stream()//
        .map(role -> (OrganizationRole)role)//
        .collect(Collectors.toSet());
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
  public boolean isEnabled()
  {
    return this.enabled;
  }


  @Override
  public void setChildren(
    Set<Organization> children)
  {
    this.children = children.stream()//
        .map(account -> (OrganizationPojo)account)//
        .collect(Collectors.toSet());
  }


  @Override
  public void setCreatedBy(
    User createdBy)
  {
    this.createdBy = (UserPojo)createdBy;
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
  public void setEnabled(
    boolean enabled)
  {
    this.enabled = enabled;
  }


  @Override
  public void setHeldAccounts(
    Set<Account> accounts)
  {
    this.heldAccounts = accounts.stream()//
        .map(account -> (AccountPojo)account)//
        .collect(Collectors.toSet());
  }


  @Override
  public void setHeldOrganizationAccounts(
    Set<OrganizationAccount> accounts)
  {
    this.heldOrganizationAccounts = accounts.stream()//
        .map(account -> (OrganizationAccountPojo)account)//
        .collect(Collectors.toSet());
  }


  @Override
  public void setHeldServiceProviderAccounts(
    Set<ServiceProviderAccount> accounts)
  {
    this.heldServiceProviderAccounts = accounts.stream()//
        .map(account -> (ServiceProviderAccountPojo)account)//
        .collect(Collectors.toSet());
  }


  @Override
  public void setLastUpdateDate(
    Instant lastUpdateDate)
  {
    this.lastUpdateDate = lastUpdateDate;
  }


  @Override
  public void setLastUpdatedBy(
    User lastUpdateId)
  {
    this.lastUpdatedBy = (UserPojo)lastUpdateId;
  }


  @Override
  public void setMembers(
    Set<OrganizationMember> members)
  {
    this.members = members.stream()//
        .map(member -> (OrganizationMemberPojo)member)//
        .collect(Collectors.toSet());
  }


  @Override
  public void setParent(
    Organization parent)
  {
    this.parent = (OrganizationPojo)parent;
  }


  @Override
  public void setProvidedAccounts(
    Set<Account> accounts)
  {
    this.providedAccounts = accounts.stream()//
        .map(account -> (AccountPojo)account)//
        .collect(Collectors.toSet());
  }


  @Override
  public void setProvidedOrganizationAccounts(
    Set<OrganizationAccount> accounts)
  {
    this.providedOrganizationAccounts = accounts.stream()//
        .map(account -> (OrganizationAccountPojo)account)//
        .collect(Collectors.toSet());
  }


  @Override
  public void setProvidedServiceProviderAccounts(
    Set<ServiceProviderAccount> accounts)
  {
    this.providedServiceProviderAccounts = accounts.stream()//
        .map(account -> (ServiceProviderAccountPojo)account)//
        .collect(Collectors.toSet());
  }


  @Override
  public void setRoles(
    Set<OrganizationRole> roles)
  {
    this.roles = roles.stream()//
        .map(role -> (OrganizationRolePojo)role)//
        .collect(Collectors.toSet());
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
