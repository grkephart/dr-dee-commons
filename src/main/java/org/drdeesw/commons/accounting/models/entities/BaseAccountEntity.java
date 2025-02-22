package org.drdeesw.commons.accounting.models.entities;


import org.drdeesw.commons.accounting.models.Account;
import org.drdeesw.commons.security.models.entities.BaseUserEntity;


public interface BaseAccountEntity<U extends BaseUserEntity<?>, H extends BaseAccountHolderEntity<U, ?>, P extends BaseAccountProviderEntity<U, ?>>
    extends Account<U, H, P>
{
  H getHolderEntity();


  void setHolderEntity(
    H holder);
}
