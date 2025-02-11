package org.drdeesw.commons.organization.models.entities;


import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.MappedSuperclass;

import org.drdeesw.commons.accounting.models.entities.AbstractAccountProviderEntity;
import org.drdeesw.commons.security.models.User;


@SuppressWarnings("serial")
@MappedSuperclass
@Access(AccessType.PROPERTY)
public abstract class AbstractOrganizationAccountProviderEntity<//
    U extends User<?>, //
    A extends OrganizationAccountEntity>
    extends AbstractAccountProviderEntity<U, A>
{

}
