/**
 * 
 */
package org.drdeesw.commons.common.models;


import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.drdeesw.commons.security.models.User;
import org.drdeesw.commons.security.models.entities.UserEntity;


/**
 * 
 */
@Embeddable
public class EmbeddedAuditable
{
  @ManyToOne
  @JoinColumn(name = "created_by_id", nullable = false, updatable = false)
  private UserEntity    createdBy;

  @Column(name = "creation_date")
  private Instant creationDate;

  @Column(name = "last_update_date")
  private Instant lastUpdateDate;

  @ManyToOne
  @JoinColumn(name = "last_updated_by_id")
  private UserEntity    lastUpdatedBy;

  public User getCreatedBy()
  {
    return createdBy;
  }


  public Instant getCreationDate()
  {
    return creationDate;
  }


  public Instant getLastUpdateDate()
  {
    return lastUpdateDate;
  }


  public User getLastUpdatedBy()
  {
    return lastUpdatedBy;
  }


  public void setCreatedBy(
    User createdBy)
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
    User lastUpdatedBy)
  {
    this.lastUpdatedBy = (UserEntity)lastUpdatedBy;
  }
}
