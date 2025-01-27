/**
 * 
 */
package org.drdeesw.commons.serviceproviders.models.entities;


import java.time.Instant;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;

import org.drdeesw.commons.accounting.models.AccountHolder;
import org.drdeesw.commons.common.models.EmbeddedAuditable;
import org.drdeesw.commons.common.models.entities.AbstractNamedLongUniqueEntity;
import org.drdeesw.commons.security.models.User;
import org.drdeesw.commons.security.models.entities.UserEntity;
import org.drdeesw.commons.serviceproviders.models.ServiceProvider;
import org.drdeesw.commons.serviceproviders.models.ServiceProviderAccount;
import org.drdeesw.commons.serviceproviders.models.ServiceProviderAccountTokenHolder;


/**
 * 
 */
@SuppressWarnings("serial")
@MappedSuperclass
@Access(AccessType.PROPERTY)
public abstract class AbstractServiceProviderAccountEntity<H extends AccountHolder<?>, P extends ServiceProvider<?>, U extends User>
    extends AbstractNamedLongUniqueEntity implements ServiceProviderAccount<H, P, U>
{
  private boolean                                 active;
  @Embedded
  private EmbeddedAuditable                       audit;
  private String                                  description;
  private String                                  internalId;
  private ServiceProviderAccountTokenHolderEntity tokenHolder;

  /**
   * Hibernate constructor
   */
  protected AbstractServiceProviderAccountEntity()
  {

  }


  @Override
  public User getCreatedBy()
  {
    return this.audit.getCreatedBy();
  }


  @Override
  public Instant getCreationDate()
  {
    return this.audit.getCreationDate();
  }


  @Override
  @Column(name = "description", length = 255)
  public String getDescription()
  {
    return this.description;
  }


  @Override
  @Column(name = "internal_id")
  public String getInternalId()
  {
    return this.internalId;
  }


  @Override
  public Instant getLastUpdateDate()
  {
    return this.audit.getLastUpdateDate();
  }


  @Override
  public User getLastUpdatedBy()
  {
    return this.audit.getLastUpdatedBy();
  }


  @Override
  @ManyToOne
  @JoinColumn(name = "token_holder_id", nullable = false)
  public ServiceProviderAccountTokenHolderEntity getTokenHolder()
  {
    return this.tokenHolder;
  }


  @Override
  @Column(name = "is_active", nullable = false)
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
    this.audit.setCreatedBy((UserEntity)createdBy);
  }


  @Override
  public void setCreationDate(
    Instant creationDate)
  {
    this.audit.setCreationDate(creationDate);
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
    Instant lastUpdateDate)
  {
    this.audit.setLastUpdateDate(lastUpdateDate);
  }


  @Override
  public void setLastUpdatedBy(
    User lastUpdatedBy)
  {
    this.audit.setLastUpdatedBy((UserEntity)lastUpdatedBy);
  }


  @Override
  public void setTokenHolder(
    ServiceProviderAccountTokenHolder tokenHolder)
  {
    this.tokenHolder = (ServiceProviderAccountTokenHolderEntity)tokenHolder;
  }

}
