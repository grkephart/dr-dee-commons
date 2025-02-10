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

import org.drdeesw.commons.common.models.EmbeddedAuditable;
import org.drdeesw.commons.security.models.entities.UserEntity;


/**
 * 
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "service_providers")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Access(AccessType.PROPERTY)
public class ServiceProviderEntity
    extends AbstractServiceProviderEntity<UserEntity, ServiceProviderAccountEntity>
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
  public ServiceProviderEntity(EmbeddedAuditable<UserEntity> audit)
  {
    super(audit);
  }


  @Override
  @Column(name = "service_provider_id")
  public Long getId()
  {
    return super.getId();
  }

}
