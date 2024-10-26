/**
 * 
 */
package org.drdeesw.commons.security.repositories;

import org.drdeesw.commons.common.repositories.QueryRepository;
import org.drdeesw.commons.security.models.entities.SystemUserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * This must be used to extend an actual concrete JPA repository. Example:
 * <pre>
 *   public interface DemoUserRepository extends JpaRepository&lt;DemoUserEntity, Long&gt;, QueryRepository&lt;DemoUserEntity, Long&gt;, SystemUserRepository&lt;DemoUserEntity&gt;
 * </pre>
 */
public interface SystemUserRepository extends JpaRepository<SystemUserEntity, Long>, QueryRepository<SystemUserEntity, Long>
{
  SystemUserEntity findByUsername(
    String username);
}
