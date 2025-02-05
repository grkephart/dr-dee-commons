/**
 * 
 */
package org.drdeesw.commons.accounting.models.pojos;


import java.time.Instant;
import java.util.Set;

import org.drdeesw.commons.accounting.models.AccountProvider;
import org.drdeesw.commons.common.models.pojos.AbstractNamedLongUniquePojo;
import org.drdeesw.commons.security.models.User;
import org.drdeesw.commons.security.models.pojos.UserPojo;


/**
 * 
 */
@SuppressWarnings("serial")
public class AccountProviderPojo<A extends AccountPojo, U extends UserPojo> extends AbstractNamedLongUniquePojo
    implements AccountProvider<A, U>
{
  private UserPojo createdBy;
  private Instant  creationDate;
  private String   description;
  private boolean  enabled;
  private Instant  lastUpdateDate;
  private UserPojo lastUpdatedBy;
  private Set<A>   providedAccounts;

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
    return this.description;
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
  public Set<A> getProvidedAccounts()
  {
    return (Set<A>)this.providedAccounts;
  }


  @Override
  public boolean isEnabled()
  {
    return this.enabled;
  }


  @Override
  public void setCreatedBy(
    User<?> createdBy)
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
  public void setLastUpdateDate(
    Instant lastUpdateDate)
  {
    this.lastUpdateDate = lastUpdateDate;
  }


  @Override
  public void setLastUpdatedBy(
    User<?> lastUpdatedBy)
  {
    this.lastUpdatedBy = (UserPojo)lastUpdatedBy;
  }


  @Override
  public void setProvidedAccounts(
    Set<A> providedAccounts)
  {
    this.providedAccounts = (Set<A>)providedAccounts;
  }

}
