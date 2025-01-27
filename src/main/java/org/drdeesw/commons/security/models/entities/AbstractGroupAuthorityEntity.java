package org.drdeesw.commons.security.models.entities;


import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import org.drdeesw.commons.common.models.entities.AbstractUniqueEntity;
import org.drdeesw.commons.security.models.Group;
import org.drdeesw.commons.security.models.GroupAuthority;


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
public abstract class AbstractGroupAuthorityEntity<G extends Group>
    extends AbstractUniqueEntity<Long> implements GroupAuthority<G>
{
  private String authority;
  /**
   * Hibernate
   */
  protected AbstractGroupAuthorityEntity()
  {
  }


  protected AbstractGroupAuthorityEntity(Long id)
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
  public void setAuthority(
    String authority)
  {
    this.authority = authority;
  }

}
