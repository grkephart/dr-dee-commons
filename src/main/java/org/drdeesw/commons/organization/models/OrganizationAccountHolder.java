/**
 * 
 */
package org.drdeesw.commons.organization.models;

import org.drdeesw.commons.common.models.UniqueObject;

/**
 * Represents the account holder of an organization account.
 */
public interface OrganizationAccountHolder extends UniqueObject<Long>
{
  enum AccountHolderType {
    ORGANIZATION, USER
  };

  /**
   * Returns the accountHolder type. Example: ORGANIZATION, USER
   * 
   * @return the accountHolder type
   */
  AccountHolderType getAccountHolderType();


}
