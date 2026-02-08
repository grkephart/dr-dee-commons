/**
 * 
 */
package org.drdeesw.commons.security.models;


import org.drdeesw.commons.common.models.LongUniqueObject;


/**
 * Represents a single granted permission or capability.
 *
 * An Authority is the atomic unit of authorization in Spring Security.
 * It answers the question: "What is this user allowed to do?"
 *
 * Authorities may be assigned directly to Users or indirectly via Groups.
 * They are evaluated verbatim by {@code hasAuthority()} and {@code hasRole()}
 * checks (after any configured prefix handling).
 *
 * In the JDBC schema, Authorities typically map to the {@code authorities} table.
 *
 * Examples:
 * <ul>
 *   <li>READ_REPORTS</li>
 *   <li>WRITE_REPORTS</li>
 *   <li>ADMIN</li>
 * </ul>
 * 
 * Structured to work with JdbcUserDetailsManager.
 */
public interface Authority extends LongUniqueObject
{
  /**
   * Returns the authority. Example: READ_REPORTS, DOWNLOAD_BANK_STATEMENTS
   * 
   * @return the authority
   */
  String getAuthority();

}
