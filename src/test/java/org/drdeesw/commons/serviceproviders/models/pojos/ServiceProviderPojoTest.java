/**
 * 
 */
package org.drdeesw.commons.serviceproviders.models.pojos;

import java.util.HashSet;
import java.util.Set;

import org.drdeesw.commons.accounting.models.Account;
import org.drdeesw.commons.identity.models.Person;
import org.drdeesw.commons.identity.models.pojos.PersonPojo;
import org.drdeesw.commons.serviceproviders.models.ServiceProvider;
import org.drdeesw.commons.serviceproviders.models.ServiceProviderAccount;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * 
 */
class ServiceProviderPojoTest
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
    ServiceProvider<ServiceProviderAccountPojo> serviceProvider = new ServiceProviderPojo();
    Set<Account> providedAccounts = new HashSet<Account>();
    ServiceProviderAccount providedAccount = new ServiceProviderAccountPojo();
    Person person = new PersonPojo();
    
    providedAccount.setHolder(person, providedAccount);
    providedAccount.setProvider(serviceProvider, providedAccount);
    
    providedAccounts.add(providedAccount);
    
    serviceProvider.setProvidedAccounts(providedAccounts);
  }

}
