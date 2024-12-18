/**
 * 
 */
package org.drdeesw.commons.organization.models.entities;

import java.util.HashSet;
import java.util.Set;

import org.drdeesw.commons.identity.models.entities.PersonEntity;
import org.drdeesw.commons.organization.models.Account;
import org.drdeesw.commons.organization.models.OrganizationAccount;
import org.drdeesw.commons.security.models.entities.UserEntity;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * 
 */
class OrganizationEntityTest
{

  /**
   * @throws java.lang.Exception
   */
  @BeforeEach
  void setUp() throws Exception
  {
  }


  /**
   * @throws java.lang.Exception
   */
  @AfterEach
  void tearDown() throws Exception
  {
  }


  @Test
  void testConstruction()
  {
    OrganizationEntity parent = new OrganizationEntity();
    OrganizationEntity org = new OrganizationEntity();
    Set<Account> heldAccounts = new HashSet<Account>();
    OrganizationAccount heldAccount1 = new OrganizationAccountEntity();
    Set<Account> providedAccounts = new HashSet<Account>();
    OrganizationAccount providedAccounts1 = new OrganizationAccountEntity();
    PersonEntity person = new PersonEntity();
    UserEntity user= new UserEntity();
    
    heldAccount1.setHolder(person);
    heldAccount1.setProvider(org);
    heldAccount1.setUser(user);
    
    user.setAccount(heldAccount1);
    
    heldAccounts.add(heldAccount1);
    
    providedAccounts1.setHolder(person);
    providedAccounts1.setProvider(org);
    
    providedAccounts.add(providedAccounts1);
    
    org.setParent(parent);
    org.setHeldAccounts(heldAccounts);
    org.setProvidedAccounts(providedAccounts);
  }

}
