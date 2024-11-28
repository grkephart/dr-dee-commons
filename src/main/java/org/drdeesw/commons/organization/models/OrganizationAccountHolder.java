/**
 * 
 */
package org.drdeesw.commons.organization.models;


import java.util.Set;


/**
 * Represents the account holder of an organization account.
 */
public interface OrganizationAccountHolder
{

  /**
   * Returns the accounts of the account holder.
   * 
   * @return the accounts
   */
  Set<OrganizationAccount> getAccounts();


  /**
   * Sets the accounts of the account holder.
   * 
   * @param accounts the accounts to set
   */
  void setAccounts(
    Set<OrganizationAccount> accounts);

}
