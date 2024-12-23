/**
 * 
 */
package org.drdeesw.commons.serviceproviders.models.entities;


import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import org.drdeesw.commons.accounting.models.entities.AccountEntity;


/**
 * 
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "service_provider_accounts")
@Inheritance(strategy = InheritanceType.JOINED)
@AttributeOverride(name = "id", column = @Column(name = "service_provider_account_id"))
public class ServiceProviderAccountEntity extends AccountEntity
{

  public ServiceProviderAccountEntity()
  {

  }

}
