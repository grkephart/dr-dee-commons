/**
 * 
 */
package org.drdeesw.commons.security.models;

import org.drdeesw.commons.common.models.Named;

/**
 * This is a generic role concept that could apply across organizations, users,
 * etc.
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
