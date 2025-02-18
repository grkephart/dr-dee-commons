/**
 * 
 */
package org.drdeesw.commons.security.models.pojos;

import org.drdeesw.commons.common.models.pojos.LongUniquePojo;
import org.drdeesw.commons.security.models.Group;
import org.drdeesw.commons.security.models.GroupMember;

/**
 * 
 */
public interface BaseGroupMemberPojo<G extends Group> extends GroupMember<G>, LongUniquePojo
{

}
