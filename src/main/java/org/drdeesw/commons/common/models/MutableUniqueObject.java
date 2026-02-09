/**
 * 
 */
package org.drdeesw.commons.common.models;

import java.io.Serializable;

/**
 * 
 */
public interface MutableUniqueObject<ID extends Serializable> extends UniqueObject<ID>
{
  void setId(ID id);
}
