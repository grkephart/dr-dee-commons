/**
 * 
 */
package org.drdeesw.commons.measurement.models.entities;


import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.drdeesw.commons.common.models.entities.AbstractNamedLongUniqueEntity;
import org.drdeesw.commons.measurement.models.MeasurableQuantity;


/**
 * 
 */
@SuppressWarnings("serial")
@Entity
@Table(name="measurable_quantities")
@AttributeOverride(name = "id", column = @Column(name = "measurable_quantity_id"))
@Access(AccessType.FIELD)
public class MeasurableQuantityEntity extends AbstractNamedLongUniqueEntity
    implements MeasurableQuantity
{

  @Column(name="fundamental")
  private boolean fundamental;

  @Override
  public boolean isFundamental()
  {
    return fundamental;
  }


  @Override
  public void setFundamental(
    boolean fundamental)
  {
    this.fundamental = fundamental;
  }

}
