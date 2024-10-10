package org.drdeesw.commons.modules.security.models.entities;


import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import org.drdeesw.commons.modules.common.models.entities.AbstractUniqueEntity;
import org.drdeesw.commons.modules.security.models.Authority;


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
public abstract class AuthorityEntity extends AbstractUniqueEntity<Long> implements Authority
{
  @Column(name = "authority")
  private String authority;
  @Column(name = "username")
  private String username;

  /**
   * Hibernate
   */
  protected AuthorityEntity()
  {
  }


  protected AuthorityEntity(Long id)
  {
    super(id);
  }


  @Override
  public String getAuthority()
  {
    return this.authority;
  }


  @Override
  public String getUsername()
  {
    return this.username;
  }


  @Override
  public void setAuthority(
    String authority)
  {
    this.authority = authority;
  }


  @Override
  public void setUsername(
    String username)
  {
    this.username = username;
  }

}
