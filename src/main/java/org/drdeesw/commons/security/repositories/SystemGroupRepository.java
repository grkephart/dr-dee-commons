/**
 * 
 */
package org.drdeesw.commons.security.repositories;

import org.drdeesw.commons.common.repositories.QueryRepository;
import org.drdeesw.commons.security.models.entities.SystemGroupEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 */
public interface SystemGroupRepository extends JpaRepository<SystemGroupEntity, Long>, QueryRepository<SystemGroupEntity, Long>
{

}
