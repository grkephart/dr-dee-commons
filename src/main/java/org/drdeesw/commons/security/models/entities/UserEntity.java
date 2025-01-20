/**
 * 
 */
package org.drdeesw.commons.security.models.entities;


import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import org.drdeesw.commons.security.models.User;


/**
 * Structured to work with JdbcUserDetailsManager.
 * This is an abstract class so that subclasses can define the schema and table names.
 * 
 * @author gary_kephart
 *
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "users")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Access(AccessType.PROPERTY)
public class UserEntity extends AbstractUserEntity implements User
{
  /**
   * Hibernate
   */
  public UserEntity()
  {
    
  }
  
  
  /**
   * Copy constructor.
   * 
   * @param that
   */
  public UserEntity(UserEntity that)
  {
    super(that);
  }

  @Override
  @Column(name="user_id")
  public Long getId()
  {
    return super.getId();
  }

}
