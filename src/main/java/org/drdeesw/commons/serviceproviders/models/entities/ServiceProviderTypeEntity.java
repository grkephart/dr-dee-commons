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
@Table(name = "service_provider_types")
@AttributeOverride(name = "id", column = @Column(name = "service_provider_type_id"))
public class ServiceProviderTypeEntity extends AbstractServiceProviderTypeEntity
{
  
  public ServiceProviderTypeEntity()
  {
    super();
  }
}
