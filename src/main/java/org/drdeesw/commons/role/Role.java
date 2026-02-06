/**
 * 
 */
package org.drdeesw.commons.role;

import org.drdeesw.commons.common.models.Named;

/**
 * This is a generic role concept that could apply across organizations, users,
 * etc. Examples include Chair, Treasurer, Volunteer, sys admin, security admin,
 * data admin, auditor.
 * Roles are different than Authority. Roles *have* authorities.
 */
public interface Role extends Named
{
  /**
   * @return
   */
  public RoleContextType getContextType();

  /**
   * @param contextType
   */
  void setContextType(RoleContextType contextType);
}
