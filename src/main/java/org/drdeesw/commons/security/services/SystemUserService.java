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
   * Return the user by username
   * 
   * @param username the username
   * @return the user
   */
  SystemUserPojo findByUsername(
    String username);

  /**
   * @return
   */
  SystemUserPojo getCurrentUser();
}
