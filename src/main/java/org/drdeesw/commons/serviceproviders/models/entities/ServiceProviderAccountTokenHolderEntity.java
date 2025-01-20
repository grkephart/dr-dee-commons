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


/**
 * 
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "service_provider_account_token_holders")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Access(AccessType.PROPERTY)
public class ServiceProviderAccountTokenHolderEntity
    extends AbstractServiceProviderAccountTokenHolderEntity
{

  public ServiceProviderAccountTokenHolderEntity()
  {
    super();
  }

  @Override
  @Column(name="service_provider_account_token_holder_id")
  public Long getId()
  {
    return super.getId();
  }
}
