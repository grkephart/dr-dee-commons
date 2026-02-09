/**
 * JPA entity implementations for the security domain model.
 *
 * <p>
 * This package contains concrete and abstract JPA entity classes that implement
 * the security-related domain interfaces defined in
 * {@code org.drdeesw.commons.security.models}. These entities provide persistence
 * mappings and database integration while preserving the domain-level separation
 * between identity, authority, grouping, and membership.
 * </p>
 *
 * <h2>Scope</h2>
 *
 * <ul>
 *   <li><b>User entities</b> representing authenticated principals.</li>
 *   <li><b>Authority entities</b> representing atomic permissions.</li>
 *   <li><b>Group entities</b> used for bulk assignment of authorities.</li>
 *   <li><b>Membership and association entities</b> modeling group membership
 *       and authority assignment.</li>
 * </ul>
 *
 * <h2>Design Notes</h2>
 *
 * <ul>
 *   <li>Entities in this package use JPA field access consistently.</li>
 *   <li>Database naming conventions (e.g. {@code user_id}, {@code group_id})
 *       are handled via annotations and attribute overrides.</li>
 *   <li>Abstract base entities provide shared persistence mechanics and are
 *       intended to be extended by concrete implementations.</li>
 *   <li>Domain meaning is defined by interfaces; these entities supply the
 *       persistence mechanism.</li>
 * </ul>
 *
 * <h2>Integration</h2>
 *
 * <p>
 * The entities in this package are structured to integrate cleanly with
 * Spring Security’s JDBC-based authentication and authorization mechanisms,
 * including {@link org.springframework.security.provisioning.JdbcUserDetailsManager},
 * via adapter layers rather than direct framework coupling.
 * </p>
 *
 * <p>
 * This package is intentionally limited to persistence concerns and should not
 * contain business logic or authorization policy decisions.
 * </p>
 *
 * @author gary_kephart
 */
package org.drdeesw.commons.security.models.entities;
