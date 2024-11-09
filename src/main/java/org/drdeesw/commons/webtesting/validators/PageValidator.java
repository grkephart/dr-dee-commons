/**
 * 
 */
package org.drdeesw.commons.webtesting.validators;


import org.drdeesw.commons.webtesting.models.BasePage;


/**
 * 
 */
public interface PageValidator<P extends BasePage, PVC extends PageValidationContext>
{

  /**
   * Validates the page.
   * 
   * @param page the page to validate
   */
  void validate(
    P page);


  /**
   * Initializes the context.
   * 
   * @param context the context to initialize
   */
  void initialize(
    PVC context);
}
