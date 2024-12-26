/**
 * 
 */
package org.drdeesw.commons.organization.models.entities;


import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import org.drdeesw.commons.accounting.models.entities.AbstractAccountableEntity;
import org.drdeesw.commons.organization.models.Organization;
import org.drdeesw.commons.organization.models.OrganizationStatus;
import org.drdeesw.commons.organization.models.OrganizationType;


/**
 * 
 */
@SuppressWarnings("serial")
@MappedSuperclass
@Access(AccessType.FIELD)
public abstract class AbstractOrganizationEntity extends AbstractAccountableEntity
    implements Organization
{
  @Column(name = "status")
  private OrganizationStatus status;
  @Column(name = "type")
  private OrganizationType   type;

  /**
   * Hibernate constructor
   */
  protected AbstractOrganizationEntity()
  {

  }

  @Override
  public OrganizationStatus getStatus()
  {
    return this.status;
  }


  @Override
  public OrganizationType getType()
  {
    return this.type;
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
    this.type = type;
  }

}
