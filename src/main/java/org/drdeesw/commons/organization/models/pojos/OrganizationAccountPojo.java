/**
 * 
 */
package org.drdeesw.commons.organization.models.pojos;


import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.drdeesw.commons.organization.models.Organization;
import org.drdeesw.commons.organization.models.OrganizationAccount;


/**
 * 
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "organization_accounts")
@AttributeOverride(name = "id", column = @Column(name = "organization_account_id"))
public class OrganizationAccountPojo extends AccountPojo implements OrganizationAccount
{

  private String           internalId;
  private OrganizationPojo organization;

  public OrganizationAccountPojo()
  {

  }


  protected OrganizationAccountPojo(OrganizationPojo serviceProvider, String internalId)
  {
    this.organization = serviceProvider;
    this.internalId = internalId;
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
  public void setInternalId(
    String internalId)
  {
    this.internalId = internalId;
  }


  @Override
  public void setOrganization(
    Organization organization)
  {
    this.organization = (OrganizationPojo)organization;
  }

}
