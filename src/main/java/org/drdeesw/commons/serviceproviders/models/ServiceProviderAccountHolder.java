/**
 * 
 */
package org.drdeesw.commons.serviceproviders.models;


/**
 * Represents the account holder of a service provider account.
 */
public interface ServiceProviderAccountHolder
{
  enum AccountType {
    ORGANIZATION, USER
  };

  /**
   * Returns the account type. Example: ORGANIZATION, USER
   * 
   * @return the account type
   */
  AccountType getAccountType();


}
