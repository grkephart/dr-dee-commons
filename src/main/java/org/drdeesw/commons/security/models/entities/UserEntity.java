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
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
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
@Access(AccessType.PROPERTY)
public class UserEntity extends AbstractUserEntity<AccountEntity>
{
  private AccountEntity account;

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


  /**
   * @return the account
   */
  @Override
  @OneToOne(targetEntity = AccountEntity.class, optional = false)
  @JoinColumn(name = "account_id")
  public AccountEntity getAccount()
  {
    return account;
  }


  /**
   * @param account the account to set
   */
  @Override
  public void setAccount(
    AccountEntity account)
  {
    this.account = account;
  }

}
