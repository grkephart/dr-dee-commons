/**
 * 
 */
package org.drdeesw.commons.common.models;


import java.time.Instant;


/**
 * 
 * 
 */
public interface Auditable
{
  /**
   * @return the ID of the user who created the object
   */
  Long getCreatedById();


  /**
   * @return the creation date of the object
   */
  Instant getCreationDate();


  /**
   * @return the last update date of the object
   */
  Instant getLastUpdateDate();


  /**
   * @return the ID of the user who last updated the object
   */
  Long getLastUpdateId();


  /**
   * @param createdById the ID of the user who created the object
   */
  void setCreatedById(
    Long createdById);


  /**
   * @param creationDate the creation date of the object
   */
  void setCreationDate(
    Instant creationDate);


  /**
   * @param lastUpdateDate
   */
  void setLastUpdateDate(
    Instant lastUpdateDate);


  /**
   * @param lastUpdateId
   */
  void setLastUpdateId(
    Long lastUpdateId);
}
