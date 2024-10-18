/**
 * 
 */
package org.drdeesw.commons.modules.webtesting.validators;


import org.drdeesw.commons.modules.webtesting.models.BasePage;


/**
 * 
 */
public interface PageValidatorFactory
{

  /**
   * @param <P>
   * @param pageClass
   * @param testContext TODO
   * @return
   */
  <P extends BasePage, PV extends PageValidator<P, PVC>, PVC extends PageValidationContext> PV getValidator(
    Class<P> pageClass,
    PVC testContext);
}
