/**
 * 
 */
package org.drdeesw.commons.accountingn.models.pojos;

import java.util.HashSet;
import java.util.Set;

import org.drdeesw.commons.accounting.models.pojos.AccountHolderPojo;
import org.drdeesw.commons.accounting.models.pojos.AccountPojo;
import org.drdeesw.commons.accounting.models.pojos.AccountProviderPojo;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * 
 */
public class AccountPojoTest
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
    Set<AccountPojo> heldAccounts = new HashSet<AccountPojo>();
    AccountPojo heldAccount1 = new AccountPojo();
    Set<AccountPojo> providedAccounts = new HashSet<AccountPojo>();
    AccountPojo providedAccount1 = new AccountPojo();
    AccountHolderPojo  accountHolder = new AccountHolderPojo();
    AccountProviderPojo  accountProvider = new AccountProviderPojo();
    
    heldAccount1.setHolder(accountHolder);
    heldAccount1.setProvider(accountProvider);
    
    heldAccounts.add(heldAccount1);
    
    providedAccount1.setHolder(accountHolder);
    providedAccount1.setProvider(accountProvider);
    
    providedAccounts.add(providedAccount1);
    
    accountHolder.setHeldAccounts(heldAccounts);
    
    accountProvider.setProvidedAccounts(providedAccounts);
  }

}
