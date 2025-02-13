package org.drdeesw.commons.identity.models.pojos;


import java.time.Instant;
import java.util.Set;

import org.drdeesw.commons.accounting.models.pojos.AbstractAccountPojo;
import org.drdeesw.commons.common.models.pojos.AbstractNamedLongUniquePojo;
import org.drdeesw.commons.identity.models.Person;
import org.drdeesw.commons.security.models.pojos.AbstractUserPojo;


@SuppressWarnings("serial")
public abstract class AbstractPersonPojo<//
    U extends AbstractUserPojo<?>, //
    HA extends AbstractAccountPojo<U, ?, ?>> // Matches held accounts type
    extends AbstractNamedLongUniquePojo implements Person<U, HA>
{
  protected U       createdBy;
  protected Instant creationDate;
  private String    description;
  protected boolean enabled;
  protected Set<HA> heldAccounts;
  protected Instant lastUpdateDate;
  protected U       lastUpdatedBy;

  protected AbstractPersonPojo()
  {
  }


  protected AbstractPersonPojo(Long id)
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


  /**
   * @return the description
   */
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
    return this.enabled;
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


  /**
   * @param description the description to set
   */
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
}
