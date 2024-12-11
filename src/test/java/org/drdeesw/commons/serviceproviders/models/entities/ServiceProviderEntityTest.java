/**
 * 
 */
package org.drdeesw.commons.serviceproviders.models.entities;

import java.util.HashSet;
import java.util.Set;

import org.drdeesw.commons.identity.models.Person;
import org.drdeesw.commons.identity.models.entities.PersonEntity;
import org.drdeesw.commons.organization.models.Account;
import org.drdeesw.commons.serviceproviders.models.ServiceProviderAccount;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * 
 */
class ServiceProviderEntityTest
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
    ServiceProviderEntity serviceProvider = new ServiceProviderEntity();
    Set<Account> providedAccounts = new HashSet<Account>();
    ServiceProviderAccount providedAccount = new ServiceProviderAccountEntity();
    Person person = new PersonEntity();
    
    providedAccount.setHolder(person);
    providedAccount.setProvider(serviceProvider);
    
    providedAccounts.add(providedAccount);
    
    serviceProvider.setProvidedAccounts(providedAccounts);
  }

}
