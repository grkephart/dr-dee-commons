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
 * Defines a user's membership in an organization.
 */
public interface OrganizationMember<O extends Organization<?, ?, ?>, R extends OrganizationMemberRole<?,?>> extends LongUniqueObject, Enableable, Auditable
{
  /**
   * Returns the organization.
   * 
   * @return the organization
   */
  public O getOrganization();


  /**
   * Returns the organization roles for this member.
   * 
   * @return the organization roles for this member.
   */
  public Set<R> getRoles();


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
    O organization);


  /**
   * Sets the organization roles for this member.
   * 
   * @param roles the organization roles to set
   */
  public void setRoles(
    Set<R> roles);


  /**
   * Sets the system user.
   * 
   * @param systemUser the systemUser to set
   */
  public void setSystemUser(
    SystemUser systemUser);
}
