/**
 * 
 */
package org.drdeesw.commons.serviceproviders.services;

import java.util.Optional;

import org.drdeesw.commons.common.services.CrudService;
import org.drdeesw.commons.serviceproviders.models.pojos.ServiceProviderPojo;

/**
 * 
 */
public interface ServiceProviderService extends CrudService<ServiceProviderPojo, Long>
{

  /**
   * Finds a service provider by the OAuth2 client registration ID.
   * 
   * @param clientRegistrationId
   * @return the service provider
   */
  Optional<ServiceProviderPojo> findByClientRegistrationId(
    String clientRegistrationId);

}
