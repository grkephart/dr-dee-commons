/**
 * 
 */
package org.drdeesw.commons.serviceproviders.models;


/**
 * 
 */
public interface ServiceProviderAccountHolder
{
  enum AccountType {
    ORGANIZATION, USER
  };

  /**
   * Returns the account type.
   * 
   * @return the account type
   */
  AccountType getAccountType();


}
