/**
 * 
 */
package org.drdeesw.commons.measurement.models;


import org.drdeesw.commons.common.models.NamedLongUniqueObject;


/**
 * Defines a system of measurement, such as the metric system or the US customary system.
 */
public interface MeasurementSystem extends NamedLongUniqueObject
{

  /**
   * Returns the abbreviation of the system of measurement.
   * 
   * @return the abbreviation of the system of measurement
   */
  String getAbbreviation();


  /**
   * Sets the abbreviation of the system of measurement.
   * 
   * @param abbreviation the abbreviation
   */
  void setAbbreviation(
    String abbreviation);

}
