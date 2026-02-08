/**
 * 
 */
package org.drdeesw.commons.role;

import org.drdeesw.commons.common.models.Describable;
import org.drdeesw.commons.common.models.Named;

/**
 * This models organizational / semantic roles, not security primitives.
 * This is a generic role concept that could apply across organizations, users,
 * etc. Examples include Chair, Treasurer, Volunteer, sys admin, security admin,
 * data admin, auditor.
 */
public interface Role extends Named, Describable
{
  /**
   * @return
   */
  public RoleContextType getContextType();
}
