/**
 * 
 */
package org.drdeesw.commons.security.repositories;

import org.drdeesw.commons.common.repositories.QueryRepository;
import org.drdeesw.commons.security.models.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * This must be used to extend an actual concrete JPA repository. Example:
 * <pre>
 *   public interface DemoUserRepository extends JpaRepository&lt;DemoUserEntity, Long&gt;, QueryRepository&lt;DemoUserEntity, Long&gt;, SystemUserRepository&lt;DemoUserEntity&gt;
 * </pre>
 */
public interface SystemUserRepository extends JpaRepository<UserEntity, Long>, QueryRepository<UserEntity, Long>
{
  /**
   * return the user by username
   * 
   * @param username the username
   * @return the user
   */
  UserEntity findByUsername(
    String username);
}
