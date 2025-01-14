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

  /**
   * Returns the service provider account with the given service provider and internalId.
   * 
   * @param serviceProvider the service provider
   * @param internalId the internalId of the account
   * @return the service provider account
   */
//  Optional<ServiceProviderAccountEntity> findByProviderAndInternalId(
//    ServiceProviderPojo serviceProvider,
//    String internalId);

  /**
   * Returns the service provider account with the given client registration ID and internalId.
   * 
   * @param clientRegistrationId the client registration ID
   * @param internalId the internalId
   * @return the service provider account
   */
//  Optional<ServiceProviderAccountEntity> findByProviderClientRegistrationIdAndInternalId(
//    String clientRegistrationId,
//    String internalId);

}
