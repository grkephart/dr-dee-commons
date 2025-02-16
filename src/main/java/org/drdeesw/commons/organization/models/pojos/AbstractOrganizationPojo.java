package org.drdeesw.commons.organization.models.pojos;


import java.time.Instant;
import java.util.Set;

import org.drdeesw.commons.accounting.models.pojos.BaseAccountPojo;
import org.drdeesw.commons.common.models.pojos.AbstractNamedLongUniquePojo;
import org.drdeesw.commons.organization.models.OrganizationStatus;
import org.drdeesw.commons.organization.models.OrganizationType;
import org.drdeesw.commons.security.models.pojos.BaseUserPojo;


/**
 * AbstractOrganizationPojo serves as the middle layer between OrganizationPojo and the interface.
 * This allows the generic structure to exist here while keeping OrganizationPojo non-generic.
 */
@SuppressWarnings("serial")
public abstract class AbstractOrganizationPojo<//
    U extends BaseUserPojo<?>, //
    PC extends BaseOrganizationPojo<U, PC, HA, PA, M, R>, //
    HA extends BaseAccountPojo<U, ?, ?>, //
    PA extends BaseOrganizationAccountPojo<U, ?, ?>, //
    M extends BaseOrganizationMemberPojo<U, ?, ?>, //
    R extends BaseOrganizationRolePojo<U, ?, ?>> //
    extends AbstractNamedLongUniquePojo implements BaseOrganizationPojo<U, PC, HA, PA, M, R>
{
  private Set<PC>            children;
  private U                  createdBy;
  private Instant            creationDate;
  private String             description;
  private boolean            enabled;
  private Set<HA>            heldAccounts;
  private Instant            lastUpdateDate;
  private U                  lastUpdatedBy;
  private Set<M>             members;
  private PC                 parent;
  private Set<PA>            providedAccounts;
  private Set<R>             roles;
  private OrganizationStatus status;
  private OrganizationType   type;

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


  /**
   * @return the heldAccounts
   */
  public Set<HA> getHeldAccounts()
  {
    return heldAccounts;
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


  /**
   * @param heldAccounts the heldAccounts to set
   */
  public void setHeldAccounts(
    Set<HA> heldAccounts)
  {
    this.heldAccounts = heldAccounts;
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
