/**
 * 
 */
package org.drdeesw.commons.serviceproviders.models;

import org.drdeesw.commons.common.models.Describable;
import org.drdeesw.commons.common.models.LongUniqueObject;

/**
 * Represents a service provider account. Contains account information and tokens.
 */
public interface ServiceProviderAccount extends LongUniqueObject, Describable
{

  /**
   * Returns the organization's internal ID of the account.
   * It could be an account number or a username or email or GUID.
   * 
   * @return  the organization's internal ID of the account
   */
  String getInternalId();


  /**
   * Returns the serviceProvider.
   * 
   * @return the serviceProvider
   */
  ServiceProvider getServiceProvider();


  /**
   * Returns the token holder for the account.
   * 
   * @return the serviceProviderAccountTokenHolder
   */
  ServiceProviderAccountTokenHolder getTokenHolder();


  /**
   * Sets the organization's internal ID of the account.
   * It could be an account number or a username or email or GUID.
   * 
   * @param internalId the organization's internal ID of the account to set
   */
  void setInternalId(
    String internalId);


  /**
   * Sets the serviceProvider.
   * 
   * @param serviceProvider the serviceProvider to set
   */
  void setServiceProvider(
    ServiceProvider serviceProvider);


  /**
   * Sets the serviceProviderAccountTokenHolder.
   * 
   * @param tokenHolder the serviceProviderAccountTokenHolder
   */
  void setTokenHolder(
    ServiceProviderAccountTokenHolder tokenHolder);
}
