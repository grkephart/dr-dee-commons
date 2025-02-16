/**
 * 
 */
package org.drdeesw.commons.common.models.entities;

import java.io.Serializable;

import org.drdeesw.commons.common.models.Named;

/**
 * @author gary_kephart
 *
 */
public interface NamedUniqueEntity<ID extends Serializable> extends Named, UniqueEntity<ID>
{

}
