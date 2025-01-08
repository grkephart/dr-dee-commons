/**
 * 
 */
package org.drdeesw.commons.accounting.models;


import java.util.Set;

import org.drdeesw.commons.common.models.Auditable;
import org.drdeesw.commons.common.models.Describable;
import org.drdeesw.commons.common.models.Enableable;
import org.drdeesw.commons.common.models.NamedLongUniqueObject;
import org.drdeesw.commons.organization.models.OrganizationAccount;
import org.drdeesw.commons.serviceproviders.models.ServiceProviderAccount;


/**
 * Represents any entity that can hold accounts, such as:
 *  Person
 *  Organization
 *  Integrating system
 */
public interface AccountHolder extends NamedLongUniqueObject, Auditable, Describable, Enableable
{
  /**
   * Returns the accounts held by the AccountHolder.
   * 
   * @return the accounts held by the AccountHolder
   */
  @Deprecated // Use typed methods instead
  Set<Account> getHeldAccounts();


  /**
   * Gets the set of organization accounts held by this Account Holder.
   * 
   * @return the set of held organization accounts
   */
  Set<OrganizationAccount> getHeldOrganizationAccounts();


  /**
   * Gets the set of service provider accounts held by this Account Holder.
   * 
   * @return the set of held service provider accounts
   */
  Set<ServiceProviderAccount> getHeldServiceProviderAccounts();


  /**
   * Sets the accounts held by the AccountHolder.
   * 
   * @param accounts the accounts held by the AccountHolder
   */
  @Deprecated // Use typed methods instead
  void setHeldAccounts(
    Set<Account> accounts);


  /**
   * Sets the organization accounts held by this Account Holder.
   * 
   * @param accounts the set of held organization accounts
   */
  void setHeldOrganizationAccounts(
    Set<OrganizationAccount> accounts);


  /**
   * Sets the service provider accounts held by this Account Holder.
   * 
   * @param accounts the set of held service provider accounts
   */
  void setHeldServiceProviderAccounts(
    Set<ServiceProviderAccount> accounts);
}
