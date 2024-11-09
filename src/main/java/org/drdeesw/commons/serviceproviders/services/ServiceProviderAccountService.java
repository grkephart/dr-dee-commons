package org.drdeesw.commons.serviceproviders.services;


import java.util.List;
import java.util.Optional;

import org.drdeesw.commons.common.services.CrudService;
import org.drdeesw.commons.serviceproviders.models.pojos.ServiceProviderAccountPojo;
import org.drdeesw.commons.serviceproviders.models.pojos.ServiceProviderPojo;


public interface ServiceProviderAccountService extends CrudService<ServiceProviderAccountPojo, Long>
{
  /**
   * Returns all accounts.
   * 
   * @return all accounts
   */
  List<ServiceProviderAccountPojo> getAllAccounts();

  /**
   * Returns the account for the given principal name and service provider.
   * 
   * @param serviceProvider the service provider
   * @param principalName the principal
   * @return the account or empty if not found
   */
  Optional<ServiceProviderAccountPojo> find(
    ServiceProviderPojo serviceProvider,
    String principalName);

  /**
   * Find or create an account for the given principal name and service provider.
   * 
   * @param clientRegistrationId the client registration id of the service provider
   * @param principalName the principal name
   * @return the account or empty if not found
   */
  Optional<ServiceProviderAccountPojo> find(
    String clientRegistrationId,
    String principalName);

  /**
   * Find or create an account for the given principal name and service provider.
   * 
   * @param clientRegistrationId the client registration id of the service provider
   * @param principalName the principal
   * @return the account or empty if not found
   * @throws Exception 
   */
  ServiceProviderAccountPojo findOrCreate(
    String clientRegistrationId,
    String principalName) throws Exception;

}