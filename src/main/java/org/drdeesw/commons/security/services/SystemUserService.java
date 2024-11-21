/**
 * 
 */
package org.drdeesw.commons.security.services;


import org.drdeesw.commons.common.services.CrudService;
import org.drdeesw.commons.security.models.pojos.UserPojo;


/**
 * The system user service.
 */
public interface SystemUserService extends CrudService<UserPojo, Long>
{

  /**
   * Return the user by username
   * 
   * @param username the username
   * @return the user
   */
  UserPojo findByUsername(
    String username);


  /**
   * Return the current user.
   * 
   * @return the current user
   */
  UserPojo getCurrentUser();
}
