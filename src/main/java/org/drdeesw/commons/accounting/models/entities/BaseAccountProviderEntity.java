package org.drdeesw.commons.accounting.models.entities;


import java.util.Set;

import org.drdeesw.commons.accounting.models.AccountProvider;
import org.drdeesw.commons.security.models.entities.BaseUserEntity;


public interface BaseAccountProviderEntity<U extends BaseUserEntity<?>, PA extends BaseAccountEntity<U, ?, ?>>
    extends AccountProvider<U, PA>
{
  Set<PA> getProvidedAccountsEntity();


  void setProvidedAccountsEntity(
    Set<PA> accounts);
}
