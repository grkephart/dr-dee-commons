/**
 * 
 */
package org.drdeesw.commons.accounting.models.entities;


import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.drdeesw.commons.accounting.models.AccountHolder;
import org.drdeesw.commons.accounting.models.AccountProvider;


/**
 * 
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "accounts")
@AttributeOverride(name = "id", column = @Column(name = "account_id"))
public class AccountEntity extends AbstractAccountEntity
{


}
