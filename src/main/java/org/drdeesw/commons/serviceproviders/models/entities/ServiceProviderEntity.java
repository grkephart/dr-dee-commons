/**
 * 
 */
package org.drdeesw.commons.serviceproviders.models.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.drdeesw.commons.common.models.EmbeddedAuditable;


/**
 * 
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "service_providers")
public class ServiceProviderEntity extends AbstractServiceProviderEntity
{

  /**
   * Hibernate
   */
  public ServiceProviderEntity()
  {
  }

  /**
   * Unit testing.
   * 
   * @param audit 
   */
  public ServiceProviderEntity(EmbeddedAuditable audit)
  {
    super(audit);
  }

  @Override
  @Column(name="service_provider_id")
  public Long getId()
  {
    return super.getId();
  }

  
}
