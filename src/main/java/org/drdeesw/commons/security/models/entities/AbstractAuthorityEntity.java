package org.drdeesw.commons.security.models.entities;


import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import org.drdeesw.commons.common.models.entities.AbstractUniqueEntity;
import org.drdeesw.commons.security.models.Authority;


/**
 * Structured to work with JdbcUserDetailsManager.
 * This is an abstract class so that subclasses can define the schema and table names.
 * 
 * @author gary_kephart
 *
 */
@SuppressWarnings("serial")
@MappedSuperclass
@Access(AccessType.PROPERTY)
public abstract class AbstractAuthorityEntity extends AbstractUniqueEntity<Long> implements Authority
{
  private String authority;
  private String username;

  /**
   * Hibernate
   */
  protected AbstractAuthorityEntity()
  {
  }


  protected AbstractAuthorityEntity(Long id)
  {
    super(id);
  }


  @Override
  @Column(name = "authority")
  public String getAuthority()
  {
    return this.authority;
  }


  @Override
  @Column(name = "username")
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
