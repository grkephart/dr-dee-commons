package org.drdeesw.commons.serviceproviders.services;


import java.util.List;
import java.util.Optional;

import org.drdeesw.commons.common.services.CrudService;
import org.drdeesw.commons.serviceproviders.models.ServiceProvider;
import org.drdeesw.commons.serviceproviders.models.pojos.ServiceProviderAccountPojo;


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
   * @param internalId the internalId
   * @return the account or empty if not found
   */
  Optional<ServiceProviderAccountPojo> find(
    ServiceProvider<ServiceProviderAccountPojo> serviceProvider,
    String internalId);

  /**
   * Find or create an account for the given principal name and service provider.
   * 
   * @param clientRegistrationId the client registration id of the service provider
   * @param internalId the internalId
   * @return the account or empty if not found
   */
  Optional<ServiceProviderAccountPojo> find(
    String clientRegistrationId,
    String internalId);

  /**
   * Find or create an account for the given principal name and service provider.
   * 
   * @param clientRegistrationId the client registration id of the service provider
   * @param internalId the internalId
   * @return the account or empty if not found
   * @throws Exception 
   */
  ServiceProviderAccountPojo findOrCreate(
    String clientRegistrationId,
    String internalId) throws Exception;

}