package org.drdeesw.commons.organization.models.pojos;


import java.time.Instant;
import java.util.Set;

import org.drdeesw.commons.accounting.models.pojos.AbstractAccountPojo;
import org.drdeesw.commons.common.models.pojos.AbstractNamedLongUniquePojo;
import org.drdeesw.commons.organization.models.Organization;
import org.drdeesw.commons.organization.models.OrganizationStatus;
import org.drdeesw.commons.organization.models.OrganizationType;
import org.drdeesw.commons.security.models.pojos.UserPojo;


/**
 * AbstractOrganizationPojo serves as the middle layer between OrganizationPojo and the interface.
 * This allows the generic structure to exist here while keeping OrganizationPojo non-generic.
 */
@SuppressWarnings("serial")
public abstract class AbstractOrganizationPojo<//
    U extends UserPojo<?>, //
    PC extends AbstractOrganizationPojo<U, ?, ?, ?, ?, ?>, //
    HA extends AbstractAccountPojo<U, ?, ?>, //
    PA extends AbstractOrganizationAccountPojo<U, ?, ?>, //
    M extends AbstractOrganizationMemberPojo<U, ?, ?>, //
    R extends AbstractOrganizationRolePojo<U, ?, ?>> //
    extends AbstractNamedLongUniquePojo implements Organization<U, PC, HA, PA, M, R>
{
  protected Set<PC>            children;
  protected U                  createdBy;
  protected Instant            creationDate;
  protected String             description;
  protected boolean            enabled;
  protected Set<HA>            heldAccounts;
  protected Instant            lastUpdateDate;
  protected U                  lastUpdatedBy;
  protected Set<M>             members;
  protected PC                 parent;
  protected Set<PA>            providedAccounts;
  protected Set<R>             roles;
  protected OrganizationStatus status;
  protected OrganizationType   type;

  protected AbstractOrganizationPojo()
  {
  }


  @Override
  public Set<PC> getChildren()
  {
    return this.children;
  }


  @Override
  public U getCreatedBy()
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
  public Instant getLastUpdateDate()
  {
    return this.lastUpdateDate;
  }


  @Override
  public U getLastUpdatedBy()
  {
    return this.lastUpdatedBy;
  }


  @Override
  public Set<M> getMembers()
  {
    return this.members;
  }


  @Override
  public PC getParent()
  {
    return parent;
  }


  @Override
  public Set<PA> getProvidedAccounts()
  {
    return this.providedAccounts;
  }


  @Override
  public Set<R> getRoles()
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
  public boolean isEnabled()
  {
    return this.enabled;
  }


  @Override
  public void setChildren(
    Set<PC> children)
  {
    this.children = children;
  }


  @Override
  public void setCreatedBy(
    U createdBy)
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
  public void setLastUpdateDate(
    Instant lastUpdateDate)
  {
    this.lastUpdateDate = lastUpdateDate;
  }


  @Override
  public void setLastUpdatedBy(
    U lastUpdatedBy)
  {
    this.lastUpdatedBy = lastUpdatedBy;
  }


  @Override
  public void setMembers(
    Set<M> members)
  {
    this.members = members;
  }


  @Override
  public void setParent(
    PC parent)
  {
    this.parent = parent;
  }


  @Override
  public void setProvidedAccounts(
    Set<PA> accounts)
  {
    this.providedAccounts = accounts;
  }


  @Override
  public void setRoles(
    Set<R> roles)
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
