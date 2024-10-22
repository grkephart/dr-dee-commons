/**
 * 
 */
package org.drdeesw.commons.security.services;

import org.drdeesw.commons.common.services.CrudService;
import org.drdeesw.commons.security.models.pojos.UserPojo;

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
