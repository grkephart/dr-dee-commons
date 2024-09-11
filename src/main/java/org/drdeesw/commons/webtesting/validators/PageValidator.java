/**
 * 
 */
package org.drdeesw.commons.webtesting.validators;

import org.drdeesw.commons.webtesting.models.BasePage;

/**
 * 
 */
public interface PageValidator<P extends BasePage, PVC extends PageValidationContext> {

	/**
	 * @param page
	 */
	void validate(P page);

	/**
	 * @param context
	 */
	void initialize(PVC context);
}
