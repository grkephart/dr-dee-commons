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
@Table(name = "groups")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class GroupEntity extends AbstractGroupEntity
{

  /**
   * Hibernate
   */
  public GroupEntity()
  {
  }


  /**
   * @param id the id
   */
  public GroupEntity(Long id)
  {
    super(id);
  }


}
