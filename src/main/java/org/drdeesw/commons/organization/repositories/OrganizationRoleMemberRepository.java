/**
 * 
 */
package org.drdeesw.commons.organization.repositories;


import org.drdeesw.commons.common.repositories.QueryRepository;
import org.drdeesw.commons.organization.models.entities.OrganizationRoleMemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 */
public interface OrganizationRoleMemberRepository
    extends JpaRepository<OrganizationRoleMemberEntity, Long>, QueryRepository<OrganizationRoleMemberEntity, Long>
{

}
