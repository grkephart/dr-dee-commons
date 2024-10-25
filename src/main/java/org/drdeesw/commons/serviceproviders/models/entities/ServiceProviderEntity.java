/**
 * 
 */
package org.drdeesw.commons.serviceproviders.models.entities;


import javax.persistence.Entity;
import javax.persistence.Table;

import org.drdeesw.commons.common.models.entities.AbstractNamedLongUniqueEntity;
import org.drdeesw.commons.serviceproviders.models.ServiceProvider;
import org.drdeesw.commons.serviceproviders.models.ServiceProviderType;


/**
 * 
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "service_providers")
public class ServiceProviderEntity extends AbstractNamedLongUniqueEntity implements ServiceProvider
{
  ServiceProviderTypeEntity type;

  /**
   * @return the type
   */
  @Override
  public ServiceProviderType getType()
  {
    return type;
  }


  /**
   * @param type the type to set
   */
  @Override
  public void setType(
    ServiceProviderType type)
  {
    this.type = (ServiceProviderTypeEntity)type;
  }
}
