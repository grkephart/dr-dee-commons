/**
 * 
 */
package org.drdeesw.commons.organization.models.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "organization_accounts")
//@AttributeOverride(name = "id", column = @Column(name = "organization_account_id"))
public class OrganizationAccountEntity extends AbstractOrganizationAccountEntity
{

  @Override
  @Column(name="organization_account_id")
  public Long getId()
  {
    return super.getId();
  }
  
}
