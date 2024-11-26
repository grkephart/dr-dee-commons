/**
 * 
 */
package org.drdeesw.commons.organization.models.entities;


import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;

import org.drdeesw.commons.common.models.entities.AbstractLongUniqueEntity;
import org.drdeesw.commons.organization.models.Organization;
import org.drdeesw.commons.organization.models.OrganizationAccount;
import org.drdeesw.commons.organization.models.OrganizationAccountHolder;


/**
 * 
 */
@SuppressWarnings("serial")
@MappedSuperclass
@Access(AccessType.FIELD)
public abstract class AbstractOrganizationAccountEntity extends AbstractLongUniqueEntity
    implements OrganizationAccount
{
  @ManyToOne
  private OrganizationAccountHolderEntity  holder;
  @Column(name = "description")
  private String                    description;
  @Column(name = "internal_id")
  private String                    internalId;
  @ManyToOne
  @JoinColumn(name = "organization_id")
  private OrganizationEntity        organization;

  /**
   * 
   */
  protected AbstractOrganizationAccountEntity()
  {

  }


  @Override
  public OrganizationAccountHolder<OrganizationAccount> getHolder()
  {
    return this.holder;
  }


  @Override
  public String getDescription()
  {
    return description;
  }


  @Override
  public String getInternalId()
  {
    return this.internalId;
  }


  @Override
  public Organization getOrganization()
  {
    return this.organization;
  }


  @Override
  public void setHolder(
    OrganizationAccountHolder holder)
  {
    this.holder = (OrganizationAccountHolderEntity)holder;
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
  public void setOrganization(
    Organization organization)
  {
    this.organization = (OrganizationEntity)organization;
  }

}
