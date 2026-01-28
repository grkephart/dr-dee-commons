package org.drdeesw.commons.accounting.models.entities;


import java.util.Set;

import org.drdeesw.commons.accounting.models.AccountHolder;
import org.drdeesw.commons.security.models.entities.BaseUserEntity;


public interface BaseAccountHolderEntity<U extends BaseUserEntity<?>, HA extends BaseAccountEntity<U, ?, ?>>
    extends AccountHolder<U, HA>
{
  Set<HA> getHeldAccountsEntity();


  void setHeldAccountsEntity(
    Set<HA> accounts);
}
