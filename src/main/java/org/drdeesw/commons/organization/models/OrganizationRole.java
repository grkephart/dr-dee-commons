/**
 * 
 */
package org.drdeesw.commons.organization.models;


import java.util.Set;

import org.drdeesw.commons.common.models.Auditable;
import org.drdeesw.commons.common.models.Describable;
import org.drdeesw.commons.common.models.Enableable;
import org.drdeesw.commons.common.models.NamedLongUniqueObject;
import org.drdeesw.commons.security.models.User;


/**
 * 
 */
public interface OrganizationRole<O extends Organization<?,?,?,?,?,U>, MR extends OrganizationMemberRole<?, ?,U>, U extends User<?>>
    extends NamedLongUniqueObject, Auditable<U>, Enableable, Describable
{

  /**
   * Returns the organization members for this role.
   * 
   * @return the organization members for this role.
   */
  public Set<MR> getMemberRoles();


  /**
   * Returns the organization associated with this role.
   * 
   * @return the organization associated with this role
   */
  O getOrganization();


  /**
   * Sets the organization member roles.
   * 
   * @param memberRoles the member roles to set
   */
  public void setMemberRoles(
    Set<MR> memberRoles);


  /**
   * Sets the organization associated with this role.
   * 
   * @param organization the new organization associated with this role
   */
  void setOrganization(
    O organization);
}
