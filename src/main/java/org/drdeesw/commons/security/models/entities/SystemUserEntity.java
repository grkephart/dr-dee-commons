/**
 * 
 */
package org.drdeesw.commons.security.models.entities;


import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


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
@AttributeOverride(name = "id", column = @Column(name = "user_id"))
public class SystemUserEntity extends AbstractSystemUserEntity
{

  /**
   * Hibernate
   */
  public SystemUserEntity()
  {
  }


  /**
   * @param id the id
   */
  public SystemUserEntity(Long id)
  {
    super(id);
  }


  /**
   * For testing.
   * 
   * @param username perhaps the email address
   */
  public SystemUserEntity(String username)
  {
    super(username);
  }


  /**
   * For when logging in reveals a new user.
   * 
   * @param username the username
   * @param enabled whether the user is enabled
   */
  public SystemUserEntity(String username, boolean enabled)
  {
    super(username, enabled);
  }

}
