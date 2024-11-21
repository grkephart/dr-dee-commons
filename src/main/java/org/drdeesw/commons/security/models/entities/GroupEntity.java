package org.drdeesw.commons.security.models.entities;


import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
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
@AttributeOverride(name = "name", column = @Column(name = "group_name"))
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
