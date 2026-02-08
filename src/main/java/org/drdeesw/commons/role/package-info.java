/**
 * Domain model for organizational and semantic roles.
 *
 * <p>
 * This package defines application-level role concepts that express meaning,
 * responsibility, and intent (e.g. Treasurer, Chair, Auditor). These roles are
 * <strong>not</strong> security primitives and are intentionally decoupled from
 * Spring Security and JdbcUserDetailsManager.
 * </p>
 *
 * <h2>Conceptual Model</h2>
 *
 * <ul>
 *   <li><b>Role</b> – A stable, semantic definition of a role. Roles describe
 *       meaning and applicability, not permissions or assignments.</li>
 *
 *   <li><b>RoleContextType</b> – A definitional constraint indicating the kinds
 *       of contexts in which a Role may be assigned (e.g. USER, ORGANIZATION).</li>
 *
 *   <li><b>RoleAssignment</b> – The assignment of a Role to a subject, optionally
 *       scoped and time-bound. RoleAssignments capture who holds a role, where it
 *       applies, and when it is valid.</li>
 *
 *   <li><b>RoleAuthority</b> – A policy-level mapping that defines which
 *       Authorities are implied by holding a given Role.</li>
 * </ul>
 *
 * <h2>Separation of Concerns</h2>
 *
 * <p>
 * This package intentionally separates:
 * </p>
 *
 * <ul>
 *   <li><b>Meaning</b> (Role)</li>
 *   <li><b>Reality</b> (RoleAssignment)</li>
 *   <li><b>Policy</b> (RoleAuthority)</li>
 *   <li><b>Enforcement</b> (Authority, outside this package)</li>
 * </ul>
 *
 * <p>
 * RoleAssignments do not grant permissions directly. At runtime, assigned Roles
 * are resolved into Authorities via RoleAuthority mappings, and only those
 * Authorities participate in authorization enforcement.
 * </p>
 *
 * <h2>Design Principles</h2>
 *
 * <ul>
 *   <li>Role definitions are immutable and stable.</li>
 *   <li>Policy mappings are explicit and immutable.</li>
 *   <li>Assignments may change only through controlled lifecycle operations.</li>
 *   <li>No Spring Security types appear in this package.</li>
 * </ul>
 *
 * <p>
 * This separation allows roles to evolve independently of enforcement mechanisms
 * while remaining auditable, testable, and resistant to misuse.
 * </p>
 */
package org.drdeesw.commons.role;