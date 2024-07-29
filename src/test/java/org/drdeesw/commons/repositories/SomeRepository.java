package org.drdeesw.commons.repositories;

import org.drdeesw.commons.models.SomeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SomeRepository
    extends JpaRepository<SomeEntity, Long>, QueryRepository<SomeEntity, Long>
{

}