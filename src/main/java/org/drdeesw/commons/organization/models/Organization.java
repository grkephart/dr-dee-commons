/**
 * 
 */
package org.drdeesw.commons.organization.models;


import org.drdeesw.commons.common.models.Auditable;
import org.drdeesw.commons.common.models.NamedLongUniqueObject;
import org.drdeesw.commons.serviceproviders.models.ServiceProviderAccountHolder;


/**
 * 
 */
public interface Organization extends NamedLongUniqueObject, ServiceProviderAccountHolder, Auditable
{
  /**
   * Returns the description of the organization.
   * 
   * @return the description of the organization
   */
  String getDescription();


  /**
   * @return the parent
   */
  Organization getParent();


  /**
   * @return the status
   */
  OrganizationStatus getStatus();


  /**
   * @return the type
   */
  OrganizationType getType();


  /**
   * Sets the description of the organization.
   * 
   * @param description the new description of the organization
   */
  void setDescription(
    String description);


  /**
   * @param parent the parent to set
   */
  void setParent(
    Organization parent);


  /**
   * @param status the status to set
   */
  void setStatus(
    OrganizationStatus status);


  /**
   * @param type the type to set
   */
  void setType(
    OrganizationType type);

}
