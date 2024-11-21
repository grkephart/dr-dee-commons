package org.drdeesw.commons.security.models.entities;


import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
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
@AttributeOverride(name = "id", column = @Column(name = "authority_id"))
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

}
