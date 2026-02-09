package org.drdeesw.commons.security.models.entities;


import javax.persistence.AttributeOverride;
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
@AttributeOverride(name="id", column=@Column(name="authority_id", nullable = false))
public abstract class AbstractAuthorityEntity extends AbstractUniqueEntity<Long> implements Authority
{
  @Column(name = "authority")
  private String authority;

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
  public String getAuthority()
  {
    return this.authority;
  }



  public void setAuthority(
      String authority)
  {
    this.authority = authority;
  }


}
