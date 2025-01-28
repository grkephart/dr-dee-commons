/**
 * 
 */
package org.drdeesw.commons.organization.models.pojos;


import java.time.Instant;
import java.util.Set;
import java.util.stream.Collectors;

import org.drdeesw.commons.accounting.models.pojos.AccountPojo;
import org.drdeesw.commons.common.models.pojos.AbstractNamedLongUniquePojo;
import org.drdeesw.commons.organization.models.Organization;
import org.drdeesw.commons.organization.models.OrganizationMember;
import org.drdeesw.commons.organization.models.OrganizationRole;
import org.drdeesw.commons.organization.models.OrganizationStatus;
import org.drdeesw.commons.organization.models.OrganizationType;
import org.drdeesw.commons.security.models.User;
import org.drdeesw.commons.security.models.pojos.UserPojo;


/**
 * 
 */
@SuppressWarnings("serial")
public class OrganizationPojo extends AbstractNamedLongUniquePojo implements Organization<OrganizationAccountPojo, OrganizationMemberPojo, OrganizationRolePojo>
{
  private Set<OrganizationPojo>           children;
  private UserPojo                        createdBy;
  private Instant                         creationDate;
  private String                          description;
  private boolean                         enabled;
  private Set<AccountPojo>                heldAccounts;
  private Instant                         lastUpdateDate;
  private UserPojo                        lastUpdatedBy;
  private Set<OrganizationMemberPojo>     members;
  private OrganizationPojo                parent;
  private Set<OrganizationAccountPojo>                providedAccounts;
  private Set<OrganizationRolePojo>       roles;
  private OrganizationStatus              status;
  private OrganizationType                type;

  @Override
  public Set<OrganizationPojo> getChildren()
  {
    return this.children;

  }


  @Override
  public UserPojo getCreatedBy()
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
  public Set<AccountPojo> getHeldAccounts()
  {
    return this.heldAccounts;
  }


  @Override
  public Instant getLastUpdateDate()
  {
    return this.lastUpdateDate;
  }


  @Override
  public UserPojo getLastUpdatedBy()
  {
    return this.lastUpdatedBy;
  }


  @Override
  public Set<OrganizationMemberPojo> getMembers()
  {
    return this.members;
  }


  @Override
  public OrganizationPojo getParent()
  {
    return parent;
  }


  @Override
  public Set<OrganizationAccountPojo> getProvidedAccounts()
  {
    return this.providedAccounts;
  }


  @Override
  public Set<OrganizationRolePojo> getRoles()
  {
    return this.role;
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
    Set<OrganizationPojo> children)
  {
    this.children = children;
  }


  @Override
  public void setCreatedBy(
    UserPojo createdBy)
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
  public void setEnabled(
    boolean enabled)
  {
    this.enabled = enabled;
  }


  @Override
  public void setHeldAccounts(
    Set<AccountPojo> accounts)
  {
    this.heldAccounts = accounts.stream()//
        .map(account -> (AccountPojo)account)//
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
    UserPojo lastUpdatedBy)
  {
    this.lastUpdatedBy = lastUpdatedBy;
  }


  @Override
  public void setMembers(
    Set<OrganizationMemberPojo> members)
  {
    this.members = members;
  }


  @Override
  public void setParent(
    OrganizationPojo parent)
  {
    this.parent = parent;
  }


  @Override
  public void setProvidedAccounts(
    Set<OrganizationAccountPojo> accounts)
  {
    this.providedAccounts = accounts;
  }


  @Override
  public void setRoles(
    Set<OrganizationRolePojo> roles)
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
