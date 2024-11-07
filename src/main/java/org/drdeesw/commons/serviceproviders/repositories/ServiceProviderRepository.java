/**
 * 
 */
package org.drdeesw.commons.serviceproviders.repositories;


import java.util.Optional;

import org.drdeesw.commons.common.repositories.QueryRepository;
import org.drdeesw.commons.serviceproviders.models.entities.ServiceProviderEntity;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 */
public interface ServiceProviderRepository
    extends JpaRepository<ServiceProviderEntity, Long>, QueryRepository<ServiceProviderEntity, Long>
{

  /**
   * Finds a service provider by the OAuth2 client registration ID.
   * 
   * @param clientRegistrationId the OAuth2 client registration ID
   * @return
   */
  Optional<ServiceProviderEntity> findByClientRegistrationId(
    String clientRegistrationId);

}
