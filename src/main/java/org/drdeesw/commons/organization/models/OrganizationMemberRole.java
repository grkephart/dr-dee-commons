/**
 * 
 */
package org.drdeesw.commons.organization.models;


import org.drdeesw.commons.common.models.Auditable;
import org.drdeesw.commons.common.models.Enableable;
import org.drdeesw.commons.common.models.LongUniqueObject;
import org.drdeesw.commons.security.models.User;


/**
 * Defines a user's membership in an organization role.
 */
public interface OrganizationMemberRole<//
    U extends User<?>, //
    M extends OrganizationMember<U, ?, ?>, //
    R extends OrganizationRole<U, ?, ?>> //
    extends LongUniqueObject, Enableable, Auditable<U>
{
  /**
   * Returns the organization member.
   * 
   * @return the member
   */
  public M getMember();


  /**
   * Returns the organizationRole.
   * 
   * @return the organizationRole
   */
  public R getRole();


  /**
   * @param member the member to set
   */
  public void setMember(
    M member);


  /**
   * @param role the organizationRole to set
   */
  public void setRole(
    R role);

}
