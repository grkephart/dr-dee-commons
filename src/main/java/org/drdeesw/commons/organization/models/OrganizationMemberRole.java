/**
 * 
 */
package org.drdeesw.commons.organization.models;

import org.drdeesw.commons.common.models.Auditable;
import org.drdeesw.commons.common.models.Enableable;
import org.drdeesw.commons.common.models.LongUniqueObject;

/**
 * Defines a user's membership in an organization role.
 */
public interface OrganizationMemberRole extends LongUniqueObject, Enableable, Auditable
{
  /**
   * Returns the organization member.
   * 
   * @return the member
   */
  public OrganizationMember getMember();
  
  /**
   * Returns the organizationRole.
   * 
   * @return the organizationRole
   */
  public OrganizationRole getRole();
   
  /**
   * @param member the member to set
   */
  public void setMember(OrganizationMember member);
  
  /**
   * @param role the organizationRole to set
   */
  public void setRole(OrganizationRole role);
  
}
