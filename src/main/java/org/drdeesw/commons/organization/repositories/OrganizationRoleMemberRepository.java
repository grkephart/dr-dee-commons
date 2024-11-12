/**
 * 
 */
package org.drdeesw.commons.organization.repositories;


import org.drdeesw.commons.common.repositories.QueryRepository;
import org.drdeesw.commons.organization.models.entities.OrganizationMemberRoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 */
public interface OrganizationRoleMemberRepository
    extends JpaRepository<OrganizationMemberRoleEntity, Long>, QueryRepository<OrganizationMemberRoleEntity, Long>
{

}
