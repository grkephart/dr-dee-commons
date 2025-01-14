/**
 * 
 */
package org.drdeesw.commons.organization.models.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "organization_accounts")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class OrganizationAccountEntity extends AbstractOrganizationAccountEntity
{

  @Override
  @Column(name="organization_account_id")
  public Long getId()
  {
    return super.getId();
  }
  
}
