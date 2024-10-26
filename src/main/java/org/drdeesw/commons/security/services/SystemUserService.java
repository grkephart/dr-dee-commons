/**
 * 
 */
package org.drdeesw.commons.security.services;

import org.drdeesw.commons.common.services.CrudService;
import org.drdeesw.commons.security.models.pojos.SystemUserPojo;

/**
 * 
 */
public interface SystemUserService extends CrudService<SystemUserPojo, Long>
{
  /**
   * @return
   */
  SystemUserPojo getCurrentUser();
}
