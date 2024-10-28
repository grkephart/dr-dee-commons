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
public interface OrganizationRoleMember extends LongUniqueObject, Enableable, Auditable
{
  /**
   * @return the system userId
   */
  public Long getSystemUserId();
  
  /**
   * @return the organizationRoleId
   */
  public Long getOrganizationRoleId();
   
  /**
   * @param systemUserId the system userId to set
   */
  public void setSystemUserId(Long systemUserId);
  
  /**
   * @param organizationRoleId the organizationRoleId to set
   */
  public void setOrganizationRoleId(Long organizationRoleId);
  
}
