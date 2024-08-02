package org.drdeesw.commons.models.security;


import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import org.drdeesw.commons.models.entities.AbstractNamedUniqueEntity;


/**
 * Structured to work with JdbcUserDetailsManager.
 * 
 * @author gary_kephart
 *
 */
@SuppressWarnings("serial")
@MappedSuperclass
@Access(AccessType.FIELD)
@AttributeOverride(name = "id", column = @Column(name = "role_id"))
@AttributeOverride(name = "name", column = @Column(name = "group_name"))
public abstract class RoleEntity extends AbstractNamedUniqueEntity<Long> implements Role
{

  /**
   * Hibernate
   */
  protected RoleEntity()
  {
  }


  protected RoleEntity(Long id)
  {
    super(id);
  }

}
