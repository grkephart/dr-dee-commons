/**
 * 
 */
package org.drdeesw.commons.organization.models.pojos;


import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.drdeesw.commons.common.models.pojos.AbstractLongUniquePojo;
import org.drdeesw.commons.organization.models.Organization;
import org.drdeesw.commons.organization.models.OrganizationAccount;
import org.drdeesw.commons.organization.models.OrganizationAccountHolder;


/**
 * 
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "organization_accounts")
@AttributeOverride(name = "id", column = @Column(name = "organization_account_id"))
public class OrganizationAccountPojo extends AbstractLongUniquePojo implements OrganizationAccount
{

  private String       description;
  private String       internalId;
  private Organization organization;

  public OrganizationAccountPojo()
  {

  }


  @Override
  public OrganizationAccountHolder<OrganizationAccount> getAccountHolder()
  {
    // TODO Auto-generated method stub
    return null;
  }


  @Override
  public String getDescription()
  {
    return this.description;
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
  public void setAccountHolder(
    OrganizationAccountHolder<OrganizationAccount> accountHolder)
  {
    // TODO Auto-generated method stub

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
    this.organization = organization;
  }

}
