/**
 * Plain Java Object (POJO) implementations of core domain model interfaces.
 *
 * <p>
 * This package provides simple, mutable implementations of the foundational
 * model interfaces defined in {@code org.drdeesw.commons.common.models}. These
 * classes are intended for use in data transfer, serialization, mapping,
 * testing, and integration layers where framework-neutral objects are required.
 * </p>
 *
 * <h2>Design Intent</h2>
 *
 * <ul>
 *   <li>POJOs in this package are deliberately free of persistence annotations.</li>
 *   <li>They implement core identity and naming interfaces without enforcing
 *       business invariants.</li>
 *   <li>Mutability is allowed and expected.</li>
 *   <li>These classes are suitable for DTOs, API payloads, and mapper targets.</li>
 * </ul>
 *
 * <p>
 * Unlike entity implementations, POJOs do not represent persistent identity
 * or lifecycle semantics. Identity fields may be set or changed as required by
 * transport or mapping concerns.
 * </p>
 *
 * <p>
 * This package complements the entity implementations found in
 * {@code org.drdeesw.commons.common.models.entities} by providing a lightweight,
 * framework-agnostic alternative for non-persistent use cases.
 * </p>
 *
 * @author gary_kephart
 */
package org.drdeesw.commons.common.models.pojos;
