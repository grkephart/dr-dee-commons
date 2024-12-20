/**
 * 
 */
package org.drdeesw.commons.organization.models.pojos;

import java.util.HashSet;
import java.util.Set;

import org.drdeesw.commons.accounting.models.Account;
import org.drdeesw.commons.identity.models.Person;
import org.drdeesw.commons.identity.models.pojos.PersonPojo;
import org.drdeesw.commons.organization.models.OrganizationAccount;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * 
 */
class OrganizationPojoTest
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
    OrganizationPojo parent = new OrganizationPojo();
    OrganizationPojo org = new OrganizationPojo();
    Set<Account> heldAccounts = new HashSet<Account>();
    OrganizationAccount heldAccount1 = new OrganizationAccountPojo();
    Set<Account> providedAccounts = new HashSet<Account>();
    OrganizationAccount providedAccounts1 = new OrganizationAccountPojo();
    Person person = new PersonPojo();
    
    heldAccount1.setHolder(person);
    heldAccount1.setProvider(org);
    
    heldAccounts.add(heldAccount1);
    
    providedAccounts1.setHolder(person);
    providedAccounts1.setProvider(org);
    
    providedAccounts.add(providedAccounts1);
    
    org.setParent(parent);
    org.setHeldAccounts(heldAccounts);
    org.setProvidedAccounts(providedAccounts);
  }

}
