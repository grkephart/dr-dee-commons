/**
 * 
 */
package org.drdeesw.commons.modules.common.services;

import org.drdeesw.commons.modules.security.models.pojos.UserPojo;

/**
 * 
 */
public interface UserService<P extends UserPojo> extends CrudService<P, Long>
{
  /**
   * @return
   */
  P getCurrentUser();
}
