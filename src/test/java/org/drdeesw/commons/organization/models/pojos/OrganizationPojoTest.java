/**
 * 
 */
package org.drdeesw.commons.organization.models.pojos;

import java.util.HashSet;
import java.util.Set;

import org.drdeesw.commons.accounting.models.Account;
import org.drdeesw.commons.accounting.models.AccountHolder;
import org.drdeesw.commons.accounting.models.entities.AbstractAccountHolderEntity;
import org.drdeesw.commons.accounting.models.pojos.AbstractAccountHolderPojo;
import org.drdeesw.commons.accounting.models.pojos.AbstractAccountPojo;
import org.drdeesw.commons.accounting.models.pojos.AbstractAccountProviderPojo;
import org.drdeesw.commons.accounting.models.pojos.AccountPojo;
import org.drdeesw.commons.common.models.Auditable;
import org.drdeesw.commons.common.models.Describable;
import org.drdeesw.commons.common.models.Enableable;
import org.drdeesw.commons.common.models.NamedLongUniqueObject;
import org.drdeesw.commons.common.models.pojos.AbstractNamedLongUniquePojo;
import org.drdeesw.commons.identity.models.Person;
import org.drdeesw.commons.identity.models.pojos.AbstractPersonPojo;
import org.drdeesw.commons.identity.models.pojos.PersonPojo;
import org.drdeesw.commons.security.models.User;
import org.drdeesw.commons.security.models.pojos.AbstractUserPojo;
import org.drdeesw.commons.security.models.pojos.UserPojo;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * 
 */
public class OrganizationPojoTest
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
    Set<AccountPojo> heldAccounts = new HashSet<AccountPojo>();
    OrganizationAccountPojo heldAccount1 = new OrganizationAccountPojo();
    Set<OrganizationAccountPojo> providedAccounts = new HashSet<OrganizationAccountPojo>();
    OrganizationAccountPojo providedAccounts1 = new OrganizationAccountPojo();
    PersonPojo  person = new PersonPojo();
    
    /* 
heldAccount1.setHolder(person) is implemented in AbstractAccountPojo<U,H,P>.setHolder(H accountHolder). Compilation error: The method setHolder(H) in the type AbstractAccountPojo<U,H,P> is not applicable for the arguments (PersonPojo)
where H extends AbstractAccountHolderPojo<U, ?> and U extends AbstractUserPojo<?>
AbstractAccountHolderPojo<U extends AbstractUserPojo<?>,HA extends AbstractAccountPojo<U, ?, ?>> extends AbstractNamedLongUniquePojo implements AccountHolder<U, HA>
AbstractAccountPojo<U extends AbstractUserPojo<?>, H extends AbstractAccountHolderPojo<U, ?>, P extends AbstractAccountProviderPojo<U, ?>> extends AbstractNamedLongUniquePojo implements BaseAccountPojo<U, H, P>
AccountHolder<U extends User<?>, HA extends BaseAccountPojo<U, ?, ?>> extends NamedLongUniqueObject, Auditable<U>, Describable, Enableable

PersonPojo extends AbstractPersonPojo<UserPojo, AccountPojo>
AbstractPersonPojo<U extends AbstractUserPojo<?>, HA extends AbstractAccountPojo<U, ?, ?>>, extends AbstractNamedLongUniquePojo implements Person<U, HA>
Person<U extends User<?>,HA extends BaseAccountPojo<U, ?, ?>> extends NamedLongUniqueObject, AccountHolder<U, HA>

So PersonPojo is an AccountHolder but why is it not being accepted as an AccountHolder in the context of AbstractAccountPojo<U,H,P>.setHolder(H accountHolder) ?
     */    
    
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
