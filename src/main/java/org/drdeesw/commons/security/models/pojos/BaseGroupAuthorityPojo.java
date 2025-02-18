/**
 * 
 */
package org.drdeesw.commons.security.models.pojos;


import org.drdeesw.commons.common.models.pojos.LongUniquePojo;
import org.drdeesw.commons.security.models.GroupAuthority;


/**
 * 
 */
public interface BaseGroupAuthorityPojo<G extends BaseGroupPojo> extends GroupAuthority<G>, LongUniquePojo
{

}
