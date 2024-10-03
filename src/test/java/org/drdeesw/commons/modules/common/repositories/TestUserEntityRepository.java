package org.drdeesw.commons.modules.common.repositories;

import org.drdeesw.commons.modules.security.models.entities.TestUserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestUserEntityRepository
    extends JpaRepository<TestUserEntity, Long>, QueryRepository<TestUserEntity, Long>
{

}