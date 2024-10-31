/**
 * 
 */
package org.drdeesw.commons.organization.models;


import org.drdeesw.commons.common.models.Auditable;
import org.drdeesw.commons.common.models.Describable;
import org.drdeesw.commons.common.models.Enableable;
import org.drdeesw.commons.common.models.NamedLongUniqueObject;


/**
 * 
 */
public interface OrganizationRole extends NamedLongUniqueObject, Auditable, Enableable, Describable
{

  /**
   * Returns the organization associated with this role.
   * 
   * @return the organization associated with this role
   */
  Organization getOrganization();


  /**
   * Sets the organization associated with this role.
   * 
   * @param organization the new organization associated with this role
   */
  void setOrganization(
    Organization organization);
}
