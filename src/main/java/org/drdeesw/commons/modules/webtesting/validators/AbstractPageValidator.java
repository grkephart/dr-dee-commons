/**
 * 
 */
package org.drdeesw.commons.modules.webtesting.validators;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.drdeesw.commons.modules.webtesting.models.BasePage;


/**
 * 
 */
public abstract class AbstractPageValidator<P extends BasePage, PVC extends PageValidationContext>
    implements PageValidator<P, PVC>
{

  private String expectedTitle;

  protected AbstractPageValidator()
  {
  }


  /**
   *
   */
  @Override
  public void initialize(
    PVC context)
  {
    this.expectedTitle = context.getExpectedTitle();
  }


  /**
   * @param page
   */
  protected void validatePage(
    P page)
  {
    assertNotNull(page);
    assertNotNull(page.getPage());

    assertNotNull(page.getPage().getTitleText());
    assertEquals(this.expectedTitle, page.getPage().getTitleText());
  }

}
