/**
 * 
 */
package org.drdeesw.commons.security.models.entities;


import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Access(AccessType.PROPERTY)
public class GroupMemberEntity extends AbstractGroupMemberEntity<GroupEntity>
{

  private GroupEntity group;

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


  @Override
  @Column(name = "group_member_id")
  public Long getId()
  {
    return super.getId();
  }


  /**
   * @return the group
   */
  @ManyToOne
  @JoinColumn(name = "group_id")
  public GroupEntity getGroup()
  {
    return group;
  }


  /**
   * @param group the role to set
   */
  public void setGroup(
    GroupEntity group)
  {
    this.group = group;
  }

}
