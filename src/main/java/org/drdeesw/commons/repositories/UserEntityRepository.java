package org.drdeesw.commons.repositories;

import org.drdeesw.commons.models.security.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserEntityRepository
    extends JpaRepository<UserEntity, Long>, QueryRepository<UserEntity, Long>
{

}