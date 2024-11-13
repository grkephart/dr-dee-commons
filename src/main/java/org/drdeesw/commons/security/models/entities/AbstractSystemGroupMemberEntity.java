/**
 * 
 */
package org.drdeesw.commons.security.models.entities;


import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;

import org.drdeesw.commons.common.models.entities.AbstractLongUniqueEntity;
import org.drdeesw.commons.security.models.SystemGroup;
import org.drdeesw.commons.security.models.SystemGroupMember;


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
public abstract class AbstractSystemGroupMemberEntity extends AbstractLongUniqueEntity
    implements SystemGroupMember
{
  @ManyToOne
  @JoinColumn(name = "group_id")
  private SystemGroupEntity systemGroup;
  @Column(name = "username")
  private String            username;

  /**
   * Hibernate
   */
  protected AbstractSystemGroupMemberEntity()
  {
  }


  protected AbstractSystemGroupMemberEntity(Long id)
  {
    super(id);
  }


  /**
   * @return the systemGroup
   */
  public SystemGroup getSystemGroup()
  {
    return systemGroup;
  }


  /**
   * @return the username
   */
  public String getUsername()
  {
    return username;
  }


  /**
   * @param systemGroup the role to set
   */
  public void setSystemGroup(
    SystemGroup systemGroup)
  {
    this.systemGroup = (SystemGroupEntity)systemGroup;
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
