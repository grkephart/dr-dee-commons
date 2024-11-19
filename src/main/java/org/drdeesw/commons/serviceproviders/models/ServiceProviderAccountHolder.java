/**
 * 
 */
package org.drdeesw.commons.serviceproviders.models;


import java.util.Set;


/**
 * Represents the account holder of a service provider account.
 */
public interface ServiceProviderAccountHolder<A extends ServiceProviderAccount>
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


  /**
   * @return
   */
  Set<A> getAccounts();


  /**
   * @param accounts
   */
  void setAccounts(
    Set<A> accounts);

}
