/**
 * 
 */
package org.drdeesw.commons.repositories;

import org.drdeesw.commons.models.security.UserEntity;

/**
 * This must be used to extend an actual concrete JPA repository. Example:
 * <pre>
 *   public interface DemoUserRepository extends JpaRepository&lt;DemoUserEntity, Long>, QueryRepository&lt;DemoUserEntity, Long>, UserRepository&lt;DemoUserEntity>
 * </pre>
 */
public interface UserRepository<E extends UserEntity>
{
  E findByUsername(
    String username);
}
