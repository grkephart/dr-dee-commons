package org.drdeesw.commons.organization.models.pojos;


import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.MappedSuperclass;


@SuppressWarnings("serial")
@MappedSuperclass
@Access(AccessType.FIELD)
public abstract class OrganizationAccountHolderPojo extends AccountHolderPojo
{
}
