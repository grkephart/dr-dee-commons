/**
 * 
 */
package org.drdeesw.commons.modules.webtesting.validators;


import java.util.HashMap;
import java.util.Map;

import org.drdeesw.commons.modules.webtesting.models.BasePage;


/**
 * 
 */
public class DefaultPageValidatorFactory implements PageValidatorFactory
{
  private final Map<Class<? extends BasePage>, PageValidator<? extends BasePage, ? extends PageValidationContext>> validators = new HashMap<>();

  /**
   * 
   */
  public DefaultPageValidatorFactory()
  {
    // Register validators
    // validators.put(LoginPage.class, new LoginPageValidator());

    // Add more validators as needed
    // validators.put(AboutPage.class, new AboutPageValidator());
  }


  /**
   *
   */
  @SuppressWarnings("unchecked")
  @Override
  public <P extends BasePage, PV extends PageValidator<P, PVC>, PVC extends PageValidationContext> PV getValidator(
    Class<P> pageClass,
    PVC context)
  {
    PV validator = (PV)validators.get(pageClass);

    validator.initialize(context);

    return validator;
  }

}
