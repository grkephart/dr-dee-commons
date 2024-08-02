package org.drdeesw.commons.repositories;

import org.drdeesw.commons.models.TestUserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestUserEntityRepository
    extends JpaRepository<TestUserEntity, Long>, QueryRepository<TestUserEntity, Long>
{

}