/**
 * 
 */
package org.drdeesw.commons.serviceproviders.repositories;


import org.drdeesw.commons.common.repositories.QueryRepository;
import org.drdeesw.commons.serviceproviders.models.entities.ServiceProviderAccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 */
public interface ServiceProviderAccountRepository
    extends JpaRepository<ServiceProviderAccountEntity, Long>, QueryRepository<ServiceProviderAccountEntity, Long>
{

}
