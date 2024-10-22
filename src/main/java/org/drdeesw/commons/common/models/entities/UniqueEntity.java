/**
 *
 */
package org.drdeesw.commons.common.models.entities;


import java.io.Serializable;

import org.drdeesw.commons.common.models.UniqueObject;



/**
 * @author gary_kephart
 *
 * @param <ID>
 */
public interface UniqueEntity<ID extends Serializable> extends UniqueObject<ID>
{

}