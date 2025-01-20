package org.drdeesw.commons.organization.models.entities;


import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.MappedSuperclass;

import org.drdeesw.commons.accounting.models.entities.AbstractAccountHolderEntity;


@SuppressWarnings("serial")
@MappedSuperclass
@Access(AccessType.PROPERTY)
public abstract class AbstractOrganizationAccountHolderEntity extends AbstractAccountHolderEntity
{

  /**
   * Hibernate constructor
   */
  protected AbstractOrganizationAccountHolderEntity()
  {

  }

}
