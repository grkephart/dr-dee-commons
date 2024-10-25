/**
 * 
 */
package org.drdeesw.commons.organization.models;

import org.drdeesw.commons.common.models.LongUniqueObject;

/**
 * 
 */
public interface UserOrganizationRoleMembership extends LongUniqueObject
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
   * @return the enabled status
   */
  public boolean isEnabled();
  
  /**
   * @param enabled the enabled status to set
   */
  public void setEnabled(boolean enabled);
  
  /**
   * @param systemUserId the system userId to set
   */
  public void setSystemUserId(Long systemUserId);
  
  /**
   * @param organizationRoleId the organizationRoleId to set
   */
  public void setOrganizationRoleId(Long organizationRoleId);
  
}
