/**
 * 
 */
package org.drdeesw.commons.accounting.models.pojos;


import java.time.Instant;

import org.drdeesw.commons.accounting.models.Account;
import org.drdeesw.commons.common.models.pojos.AbstractNamedLongUniquePojo;
import org.drdeesw.commons.security.models.pojos.UserPojo;


/**
 * 
 */
@SuppressWarnings("serial")
public abstract class AccountPojo<U extends UserPojo<?>, H extends AccountHolderPojo<U>, P extends AccountProviderPojo<U, ?>>
    extends AbstractNamedLongUniquePojo implements Account<U, H, P>
{
  private boolean active;
  private U       createdBy;
  private Instant creationDate;
  private String  description;
  private H       holder;
  private String  internalId;
  private U       lastUpdatedBy;
  private Instant lastUpdatedDate;
  private P       provider;
  private U       user;

  public AccountPojo()
  {
  }


  public AccountPojo(H holder, String internalId)
  {
    this.holder = holder;
    this.internalId = internalId;
  }


  public AccountPojo(P provider, String internalId)
  {
    this.provider = provider;
    this.internalId = internalId;
  }


  public AccountPojo(String internalId)
  {
    this.internalId = internalId;
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
    return this.description;
  }


  @Override
  public H getHolder()
  {
    return holder;
  }


  @Override
  public String getInternalId()
  {
    return this.internalId;
  }


  @Override
  public Instant getLastUpdateDate()
  {
    return lastUpdatedDate;
  }


  @Override
  public U getLastUpdatedBy()
  {
    return this.lastUpdatedBy;
  }


  @Override
  public P getProvider()
  {
    return provider;
  }


  @Override
  public U getUser()
  {
    return this.user;
  }


  @Override
  public boolean isActive()
  {
    return this.active;
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
    Instant lastUpdatedDate)
  {
    this.lastUpdatedDate = lastUpdatedDate;
  }


  @Override
  public void setLastUpdatedBy(
    U lastUpdatedBy)
  {
    this.lastUpdatedBy = lastUpdatedBy;
  }


  @Override
  public void setProvider(
    P provider)
  {
    this.provider = provider;
  }


  @Override
  public void setUser(
    U user)
  {
    this.user = user;
  }

}
