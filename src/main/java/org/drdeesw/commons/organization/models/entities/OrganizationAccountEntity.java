/**
 * 
 */
package org.drdeesw.commons.organization.models.entities;


import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import org.drdeesw.commons.accounting.models.entities.AccountHolderEntity;
import org.drdeesw.commons.security.models.entities.UserEntity;


@SuppressWarnings("serial")
@Entity
@Table(name = "organization_accounts")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Access(AccessType.PROPERTY)
public class OrganizationAccountEntity
    extends AbstractOrganizationAccountEntity<AccountHolderEntity, OrganizationEntity, UserEntity>
{
  @Override
  @Column(name = "organization_account_id")
  public Long getId()
  {
    return super.getId();
  }

}
