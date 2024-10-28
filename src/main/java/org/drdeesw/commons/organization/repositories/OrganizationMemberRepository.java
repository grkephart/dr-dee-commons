/**
 * 
 */
package org.drdeesw.commons.organization.repositories;


import org.drdeesw.commons.common.repositories.QueryRepository;
import org.drdeesw.commons.organization.models.entities.OrganizationMemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 */
public interface OrganizationMemberRepository
    extends JpaRepository<OrganizationMemberEntity, Long>, QueryRepository<OrganizationMemberEntity, Long>
{

}
