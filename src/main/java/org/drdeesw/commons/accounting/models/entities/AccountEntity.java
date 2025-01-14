/**
 * 
 */
package org.drdeesw.commons.accounting.models.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;


/**
 * 
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "accounts")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class AccountEntity extends AbstractAccountEntity
{

  @Override
  @Column(name="account_id")
  public Long getId()
  {
    return super.getId();
  }


}
