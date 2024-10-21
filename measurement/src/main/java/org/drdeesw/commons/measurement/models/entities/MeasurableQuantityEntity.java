/**
 * 
 */
package org.drdeesw.commons.measurement.models.entities;


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
