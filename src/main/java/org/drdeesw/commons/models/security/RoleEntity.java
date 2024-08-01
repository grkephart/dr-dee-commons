package org.drdeesw.commons.models.security;


import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.drdeesw.commons.models.entities.AbstractNamedUniqueEntity;


/**
 * Structured to work with JdbcUserDetailsManager.
 * 
 * @author gary_kephart
 *
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "roles")
@Access(AccessType.FIELD)
@AttributeOverride(name = "id", column = @Column(name = "role_id"))
@AttributeOverride(name = "name", column = @Column(name = "group_name"))
public class RoleEntity extends AbstractNamedUniqueEntity<Long> implements Role
{

  /* (non-Javadoc)
   * @see org.drdeesw.reactrax.dto.general.AbstractRenameableObject#getName()
   */
  @Override
  public String getName()
  {
    return super.getName();
  }

}
