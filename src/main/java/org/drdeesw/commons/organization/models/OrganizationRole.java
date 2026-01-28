/**
 * 
 */
package org.drdeesw.commons.organization.models;


import java.util.Set;

import org.drdeesw.commons.common.models.Auditable;
import org.drdeesw.commons.common.models.Describable;
import org.drdeesw.commons.common.models.Enableable;
import org.drdeesw.commons.common.models.NamedLongUniqueObject;
import org.drdeesw.commons.security.models.Role;


/**
 * Defines roles in an organization. For example, a political campaign could
 * have Chair, Treasurer, Field Director, etc, as roles, while a company could
 * have CEO, CFO, CTO, etc.
 */
public interface OrganizationRole<O extends Organization<?, ?, ?>, M extends OrganizationMemberRole<?, ?>>
    extends NamedLongUniqueObject, Auditable, Enableable, Describable
{

  /**
   * Returns the organization members for this role.
   * 
   * @return the organization members for this role.
   */
  public Set<M> getMembers();

  /**
   * Returns the organization associated with this role.
   * 
   * @return the organization associated with this role
   */
  O getOrganization();

  /**
   * @return
   */
  Role getRole();


  /**
   * Sets the organization members for this role.
   * 
   * @param members the organization members to set
   */
  public void setMembers(Set<M> members);


  /**
   * Sets the organization associated with this role.
   * 
   * @param organization the new organization associated with this role
   */
  void setOrganization(O organization);


  /**
   * @param role
   */
  void setRole(Role role);
}
