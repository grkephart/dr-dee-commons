/**
 * 
 */
package org.drdeesw.commons.organization.models;


import java.util.Set;

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
   * Returns the organization members for this role.
   * 
   * @return the organization members for this role.
   */
  public Set<OrganizationMemberRole> getMemberRoles();


  /**
   * Returns the organization associated with this role.
   * 
   * @return the organization associated with this role
   */
  Organization getOrganization();


  /**
   * Sets the organization member roles.
   * 
   * @param memberRoles the member roles to set
   */
  public void setMemberRoles(
    Set<OrganizationMemberRole> memberRoles);


  /**
   * Sets the organization associated with this role.
   * 
   * @param organization the new organization associated with this role
   */
  void setOrganization(
    Organization organization);
}
