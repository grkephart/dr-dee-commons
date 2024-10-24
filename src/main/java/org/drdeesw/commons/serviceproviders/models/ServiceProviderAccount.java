/**
 * 
 */
package org.drdeesw.commons.serviceproviders.models;


import org.drdeesw.commons.common.models.NamedLongUniqueObject;
import org.drdeesw.commons.security.models.User;


/**
 * 
 */
public interface ServiceProviderAccount<U extends User> extends NamedLongUniqueObject
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
  ServiceProviderAccountTokenHolder<U> getTokenHolder();


  /**
   * Returns the user.
   * 
   * @return the user
   */
  U getUser();


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
    ServiceProviderAccountTokenHolder<U> tokenHolder);


  /**
   * Sets the user.
   * 
   * @param user the user to set
   */
  void setUser(
    U user);
}
