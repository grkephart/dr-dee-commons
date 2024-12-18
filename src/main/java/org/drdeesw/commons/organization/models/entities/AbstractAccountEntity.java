/**
 * 
 */
package org.drdeesw.commons.organization.models.entities;


import java.time.Instant;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;

import org.drdeesw.commons.common.models.entities.AbstractNamedLongUniqueEntity;
import org.drdeesw.commons.organization.models.Account;
import org.drdeesw.commons.organization.models.AccountHolder;
import org.drdeesw.commons.organization.models.AccountProvider;
import org.drdeesw.commons.security.models.User;
import org.drdeesw.commons.security.models.entities.UserEntity;


/**
 * 
 */
@SuppressWarnings("serial")
@MappedSuperclass
@Access(AccessType.FIELD)
public abstract class AbstractAccountEntity extends AbstractNamedLongUniqueEntity implements Account
{

  @Column(name = "is_active", nullable = false)
  private boolean                       active;

  @ManyToOne
  @JoinColumn(name = "created_by", nullable = false)
  private UserEntity                    createdBy;

  @Column(name = "creation_date", nullable = false)
  private Instant                       creationDate;

  @Column(name = "description", nullable = false)
  private String                        description;

  @ManyToOne(targetEntity = AccountHolderEntity.class, optional = false)
  @JoinColumn(name = "holder_id", nullable = false)
  private AbstractAccountHolderEntity   holder;

  @Column(name = "internal_id")
  private String                        internalId;

  @Column(name = "last_update_date", nullable = false)
  private Instant                       lastUpdateDate;

  @ManyToOne
  @JoinColumn(name = "last_updated_by", nullable = false)
  private UserEntity                    lastUpdatedBy;

  @ManyToOne(targetEntity = AccountProviderEntity.class, optional = false)
  @JoinColumn(name = "provider_id", nullable = false)
  private AbstractAccountProviderEntity provider;

  @OneToOne
  @JoinColumn(name = "user_id")
  private UserEntity                    user;

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


  @Override
  public AccountHolder getHolder()
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
    return this.lastUpdateDate;
  }


  @Override
  public User getLastUpdatedBy()
  {
    return (User)this.lastUpdatedBy;
  }


  @Override
  public AccountProvider getProvider()
  {
    return this.provider;
  }


  @Override
  public User getUser()
  {
    return user;
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
  public void setHolder(
    AccountHolder accountHolder)
  {
    this.holder = (AbstractAccountHolderEntity)accountHolder;
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
    this.lastUpdateDate = lastUpdatedDate;
  }


  @Override
  public void setLastUpdatedBy(
    User lastUpdatedBy)
  {
    this.lastUpdatedBy = (UserEntity)lastUpdatedBy;
  }


  /**
   * @param lastUpdatedBy the lastUpdatedBy to set
   */
  public void setLastUpdatedBy(
    UserEntity lastUpdatedBy)
  {
    this.lastUpdatedBy = lastUpdatedBy;
  }


  @Override
  public void setProvider(
    AccountProvider accountProvider)
  {
    this.provider = (AbstractAccountProviderEntity)accountProvider;
  }


  @Override
  public void setUser(
    User user)
  {
    this.user = (UserEntity)user;
  }

}
