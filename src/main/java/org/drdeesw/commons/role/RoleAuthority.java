/**
 * 
 */
package org.drdeesw.commons.role;

import org.drdeesw.commons.security.models.Authority;

/**
 * Represents the policy-level association between a Role and an Authority.
 *
 * A RoleAuthority defines which Authorities are implied by holding a given Role.
 * This is an application-level concept and is not part of Spring Security or
 * JdbcUserDetailsManager.
 *
 * RoleAuthorities are resolved at runtime to produce enforceable
 * GrantedAuthority instances.
 */
public interface RoleAuthority
{

    /**
     * The role that implies the authority.
     */
    Role getRole();

    /**
     * The authority granted by the role.
     */
    Authority getAuthority();
}
