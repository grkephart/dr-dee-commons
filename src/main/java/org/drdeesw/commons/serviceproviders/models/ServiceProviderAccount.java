/**
 * 
 */
package org.drdeesw.commons.serviceproviders.models;


import org.drdeesw.commons.accounting.models.Account;


/**
 * Represents a service provider account. Contains account information and tokens.
 */
public interface ServiceProviderAccount extends Account
{

  /**
   * Returns the token holder for the account.
   * 
   * @return the serviceProviderAccountTokenHolder
   */
  ServiceProviderAccountTokenHolder getTokenHolder();


  /**
   * Sets the serviceProviderAccountTokenHolder.
   * 
   * @param tokenHolder the serviceProviderAccountTokenHolder
   */
  void setTokenHolder(
    ServiceProviderAccountTokenHolder tokenHolder);
}
