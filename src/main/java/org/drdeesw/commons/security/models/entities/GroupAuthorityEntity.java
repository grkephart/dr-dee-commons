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
@Table(name = "group_authorities")
@AttributeOverride(name = "id", column = @Column(name = "group_authority_id"))
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
