/**
 * 
 */
package org.drdeesw.commons.organization.models.entities;


import java.time.Instant;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.MappedSuperclass;

import org.drdeesw.commons.accounting.models.Account;
import org.drdeesw.commons.common.models.EmbeddedAuditable;
import org.drdeesw.commons.common.models.entities.AbstractNamedLongUniqueEntity;
import org.drdeesw.commons.organization.models.Organization;
import org.drdeesw.commons.organization.models.OrganizationAccount;
import org.drdeesw.commons.organization.models.OrganizationMember;
import org.drdeesw.commons.organization.models.OrganizationRole;
import org.drdeesw.commons.organization.models.OrganizationStatus;
import org.drdeesw.commons.organization.models.OrganizationType;
import org.drdeesw.commons.security.models.User;


/**
 * 
 */
@SuppressWarnings("serial")
@MappedSuperclass
@Access(AccessType.PROPERTY)
public abstract class AbstractOrganizationEntity<//
    U extends User<?>, //
    PC extends Organization<U, PC, HA, PA, M, R>, //
    HA extends Account<U, ?, ?>, //
    PA extends OrganizationAccount<U, ?, ?>, //
    M extends OrganizationMember<U, ?, ?>, //
    R extends OrganizationRole<U, ?, ?>> //
    extends AbstractNamedLongUniqueEntity implements Organization<U, PC, HA, PA, M, R>
{
  @Embedded
  private EmbeddedAuditable<U>   audit;
  private String                 description;
  private boolean                enabled = true;
  private OrganizationStatus     status;
  private OrganizationTypeEntity type;

  /**
   * Hibernate constructor
   */
  protected AbstractOrganizationEntity()
  {

  }


  /**
   * Unit test constructor
   */
  protected AbstractOrganizationEntity(EmbeddedAuditable<U> audit)
  {
    this.audit = audit;
  }


  @Override
  public U getCreatedBy()
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
  @Column(name = "status")
  public OrganizationStatus getStatus()
  {
    return this.status;
  }


  @Override
  @Column(name = "type")
  public OrganizationType getType()
  {
    return this.type;
  }


  @Override
  @Column(name = "is_enabled", nullable = false)
  public boolean isEnabled()
  {
    return this.enabled;
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
    U lastUpdatedBy)
  {
    this.audit.setLastUpdatedBy(lastUpdatedBy);
  }


  @Override
  public void setStatus(
    OrganizationStatus status)
  {
    this.status = status;
  }


  @Override
  public void setType(
    OrganizationType type)
  {
    this.type = (OrganizationTypeEntity)type;
  }

}
