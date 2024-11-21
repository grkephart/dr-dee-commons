/**
 * 
 */
package org.drdeesw.commons.security.repositories;

import org.drdeesw.commons.common.repositories.QueryRepository;
import org.drdeesw.commons.security.models.entities.GroupEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 */
public interface SystemGroupRepository extends JpaRepository<GroupEntity, Long>, QueryRepository<GroupEntity, Long>
{

}
