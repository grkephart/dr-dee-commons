/**
 * 
 */
package org.drdeesw.commons.models;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.drdeesw.commons.models.security.UserEntity;

/**
 * @author gary_kephart
 *
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "test_user_entities")
public class TestUserEntity extends UserEntity
{

}
