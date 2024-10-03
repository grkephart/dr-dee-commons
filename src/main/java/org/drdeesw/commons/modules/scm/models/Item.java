/**
 * 
 */
package org.drdeesw.commons.modules.scm.models;

import org.drdeesw.commons.modules.common.models.NamedLongUniqueObject;

/**
 * 
 */
public interface Item extends NamedLongUniqueObject
{
  ItemMaster getItemMaster();
  
  void setItemMaster(ItemMaster itemMaster);
}
