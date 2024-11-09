/**
 * 
 */
package org.drdeesw.commons.webtesting.validators;


import java.util.HashMap;
import java.util.Map;


/**
 * 
 */
public class PageValidationContext
{
  private static final String EXPECTED_TITLE_KEY = "expectedTitle";
  private Map<String, Object> context;

  /**
   * 
   */
  public PageValidationContext()
  {
    this.context = new HashMap<String, Object>();
  }


  /**
   * Returns the expected title.
   * 
   * @return the expected title
   */
  public String getExpectedTitle()
  {
    return (String)this.context.get(EXPECTED_TITLE_KEY);
  }


  /**
   * Returns the value of the property with the given key.
   * 
   * @param key the key of the property
   * @return the value of the property
   */
  public Object getProperty(
    String key)
  {
    return this.context.get(key);
  }


  /**
   * Sets the expected title.
   * 
   * @param expectedTitle the expected title
   */
  public void setExpectedTitle(
    String expectedTitle)
  {
    this.context.put(EXPECTED_TITLE_KEY, expectedTitle);
  }


  /**
   * Sets the value of the property with the given key.
   * 
   * @param key the key of the property
   * @param value the value of the property
   */
  public void setProperty(
    String key,
    Object value)
  {
    this.context.put(key, value);
  }
};
