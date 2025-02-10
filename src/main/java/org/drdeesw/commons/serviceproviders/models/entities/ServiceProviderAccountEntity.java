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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.drdeesw.commons.accounting.models.entities.AccountHolderEntity;
import org.drdeesw.commons.security.models.entities.UserEntity;
import org.drdeesw.commons.serviceproviders.models.ServiceProviderAccountTokenHolder;


/**
 * 
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "service_provider_accounts")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Access(AccessType.PROPERTY)
public class ServiceProviderAccountEntity extends
    AbstractServiceProviderAccountEntity<UserEntity, AccountHolderEntity, ServiceProviderEntity>
{
  private ServiceProviderAccountTokenHolderEntity tokenHolder;

  @Override
  @Column(name = "service_provider_account_id")
  public Long getId()
  {
    return super.getId();
  }


  @Override
  @ManyToOne
  @JoinColumn(name = "token_holder_id", nullable = false)
  public ServiceProviderAccountTokenHolderEntity getTokenHolder()
  {
    return this.tokenHolder;
  }


  @Override
  public void setTokenHolder(
    ServiceProviderAccountTokenHolder<?> tokenHolder)
  {
    this.tokenHolder = (ServiceProviderAccountTokenHolderEntity)tokenHolder;
  }

}
