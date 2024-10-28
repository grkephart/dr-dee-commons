/**
 * 
 */
package org.drdeesw.commons.organization.repositories;


import org.drdeesw.commons.common.repositories.QueryRepository;
import org.drdeesw.commons.organization.models.entities.OrganizationRoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 */
public interface OrganizationRoleRepository
    extends JpaRepository<OrganizationRoleEntity, Long>, QueryRepository<OrganizationRoleEntity, Long>
{

}
