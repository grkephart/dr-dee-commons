/**
 * 
 */
package org.drdeesw.commons.serviceproviders.models;

import org.drdeesw.commons.common.models.UniqueObject;

/**
 * Represents the account holder of a service provider account.
 */
public interface ServiceProviderAccountHolder extends UniqueObject<Long>
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
