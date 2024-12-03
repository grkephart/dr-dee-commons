/**
 * 
 */
package org.drdeesw.commons.serviceproviders.models.entities;


import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


/**
 * 
 */

@SuppressWarnings("serial")
@Entity
@Table(name = "service_provider_account_holders")
@AttributeOverride(name = "id", column = @Column(name = "service_provider_account_holder_id"))
public class ServiceProviderAccountHolderEntity extends AbstractServiceProviderAccountHolderEntity
{

}
