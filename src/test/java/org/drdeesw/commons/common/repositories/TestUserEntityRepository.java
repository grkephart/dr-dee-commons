package org.drdeesw.commons.common.repositories;

import org.drdeesw.commons.security.models.entities.TestUserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestUserEntityRepository
    extends JpaRepository<TestUserEntity, Long>, QueryRepository<TestUserEntity, Long>
{

}