/**
 * 
 */
package org.drdeesw.commons.serviceproviders.models;


import org.drdeesw.commons.accounting.models.Account;
import org.drdeesw.commons.security.models.User;


/**
 * Represents a service provider account. Contains account information and tokens.
 */
public interface ServiceProviderAccount<//
    U extends User<?>, //
    H extends ServiceProviderAccountHolder<U, ?>, //
    P extends ServiceProviderAccountProvider<U, ?>> //
    extends Account<U, H, P>
{
  /**
   * Returns the token holder for the account.
   * 
   * @return the serviceProviderAccountTokenHolder
   */
  ServiceProviderAccountTokenHolder<?> getTokenHolder();


  /**
   * Sets the serviceProviderAccountTokenHolder.
   * 
   * @param tokenHolder the serviceProviderAccountTokenHolder
   */
  void setTokenHolder(
    ServiceProviderAccountTokenHolder<?> tokenHolder);
}
