package org.drdeesw.commons.accounting.models.pojos;


import java.time.Instant;
import java.util.Set;

import org.drdeesw.commons.common.models.pojos.AbstractNamedLongUniquePojo;
import org.drdeesw.commons.security.models.pojos.BaseUserPojo;


@SuppressWarnings("serial")
public abstract class AbstractAccountHolderPojo<//
    U extends BaseUserPojo<?>, //
    HA extends BaseAccountPojo<U, ?, ?>> //
    extends AbstractNamedLongUniquePojo implements BaseAccountHolderPojo<U, HA>
{
  protected U       createdBy;
  protected Instant creationDate;
  protected String  description;
  protected boolean enabled;
  protected Set<HA>  heldAccounts;
  protected Instant lastUpdateDate;
  protected U       lastUpdatedBy;

  protected AbstractAccountHolderPojo()
  {
    super();
  }


  protected AbstractAccountHolderPojo(Long id)
  {
    super(id);
  }


  @Override
  public U getCreatedBy()
  {
    return createdBy;
  }


  @Override
  public Instant getCreationDate()
  {
    return creationDate;
  }


  @Override
  public String getDescription()
  {
    return description;
  }


  @Override
  public Set<HA> getHeldAccounts()
  {
    return this.heldAccounts;
  }


  @Override
  public Instant getLastUpdateDate()
  {
    return lastUpdateDate;
  }


  @Override
  public U getLastUpdatedBy()
  {
    return lastUpdatedBy;
  }


  @Override
  public boolean isEnabled()
  {
    return enabled;
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
  public void setHeldAccounts(
    Set<HA> accounts)
  {
    this.heldAccounts = accounts;
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
}
