/**
 * 
 */
package org.drdeesw.commons.organization.models;


import java.util.Set;

import org.drdeesw.commons.common.models.Auditable;
import org.drdeesw.commons.common.models.Enableable;
import org.drdeesw.commons.common.models.LongUniqueObject;
import org.drdeesw.commons.security.models.SystemUser;


/**
 * Defines a user's membership in an organization in a particular role.
 * If a user is in multiple organizations or multiple roles in the same organization, then there will be multiple instances of this class.
 */
public interface OrganizationMember extends LongUniqueObject, Enableable, Auditable
{
  /**
   * Returns the organization.
   * 
   * @return the organization
   */
  public Organization getOrganization();


  /**
   * Returns the organization roles for this member.
   * 
   * @return the organization roles for this member.
   */
  public Set<OrganizationMemberRole> getRoles();


  /**
   * Returns the system user.
   * 
   * @return the system user
   */
  public SystemUser getSystemUser();


  /**
   * Sets the organization.
   * 
   * @param organization the organization to set
   */
  public void setOrganization(
    Organization organization);


  /**
   * Sets the organization roles for this member.
   * 
   * @param roles the organization roles to set
   */
  public void setRoles(
    Set<OrganizationMemberRole> roles);


  /**
   * Sets the system user.
   * 
   * @param systemUser the systemUser to set
   */
  public void setSystemUser(
    SystemUser systemUser);
}
