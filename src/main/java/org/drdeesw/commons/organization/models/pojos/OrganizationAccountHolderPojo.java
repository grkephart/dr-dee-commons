package org.drdeesw.commons.organization.models.pojos;


import org.drdeesw.commons.security.models.pojos.UserPojo;


@SuppressWarnings("serial")
public class OrganizationAccountHolderPojo
    extends AbstractOrganizationAccountHolderPojo<UserPojo<?> , OrganizationAccountPojo<
        UserPojo<?>, OrganizationAccountHolderPojo, OrganizationAccountProviderPojo>>
{
  public OrganizationAccountHolderPojo() {
    super();
  }
}