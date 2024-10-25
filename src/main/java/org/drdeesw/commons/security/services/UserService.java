/**
 * 
 */
package org.drdeesw.commons.security.services;

import org.drdeesw.commons.common.services.CrudService;
import org.drdeesw.commons.security.models.pojos.SystemUserPojo;

/**
 * 
 */
public interface UserService<P extends SystemUserPojo> extends CrudService<P, Long>
{
  /**
   * @return
   */
  P getCurrentUser();
}
