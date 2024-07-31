package org.drdeesw.commons.repositories;

import org.drdeesw.commons.models.security.UserRoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRoleEntityRepository
    extends JpaRepository<UserRoleEntity, Long>, QueryRepository<UserRoleEntity, Long>
{

}