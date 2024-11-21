package org.drdeesw.commons.security.models.entities;


import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Access(AccessType.FIELD)
public abstract class AbstractGroupAuthorityEntity extends AbstractUniqueEntity<Long>
    implements GroupAuthority
{
  @Column(name = "authority")
  private String      authority;
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
  public String getAuthority()
  {
    return this.authority;
  }


  @Override
  public Group getGroup()
  {
    return this.group;
  }


  @Override
  public void setAuthority(
    String authority)
  {
    this.authority = authority;
  }


  @Override
  public void setGroup(
    Group systemGroup)
  {
    this.group = (GroupEntity)systemGroup;
  }

}
