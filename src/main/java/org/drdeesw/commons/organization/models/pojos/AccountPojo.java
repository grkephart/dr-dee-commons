/**
 * 
 */
package org.drdeesw.commons.organization.models.pojos;


import java.time.Instant;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.MappedSuperclass;

import org.drdeesw.commons.common.models.pojos.AbstractNamedLongUniquePojo;
import org.drdeesw.commons.organization.models.Account;
import org.drdeesw.commons.organization.models.AccountHolder;
import org.drdeesw.commons.security.models.User;
import org.drdeesw.commons.security.models.pojos.UserPojo;


/**
 * 
 */
@SuppressWarnings("serial")
@MappedSuperclass
@Access(AccessType.FIELD)
public abstract class AccountPojo extends AbstractNamedLongUniquePojo implements Account
{
  private AccountHolderPojo accountHolder;
  private boolean           active;
  private UserPojo          createdBy;
  private Instant           creationDate;
  private String            description;
  private Instant           lastUpdateDate;
  private UserPojo          lastUpdatedBy;

  @Override
  public AccountHolder getHolder()
  {
    return accountHolder;
  }


  @Override
  public User getCreatedBy()
  {
    return (User)this.createdBy;
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


  /**
   * @return the lastUpdateDate
   */
  public Instant getLastUpdateDate()
  {
    return lastUpdateDate;
  }


  @Override
  public User getLastUpdatedBy()
  {
    return (User)this.lastUpdatedBy;
  }


  @Override
  public Instant getLastUpdatedDate()
  {
    return this.lastUpdateDate;
  }


  @Override
  public boolean isActive()
  {
    return this.active;
  }


  @Override
  public void setHolder(
    AccountHolder accountHolder)
  {
    this.accountHolder = (AccountHolderPojo)accountHolder;
  }


  @Override
  public void setActive(
    boolean active)
  {
    this.active = active;
  }


  @Override
  public void setCreatedBy(
    User createdBy)
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


  /**
   * @param lastUpdateDate the lastUpdateDate to set
   */
  public void setLastUpdateDate(
    Instant lastUpdateDate)
  {
    this.lastUpdateDate = lastUpdateDate;
  }


  @Override
  public void setLastUpdatedBy(
    User lastUpdatedBy)
  {
    this.lastUpdatedBy = (UserPojo)lastUpdatedBy;
  }


  @Override
  public void setLastUpdatedDate(
    Instant lastUpdatedDate)
  {
    this.lastUpdateDate = lastUpdatedDate;
  }

}
