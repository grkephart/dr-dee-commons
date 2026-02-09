/**
 * 
 */
package org.drdeesw.commons.security.models.entities;


import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;

import org.drdeesw.commons.common.models.entities.AbstractLongUniqueEntity;
import org.drdeesw.commons.security.models.Group;
import org.drdeesw.commons.security.models.GroupMember;
import org.drdeesw.commons.security.models.User;


/**
 * Structured to work with JdbcUserDetailsManager. This is an abstract class so
 * that subclasses can define the schema and table names.
 * 
 * @author gkephart
 *
 */
@SuppressWarnings("serial")
@MappedSuperclass
public abstract class AbstractGroupMemberEntity extends AbstractLongUniqueEntity
    implements GroupMember
{
  @ManyToOne
  @JoinColumn(name = "group_id")
  private Group   group;
  @ManyToOne
  @JoinColumn(name = "user_id")
  private User<?> user;

  /**
   * Hibernate
   */
  protected AbstractGroupMemberEntity()
  {
  }


  protected AbstractGroupMemberEntity(Long id)
  {
    super(id);
  }


  /**
   * @return the group
   */
  public Group getGroup()
  {
    return group;
  }


  /**
   * @return the username
   */
  @Override
  public User<?> getUser()
  {
    return user;
  }


  /**
   * @param group the group to set
   */
  public void setGroup(Group group)
  {
    this.group = group;
  }


  /**
   * @param username the username to set
   */
  public void setUser(User<?> user)
  {
    this.user = user;
  }

}
