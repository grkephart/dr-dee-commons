/**
 * 
 */
package org.drdeesw.commons.organization.models.pojos;


import org.drdeesw.commons.common.models.pojos.AbstractLongUniquePojo;
import org.drdeesw.commons.organization.models.UserOrganizationMembership;


/**
 * 
 */
@SuppressWarnings("serial")
public class UserOrganizationMembershipPojo extends AbstractLongUniquePojo
    implements UserOrganizationMembership
{
  private Long    systemUserId;
  private Long    organizationId;
  private Long    roleId;
  private boolean enabled;

  @Override
  public Long getSystemUserId()
  {
    return this.systemUserId;
  }


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
  public void setSystemUserId(
    Long systemUserId)
  {
    this.systemUserId = systemUserId;
  }


  @Override
  public void setOrganizationId(
    Long organizationId)
  {
    this.organizationId = organizationId;
  }

}
