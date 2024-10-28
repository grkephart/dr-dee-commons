package org.drdeesw.commons.security.models.entities;


import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

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
@Entity
@Table(name = "groups")
@AttributeOverride(name = "name", column = @Column(name = "group_name"))
@Access(AccessType.FIELD)
public abstract class SystemGroupEntity extends AbstractNamedUniqueEntity<Long> implements SystemGroup
{

  /**
   * Hibernate
   */
  protected SystemGroupEntity()
  {
  }


  protected SystemGroupEntity(Long id)
  {
    super(id);
  }

}
