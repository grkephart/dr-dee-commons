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
import javax.persistence.OneToOne;

import org.drdeesw.commons.accounting.models.AccountHolder;
import org.drdeesw.commons.accounting.models.AccountProvider;
import org.drdeesw.commons.accounting.models.entities.AccountHolderEntity;
import org.drdeesw.commons.accounting.models.entities.AccountProviderEntity;
import org.drdeesw.commons.common.models.EmbeddedAuditable;
import org.drdeesw.commons.common.models.entities.AbstractNamedLongUniqueEntity;
import org.drdeesw.commons.security.models.User;
import org.drdeesw.commons.security.models.entities.UserEntity;
import org.drdeesw.commons.serviceproviders.models.ServiceProviderAccount;
import org.drdeesw.commons.serviceproviders.models.ServiceProviderAccountTokenHolder;


/**
 * 
 */
@SuppressWarnings("serial")
@MappedSuperclass
@Access(AccessType.FIELD)
public abstract class AbstractServiceProviderAccountEntity extends AbstractNamedLongUniqueEntity
    implements ServiceProviderAccount
{
  @Column(name = "is_active", nullable = false)
  private boolean                           active;

  @Embedded
  private EmbeddedAuditable                 audit;

  @Column(name = "description", length = 255)
  private String                            description;

  @ManyToOne(targetEntity = AccountHolderEntity.class, optional = false)
  @JoinColumn(name = "holder_id", nullable = false)
  private AccountHolderEntity holder;

  @Column(name = "internal_id")
  private String                            internalId;

  @ManyToOne(targetEntity = AccountProviderEntity.class, optional = false)
  @JoinColumn(name = "provider_id", nullable = false)
  private AccountProviderEntity  provider;

  /**
   * Note same column as for provider, but different mapping.
   */
  @ManyToOne(targetEntity = AccountProviderEntity.class, optional = false)
  @JoinColumn(name = "provider_id", nullable = false, insertable = false, updatable = false)
  private ServiceProviderEntity  serviceProvider;

  @ManyToOne
  @JoinColumn(name = "token_holder_id", nullable = false)
  private ServiceProviderAccountTokenHolderEntity tokenHolder;

  @OneToOne
  @JoinColumn(name = "user_id")
  private UserEntity                        user;

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
  public String getDescription()
  {
    return this.description;
  }


  @Override
  public AccountHolder getHolder()
  {
    return this.holder;
  }


  @Override
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
  public AccountProvider getProvider()
  {
    return this.provider;
  }


  /**
   * @return the serviceProvider
   */
  @Override
  public ServiceProviderEntity getServiceProvider()
  {
    return serviceProvider;
  }


  @Override
  public ServiceProviderAccountTokenHolder getTokenHolder()
  {
    return this.tokenHolder;
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
  public void setHolder(
    AccountHolder accountHolder)
  {
   this.holder = (AccountHolderEntity)accountHolder;
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
  public void setProvider(
    AccountProvider accountProvider)
  {
    this.provider = (AccountProviderEntity)accountProvider;
  }



  @Override
  public void setTokenHolder(
    ServiceProviderAccountTokenHolder tokenHolder)
  {
    this.tokenHolder = (ServiceProviderAccountTokenHolderEntity)tokenHolder;
  }


  @Override
  public void setUser(
    User user)
  {
    this.user = (UserEntity)user;
  }

}
