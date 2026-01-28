/**
 * 
 */
package org.drdeesw.commons.accounting.models.entities;


import java.time.Instant;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Embedded;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;

import org.drdeesw.commons.accounting.models.Account;
import org.drdeesw.commons.common.models.EmbeddedAuditable;
import org.drdeesw.commons.common.models.entities.AbstractNamedLongUniqueEntity;
import org.drdeesw.commons.security.models.entities.AbstractUserEntity;


/**
 * 
 */
@SuppressWarnings("serial")
@MappedSuperclass
@DiscriminatorColumn(name = "account_type", discriminatorType = DiscriminatorType.STRING)
@Access(AccessType.PROPERTY)
public abstract class AbstractAccountEntity<//
    U extends AbstractUserEntity<?>, //
    H extends AbstractAccountHolderEntity<U, ?>, //
    P extends AbstractAccountProviderEntity<U, ?>> //
    extends AbstractNamedLongUniqueEntity implements Account<U, H, P>
{
  private boolean              active;
  @Embedded
  private EmbeddedAuditable<U> audit;
  private String               description;
  private boolean              enabled;
  private H                    holder;
  private String               internalId;
  private P                    provider;
  private U                    user;

  @Override
  public U getCreatedBy()
  {
    return (U)this.audit.getCreatedBy();
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
    return description;
  }


  @Override
  @ManyToOne
  @JoinColumn(name = "holder_id", nullable = false)
  public H getHolder()
  {
    return this.holder;
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
  public U getLastUpdatedBy()
  {
    return this.audit.getLastUpdatedBy();
  }


  @Override
  @ManyToOne
  @JoinColumn(name = "provider_id", nullable = false)
  public P getProvider()
  {
    return this.provider;
  }


  @Override
  @OneToOne
  @JoinColumn(name = "user_id")
  public U getUser()
  {
    return user;
  }


  @Override
  @Column(name = "is_active", nullable = false)
  public boolean isActive()
  {
    return this.active;
  }


  /**
   * @return the enabled
   */
  @Column(name = "is_enabled", nullable = false)
  public boolean isEnabled()
  {
    return enabled;
  }


  @Override
  public void setActive(
    boolean active)
  {
    this.active = active;
  }


  @Override
  public void setCreatedBy(
    U createdBy)
  {
    this.audit.setCreatedBy(createdBy);
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


  /**
   * @param enabled the enabled to set
   */
  public void setEnabled(
    boolean enabled)
  {
    this.enabled = enabled;
  }


  @Override
  public void setHolder(
    H holder)
  {
    this.holder = holder;
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
    U lastUpdatedBy)
  {
    this.audit.setLastUpdatedBy(lastUpdatedBy);
  }


  @Override
  public void setProvider(
    P provider)
  {
    this.provider = provider;
  }


  @Override
  public void setUser(
    U user)
  {
    this.user = user;
  }
}
