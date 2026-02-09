package org.drdeesw.commons.security.models.entities;


import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;


/**
 * Structured to work with JdbcUserDetailsManager.
 * 
 * @author gary_kephart
 *
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "group_authorities")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class GroupAuthorityEntity extends AbstractGroupAuthorityEntity
{

  /**
   * Hibernate
   */
  public GroupAuthorityEntity()
  {
  }


  /**
   * @param id The id of the entity
   */
  public GroupAuthorityEntity(Long id)
  {
    super(id);
  }


}
