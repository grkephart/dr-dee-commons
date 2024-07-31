package org.drdeesw.commons.repositories;

import org.drdeesw.commons.models.security.RoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleEntityRepository
    extends JpaRepository<RoleEntity, Long>, QueryRepository<RoleEntity, Long>
{

}