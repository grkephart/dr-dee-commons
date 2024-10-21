/**
 * 
 */
package org.drdeesw.commons.scm.models.measurements;

import org.drdeesw.commons.measurement.models.UnitConversion;
import org.drdeesw.commons.scm.models.ItemMaster;

/**
/**
 * Defined a conversion between a unit of measurement and an item master.
 * For example, this could be the number of items in a box.
 */
public interface ItemMasterUnitConversion extends UnitConversion
{
  /**
   * Returns the item master for this conversion.
   * 
   * @return the item master
   */
  ItemMaster getItemMaster();
  
  /**
   * Sets the item master for this conversion.
   * 
   * @param item the item  master
   */
  void setItemMaster(ItemMaster itemMaster);
}
