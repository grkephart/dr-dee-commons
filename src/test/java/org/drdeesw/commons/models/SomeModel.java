/**
 * 
 */
package org.drdeesw.commons.models;

import org.drdeesw.commons.models.base.NamedLongUniqueObject;

/**
 * 
 */
public interface SomeModel extends NamedLongUniqueObject
{
  String getDescription();
  
  void setDescription(String description);
}
