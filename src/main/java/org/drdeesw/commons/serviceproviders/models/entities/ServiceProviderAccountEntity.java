/**
 * 
 */
package org.drdeesw.commons.serviceproviders.models.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


/**
 * 
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "service_provider_accounts")
public class ServiceProviderAccountEntity extends AbstractServiceProviderAccountEntity
{

  @Override
  @Column(name="service_provider_account_id")
  public Long getId()
  {
    return super.getId();
  }

}
