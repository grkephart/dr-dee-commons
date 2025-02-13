/**
 * 
 */
package org.drdeesw.commons.identity.models.entities;


import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import org.drdeesw.commons.accounting.models.entities.AccountEntity;
import org.drdeesw.commons.security.models.entities.UserEntity;


/**
 * 
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "persons")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Access(AccessType.PROPERTY)
public class PersonEntity extends AbstractPersonEntity<UserEntity, AccountEntity>
{

  /**
   * Hibernate constructor
   */
  public PersonEntity()
  {

  }


  @Override
  @Column(name = "person_id")
  public Long getId()
  {
    return super.getId();
  }

}
