/**
 * 
 */
package org.drdeesw.commons.identity.models;

import org.drdeesw.commons.common.models.NamedLongUniqueObject;
import org.drdeesw.commons.organization.models.AccountHolder;

/**
 * A real-world individual (e.g., John Doe).
 */
public interface Person extends NamedLongUniqueObject, AccountHolder
{

}
