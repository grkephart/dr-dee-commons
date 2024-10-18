/**
 * 
 */
package org.drdeesw.commons.modules.scm.models.measurements;


import org.drdeesw.commons.modules.measurement.models.UnitConversion;
import org.drdeesw.commons.modules.scm.models.Item;


/**
 * Defined a conversion between a unit of measurement and an item.
 * For example, this could be the number of items in a box.
 */
public interface ItemUnitConversion extends UnitConversion
{
  /**
   * Returns the item for this conversion.
   * 
   * @return the item
   */
  Item getItem();


  /**
   * Sets the item for this conversion.
   * 
   * @param item the item 
   */
  void setItem(
    Item item);
}
