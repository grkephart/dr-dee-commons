/**
 * 
 */
package org.drdeesw.commons.accounting.models;


import java.util.Set;

import org.drdeesw.commons.common.models.Auditable;
import org.drdeesw.commons.common.models.Describable;
import org.drdeesw.commons.common.models.Enableable;
import org.drdeesw.commons.common.models.Named;
import org.drdeesw.commons.organization.models.OrganizationAccount;
import org.drdeesw.commons.serviceproviders.models.ServiceProviderAccount;


/**
 * 
 */
public interface AccountProvider extends Named, Auditable, Describable, Enableable
{
  /**
   * Returns the accounts provided by the AccountProvider.
   * 
   * @return the accounts provided by the AccountProvider
   */
  Set<Account> getProvidedAccounts();


  /**
   * Gets the set of organization accounts provided by this Account Provider.
   *
   * @return the set of provided organization accounts
   */
  Set<OrganizationAccount> getProvidedOrganizationAccounts();


  /**
   * Gets the set of service provider accounts provided by this Account Provider.
   *
   * @return the set of provided service provider accounts
   */
  Set<ServiceProviderAccount> getProvidedServiceProviderAccounts();


  /**
   * Sets the accounts provided by the AccountProvider.
   * 
   * @param providedAccounts the accounts provided by the AccountProvider.
   */
  void setProvidedAccounts(
    Set<Account> providedAccounts);


  /**
   * Sets the organization accounts provided by this Account Provider.
   *
   * @param accounts the set of provided organization accounts
   */
  void setProvidedOrganizationAccounts(
    Set<OrganizationAccount> accounts);


  /**
   * Sets the service provider accounts provided by this Account Provider.
   *
   * @param accounts the set of provided service provider accounts
   */
  void setProvidedServiceProviderAccounts(
    Set<ServiceProviderAccount> accounts);
}
