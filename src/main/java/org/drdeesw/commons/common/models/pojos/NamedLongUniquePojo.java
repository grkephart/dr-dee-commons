/**
 * 
 */
package org.drdeesw.commons.common.models.pojos;

import java.io.Serializable;

/**
 * @author gary_kephart
 *
 */
public interface NamedLongUniquePojo<ID extends Serializable> extends NamedUniquePojo<Long>, LongUniquePojo
{

}
