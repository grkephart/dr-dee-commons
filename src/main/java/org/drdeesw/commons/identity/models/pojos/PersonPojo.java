/**
 * 
 */
package org.drdeesw.commons.identity.models.pojos;


import java.time.Instant;
import java.util.Set;
import java.util.stream.Collectors;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.drdeesw.commons.accounting.models.pojos.AccountHolderPojo;
import org.drdeesw.commons.accounting.models.pojos.AccountPojo;
import org.drdeesw.commons.security.models.pojos.UserPojo;


/**
 * 
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "persons")
public class PersonPojo<//
    U extends UserPojo<?>> //
    extends AccountHolderPojo<U>
{
  private U                createdBy;
  private Instant          creationDate;
  private String           description;
  private boolean          enabled;
  private Set<AccountPojo> heldAccounts;
  private Instant          lastUpdateDate;
  private U                lastUpdatedBy;

  /**
   * @return the createdBy
   */
  @Override
  public U getCreatedBy()
  {
    return createdBy;
  }


  /**
   * @return the creationDate
   */
  @Override
  public Instant getCreationDate()
  {
    return creationDate;
  }


  /**
   * @return the description
   */
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


  /**
   * @return the lastUpdateDate
   */
  @Override
  public Instant getLastUpdateDate()
  {
    return lastUpdateDate;
  }


  /**
   * @return the lastUpdatedBy
   */
  @Override
  public U getLastUpdatedBy()
  {
    return lastUpdatedBy;
  }


  /**
   * @return the enabled
   */
  @Override
  public boolean isEnabled()
  {
    return enabled;
  }


  /**
   * @param createdBy the createdBy to set
   */
  @Override
  public void setCreatedBy(
    U createdBy)
  {
    this.createdBy = createdBy;
  }


  /**
   * @param creationDate the creationDate to set
   */
  @Override
  public void setCreationDate(
    Instant creationDate)
  {
    this.creationDate = creationDate;
  }


  /**
   * @param description the description to set
   */
  @Override
  public void setDescription(
    String description)
  {
    this.description = description;
  }


  /**
   * @param enabled the enabled to set
   */
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


  /**
   * @param lastUpdateDate the lastUpdateDate to set
   */
  @Override
  public void setLastUpdateDate(
    Instant lastUpdateDate)
  {
    this.lastUpdateDate = lastUpdateDate;
  }


  /**
   * @param lastUpdatedBy the lastUpdatedBy to set
   */
  @Override
  public void setLastUpdatedBy(
    U lastUpdatedBy)
  {
    this.lastUpdatedBy = lastUpdatedBy;
  }

}
