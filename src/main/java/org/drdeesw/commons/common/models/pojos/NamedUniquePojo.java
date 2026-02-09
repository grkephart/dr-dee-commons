/**
 * 
 */
package org.drdeesw.commons.common.models.pojos;

import java.io.Serializable;

import org.drdeesw.commons.common.models.MutableUniqueObject;
import org.drdeesw.commons.common.models.Named;

/**
 * @author gary_kephart
 *
 */
public interface NamedUniquePojo<ID extends Serializable> extends Named, MutableUniqueObject<ID>
{

}
