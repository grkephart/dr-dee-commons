/**
 * 
 */
package org.drdeesw.commons.accounting.models.pojos;


import java.util.Set;

import org.drdeesw.commons.accounting.models.AccountProvider;
import org.drdeesw.commons.common.models.pojos.NamedLongUniquePojo;
import org.drdeesw.commons.security.models.pojos.BaseUserPojo;


/**
 * The POJO version of AccountProvider.
 */
public interface BaseAccountProviderPojo<//
    U extends BaseUserPojo<?>, //
    PA extends BaseAccountPojo<U, ?, ?>> extends AccountProvider<U, PA>, NamedLongUniquePojo
{
  @Override
  Set<PA> getProvidedAccounts();


  @Override
  void setProvidedAccounts(
    Set<PA> accounts);
}
