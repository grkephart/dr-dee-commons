/**
 * 
 */
package org.drdeesw.commons.identity.models.entities;

import java.util.Collections;
import java.util.Set;
import java.util.stream.Collectors;

import javax.persistence.AttributeOverride;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.drdeesw.commons.accounting.models.Account;
import org.drdeesw.commons.accounting.models.entities.AccountEntity;

/**
 * 
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "persons")
@AttributeOverride(name = "id", column = @Column(name = "person_id"))
public class PersonEntity extends AbstractPersonEntity
{

}
