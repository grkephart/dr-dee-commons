package org.drdeesw.commons.common.models;


/**
 * @author gary_kephart
 *
 */
public interface Named extends DataTransferObject
{
  /**
   * Returns the name of the object.
   * 
   * @return the name of the object
   */
  public String getName();


  /**
   * Sets the name of the object.
   * 
   * @param <NO> the type of the object whose name is being set
   * @param name the name to set
   * @return the object
   */
  <NO extends Named> NO setName(
    String name);
}
