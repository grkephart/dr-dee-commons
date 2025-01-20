package org.drdeesw.commons.security.models.entities;


import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;


/**
 * Structured to work with JdbcUserDetailsManager.
 * 
 * @author gary_kephart
 *
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "authorities")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Access(AccessType.PROPERTY)
public class AuthorityEntity extends AbstractAuthorityEntity
{

  /**
   * Hibernate
   */
  public AuthorityEntity()
  {
    super();
  }


  public AuthorityEntity(Long id)
  {
    super(id);
  }

  @Override
  @Column(name="authority_id")
  public Long getId()
  {
    return super.getId();
  }

}
