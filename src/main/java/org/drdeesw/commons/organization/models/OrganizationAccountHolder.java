/**
 * 
 */
package org.drdeesw.commons.organization.models;

import java.util.Set;

/**
 * Represents the account holder of an organization account.
 */
public interface OrganizationAccountHolder<A extends OrganizationAccount>
{
  enum AccountHolderType
  {
    ORGANIZATION, USER
  };

  /**
   * Returns the accountHolder type. Example: ORGANIZATION, USER
   * 
   * @return the accountHolder type
   */
  AccountHolderType getAccountHolderType();

  /**
   * @return
   */
  Set<A> getAccounts();

  /**
   * @param accounts
   */
  void setAccounts(Set<A> accounts);

}
