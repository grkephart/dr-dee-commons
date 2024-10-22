/**
 * 
 */
package org.drdeesw.commons.serviceproviders.models;

import org.drdeesw.commons.common.models.NamedLongUniqueObject;

/**
 * 
 */
public interface ServiceProvider extends NamedLongUniqueObject
{
  /**
   * Returns the type of the service provider.
   * 
   * @return the type
   */
  ServiceProviderType getType();
  
  /**
   * Sets the type of the service provider.
   * 
   * @param type the type
   */
  void setType(ServiceProviderType type);
}
