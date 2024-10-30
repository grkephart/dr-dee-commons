package org.drdeesw.commons.security.models.entities;


import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import org.drdeesw.commons.common.models.entities.AbstractUniqueEntity;
import org.drdeesw.commons.security.models.SystemGroupAuthority;


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
public abstract class AbstractSystemGroupAuthorityEntity extends AbstractUniqueEntity<Long> implements SystemGroupAuthority
{
  @Column(name = "authority")
  private String authority;
  @Column(name = "group_id")
  private Long systemGroupId;

  /**
   * Hibernate
   */
  protected AbstractSystemGroupAuthorityEntity()
  {
  }


  protected AbstractSystemGroupAuthorityEntity(Long id)
  {
    super(id);
  }


  @Override
  public String getAuthority()
  {
    return this.authority;
  }


  @Override
  public Long getSystemGroupId()
  {
    return this.systemGroupId;
  }


  @Override
  public void setAuthority(
    String authority)
  {
    this.authority = authority;
  }


  @Override
  public void setSystemGroupId(
    Long systemGroupId)
  {
    this.systemGroupId = systemGroupId;
  }

}