/**
 * 
 */
package org.drdeesw.commons.serviceproviders.models.entities;


import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


/**
 * 
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "service_provider_account_token_holders")
@AttributeOverride(name = "id", column = @Column(name = "service_provider_account_token_holder_id"))
public class ServiceProviderAccountTokenHolderEntity
    extends AbstractServiceProviderAccountTokenHolderEntity
{

  public ServiceProviderAccountTokenHolderEntity()
  {
    super();
  }
}
