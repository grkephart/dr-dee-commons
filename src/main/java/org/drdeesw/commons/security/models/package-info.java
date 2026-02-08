/**
 * Domain models for system security and authorization.
 *
 * <p>
 * This package defines framework-agnostic security primitives used to model
 * authenticated users, enforceable authorities, group-based authority
 * assignment, and membership relationships.
 * </p>
 *
 * <h2>Conceptual Model</h2>
 *
 * <ul>
 *   <li><b>User</b> – An authenticated principal in the system. Users are the
 *       root security subjects evaluated during authentication.</li>
 *
 *   <li><b>Authority</b> – An atomic, enforceable permission or capability
 *       (e.g. READ_REPORTS, ADMIN).</li>
 *
 *   <li><b>Group</b> – A named collection of users used to assign Authorities
 *       in bulk.</li>
 *
 *   <li><b>GroupMember</b> – A membership relationship indicating that a User
 *       belongs to a Group.</li>
 *
 *   <li><b>GroupAuthority</b> – A policy-level association indicating which
 *       Authorities are granted to members of a Group.</li>
 * </ul>
 *
 * <h2>Design Principles</h2>
 *
 * <ul>
 *   <li>Authorities and policy mappings are immutable.</li>
 *   <li>Membership relationships represent stable facts.</li>
 *   <li>Operational state (e.g. enabled/disabled) is explicitly modeled.</li>
 *   <li>Security concepts are decoupled from organizational or semantic roles.</li>
 * </ul>
 *
 * <h2>Spring Security Integration</h2>
 *
 * <p>
 * These models are structured to integrate cleanly with
 * {@link org.springframework.security.provisioning.JdbcUserDetailsManager}
 * through adapter or resolver layers. Spring Security concepts such as
 * {@code UserDetails} and {@code GrantedAuthority} are intentionally not
 * referenced directly in this package.
 * </p>
 *
 * <p>
 * The canonical JDBC schema used by {@code JdbcUserDetailsManager} is documented
 * in the Spring Security reference:
 * </p>
 *
 * <p>
 * {@link https://docs.spring.io/spring-security/reference/servlet/authentication/passwords/jdbc.html}
 * </p>
 *
 * <p>
 * This separation allows the security domain model to remain stable and
 * expressive while supporting multiple authentication and authorization
 * mechanisms.
 * </p>
 *
 * @author gary_kephart
 */
package org.drdeesw.commons.security.models;
