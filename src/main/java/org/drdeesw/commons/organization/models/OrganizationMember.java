/**
 * 
 */
package org.drdeesw.commons.organization.models;

import org.drdeesw.commons.common.models.Auditable;
import org.drdeesw.commons.common.models.Enableable;
import org.drdeesw.commons.common.models.LongUniqueObject;

/**
 * Defines a user's membership in an organization.
 */
public interface OrganizationMember extends LongUniqueObject, Enableable, Auditable
{
  /**
   * @return the system userId
   */
  public Long getSystemUserId();
  
  /**
   * @return the organizationId
   */
  public Long getOrganizationId();
  
  /**
   * @return the organization role ID
   */
  public Long getRoleId();
   
  /**
   * @param systemUserId the system userId to set
   */
  public void setSystemUserId(Long systemUserId);
  
  /**
   * @param organizationId the organizationId to set
   */
  public void setOrganizationId(Long organizationId);
}
