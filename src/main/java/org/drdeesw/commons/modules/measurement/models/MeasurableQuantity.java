/**
 * 
 */
package org.drdeesw.commons.modules.measurement.models;


import org.drdeesw.commons.modules.common.models.NamedLongUniqueObject;


/**
 * There are seven fundamental quantities agreed by the delegates in a convention formulating the SI units of measurements
 * plus a variety of derived quantities and non-SI units, like Count and Currency.
 * 
 * <table border="1">
 *   <thead>
 *     <tr><th>Name</th><th>Fundamental/Derived</th><th>Examples</th></tr>
 *   </thead>
 *   <tbody>
 *     <tr><td>Mass</td><td>Fundamental</td><td>Gram, Kilogram</td></tr>
 *     <tr><td>Length</td><td>Fundamental</td><td>Feet, yards, meters, kilometers</td></tr>
 *     <tr><td>Time</td><td>Fundamental</td><td>Seconds, minutes, hours</td></tr>
 *     <tr><td>Temperature</td><td>Fundamental</td><td>Fahrenheit, Celsius, Kelvin</td></tr>
 *     <tr><td>Electric Current</td><td>Fundamental</td><td>Ampere</td></tr>
 *     <tr><td>Amount of Substance</td><td>Fundamental</td><td>Mole</td></tr>
 *     <tr><td>Luminous Intensity</td><td>Fundamental</td><td>Candela</td></tr>
 *     <tr><td>Area</td><td>Derived from length and width</td><td>Square feet</td></tr>
 *     <tr><td>Volume</td><td>Derived from length, width, and height</td><td>Cubic feet</td></tr>
 *     <tr><td>Speed</td><td>Derived from time and length</td><td>Miles per hour</td></tr>
 *     <tr><td>Density</td><td>Derived from mass and volume</td><td>kilogram per cubic meter, gram per cubic centimeter</td></tr>
 *     <tr><td>Energy</td><td>Derived from mass, length and time</td><td>Joules</td></tr>
 *     <tr><td>Force</td><td>Derived from mass, length, and time</td><td>Newtons</td></tr>
 *     <tr><td>Count</td><td>aka Packaging</td><td>each, dozen, box, case, gross, pair, bundle, pallet</td></tr>
 *     <tr><td>Currency</td><td>Different than Count in that it refers to value rather than quantity</td><td>Dollar, Euro, Quarter</td></tr>
 *   </tbody>
 * </table>
 */
public interface MeasurableQuantity extends NamedLongUniqueObject
{

  /**
   * Returns whether the measurable quantity is fundamental.
   * 
   * @return whether the measurable quantity is fundamental
   */
  boolean isFundamental();


  /**
   * Sets  whether the measurable quantity is fundamental.
   * 
   * @param fundamental whether the measurable quantity is fundamental
   */
  void setFundamental(
    boolean fundamental);

}
