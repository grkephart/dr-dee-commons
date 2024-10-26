/**
 * 
 */
package org.drdeesw.commons.security.repositories;

import org.drdeesw.commons.common.repositories.QueryRepository;
import org.drdeesw.commons.security.models.entities.SystemGroupAuthorityEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 */
public interface SystemGroupAuthorityRepository extends JpaRepository<SystemGroupAuthorityEntity, Long>, QueryRepository<SystemGroupAuthorityEntity, Long>
{

}
