/**
 * 
 */
package org.drdeesw.commons.modules.common.models.aggregates;

/**
 * An aggregate is a cluster of domain objects that can be treated as a unit. 
 * It consists of a root entity and possibly one or more other associated 
 * entities and value objects. For example, the domain model for the online 
 * store contains aggregates such as Order and Customer. An Order aggregate 
 * consists of an Order entity (the root), one or more OrderLineItem value 
 * objects along with other value objects such as a delivery Address and 
 * PaymentInformation. A Customer aggregate consists of the Customer root 
 * entity along with other value objects such a DeliveryInfo and 
 * PaymentInformation.
 * 
 * @author gary_kephart
 *
 */
public interface Aggregate
{

}
