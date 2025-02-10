package org.drdeesw.commons.organization.models.entities;


import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.MappedSuperclass;

import org.drdeesw.commons.accounting.models.entities.AbstractAccountProviderEntity;
import org.drdeesw.commons.organization.models.pojos.OrganizationAccountPojo;
import org.drdeesw.commons.security.models.User;


@SuppressWarnings("serial")
@MappedSuperclass
@Access(AccessType.PROPERTY)
public abstract class AbstractOrganizationAccountProviderEntity<//
    U extends User<?>, //
    A extends  OrganizationAccountPojo<U, ? extends AbstractOrganizationAccountHolderEntity<U>, ? extends AbstractOrganizationAccountProviderEntity<U>>>
    extends AbstractAccountProviderEntity<U, A>
{

}
