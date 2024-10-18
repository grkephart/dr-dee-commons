/**
 * 
 */
package org.drdeesw.commons.modules.common.models;

import java.io.Serializable;

/**
 * @author gary_kephart
 *
 */
public interface NamedUniqueObject<ID extends Serializable> extends NamedObject, UniqueObject<ID>
{

}
