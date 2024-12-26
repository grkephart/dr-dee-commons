/**
 * 
 */
package org.drdeesw.commons.serviceproviders.models.entities;


import java.time.Instant;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;

import org.drdeesw.commons.common.models.entities.AbstractNamedLongUniqueEntity;
import org.drdeesw.commons.security.models.User;
import org.drdeesw.commons.serviceproviders.models.ServiceProvider;


/**
 * 
 */
@SuppressWarnings("serial")
@MappedSuperclass
@Access(AccessType.FIELD)
public abstract class AbstractServiceProviderEntity extends AbstractNamedLongUniqueEntity
    implements ServiceProvider
{
  @ManyToOne
  @JoinColumn(name = "created_by_id")
  private User                                    createdBy;
  @Column(name = "creation_date")
  private Instant                                 creationDate;
  @Column(name = "description")
  private String                                  description;
  @Column(name = "enabled")
  private boolean                                 enabled;
  @Column(name = "last_update_date")
  private Instant                                 lastUpdateDate;
  @ManyToOne
  @JoinColumn(name = "last_updated_by_id")
  private User                                    lastUpdatedBy;
  @ManyToOne
  @JoinColumn(name = "token_holder_id")
  private ServiceProviderAccountTokenHolderEntity tokenHolder;

  @Override
  public User getCreatedBy()
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
  public User getLastUpdatedBy()
  {
    return this.lastUpdatedBy;
  }


  /**
   * @return the tokenHolder
   */
  public ServiceProviderAccountTokenHolderEntity getTokenHolder()
  {
    return tokenHolder;
  }


  @Override
  public boolean isEnabled()
  {
    return this.enabled;
  }


  @Override
  public void setCreatedBy(
    User createdBy)
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
  public void setLastUpdateDate(
    Instant lastUpdateDate)
  {
    this.lastUpdateDate = lastUpdateDate;
  }


  @Override
  public void setLastUpdatedBy(
    User lastUpdatedBy)
  {
    this.lastUpdatedBy = lastUpdatedBy;
  }


  /**
   * @param tokenHolder the tokenHolder to set
   */
  public void setTokenHolder(
    ServiceProviderAccountTokenHolderEntity tokenHolder)
  {
    this.tokenHolder = tokenHolder;
  }

}
