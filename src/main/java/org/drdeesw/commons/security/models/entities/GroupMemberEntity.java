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
public class GroupMemberEntity extends AbstractGroupMemberEntity
{

  /**
   * Hibernate
   */
  public GroupMemberEntity()
  {
  }


  /**
   * @param id the id
   */
  public GroupMemberEntity(Long id)
  {
    super(id);
  }

}
