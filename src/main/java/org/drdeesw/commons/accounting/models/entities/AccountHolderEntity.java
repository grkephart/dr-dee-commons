/**
 * 
 */
package org.drdeesw.commons.accounting.models.entities;


import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


/**
 * 
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "account_holders")
@AttributeOverride(name = "id", column = @Column(name = "account_holder_id"))
public class AccountHolderEntity extends AbstractAccountHolderEntity
{
}
