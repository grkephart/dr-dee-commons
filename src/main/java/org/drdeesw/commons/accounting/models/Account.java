/**
 * 
 */
package org.drdeesw.commons.accounting.models;


import org.drdeesw.commons.common.models.Actor;
import org.drdeesw.commons.common.models.Auditable;
import org.drdeesw.commons.common.models.Describable;
import org.drdeesw.commons.common.models.Enableable;
import org.drdeesw.commons.common.models.NamedLongUniqueObject;

import com.nimbusds.oauth2.sdk.id.Subject;


/**
 * Represents a concrete account owned by a Subject and governed by an AccountProvider.
 *
 * An Account is an owned resource (e.g. a Spotify account, bank account, or
 * MailChimp account). It does not define who may access it through this system;
 * access is handled separately via AccountAccess.
 */
public interface Account
    extends NamedLongUniqueObject, Describable, Auditable<? extends Actor>, Enableable
{

  /**
   * Returns the Subject that owns this account.
   */
  Subject getOwner();

  /**
   * Sets the Subject that owns this account.
   */
  void setOwner(Subject owner);

  /**
   * Returns the authority that governs this account.
   */
  AccountProvider getProvider();

  /**
   * Sets the authority that governs this account.
   */
  void setProvider(AccountProvider provider);

  /**
   * Returns the provider-scoped identifier for this account
   * (e.g. username, account number, external GUID).
   */
  String getExternalId();

  /**
   * Sets the provider-scoped identifier for this account.
   */
  void setExternalId(String externalId);

  /**
   * Returns whether the account is active.
   */
  boolean isActive();

  /**
   * Sets whether the account is active.
   */
  void setActive(boolean active);
}

