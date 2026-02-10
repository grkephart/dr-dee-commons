/**
 * 
 */
package org.drdeesw.commons.accounting.models;

/**
 * Represents an authority that governs the existence and semantics of accounts.
 * <p>
 * An AccountProvider defines <em>how</em> accounts are identified, authenticated,
 * and managed, but does not own or contain accounts itself.
 * </p>
 *
 * <p>
 * This is a <strong>role</strong>, not a real-world entity.
 * The role may be fulfilled by an Organization, a ServiceProvider role,
 * or an external system, but AccountProvider itself is not a subject and
 * does not represent ownership.
 * </p>
 *
 * <p>
 * Accounts reference their provider; providers do not aggregate accounts.
 * This keeps account lifecycle ownership with the Account aggregate.
 * </p>
 *
 * <p>
 * Examples of AccountProviders include:
 * <ul>
 *   <li>Spotify account authority</li>
 *   <li>YouTube account authority</li>
 *   <li>MailChimp account authority</li>
 *   <li>An internal billing or identity system</li>
 * </ul>
 * </p>
 *
 * <p>
 * Ownership of an account is always represented by a Subject
 * (such as a Person, User, or Organization), never by an AccountProvider.
 * </p>
 */
public interface AccountProvider
{

}
