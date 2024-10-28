/**
 * 
 */
package org.drdeesw.commons.organization.models.pojos;


import java.time.Instant;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.drdeesw.commons.common.models.pojos.AbstractNamedLongUniquePojo;
import org.drdeesw.commons.organization.models.Organization;
import org.drdeesw.commons.organization.models.OrganizationStatus;
import org.drdeesw.commons.organization.models.OrganizationType;


/**
 * 
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "organizations")
public class OrganizationPojo extends AbstractNamedLongUniquePojo implements Organization
{
  private Long               createdById;
  private Instant            creationDate;
  private String             description;
  private Instant            lastUpdateDate;
  private Long               lastUpdateId;
  private Organization       parent;
  private OrganizationStatus status;
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
