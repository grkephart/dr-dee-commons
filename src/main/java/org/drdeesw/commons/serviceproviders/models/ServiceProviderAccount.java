/**
 * 
 */
package org.drdeesw.commons.serviceproviders.models;


import org.drdeesw.commons.common.models.NamedLongUniqueObject;


/**
 * 
 */
public interface ServiceProviderAccount extends NamedLongUniqueObject
{
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
   * Returns the accountHolder.
   * 
   * @return the accountHolder
   */
  ServiceProviderAccountHolder getAccountHolder();


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


  /**
   * Sets the accountHolder.
   * 
   * @param accountHolder the accountHolder to set
   */
  void setAccountHolder(
    ServiceProviderAccountHolder accountHolder);
}
