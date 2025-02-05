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


/**
 * 
 */
@Embeddable
public class EmbeddedAuditable<U extends User<?>>
{
  private U       createdBy;
  private Instant creationDate;
  private Instant lastUpdateDate;
  private U       lastUpdatedBy;

  @ManyToOne
  @JoinColumn(name = "created_by_id", nullable = false, updatable = false)
  public U getCreatedBy()
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
  public U getLastUpdatedBy()
  {
    return lastUpdatedBy;
  }


  public void setCreatedBy(
    U createdBy)
  {
    this.createdBy = (U)createdBy;
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
    U lastUpdatedBy)
  {
    this.lastUpdatedBy = (U)lastUpdatedBy;
  }
}
