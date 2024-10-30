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
@Table(name = "service_providers")
@AttributeOverride(name = "id", column = @Column(name = "service_provider_id"))
public class ServiceProviderEntity extends AbstractServiceProviderEntity
{
  
  public ServiceProviderEntity()
  {
    super();
  }
}
