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
   * @return the system userId
   */
  public OrganizationMember getMember();
  
  /**
   * @return the organizationRoleId
   */
  public OrganizationRole getRole();
   
  /**
   * @param member the system userId to set
   */
  public void setMember(OrganizationMember member);
  
  /**
   * @param role the organizationRoleId to set
   */
  public void setRole(OrganizationRole role);
  
}
