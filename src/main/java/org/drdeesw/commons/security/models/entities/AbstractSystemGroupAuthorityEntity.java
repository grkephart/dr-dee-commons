package org.drdeesw.commons.security.models.entities;


import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;

import org.drdeesw.commons.common.models.entities.AbstractUniqueEntity;
import org.drdeesw.commons.security.models.SystemGroup;
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
  @ManyToOne
  @JoinColumn(name = "group_id")
  private SystemGroupEntity systemGroup;

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
  public SystemGroup getSystemGroup()
  {
    return this.systemGroup;
  }


  @Override
  public void setAuthority(
    String authority)
  {
    this.authority = authority;
  }


  @Override
  public void setSystemGroup(
    SystemGroup systemGroup)
  {
    this.systemGroup = (SystemGroupEntity)systemGroup;
  }

}
