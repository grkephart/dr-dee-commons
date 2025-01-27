/**
 * 
 */
package org.drdeesw.commons.accounting.models.pojos;


import java.time.Instant;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.drdeesw.commons.accounting.models.AccountHolder;
import org.drdeesw.commons.common.models.pojos.AbstractNamedLongUniquePojo;
import org.drdeesw.commons.security.models.User;
import org.drdeesw.commons.security.models.entities.UserEntity;


/**
 * 
 */
@SuppressWarnings("serial")
public class AccountHolderPojo extends AbstractNamedLongUniquePojo implements AccountHolder<AccountPojo>
{
  @ManyToOne
  @JoinColumn(name = "created_by", nullable = false)
  private UserEntity                  createdBy;

  @Column(name = "creation_date", nullable = false)
  private Instant                     creationDate;

  @Column(name = "description", nullable = false)
  private String                      description;

  @Column(name = "is_enabled", nullable = false)
  private boolean                     enabled;

  private Set<AccountPojo>            heldAccounts;

  @Column(name = "last_update_date", nullable = false)
  private Instant                     lastUpdateDate;

  @ManyToOne
  @JoinColumn(name = "last_updated_by", nullable = false)
  private UserEntity                  lastUpdatedBy;

  public AccountHolderPojo()
  {
    super();
  }


  public AccountHolderPojo(Long id)
  {
    super(id);
  }


  @Override
  public UserEntity getCreatedBy()
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
  public Set<AccountPojo> getHeldAccounts()
  {
    return this.heldAccounts;
  }



  @Override
  public Instant getLastUpdateDate()
  {
    return lastUpdateDate;
  }


  @Override
  public UserEntity getLastUpdatedBy()
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
    User createdBy)
  {
    this.createdBy = (UserEntity)createdBy;
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
    Set<AccountPojo> accounts)
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
    User lastUpdatedBy)
  {
    this.lastUpdatedBy = (UserEntity)lastUpdatedBy;
  }

}
