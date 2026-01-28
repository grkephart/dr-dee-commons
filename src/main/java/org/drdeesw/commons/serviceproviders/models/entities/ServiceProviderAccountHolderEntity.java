/**
 * 
 */
package org.drdeesw.commons.serviceproviders.models.entities;


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
@Table(name = "ServiceProvider_account_holders")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Access(AccessType.PROPERTY)
public class ServiceProviderAccountHolderEntity
    extends AbstractServiceProviderAccountHolderEntity<UserEntity, ServiceProviderAccountEntity>
{

  /**
   * Hibernate constructor
   */
  public ServiceProviderAccountHolderEntity()
  {

  }


  @Override
  @Column(name = "account_holder_id")
  public Long getId()
  {
    return super.getId();
  }


}
