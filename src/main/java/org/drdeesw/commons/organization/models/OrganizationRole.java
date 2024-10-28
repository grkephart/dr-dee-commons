/**
 * 
 */
package org.drdeesw.commons.organization.models;


import org.drdeesw.commons.common.models.Auditable;
import org.drdeesw.commons.common.models.Enableable;
import org.drdeesw.commons.common.models.NamedLongUniqueObject;


/**
 * 
 */
public interface OrganizationRole extends NamedLongUniqueObject, Auditable, Enableable
{
  /**
  /**
   * Returns the description of the organization role.
   * 
   * @return the description of the organization role
   */
  String getDescription();


  /**
   * Returns the organization associated with this role.
   * 
   * @return the organization associated with this role
   */
  Organization getOrganization();


  /**
   * Sets the description of the organization role.
   * 
   * @param description the new description of the organization role
   */
  void setDescription(
    String description);


  /**
   * Sets the organization associated with this role.
   * 
   * @param organization the new organization associated with this role
   */
  void setOrganization(
    Organization organization);
}
