/**
 * 
 */
package org.drdeesw.commons.organization.repositories;


import org.drdeesw.commons.common.repositories.QueryRepository;
import org.drdeesw.commons.organization.models.entities.OrganizationTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 */
public interface OrganizationTypeRepository
    extends JpaRepository<OrganizationTypeEntity, Long>, QueryRepository<OrganizationTypeEntity, Long>
{

}
