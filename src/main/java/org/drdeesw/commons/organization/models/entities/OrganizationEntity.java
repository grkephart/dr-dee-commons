/**
 * 
 */
package org.drdeesw.commons.organization.models.entities;


import java.time.Instant;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.drdeesw.commons.common.models.entities.AbstractNamedLongUniqueEntity;
import org.drdeesw.commons.organization.models.Organization;
import org.drdeesw.commons.organization.models.OrganizationStatus;
import org.drdeesw.commons.organization.models.OrganizationType;


/**
 * 
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "organizations")
@AttributeOverride(name = "id", column = @Column(name = "organization_id"))
@Access(AccessType.FIELD)
public class OrganizationEntity extends AbstractNamedLongUniqueEntity implements Organization
{
  @Column(name = "created_by_id")
  private Long               createdById;
  @Column(name = "creation_date")
  private Instant            creationDate;
  @Column(name = "description")
  private String             description;
  @Column(name = "last_update_date")
  private Instant            lastUpdateDate;
  @Column(name = "last_update_id")
  private Long               lastUpdateId;
  @Column(name = "parent_id")
  private Organization       parent;
  @Column(name = "status")
  private OrganizationStatus status;
  @ManyToOne
  @JoinColumn(name = "type_id")
  private OrganizationType   type;

  @Override
  public AccountType getAccountType()
  {
    return AccountType.ORGANIZATION;
  }


  @Override
  public Long getCreatedById()
  {
    return this.createdById;
  }


  @Override
  public Instant getCreationDate()
  {
    return this.creationDate;
  }


  @Override
  public String getDescription()
  {
    return description;
  }


  @Override
  public Instant getLastUpdateDate()
  {
    return this.lastUpdateDate;
  }


  @Override
  public Long getLastUpdateId()
  {
    return this.lastUpdateId;
  }


  /**
   * @return the parent
   */
  @Override
  public Organization getParent()
  {
    return parent;
  }


  /**
   * @return the status
   */
  @Override
  public OrganizationStatus getStatus()
  {
    return status;
  }


  /**
   * @return the type
   */
  @Override
  public OrganizationType getType()
  {
    return type;
  }


  @Override
  public void setCreatedById(
    Long createdById)
  {
    this.createdById = createdById;
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
  public void setLastUpdateDate(
    Instant lastUpdateDate)
  {
    this.lastUpdateDate = lastUpdateDate;
  }


  @Override
  public void setLastUpdateId(
    Long lastUpdateId)
  {
    this.lastUpdateId = lastUpdateId;
  }


  /**
   * @param parent the parent to set
   */
  @Override
  public void setParent(
    Organization parent)
  {
    this.parent = parent;
  }


  /**
   * @param status the status to set
   */
  @Override
  public void setStatus(
    OrganizationStatus status)
  {
    this.status = status;
  }


  /**
   * @param type the type to set
   */
  @Override
  public void setType(
    OrganizationType type)
  {
    this.type = type;
  }
}
