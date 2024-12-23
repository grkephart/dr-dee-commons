/**
 * 
 */
package org.drdeesw.commons.accounting.models.entities;


import java.time.Instant;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;

import org.drdeesw.commons.accounting.models.Account;
import org.drdeesw.commons.common.models.entities.AbstractNamedLongUniqueEntity;
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

  @Column(name = "internal_id")
  private String                        internalId;

  @Column(name = "last_update_date", nullable = false)
  private Instant                       lastUpdateDate;

  @ManyToOne
  @JoinColumn(name = "last_updated_by", nullable = false)
  private UserEntity                    lastUpdatedBy;

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


  @Override
  public void setUser(
    User user)
  {
    this.user = (UserEntity)user;
  }

}
