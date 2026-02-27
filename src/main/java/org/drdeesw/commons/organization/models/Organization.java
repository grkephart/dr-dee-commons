/**
 * 
 */
package org.drdeesw.commons.organization.models;


import org.drdeesw.commons.common.models.Auditable;
import org.drdeesw.commons.common.models.Describable;
import org.drdeesw.commons.common.models.Enableable;
import org.drdeesw.commons.common.models.NamedLongUniqueObject;


/**
 * Represents an organized legal or operational entity within the system.
 *
 * <p>
 * An Organization is a core identity entity that may participate in
 * various relationships (e.g., account ownership, membership structures,
 * service provision), but it does not encode those relationships directly.
 * </p>
 *
 * <p>
 * Organization models the identity of the entity itself. Relationships
 * such as members, roles, accounts, or providers are modeled separately.
 * </p>
 */
public interface Organization
    extends NamedLongUniqueObject, Auditable, Enableable, Describable
{

 
}

