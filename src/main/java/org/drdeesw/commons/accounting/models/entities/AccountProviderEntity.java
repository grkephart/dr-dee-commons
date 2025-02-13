/**
 * 
 */
package org.drdeesw.commons.accounting.models.entities;


import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import org.drdeesw.commons.security.models.entities.UserEntity;


/**
 * 
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "account_providers")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Access(AccessType.PROPERTY)
public class AccountProviderEntity extends AbstractAccountProviderEntity<UserEntity, AccountEntity>
{

  /**
   * Hibernate
   */
  public AccountProviderEntity()
  {
  }


  @Override
  @Column(name = "account_provider_id")
  public Long getId()
  {
    return super.getId();
  }
}
