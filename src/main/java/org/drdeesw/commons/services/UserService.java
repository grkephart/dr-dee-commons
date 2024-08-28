/**
 * 
 */
package org.drdeesw.commons.services;

import org.drdeesw.commons.models.security.pojos.UserPojo;

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
