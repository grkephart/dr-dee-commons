/**
 * 
 */
package org.drdeesw.commons.security.models.entities;


import javax.persistence.Entity;
import javax.persistence.Table;


/**
 * @author gary_kephart
 *
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "test_user_entities")
public class TestUserEntity extends SystemUserEntity
{
  @Override
  public AccountHolderType getAccountHolderType()
  {
    return AccountHolderType.USER;
  }

}
