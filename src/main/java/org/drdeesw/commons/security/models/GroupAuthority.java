/**
 * 
 */
package org.drdeesw.commons.security.models;


import org.drdeesw.commons.common.models.LongUniqueObject;


/**
 * Represents the association between a Group and an Authority.
 *
 * A GroupAuthority defines which permissions are granted to all members
 * of a Group. Users inherit these Authorities transitively through
 * Group membership.
 *
 * In Spring Security's JDBC schema, this maps to the {@code group_authorities} table.
 *
 * Examples:
 * <ul>
 *   <li>Group 'Accounting' -> Authority 'READ_REPORTS'</li>
 *   <li>Group 'IT' -> Authority 'ADMIN'</li>
 * </ul>
 * 
 * Structured to work with JdbcUserDetailsManager.
 * 
 */
public interface GroupAuthority extends LongUniqueObject
{
  /**
   * Returns the authority granted to the group.
   * 
   * @return authority the authority granted to the group.
   */
  Authority getAuthority();


  /**
   * Returns the group.
   * 
   * @return the group
   */
  Group getGroup();

}
