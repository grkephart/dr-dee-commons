/**
 * 
 */
package org.drdeesw.commons.organization.models.pojos;


import org.drdeesw.commons.common.models.pojos.AbstractLongUniquePojo;
import org.drdeesw.commons.organization.models.OrganizationRoleMember;


/**
 * 
 */
@SuppressWarnings("serial")
public class OrganizationRoleMemberPojo extends AbstractLongUniquePojo
    implements OrganizationRoleMember
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
