/**
 * 
 */
package org.drdeesw.commons.accounting.models.pojos;


import java.time.Instant;
import java.util.Set;

import org.drdeesw.commons.accounting.models.AccountHolder;
import org.drdeesw.commons.common.models.pojos.AbstractNamedLongUniquePojo;
import org.drdeesw.commons.security.models.User;


/**
 * 
 */
@SuppressWarnings("serial")
public abstract class AccountHolderPojo<A extends AccountPojo, U extends User<?>> extends AbstractNamedLongUniquePojo
    implements AccountHolder<A, U>
{
  private U createdBy;
  private Instant    creationDate;
  private String     description;
  private boolean    enabled;
  private Set<A>     heldAccounts;
  private Instant    lastUpdateDate;
  private U lastUpdatedBy;

  public AccountHolderPojo()
  {
    super();
  }


  public AccountHolderPojo(Long id)
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
  public Set<A> getHeldAccounts()
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
    Set<A> accounts)
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
