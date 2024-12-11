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
@Table(name = "account_providers")
@AttributeOverride(name = "id", column = @Column(name = "account_provider_id"))
public class AccountProviderEntity extends AbstractAccountProviderEntity
{
}
