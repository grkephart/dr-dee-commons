/**
 * 
 */
package org.drdeesw.commons.organization.repositories;


import org.drdeesw.commons.common.repositories.QueryRepository;
import org.drdeesw.commons.organization.models.entities.OrganizationEntity;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 */
public interface OrganizationRepository
    extends JpaRepository<OrganizationEntity, Long>, QueryRepository<OrganizationEntity, Long>
{

}
