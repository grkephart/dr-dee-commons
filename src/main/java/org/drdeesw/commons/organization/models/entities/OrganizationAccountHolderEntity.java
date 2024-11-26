/**
 * 
 */
package org.drdeesw.commons.organization.models.entities;


import javax.persistence.Entity;
import javax.persistence.Table;


/**
 * 
 */

@Entity
@Table(name = "organization_account_holders")
public class OrganizationAccountHolderEntity
    extends AbstractOrganizationAccountHolderEntity<OrganizationAccountEntity>
{

}
