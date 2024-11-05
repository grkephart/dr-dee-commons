/**
 * 
 */
package org.drdeesw.commons.serviceproviders.repositories;


import org.drdeesw.commons.common.repositories.QueryRepository;
import org.drdeesw.commons.serviceproviders.models.entities.ServiceProviderAccountTokenHolderEntity;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 */
public interface ServiceProviderAccountTokenHolderRepository
    extends JpaRepository<ServiceProviderAccountTokenHolderEntity, Long>, QueryRepository<ServiceProviderAccountTokenHolderEntity, Long>
{

}
