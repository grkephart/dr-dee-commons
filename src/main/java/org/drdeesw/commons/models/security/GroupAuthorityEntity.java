package org.drdeesw.commons.models.security;


import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import org.drdeesw.commons.models.entities.AbstractUniqueEntity;


/**
 * Structured to work with JdbcUserDetailsManager.
 * This is an abstract class so that subclasses can define the schema and table names.
 * 
 * @author gary_kephart
 *
 */
@SuppressWarnings("serial")
@MappedSuperclass
@Access(AccessType.FIELD)
public abstract class GroupAuthorityEntity extends AbstractUniqueEntity<Long> implements GroupAuthority
{
  @Column(name = "authority")
  private String authority;
  @Column(name = "group_id ")
  private Long groupId;

  /**
   * Hibernate
   */
  protected GroupAuthorityEntity()
  {
  }


  protected GroupAuthorityEntity(Long id)
  {
    super(id);
  }


  @Override
  public String getAuthority()
  {
    return this.authority;
  }


  @Override
  public Long getGroupId()
  {
    return this.groupId;
  }


  @Override
  public void setAuthority(
    String authority)
  {
    this.authority = authority;
  }


  @Override
  public void setGroupId(
    Long groupId)
  {
    this.groupId = groupId;
  }

}
