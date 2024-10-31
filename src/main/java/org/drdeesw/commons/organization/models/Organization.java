/**
 * 
 */
package org.drdeesw.commons.organization.models;


import org.drdeesw.commons.common.models.Auditable;
import org.drdeesw.commons.common.models.Describable;
import org.drdeesw.commons.common.models.NamedLongUniqueObject;
import org.drdeesw.commons.serviceproviders.models.ServiceProviderAccountHolder;


/**
 * 
 */
public interface Organization
    extends NamedLongUniqueObject, ServiceProviderAccountHolder, Auditable, Describable
{

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
