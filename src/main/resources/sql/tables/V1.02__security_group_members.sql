/*
-- Structured to work with JdbcUserDetailsManager.
--
-- select username from group_members gm, groups g where gm.group_id = g.id and g.group_name = ?
-- delete from group_members where group_id = ?
-- insert into group_members (group_id, username) values (?,?)
-- delete from group_members where group_id = ? and username = ?
*/

SET @logMessage = NULL;

DELIMITER //

CREATE PROCEDURE CheckAndCreateGroupMembersTable()
BEGIN

	SET @table_name = 'group_members';
	
	IF NOT EXISTS (SELECT TABLE_NAME FROM INFORMATION_SCHEMA.TABLES  WHERE TABLE_NAME = @table_name) THEN
			
	CREATE TABLE group_members(
	  id       BIGINT       UNSIGNED NOT NULL AUTO_INCREMENT,
	  group_id BIGINT       UNSIGNED NOT NULL,
	  user_id  BIGINT       UNSIGNED NOT NULL,
	  username VARCHAR(255),
	  PRIMARY KEY             (id),
	  UNIQUE KEY group_id_uq  (id),
	  UNIQUE KEY gm_sk_uq     (group_id, user_id),
	  CONSTRAINT gm_groups_fk FOREIGN KEY (group_id) REFERENCES groups (id),
	  CONSTRAINT gm_users_fk  FOREIGN KEY (user_id)  REFERENCES users  (user_id)
	) ENGINE=InnoDB DEFAULT CHARSET=utf8;
	
	SET @logMessage = CONCAT('Table "', @table_name, '" was created.');
  ELSE
    SET @logMessage = CONCAT('Table "', @table_name, '" already exists.');
  END IF;

END //

DELIMITER ;

CALL CheckAndCreateGroupMembersTable();
SELECT @logMessage AS Message;

DROP PROCEDURE IF EXISTS CheckAndCreateGroupMembersTable;
