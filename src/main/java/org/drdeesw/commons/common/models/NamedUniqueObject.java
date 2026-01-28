/**
 * 
 */
package org.drdeesw.commons.common.models;

import java.io.Serializable;

/**
 * @author gary_kephart
 *
 */
public interface NamedUniqueObject<ID extends Serializable> extends Named, UniqueObject<ID>
{

}
