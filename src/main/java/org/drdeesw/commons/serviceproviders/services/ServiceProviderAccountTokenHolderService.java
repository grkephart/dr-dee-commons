package org.drdeesw.commons.serviceproviders.services;


import java.util.Optional;

import org.drdeesw.commons.common.services.CrudService;
import org.drdeesw.commons.serviceproviders.models.pojos.ServiceProviderAccountTokenHolderPojo;


public interface ServiceProviderAccountTokenHolderService extends CrudService<ServiceProviderAccountTokenHolderPojo, Long>
{

  /**
   * Returns the account token holder for the given service provider account.
   * 
   * @param clientRegistrationId the service provider client registration id
   * @param principalName the principal
   * @return the account token holder or empty if not found
   */
  Optional<ServiceProviderAccountTokenHolderPojo> find(
    String clientRegistrationId,
    String principalName);

  /**
   * Finds or creates an account token holder for the given service provider account.
   * 
   * @param clientRegistrationId the service provider client registration id
   * @param principalName the principal
   * @return the account token holder
   * @throws Exception 
   */
  ServiceProviderAccountTokenHolderPojo findOrCreate(
    String clientRegistrationId,
    String principalName) throws Exception;

}