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

import org.drdeesw.commons.common.models.Auditable;
import org.drdeesw.commons.common.models.Describable;
import org.drdeesw.commons.common.models.Enableable;
import org.drdeesw.commons.common.models.entities.AbstractNamedLongUniqueEntity;
import org.drdeesw.commons.security.models.User;
import org.drdeesw.commons.security.models.entities.UserEntity;


/**
 * 
 */
@SuppressWarnings("serial")
@MappedSuperclass
@Access(AccessType.FIELD)
public abstract class AbstractAccountableEntity extends AbstractNamedLongUniqueEntity
    implements Auditable, Describable, Enableable
{

  @ManyToOne
  @JoinColumn(name = "created_by", nullable = false)
  private UserEntity createdBy;
  @Column(name = "creation_date", nullable = false)
  private Instant    creationDate;
  @Column(name = "description", nullable = true)
  private String     description;
  @Column(name = "enabled", nullable = true)
  private boolean    enabled;
  @Column(name = "last_update_date", nullable = false)
  private Instant    lastUpdateDate;
  @ManyToOne
  @JoinColumn(name = "last_updated_by", nullable = false)
  private UserEntity lastUpdatedBy;

  protected AbstractAccountableEntity()
  {
  }


  protected AbstractAccountableEntity(Long id)
  {
    super(id);
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
   * @return the enabled
   */
  @Override
  public boolean isEnabled()
  {
    return enabled;
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

}
