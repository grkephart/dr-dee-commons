/**
 *
 */
package org.drdeesw.commons.models.base.entities;


import java.io.Serializable;

import org.drdeesw.commons.models.base.UniqueObject;



/**
 * @author gary_kephart
 *
 * @param <ID>
 */
public interface UniqueEntity<ID extends Serializable> extends UniqueObject<ID>
{

}
