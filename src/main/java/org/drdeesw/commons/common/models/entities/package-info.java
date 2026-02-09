/**
 * Abstract base entity implementations for common domain models.
 *
 * <p>
 * This package contains foundational JPA-aware entity base classes used across
 * the Commons library. These classes provide consistent handling of identity,
 * persistence mechanics, and shared structural concerns, while remaining
 * independent of any specific business domain.
 * </p>
 *
 * <h2>Design Intent</h2>
 *
 * <ul>
 *   <li>Defines reusable base entities with stable identity semantics.</li>
 *   <li>Separates identity and persistence mechanics from domain meaning.</li>
 *   <li>Supports extension by downstream modules without requiring changes to Commons.</li>
 *   <li>Establishes consistent JPA mapping conventions (field access).</li>
 * </ul>
 *
 * <h2>Identity Semantics</h2>
 *
 * <p>
 * Entities in this package typically use a surrogate primary key (e.g. {@code Long})
 * to represent persistent identity. Identity is considered non-copyable; copy
 * constructors, where present, are intended to copy semantic state only, not
 * persistent identity.
 * </p>
 *
 * <h2>Usage Notes</h2>
 *
 * <ul>
 *   <li>These classes are intended to be extended, not used directly.</li>
 *   <li>Concrete entity implementations should reside in domain-specific modules.</li>
 *   <li>Database-specific concerns (table names, column names) are handled via
 *       annotations and attribute overrides in concrete subclasses.</li>
 * </ul>
 *
 * <p>
 * This package forms the root of the entity inheritance hierarchy used throughout
 * Commons; decisions made here have system-wide impact and are intentionally
 * conservative.
 * </p>
 *
 * @author gary_kephart
 */
package org.drdeesw.commons.common.models.entities;