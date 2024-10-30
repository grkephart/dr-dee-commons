package org.drdeesw.commons.security.models.entities;


import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.MappedSuperclass;

import org.drdeesw.commons.common.models.entities.AbstractNamedUniqueEntity;
import org.drdeesw.commons.security.models.SystemGroup;


/**
 * Structured to work with JdbcUserDetailsManager.
 * This is an abstract class so that subclasses can define the schema and table names.
 * 
 * @author gary_kephart
 *
 */
@SuppressWarnings("serial")
@MappedSuperclass
@Access(AccessType.FIELD)
public abstract class AbstractSystemGroupEntity extends AbstractNamedUniqueEntity<Long>
    implements SystemGroup
{

  /**
   * Hibernate
   */
  protected AbstractSystemGroupEntity()
  {
  }


  protected AbstractSystemGroupEntity(Long id)
  {
    super(id);
  }

}
