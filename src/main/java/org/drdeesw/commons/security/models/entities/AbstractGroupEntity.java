package org.drdeesw.commons.security.models.entities;


import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.MappedSuperclass;

import org.drdeesw.commons.common.models.entities.AbstractNamedUniqueEntity;
import org.drdeesw.commons.security.models.Group;


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
public abstract class AbstractGroupEntity extends AbstractNamedUniqueEntity<Long>
    implements Group
{

  /**
   * Hibernate
   */
  protected AbstractGroupEntity()
  {
  }


  protected AbstractGroupEntity(Long id)
  {
    super(id);
  }

}