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

import org.drdeesw.commons.common.models.EmbeddedAuditable;
import org.drdeesw.commons.common.models.entities.AbstractNamedLongUniqueEntity;
import org.drdeesw.commons.organization.models.Organization;
import org.drdeesw.commons.organization.models.OrganizationMemberRole;
import org.drdeesw.commons.organization.models.OrganizationRole;
import org.drdeesw.commons.security.models.User;
import org.drdeesw.commons.security.models.entities.UserEntity;


/**
 * 
 */
@SuppressWarnings("serial")
@MappedSuperclass
@Access(AccessType.PROPERTY)
public abstract class AbstractOrganizationRoleEntity<O extends Organization<?,?,?>, MR extends OrganizationMemberRole<?, ?>>
    extends AbstractNamedLongUniqueEntity implements OrganizationRole<O, MR>
{
  @Embedded
  private EmbeddedAuditable audit;
  private String            description;
  private boolean           enabled = true;
  /**
   * 
   */
  protected AbstractOrganizationRoleEntity()
  {

  }


  @Override
  public User<?> getCreatedBy()
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
  public User<?> getLastUpdatedBy()
  {
    return this.audit.getLastUpdatedBy();
  }


  @Override
  @Column(name = "is_enabled", nullable = false)
  public boolean isEnabled()
  {
    return this.enabled;
  }


  @Override
  public void setCreatedBy(
    User<?> createdBy)
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
    User<?> lastUpdatedBy)
  {
    this.audit.setLastUpdatedBy((UserEntity)lastUpdatedBy);
  }
}
