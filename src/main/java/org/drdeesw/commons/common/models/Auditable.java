/**
 * 
 */
package org.drdeesw.commons.common.models;


import java.time.Instant;

import org.drdeesw.commons.security.models.User;


/**
 * 
 * 
 */
public interface Auditable
{
  /**
   * Returns the user who created the object.
   * 
   * @return the user who created the object
   */
  User getCreatedBy();


  /**
   * Returns the creation date of the object.
   * 
   * @return the creation date of the object
   */
  Instant getCreationDate();


  /**
   * Returns the last update date of the object.
   * 
   * @return the last update date of the object
   */
  Instant getLastUpdateDate();


  /**
   * Returns the user who last updated the object.
   * 
   * @return the user who last updated the object
   */
  User getLastUpdatedBy();


  /**
   * Sets the user who created the object.
   * 
   * @param createdBy the user who created the object
   */
  void setCreatedBy(
    User createdBy);


  /**
   * Sets the creation date of the object.
   * 
   * @param creationDate the creation date of the object
   */
  void setCreationDate(
    Instant creationDate);


  /**
   * Sets the last update date of the object.
   * 
   * @param lastUpdateDate the last update date of the object
   */
  void setLastUpdateDate(
    Instant lastUpdateDate);


  /**
   * Sets the user who last updated the object.
   * 
   * @param lastUpdatedBy the user who last updated the object
   */
  void setLastUpdatedBy(
    User lastUpdatedBy);
}
