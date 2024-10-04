/**
 * 
 */
package org.drdeesw.commons.modules.serviceproviders.models;

import org.drdeesw.commons.modules.common.models.NamedLongUniqueObject;

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
