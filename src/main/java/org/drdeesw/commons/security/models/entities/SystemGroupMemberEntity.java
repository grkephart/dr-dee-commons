/**
 * 
 */
package org.drdeesw.commons.security.models.entities;


import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


/**
 * Structured to work with JdbcUserDetailsManager.
 * 
 * @author gkephart
 *
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "group_members")
@AttributeOverride(name = "id", column = @Column(name = "group_member_id"))
public class SystemGroupMemberEntity extends AbstractSystemGroupMemberEntity
{

  /**
   * Hibernate
   */
  public SystemGroupMemberEntity()
  {
  }


  /**
   * @param id the id
   */
  public SystemGroupMemberEntity(Long id)
  {
    super(id);
  }

}
