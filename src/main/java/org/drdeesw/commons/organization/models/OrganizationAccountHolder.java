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
   * Returns the accounts of the account holder.
   * 
   * @return the accounts
   */
  Set<A> getAccounts();

  /**
   * Sets the accounts of the account holder.
   * 
   * @param accounts the accounts to set
   */
  void setAccounts(Set<A> accounts);

}
