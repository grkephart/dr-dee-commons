/**
 * 
 */
package org.drdeesw.commons.serviceproviders.repositories;


import org.drdeesw.commons.common.repositories.QueryRepository;
import org.drdeesw.commons.serviceproviders.models.entities.ServiceProviderTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 */
public interface ServiceProviderTypeRepository
    extends JpaRepository<ServiceProviderTypeEntity, Long>, QueryRepository<ServiceProviderTypeEntity, Long>
{

}
