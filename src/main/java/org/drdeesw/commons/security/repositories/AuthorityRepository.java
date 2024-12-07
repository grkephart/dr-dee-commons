/**
 * 
 */
package org.drdeesw.commons.security.repositories;

import org.drdeesw.commons.common.repositories.QueryRepository;
import org.drdeesw.commons.security.models.entities.AuthorityEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 */
public interface AuthorityRepository extends JpaRepository<AuthorityEntity, Long>, QueryRepository<AuthorityEntity, Long>
{

}
