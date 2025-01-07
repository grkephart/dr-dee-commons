/**
 * 
 */
package org.drdeesw.commons.organization.models.entities;


import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.drdeesw.commons.accounting.models.AccountHolder;
import org.drdeesw.commons.accounting.models.AccountProvider;
import org.drdeesw.commons.accounting.models.entities.AccountHolderEntity;
import org.drdeesw.commons.accounting.models.entities.AccountProviderEntity;


/**
 * 
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "organization_accounts")
@Inheritance(strategy = InheritanceType.JOINED)
@AttributeOverride(name = "id", column = @Column(name = "organization_account_id"))
public class OrganizationAccountEntity extends AbstractOrganizationAccountEntity
{}
