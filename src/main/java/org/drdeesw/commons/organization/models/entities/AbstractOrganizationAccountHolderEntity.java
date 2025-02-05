package org.drdeesw.commons.organization.models.entities;


import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.MappedSuperclass;

import org.drdeesw.commons.accounting.models.entities.AbstractAccountHolderEntity;
import org.drdeesw.commons.security.models.User;


@SuppressWarnings("serial")
@MappedSuperclass
@Access(AccessType.PROPERTY)
public abstract class AbstractOrganizationAccountHolderEntity<A extends OrganizationAccountEntity, U extends User<?>>
    extends AbstractAccountHolderEntity<A,U>
{

}
