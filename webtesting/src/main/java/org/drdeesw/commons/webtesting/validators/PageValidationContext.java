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
   * @return
   */
  public String getExpectedTitle()
  {
    return (String)this.context.get(EXPECTED_TITLE_KEY);
  }


  /**
   * @param key
   * @return
   */
  public Object getProperty(
    String key)
  {
    return this.context.get(key);
  }


  /**
   * @param expectedTitle
   */
  public void setExpectedTitle(
    String expectedTitle)
  {
    this.context.put(EXPECTED_TITLE_KEY, expectedTitle);
  }


  /**
   * @param key
   * @param value
   */
  public void setProperty(
    String key,
    Object value)
  {
    this.context.put(key, value);
  }
};
