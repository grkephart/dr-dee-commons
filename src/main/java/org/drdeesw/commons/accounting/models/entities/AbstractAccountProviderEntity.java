/**
 * 
 */
package org.drdeesw.commons.accounting.models.entities;


import java.time.Instant;
import java.util.Set;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Embedded;
import javax.persistence.FetchType;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;

import org.drdeesw.commons.accounting.models.Account;
import org.drdeesw.commons.accounting.models.AccountProvider;
import org.drdeesw.commons.common.models.EmbeddedAuditable;
import org.drdeesw.commons.common.models.entities.AbstractNamedLongUniqueEntity;
import org.drdeesw.commons.security.models.User;
import org.drdeesw.commons.security.models.entities.UserEntity;


/**
 * 
 */
@SuppressWarnings("serial")
@MappedSuperclass
@DiscriminatorColumn(name = "provider_type", discriminatorType = DiscriminatorType.STRING)
@Access(AccessType.PROPERTY)
public abstract class AbstractAccountProviderEntity<A extends Account<?, ?, ?>>
    extends AbstractNamedLongUniqueEntity implements AccountProvider<A>
{
  @Embedded
  private EmbeddedAuditable audit;
  private String            description;
  private boolean           enabled;
  private Set<A>            providedAccounts;

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
    return description;
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
  @OneToMany(fetch = FetchType.LAZY, mappedBy = "provider", cascade = CascadeType.ALL, orphanRemoval = true)
  public Set<A> getProvidedAccounts()
  {
    return providedAccounts;
  }


  @Override
  @Column(name = "is_enabled", nullable = false)
  public boolean isEnabled()
  {
    return enabled;
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
  public void setEnabled(
    boolean enabled)
  {
    this.enabled = enabled;
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
  public void setProvidedAccounts(
    Set<A> accounts)
  {
    this.providedAccounts = accounts;
  }

}
