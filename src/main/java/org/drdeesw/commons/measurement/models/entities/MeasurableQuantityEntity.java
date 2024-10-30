/**
 * 
 */
package org.drdeesw.commons.measurement.models.entities;


import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


/**
 * 
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "measurable_quantities")
@AttributeOverride(name = "id", column = @Column(name = "measurable_quantity_id"))
public class MeasurableQuantityEntity extends AbstractMeasurableQuantityEntity
{

}
