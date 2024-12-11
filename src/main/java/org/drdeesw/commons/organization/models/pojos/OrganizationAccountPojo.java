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

  private OrganizationPojo organization;

  public OrganizationAccountPojo()
  {

  }


  protected OrganizationAccountPojo(OrganizationPojo organization, String internalId)
  {
    super(organization, internalId);
    this.organization = organization;
  }


  @Override
  public Organization getOrganization()
  {
    return this.organization;
  }


  @Override
  public void setOrganization(
    Organization organization)
  {
    this.organization = (OrganizationPojo)organization;
  }

}
