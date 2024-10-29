/**
 * 
 */
package org.drdeesw.commons.measurement.models;

import org.drdeesw.commons.common.models.NamedLongUniqueObject;

/**
 * Defines a unit of measurement, such as inches, pounds, or liters.
 * Some units of measurement are base units, such as meters, grams, or liters.
 * There is one base unit of measurement for each measurable quantity in each measurement system.
 * Examples include:
 * <ul>
 *   <li>Length: meter (m) in the metric system</li>
 *   <li>Length: inch (in) in the imperial system</li>
 *   <li>Mass: gram (g) in the metric system</li>
 *   <li>Mass: pound (lb) in the imperial system</li>
 *   <li>Volume: liter (L) in the metric system</li>
 *   <li>Volume: gallon (gal) in the imperial system</li>
 *   <li>Time: second (s) in both metric and imperial systems</li>
 * </ul>
 */
public interface UnitOfMeasurement extends NamedLongUniqueObject
{
  /**
   * Returns the abbreviation of the unit of measurement.
   * 
   * @return the abbreviation of the unit of measurement
   */
  String getAbbreviation();


  /**
   * Returns the measurable quantity.
   * 
   * @return the measurable quantity
   */
  MeasurableQuantity getMeasurableQuantity();


  /**
   * Returns the measurement system.
   * 
   * @return the measurement system
   */
  MeasurementSystem getMeasurementSystem();


  /**
   * @return true if this is a base unit of measurement for this quantity, false otherwise
   */
  boolean isBase();


  /**
   * Sets the abbreviation of the unit of measurement.
   * 
   * @param abbreviation the abbreviation
   */
  void setAbbreviation(
    String abbreviation);


  /**
   * Sets whether this is a base unit of measurement for this quantity.
   * 
   * @param base true if this is a base unit of measurement for this quantity, false otherwise
   */
  void setBase(
    boolean base);


  /**
   * Sets the measurable quantity.
   * 
   * @param measurableQuantity the measurableQuantity to set
   */
  void setMeasurableQuantity(
    MeasurableQuantity measurableQuantity);


  /**
   * Sets the measurement system.
   * 
   * @param measurementSystem the measurement system
   */
  void setMeasurementSystem(
    MeasurementSystem measurementSystem);

}
