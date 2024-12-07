/**
 * 
 */
package org.drdeesw.commons.security.repositories;

import org.drdeesw.commons.common.repositories.QueryRepository;
import org.drdeesw.commons.security.models.entities.GroupAuthorityEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 */
public interface GroupAuthorityRepository extends JpaRepository<GroupAuthorityEntity, Long>, QueryRepository<GroupAuthorityEntity, Long>
{

}
