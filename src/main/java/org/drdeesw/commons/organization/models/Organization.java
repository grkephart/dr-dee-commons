/**
 * 
 */
package org.drdeesw.commons.organization.models;

import org.drdeesw.commons.common.models.NamedLongUniqueObject;
import org.drdeesw.commons.serviceproviders.models.ServiceProviderAccountHolder;

/**
 * 
 */
public interface Organization extends NamedLongUniqueObject, ServiceProviderAccountHolder
{
  /**
   * Returns the description of the organization.
   * 
   * @return the description of the organization
   */
  String getDescription();
  
  /**
   * Sets the description of the organization.
   * 
   * @param description the new description of the organization
   */
  void setDescription(String description);
}
