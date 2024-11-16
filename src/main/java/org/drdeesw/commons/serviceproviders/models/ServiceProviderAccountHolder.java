/**
 * 
 */
package org.drdeesw.commons.serviceproviders.models;

import org.drdeesw.commons.organization.models.OrganizationAccountHolder;
import org.drdeesw.commons.organization.models.OrganizationMember;

/**
 * Represents the account holder of a service provider account.
 */
public interface ServiceProviderAccountHolder extends OrganizationAccountHolder<ServiceProvider, ServiceProviderAccount>
{
  enum AccountHolderType {
    ORGANIZATION, USER
  };

  /**
   * Returns the account type. Example: ORGANIZATION, USER
   * 
   * @return the account holder type
   */
  AccountHolderType getAccountHolderType();


}
