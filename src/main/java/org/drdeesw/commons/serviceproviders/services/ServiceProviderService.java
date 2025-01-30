/**
 * 
 */
package org.drdeesw.commons.serviceproviders.services;

import java.util.Optional;

import org.drdeesw.commons.common.services.CrudService;
import org.drdeesw.commons.serviceproviders.models.ServiceProvider;
import org.drdeesw.commons.serviceproviders.models.pojos.ServiceProviderAccountPojo;
import org.drdeesw.commons.serviceproviders.models.pojos.ServiceProviderPojo;

/**
 * 
 */
public interface ServiceProviderService extends CrudService<ServiceProviderPojo, Long>
{

  /**
   * Finds a service provider by the OAuth2 client registration ID.
   * 
   * @param clientRegistrationId the OAuth2 client registration ID
   * @return the service provider
   */
  Optional<ServiceProviderPojo> findByClientRegistrationId(
    String clientRegistrationId);

  /**
   * Finds a service provider by the OAuth2 client registration ID, or creates a new service provider if one does not exist.
   * 
   * @param clientRegistrationId the OAuth2 client registration ID
   * @return the service provider
   */
  ServiceProvider<ServiceProviderAccountPojo> findOrCreate(
    String clientRegistrationId);

}
