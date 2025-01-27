/**
 * 
 */
package org.drdeesw.commons.security.models.entities;


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
@Access(AccessType.PROPERTY)
public abstract class AbstractGroupMemberEntity<G extends GroupEntity> extends AbstractLongUniqueEntity
    implements GroupMember<G>
{
  private String username;

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
   * @return the username
   */
  @Column(name = "username")
  public String getUsername()
  {
    return username;
  }


  /**
   * @param username the username to set
   */
  public void setUsername(
    String username)
  {
    this.username = username;
  }

}
