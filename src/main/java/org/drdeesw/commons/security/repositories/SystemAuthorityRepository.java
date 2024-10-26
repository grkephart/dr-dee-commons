/**
 * 
 */
package org.drdeesw.commons.security.repositories;

import org.drdeesw.commons.common.repositories.QueryRepository;
import org.drdeesw.commons.security.models.entities.SystemAuthorityEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 */
public interface SystemAuthorityRepository extends JpaRepository<SystemAuthorityEntity, Long>, QueryRepository<SystemAuthorityEntity, Long>
{

}
