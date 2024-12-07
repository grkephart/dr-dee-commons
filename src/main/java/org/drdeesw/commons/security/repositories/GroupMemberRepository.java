/**
 * 
 */
package org.drdeesw.commons.security.repositories;

import org.drdeesw.commons.common.repositories.QueryRepository;
import org.drdeesw.commons.security.models.entities.GroupMemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 */
public interface GroupMemberRepository extends JpaRepository<GroupMemberEntity, Long>, QueryRepository<GroupMemberEntity, Long>
{

}
