/**
 * 
 */
package org.drdeesw.commons.measurement.models;


import org.drdeesw.commons.common.models.LongUniqueObject;


/**
 * Defines a conversion between two units of measurement. 
 * This conversion is defined by a conversion factor and an offset. 
 * 
 * Note that for the Count/Packaging unit of measurement, the conversion factor is the number of items in a unit.
 * Count conversion values, like boxes to cases, will depend on the specific item and will therefore need a subclass which specifies the item.
 * Currency conversion is temporal and will need a subclass which specifies the date.
 */
public interface UnitConversion extends LongUniqueObject
{

  /**
   * Returns the conversion factor for this conversion.
   * 
   * @return the conversion factor
   */
  public Double getConversionFactor();


  /**
   * Returns the unit of measurement from which the conversion is made.
   * 
   * @return the unit of measurement from which the conversion is made
   */
  public UnitOfMeasurement getFromUnit();


  /**
   * Returns the offset for this conversion.
   * 
   * @return the offset
   */
  public Double getOffset();


  /**
   * Returns the unit of measurement to which the conversion is made.
   * 
   * @return the unit of measurement to which the conversion is made
   */
  public UnitOfMeasurement getToUnit();


  /**
   * Sets the conversion factor for this conversion.
   * 
   * @param conversionFactor the conversion factor
   */
  public void setConversionFactor(
    Double conversionFactor);


  /**
   * Sets the unit of measurement from which the conversion is made.
   * 
   * @param fromUnit the unit of measurement from which the conversion is made
   */
  public void setFromUnit(
    UnitOfMeasurement fromUnit);


  /**
   * Set the offset for this conversion.
   * 
   * @param offset the offset
   */
  public void setOffset(
    Double offset);


  /**
   * Sets the unit of measurement to which the conversion is made.
   * 
   * @param toUnit the unit of measurement to which the conversion is made
   */
  public void setToUnit(
    UnitOfMeasurement toUnit);
}
