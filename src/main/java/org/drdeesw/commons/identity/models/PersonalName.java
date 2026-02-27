/**
 * 
 */
package org.drdeesw.commons.identity.models;

/**
 * Represents a structured personal name.
 *
 * <p>
 * A PersonalName separates first, middle, last, suffix, and title components to
 * support formatting, sorting, and legal representation.
 * </p>
 */
public interface PersonalName
{

  String getFirstName();

  /**
   * Returns the full formatted name.
   */
  String getFullName();

  String getLastName();

  /**
   * Returns the name formatted as "Last, First".
   */
  String getLastNameFirst();

  String getMiddleName();

  String getSuffix();

  String getTitle();

  void setFirstName(String firstName);

  void setLastName(String lastName);

  void setMiddleName(String middleName);

  void setSuffix(String suffix);

  void setTitle(String title);
}
