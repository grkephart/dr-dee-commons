/**
 * 
 */
package org.drdeesw.commons.accounting.models;


import org.drdeesw.commons.common.models.Auditable;
import org.drdeesw.commons.common.models.Describable;
import org.drdeesw.commons.common.models.Enableable;
import org.drdeesw.commons.common.models.NamedLongUniqueObject;

import com.nimbusds.oauth2.sdk.id.Subject;


/**
 * Represents a formal contractual relationship between an {@link AccountOwner}
 * and an {@link AccountProvider}.
 *
 * <p>
 * In Dr Dee Commons, an <strong>Account</strong> does not represent the
 * provider’s internal systems, infrastructure, or database records. Instead, it
 * represents the contractual position held by a legal or organizational party
 * with respect to a provider.
 * </p>
 *
 * <p>
 * An account exists:
 * </p>
 * <ul>
 * <li>On behalf of an {@link AccountOwner} (e.g., a {@link Person} or
 * {@link Organization}).</li>
 * <li>Under the governance of an {@link AccountProvider} (e.g., a bank, SaaS
 * provider, or hosting company).</li>
 * </ul>
 *
 * <p>
 * The {@code AccountOwner} holds the contractual rights and responsibilities
 * associated with the account relationship. The {@code AccountProvider} governs
 * and administers that relationship.
 * </p>
 *
 * <p>
 * An Account does <em>not</em> imply system access. Access to an account within
 * a software system is modeled separately (e.g., via AccountAccess), typically
 * associating a {@link User} with specific permissions.
 * </p>
 *
 * <p>
 * Examples:
 * </p>
 * <ul>
 * <li>A Person holding a bank account governed by a financial institution.</li>
 * <li>An Organization holding a MailChimp account governed by MailChimp.</li>
 * <li>An Organization holding a hosting account governed by a cloud
 * provider.</li>
 * </ul>
 *
 * <p>
 * Conceptually, an Account models ownership of the <em>relationship</em>, not
 * ownership of the provider’s infrastructure or systems.
 * </p>
 */

public interface Account extends NamedLongUniqueObject, Describable, Auditable, Enableable
{

  /**
   * Returns the Subject that owns this account.
   */
  AccountOwner getOwner();

  /**
   * Returns the authority that governs this account.
   */
  AccountProvider getProvider();

  /**
   * Returns the provider-scoped identifier for this account (e.g. username,
   * account number, external GUID).
   */
  String getProviderAccountId();

  /**
   * Returns whether the account is active.
   */
  boolean isActive();

  /**
   * Sets the accountOwner that owns this account.
   */
  void setAccountOwner(AccountOwner accountOwner);

  /**
   * Sets whether the account is active.
   */
  void setActive(boolean active);

  /**
   * Sets the authority that governs this account.
   */
  void setProvider(AccountProvider provider);

  /**
   * Sets the provider-scoped identifier for this account.
   */
  void setProviderAccountId(String providerAccountId);
}

