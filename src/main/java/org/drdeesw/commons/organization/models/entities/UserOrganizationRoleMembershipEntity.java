/**
 * 
 */
package org.drdeesw.commons.organization.models.entities;


import org.drdeesw.commons.common.models.entities.AbstractLongUniqueEntity;
import org.drdeesw.commons.organization.models.UserOrganizationRoleMembership;


/**
 * 
 */
@SuppressWarnings("serial")
public class UserOrganizationRoleMembershipEntity extends AbstractLongUniqueEntity
    implements UserOrganizationRoleMembership
{
  private boolean enabled;
  private Long    organizationRoleId;
  private Long    systemUserId;

  @Override
  public Long getOrganizationRoleId()
  {
    return this.organizationRoleId;
  }


  /**
   * @return the systemUserId
   */
  public Long getSystemUserId()
  {
    return systemUserId;
  }


  @Override
  public boolean isEnabled()
  {
    return this.enabled;
  }


  @Override
  public void setEnabled(
    boolean enabled)
  {
    this.enabled = enabled;
  }


  /**
   * @param organizationRoleId the organizationRoleId to set
   */
  public void setOrganizationRoleId(
    Long organizationRoleId)
  {
    this.organizationRoleId = organizationRoleId;
  }


  @Override
  public void setSystemUserId(
    Long systemUserId)
  {
    this.systemUserId = systemUserId;
  }

}
