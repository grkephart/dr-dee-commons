/**
 * 
 */
package org.drdeesw.commons.measurement.models.entities;


import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import org.drdeesw.commons.common.models.entities.AbstractNamedLongUniqueEntity;
import org.drdeesw.commons.measurement.models.MeasurableQuantity;


/**
 * 
 */
@SuppressWarnings("serial")
@MappedSuperclass
@Access(AccessType.FIELD)
public abstract class AbstractMeasurableQuantityEntity extends AbstractNamedLongUniqueEntity
    implements MeasurableQuantity
{

  @Column(name = "fundamental")
  private boolean fundamental;

  /**
   * 
   */
  protected AbstractMeasurableQuantityEntity()
  {
    super();
  }


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
