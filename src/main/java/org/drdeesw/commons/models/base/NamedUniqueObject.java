/**
 * 
 */
package org.drdeesw.commons.models.base;

import java.io.Serializable;

/**
 * @author gary_kephart
 *
 */
public interface NamedUniqueObject<ID extends Serializable> extends NamedObject, UniqueObject<ID>
{

}
