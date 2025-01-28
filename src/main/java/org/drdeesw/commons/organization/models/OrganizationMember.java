/**
 * 
 */
package org.drdeesw.commons.organization.models;


import java.util.Set;

import org.drdeesw.commons.common.models.Auditable;
import org.drdeesw.commons.common.models.Enableable;
import org.drdeesw.commons.common.models.LongUniqueObject;
import org.drdeesw.commons.security.models.User;


/**
 * Defines a user's membership in an organization.
 */
public interface OrganizationMember<R extends OrganizationMemberRole<?,?>, O extends Organization<?,?,?>, U extends User<?>> extends LongUniqueObject, Enableable, Auditable
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
  public Set<R> getMemberRoles();


  /**
   * Returns the system user.
   * 
   * @return the system user
   */
  public U getUser();


  /**
   * Sets the organization.
   * 
   * @param organization the organization to set
   */
  public void setOrganization(
    O organization);


  /**
   * Sets the memberRoles for this member.
   * 
   * @param memberRoles the memberRoles to set
   */
  public void setMemberRoles(
    Set<R> memberRoles);


  /**
   * Sets the system user.
   * 
   * @param systemUser the systemUser to set
   */
  public void setUser(
    U systemUser);
}
