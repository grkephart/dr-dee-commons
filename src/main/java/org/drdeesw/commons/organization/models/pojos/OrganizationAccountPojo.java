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
public class OrganizationAccountPojo  extends AbstractLongUniquePojo implements OrganizationAccount
{

  public OrganizationAccountPojo()
  {

  }



  @Override
  public String getDescription()
  {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public void setDescription(
    String description)
  {
    // TODO Auto-generated method stub
    
  }

  @Override
  public OrganizationAccountHolder getAccountHolder()
  {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public String getInternalId()
  {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Organization getOrganization()
  {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public void setAccountHolder(
    OrganizationAccountHolder accountHolder)
  {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void setInternalId(
    String internalId)
  {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void setOrganization(
    Organization organization)
  {
    // TODO Auto-generated method stub
    
  }

}
