/**
 * 
 */
package org.drdeesw.commons.identity.models.pojos;


import javax.persistence.Entity;
import javax.persistence.Table;

import org.drdeesw.commons.accounting.models.pojos.AccountPojo;
import org.drdeesw.commons.security.models.pojos.UserPojo;


/**
 * 
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "persons")
public class PersonPojo extends AbstractPersonPojo<UserPojo, AccountPojo>
{
}
