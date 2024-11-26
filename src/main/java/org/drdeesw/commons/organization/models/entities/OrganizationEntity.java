/**
 * 
 */
package org.drdeesw.commons.organization.models.entities;


import java.util.Set;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


/**
 * 
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "organizations")
@AttributeOverride(name = "id", column = @Column(name = "organization_id"))
public class OrganizationEntity extends AbstractOrganizationEntity<OrganizationAccountEntity>
{

  @Override
  public Set<OrganizationAccountEntity> getAccounts()
  {
    return super.getAccounts();
  }


  @Override
  public void setAccounts(
    Set<OrganizationAccountEntity> accounts)
  {
    super.setAccounts(accounts);
  }

}
