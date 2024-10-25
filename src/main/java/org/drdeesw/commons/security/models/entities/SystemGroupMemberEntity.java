/**
 * 
 */
package org.drdeesw.commons.security.models.entities;


import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import org.drdeesw.commons.common.models.entities.AbstractLongUniqueEntity;
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
public abstract class SystemGroupMemberEntity extends AbstractLongUniqueEntity implements SystemGroupMember
{
  @Column(name = "group_id")
  private Long   systemGroupId;
  @Column(name = "username")
  private String username;

  /**
   * Hibernate
   */
  protected SystemGroupMemberEntity()
  {
  }


  protected SystemGroupMemberEntity(Long id)
  {
    super(id);
  }


  /**
   * @return the systemGroupId
   */
  public Long getSystemGroupId()
  {
    return systemGroupId;
  }



  /**
   * @return the username
   */
  public String getUsername()
  {
    return username;
  }


  /**
   * @param systemGroupId the role to set
   */
  public void setSystemGroupId(Long systemGroupId)
  {
    this.systemGroupId = systemGroupId;
  }



  /**
   * @param username the username to set
   */
  public void setUsername(String username)
  {
    this.username = username;
  }

}
