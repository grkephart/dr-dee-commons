/**
 * 
 */
package org.drdeesw.commons.serviceproviders.repositories;


import java.util.Optional;

import org.drdeesw.commons.common.repositories.QueryRepository;
import org.drdeesw.commons.serviceproviders.models.entities.ServiceProviderAccountEntity;
import org.drdeesw.commons.serviceproviders.models.pojos.ServiceProviderAccountPojo;
import org.drdeesw.commons.serviceproviders.models.pojos.ServiceProviderPojo;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 */
public interface ServiceProviderAccountRepository
    extends JpaRepository<ServiceProviderAccountEntity, Long>, QueryRepository<ServiceProviderAccountEntity, Long>
{

  /**
   * Returns the service provider account with the given service provider and principal name.
   * 
   * @param serviceProvider the service provider
   * @param principalName the principal name
   * @return the service provider account
   */
  Optional<ServiceProviderAccountPojo> findByServiceProviderAndPrincipalName(
    ServiceProviderPojo serviceProvider,
    String principalName);

  /**
   * Returns the service provider account with the given client registration ID and principal name.
   * 
   * @param clientRegistrationId the client registration ID
   * @param principalName the principal name
   * @return the service provider account
   */
  Optional<ServiceProviderAccountPojo> findByClientRegistrationIdAndPrincipalName(
    String clientRegistrationId,
    String principalName);

}
