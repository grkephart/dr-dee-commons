/**
 * 
 */
package org.drdeesw.commons.modules.security.models.entities;


import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import org.drdeesw.commons.common.models.entities.AbstractLongUniqueEntity;
import org.drdeesw.commons.security.models.GroupMember;


/**
 * Structured to work with JdbcUserDetailsManager.
 * This is an abstract class so that subclasses can define the schema and table names.
 * 
 * @author gkephart
 *
 */
@SuppressWarnings("serial")
@MappedSuperclass
@Access(AccessType.FIELD)
public abstract class GroupMemberEntity extends AbstractLongUniqueEntity implements GroupMember
{
  @Column(name = "group_id")
  private Long   groupId;
  @Column(name = "username")
  private String username;

  /**
   * Hibernate
   */
  protected GroupMemberEntity()
  {
  }


  protected GroupMemberEntity(Long id)
  {
    super(id);
  }


  /**
   * @return the groupId
   */
  public Long getGroupId()
  {
    return groupId;
  }



  /**
   * @return the username
   */
  public String getUsername()
  {
    return username;
  }


  /**
   * @param groupId the role to set
   */
  public void setGroupId(Long groupId)
  {
    this.groupId = groupId;
  }



  /**
   * @param username the username to set
   */
  public void setUsername(String username)
  {
    this.username = username;
  }

}
