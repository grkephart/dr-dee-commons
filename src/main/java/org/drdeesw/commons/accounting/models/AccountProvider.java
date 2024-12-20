/**
 * 
 */
package org.drdeesw.commons.accounting.models;


import java.util.Set;

import org.drdeesw.commons.common.models.Auditable;
import org.drdeesw.commons.common.models.Describable;
import org.drdeesw.commons.common.models.Enableable;
import org.drdeesw.commons.common.models.Named;


/**
 * 
 */
public interface AccountProvider extends Named, Auditable, Describable, Enableable
{
  /**
   * @return
   */
  Set<Account> getProvidedAccounts();


  /**
   * @param providedAccounts
   */
  void setProvidedAccounts(
    Set<Account> providedAccounts);

}
