/**
 * 
 */
package org.drdeesw.commons.identity.models;


import org.drdeesw.commons.common.models.Auditable;
import org.drdeesw.commons.common.models.Enableable;
import org.drdeesw.commons.common.models.LongUniqueObject;


/**
 * Represents a natural person within the system.
 *
 * <p>
 * A Person is a core identity entity and is intentionally context-neutral.
 * It may participate in various relationships (e.g., voter registration,
 * account ownership, organization membership), but it does not encode
 * those relationships directly.
 * </p>
 *
 * <p>
 * A Person has a structured {@link PersonalName}, rather than a single
 * string name, to support legal names, formatted display, and sorting.
 * </p>
 */
public interface Person extends LongUniqueObject, Auditable, Enableable
{

}
