package org.drdeesw.commons.security.models.entities;


import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;

import org.drdeesw.commons.common.models.entities.AbstractUniqueEntity;
import org.drdeesw.commons.security.models.Authority;
import org.drdeesw.commons.security.models.GroupAuthority;


/**
 * Structured to work with JdbcUserDetailsManager. This is an abstract class so
 * that subclasses can define the schema and table names.
 * 
 * @author gary_kephart
 *
 */
@SuppressWarnings("serial")
@MappedSuperclass
@AttributeOverride(name="id", column=@Column(name="group_authority_id"))
public abstract class AbstractGroupAuthorityEntity extends AbstractUniqueEntity<Long> implements GroupAuthority
{
  @ManyToOne
  @JoinColumn(name = "authority_id")
  private Authority authority;
  
  @ManyToOne
  @JoinColumn(name = "group_id")
  private GroupEntity group;

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
  public GroupEntity getGroup()
  {
    return this.group;
  }



  public void setGroup(
    GroupEntity group)
  {
    this.group = group;
  }


  @Override
  public Authority getAuthority()
  {
    return this.authority;
  }


  public void setAuthority(Authority authority)
  {
    this.authority = authority;
  }

}
