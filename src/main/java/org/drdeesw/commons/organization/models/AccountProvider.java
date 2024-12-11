/**
 * 
 */
package org.drdeesw.commons.organization.models;


import java.util.Set;

import org.drdeesw.commons.common.models.Describable;
import org.drdeesw.commons.common.models.Named;


/**
 * 
 */
public interface AccountProvider extends Named, Describable
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
