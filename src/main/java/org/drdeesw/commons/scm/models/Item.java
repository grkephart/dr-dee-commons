/**
 * 
 */
package org.drdeesw.commons.scm.models;

import org.drdeesw.commons.common.models.NamedLongUniqueObject;

/**
 * 
 */
public interface Item extends NamedLongUniqueObject
{
  ItemMaster getItemMaster();
  
  void setItemMaster(ItemMaster itemMaster);
}
