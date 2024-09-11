/**
 * 
 */
package org.drdeesw.commons.webtesting.models;

import org.htmlunit.html.HtmlPage;

/**
 * 
 */
public abstract class BasePage {
	protected HtmlPage page;

	/**
	 * @param page
	 */
	protected BasePage(HtmlPage page) {
		this.page = page;
	}

	/**
	 * @return the page
	 */
	public HtmlPage getPage() {
		return page;
	}
}
