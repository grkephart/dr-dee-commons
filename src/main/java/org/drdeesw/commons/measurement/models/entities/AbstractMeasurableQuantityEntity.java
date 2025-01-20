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
@Access(AccessType.PROPERTY)
public abstract class AbstractMeasurableQuantityEntity extends AbstractNamedLongUniqueEntity
    implements MeasurableQuantity
{

  private boolean fundamental;

  /**
   * 
   */
  protected AbstractMeasurableQuantityEntity()
  {
    super();
  }


  @Override
  @Column(name = "fundamental")
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
