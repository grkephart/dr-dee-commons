package org.drdeesw.commons.accounting.models.pojos;


import java.time.Instant;

import org.drdeesw.commons.accounting.models.Account;
import org.drdeesw.commons.common.models.pojos.AbstractNamedLongUniquePojo;
import org.drdeesw.commons.security.models.pojos.AbstractUserPojo;


@SuppressWarnings("serial")
public abstract class AbstractAccountPojo<//
    U extends AbstractUserPojo<?>, //
    H extends AbstractAccountHolderPojo<U, ?>, //
    P extends AbstractAccountProviderPojo<U, ?>> //
    extends AbstractNamedLongUniquePojo implements Account<U, H, P>
{
  private boolean active;
  private U       createdBy;
  private Instant creationDate;
  private String  description;
  private boolean enabled;
  private H       holder;
  private String  internalId;
  private Instant lastUpdateDate;
  private U       lastUpdatedBy;
  private P       provider;
  private U       user;

  protected AbstractAccountPojo()
  {
    super();
  }


  protected AbstractAccountPojo(H holder, String internalId)
  {
    this.holder = holder;
    this.internalId = internalId;
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
  public H getHolder()
  {
    return holder;
  }


  @Override
  public String getInternalId()
  {
    return internalId;
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
  public P getProvider()
  {
    return provider;
  }


  /**
   * @return the user
   */
  public U getUser()
  {
    return user;
  }


  @Override
  public boolean isActive()
  {
    return this.active;
  }


  @Override
  public boolean isEnabled()
  {
    return enabled;
  }


  @Override
  public void setActive(
    boolean active)
  {
    this.active = active;
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
  public void setHolder(
    H accountHolder)
  {
    this.holder = accountHolder;
  }


  @Override
  public void setInternalId(
    String internalId)
  {
    this.internalId = internalId;
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
  public void setProvider(
    P accountProvider)
  {
    this.provider = accountProvider;
  }


  /**
   * @param user the user to set
   */
  public void setUser(
    U user)
  {
    this.user = user;
  }
}
