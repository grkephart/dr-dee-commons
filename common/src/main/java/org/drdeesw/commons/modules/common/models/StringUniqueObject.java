/**
 * 
 */
package org.drdeesw.commons.modules.common.models;

/**
 * A unique object that uses a String as its unique identifier.
 * 
 * @author gary_kephart
 *
 */
public interface StringUniqueObject extends UniqueObject<String>
{
  void setId(String id);

}
