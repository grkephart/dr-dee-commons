/**
 * 
 */
package org.drdeesw.commons.modules.webtesting.validators;


import org.drdeesw.commons.modules.webtesting.models.BasePage;


/**
 * 
 */
public interface PageValidator<P extends BasePage, PVC extends PageValidationContext>
{

  /**
   * @param page
   */
  void validate(
    P page);


  /**
   * @param context
   */
  void initialize(
    PVC context);
}
