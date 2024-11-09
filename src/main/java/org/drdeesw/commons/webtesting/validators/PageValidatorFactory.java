/**
 * 
 */
package org.drdeesw.commons.webtesting.validators;


import org.drdeesw.commons.webtesting.models.BasePage;


/**
 * 
 */
public interface PageValidatorFactory
{

  /**
   * Returns a validator for the given page class.
   * 
   * @param <P> the page class
   * @param <PV> the page validator class
   * @param <PVC> the page validation context class
   * @param pageClass the page class for which to get a validator
   * @param testContext the context in which the page is being
   * @return the validator for the given page class
   *
   */
  <P extends BasePage, PV extends PageValidator<P, PVC>, PVC extends PageValidationContext> PV getValidator(
    Class<P> pageClass,
    PVC testContext);
}
