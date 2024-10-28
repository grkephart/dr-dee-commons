package org.drdeesw.commons.security.models.entities;


import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.drdeesw.commons.common.models.entities.AbstractUniqueEntity;
import org.drdeesw.commons.security.models.SystemAuthority;


/**
 * Structured to work with JdbcUserDetailsManager.
 * This is an abstract class so that subclasses can define the schema and table names.
 * 
 * @author gary_kephart
 *
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "authorities")
@AttributeOverride(name = "id", column = @Column(name = "authority_id"))
@Access(AccessType.FIELD)
public abstract class SystemAuthorityEntity extends AbstractUniqueEntity<Long> implements SystemAuthority
{
  @Column(name = "authority")
  private String authority;
  @Column(name = "username")
  private String username;

  /**
   * Hibernate
   */
  protected SystemAuthorityEntity()
  {
  }


  protected SystemAuthorityEntity(Long id)
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
