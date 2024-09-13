/**
 * 
 */
package org.drdeesw.commons.repositories;

import org.drdeesw.commons.models.security.entities.UserEntity;

/**
 * This must be used to extend an actual concrete JPA repository. Example:
 * <pre>
 *   public interface DemoUserRepository extends JpaRepository&lt;DemoUserEntity, Long&gt;, QueryRepository&lt;DemoUserEntity, Long&gt;, UserRepository&lt;DemoUserEntity&gt;
 * </pre>
 */
public interface UserRepository<E extends UserEntity>
{
  E findByUsername(
    String username);
}
