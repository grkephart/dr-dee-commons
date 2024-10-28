/**
 * 
 */
package org.drdeesw.commons.common.models;


/**
 *  
 */
public interface Enableable
{
  /**
   * Returns true if the object is enabled, false otherwise.
   * 
   * @return  true if the object is enabled, false otherwise
   */
  boolean isEnabled();


  /**
   * Sets the enabled status of the object.
   * 
   * @param enabled the new enabled status of the object
   */
  void setEnabled(
    boolean enabled);
}
