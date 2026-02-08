/**
 * 
 */
package org.drdeesw.commons.role;

import java.time.Instant;

/**
 * Represents the assignment of a Role to a subject.
 *
 * RoleAssignment captures who holds a role, the scope in which it applies, and
 * any temporal constraints on that assignment.
 *
 * Although roles may currently be treated as global and user-only, this
 * abstraction intentionally supports scoped and time-bound role assignments
 * without requiring future redesign.
 *
 * RoleAssignments do not grant permissions directly. Assigned Roles are
 * resolved into Authorities via RoleAuthority mappings prior to authorization
 * enforcement.
 */
public interface RoleAssignment
{
  void expireAt(Instant instant);

  Role getRole();

  String getScopeId();

  String getScopeType();

  String getSubjectId();

  String getSubjectType();

  Instant getValidFrom();

  Instant getValidTo();

  boolean isActive(Instant now);
}
