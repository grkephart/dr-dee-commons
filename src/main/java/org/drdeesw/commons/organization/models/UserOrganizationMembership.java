/**
 * 
 */
package org.drdeesw.commons.organization.models;

import org.drdeesw.commons.common.models.LongUniqueObject;

/**
 * 
 */
public interface UserOrganizationMembership extends LongUniqueObject
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
   * @param organizationId the organizationId to set
   */
  public void setOrganizationId(Long organizationId);
}
