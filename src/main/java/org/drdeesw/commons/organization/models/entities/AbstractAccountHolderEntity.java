/**
 * 
 */
package org.drdeesw.commons.organization.models.entities;


import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.MappedSuperclass;

import org.drdeesw.commons.common.models.entities.AbstractNamedLongUniqueEntity;
import org.drdeesw.commons.organization.models.AccountHolder;


/**
 * 
 */
@SuppressWarnings("serial")
@MappedSuperclass
@Access(AccessType.FIELD)
public abstract class AbstractAccountHolderEntity extends AbstractNamedLongUniqueEntity
    implements AccountHolder
{
  public AbstractAccountHolderEntity()
  {
  }


  public AbstractAccountHolderEntity(Long id)
  {
    super(id);
  }



}
