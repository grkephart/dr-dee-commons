/**
 * 
 */
package org.drdeesw.commons.webtesting;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.drdeesw.commons.webtesting.validators.DefaultPageValidatorFactory;
import org.drdeesw.commons.webtesting.validators.PageValidatorFactory;
import org.htmlunit.SilentCssErrorHandler;
import org.htmlunit.WebClient;
import org.htmlunit.html.HtmlPage;

/**
 * 
 */
public abstract class AbstractWebTest {

	private static final String HOME_PAGE_URL_KEY = "home.page.url";
	private static final String PROP_RESOURCE_NAME = "webtesting.properties";
	private Properties properties;
	protected WebClient webClient;
	protected PageValidatorFactory validatorFactory;
	
	/**
	 * 
	 */
	protected AbstractWebTest() {
	}

	/**
	 * @return
	 */
	protected HtmlPage getHomePage() {
		return getPage(getProperty(HOME_PAGE_URL_KEY));
	}

	/**
	 * @param url
	 * @return
	 */
	protected HtmlPage getPage(String url) {
		try {
			return this.webClient.getPage(url);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * @param key
	 * @return
	 */
	protected String getProperty(String key) {
		return this.properties.getProperty(key);
	}

	/**
	 * @throws Exception
	 */
	void setUp() throws Exception {
		this.properties = new Properties();

		try (InputStream input = getClass().getClassLoader().getResourceAsStream(PROP_RESOURCE_NAME)) {
			if (input == null) {
				throw new IOException("Unable to find " + PROP_RESOURCE_NAME);
			}
			properties.load(input);
		}

		this.webClient = new WebClient();
		this.webClient.setCssErrorHandler(new SilentCssErrorHandler());
		this.validatorFactory = new DefaultPageValidatorFactory();
	}

	void tearDown() throws Exception {
		this.webClient.close();
	}
}