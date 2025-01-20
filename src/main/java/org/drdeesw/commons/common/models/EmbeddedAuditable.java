/**
 * 
 */
package org.drdeesw.commons.common.models;


import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.drdeesw.commons.security.models.entities.UserEntity;


/**
 * 
 */
@Embeddable
public class EmbeddedAuditable
{
  private UserEntity createdBy;
  private Instant    creationDate;
  private Instant    lastUpdateDate;
  private UserEntity lastUpdatedBy;

  @ManyToOne
  @JoinColumn(name = "created_by_id", nullable = false, updatable = false)
  public UserEntity getCreatedBy()
  {
    return createdBy;
  }


  @Column(name = "creation_date")
  public Instant getCreationDate()
  {
    return creationDate;
  }


  @Column(name = "last_update_date")
  public Instant getLastUpdateDate()
  {
    return lastUpdateDate;
  }


  @ManyToOne
  @JoinColumn(name = "last_updated_by_id")
  public UserEntity getLastUpdatedBy()
  {
    return lastUpdatedBy;
  }


  public void setCreatedBy(
    UserEntity createdBy)
  {
    this.createdBy = (UserEntity)createdBy;
  }


  public void setCreationDate(
    Instant creationDate)
  {
    this.creationDate = creationDate;
  }


  public void setLastUpdateDate(
    Instant lastUpdateDate)
  {
    this.lastUpdateDate = lastUpdateDate;
  }


  public void setLastUpdatedBy(
    UserEntity lastUpdatedBy)
  {
    this.lastUpdatedBy = (UserEntity)lastUpdatedBy;
  }
}
