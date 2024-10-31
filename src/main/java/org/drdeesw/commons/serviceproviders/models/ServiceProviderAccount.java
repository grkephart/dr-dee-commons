/**
 * 
 */
package org.drdeesw.commons.serviceproviders.models;


import org.drdeesw.commons.common.models.Describable;
import org.drdeesw.commons.common.models.LongUniqueObject;


/**
 * 
 */
public interface ServiceProviderAccount extends LongUniqueObject, Describable
{
  /**
   * Returns the accountHolder.
   * 
   * @return the accountHolder
   */
  ServiceProviderAccountHolder getAccountHolder();


  /**
   * Returns the service provider's internal ID of the account.
   * It could be an account number or a username or email or GUID.
   * 
   * @return  the service provider's internal ID of the account
   */
  String getInternalId();


  /**
   * Returns the serviceProvider.
   * 
   * @return the serviceProvider
   */
  ServiceProvider getServiceProvider();


  /**
   * Returns the serviceProviderAccountTokenHolder.
   * 
   * @return the serviceProviderAccountTokenHolder
   */
  ServiceProviderAccountTokenHolder getTokenHolder();


  /**
   * Sets the accountHolder.
   * 
   * @param accountHolder the accountHolder to set
   */
  void setAccountHolder(
    ServiceProviderAccountHolder accountHolder);


  /**
   * Sets the service provider's internal ID of the account.
   * It could be an account number or a username or email or GUID.
   * 
   * @param internalId the service provider's internal ID of the account to set
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
