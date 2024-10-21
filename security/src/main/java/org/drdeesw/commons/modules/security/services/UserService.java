/**
 * 
 */
package main.java.org.drdeesw.commons.modules.security.services;

import org.drdeesw.commons.common.services.CrudService;

import main.java.org.drdeesw.commons.modules.security.models.pojos.UserPojo;

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
