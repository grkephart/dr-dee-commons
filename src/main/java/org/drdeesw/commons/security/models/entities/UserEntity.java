/**
 * 
 */
package org.drdeesw.commons.security.models.entities;


import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import org.drdeesw.commons.accounting.models.entities.AccountEntity;


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
public class UserEntity extends AbstractUserEntity<AccountEntity>
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



}
