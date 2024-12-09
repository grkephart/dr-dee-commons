/**
 * 
 */
package org.drdeesw.commons.organization.models.entities;


import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;

import org.drdeesw.commons.organization.models.Organization;
import org.drdeesw.commons.organization.models.OrganizationAccount;


/**
 * 
 */
@SuppressWarnings("serial")
@MappedSuperclass
@Access(AccessType.FIELD)
public abstract class AbstractOrganizationAccountEntity extends AbstractAccountEntity
    implements OrganizationAccount
{
  @ManyToOne
  @JoinColumn(name = "organization_id")
  private OrganizationEntity organization;

  /**
   * 
   */
  protected AbstractOrganizationAccountEntity()
  {

  }


  @Override
  public Organization getOrganization()
  {
    return (Organization)this.organization;
  }


  @Override
  public void setOrganization(
    Organization organization)
  {
    this.organization = (OrganizationEntity)organization;
  }

}
