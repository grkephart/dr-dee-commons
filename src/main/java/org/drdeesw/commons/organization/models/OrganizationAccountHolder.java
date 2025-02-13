package org.drdeesw.commons.organization.models;

import org.drdeesw.commons.accounting.models.AccountHolder;
import org.drdeesw.commons.security.models.User;

public interface OrganizationAccountHolder<U extends User<?>>
extends AccountHolder<U, OrganizationAccount<U, ?, ?>> 
{

}
