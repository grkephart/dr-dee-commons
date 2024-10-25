/**
 * 
 */
package org.drdeesw.commons.organization.models.entities;


import org.drdeesw.commons.common.models.entities.AbstractLongUniqueEntity;
import org.drdeesw.commons.organization.models.UserOrganizationMembership;


/**
 * 
 */
@SuppressWarnings("serial")
public class UserOrganizationMembershipEntity extends AbstractLongUniqueEntity
    implements UserOrganizationMembership
{
  private boolean enabled;
  private Long    organizationId;
  private Long    roleId;
  private Long    systemUserId;

  @Override
  public Long getOrganizationId()
  {
    return this.organizationId;
  }


  @Override
  public Long getRoleId()
  {
    return this.roleId;
  }


  @Override
  public Long getSystemUserId()
  {
    return this.systemUserId;
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


  @Override
  public void setOrganizationId(
    Long organizationId)
  {
    this.organizationId = organizationId;
  }


  @Override
  public void setSystemUserId(
    Long systemUserId)
  {
    this.systemUserId = systemUserId;
  }

}
