/**
 * 
 */
package org.drdeesw.commons.security.models;

import org.drdeesw.commons.common.models.LongUniqueObject;

/**
 * Represents the membership relationship between a User and a Group.
 *
 * A GroupMember indicates that a specific User belongs to a specific Group.
 * Membership itself conveys no permissions unless the Group is associated
 * with Authorities.
 *
 * In the JDBC schema, this maps to the {@code group_members} table.
 *
 * Examples:
 * <ul>
 *   <li>User 'alice' is a member of Group 'Accounting'</li>
 *   <li>User 'bob' is a member of Group 'IT'</li>
 * </ul>
 * 
 * Structured to work with JdbcUserDetailsManager.
 * 
 * @author gkephart
 *
 */
public interface GroupMember extends LongUniqueObject
{


  /**
   * @return the system group
   */
  Group getGroup();


  /**
   * @return the user
   */
  User<?> getUser();

}
