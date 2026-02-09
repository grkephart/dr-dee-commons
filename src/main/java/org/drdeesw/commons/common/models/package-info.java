/**
 * Core domain model interfaces and marker types.
 *
 * <p>
 * This package defines the most fundamental, framework-agnostic interfaces
 * used throughout the Commons library. These interfaces establish identity,
 * naming, description, enablement, and audit-related traits without imposing
 * persistence, transport, or business logic concerns.
 * </p>
 *
 * <h2>Design Principles</h2>
 * <ul>
 *   <li>Pure contracts only — no framework dependencies.</li>
 *   <li>Identity is observable, not mutable.</li>
 *   <li>Traits are orthogonal and composable.</li>
 *   <li>Interfaces here form the root of the object model hierarchy.</li>
 * </ul>
 *
 * <p>
 * Marker interfaces (such as {@code DataTransferObject}) are used intentionally
 * to define conceptual boundaries and support tooling or architectural
 * conventions without enforcing behavior.
 * </p>
 *
 * <p>
 * This package is intentionally conservative; changes here have system-wide
 * impact and should be made rarely.
 * </p>
 *
 * @author gary_kephart
 */
package org.drdeesw.commons.common.models;
