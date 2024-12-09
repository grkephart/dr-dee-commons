/**
 * 
 */
package org.drdeesw.commons.organization.models.entities;


import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


/**
 * 
 */

@SuppressWarnings("serial")
@Entity
@Table(name = "organization_account_holders")
@AttributeOverride(name = "id", column = @Column(name = "organization_account_holder_id"))
public class OrganizationAccountHolderEntity
    extends AbstractOrganizationAccountHolderEntity
{

}
