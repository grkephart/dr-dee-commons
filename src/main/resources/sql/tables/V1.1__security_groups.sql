/*
-- Structured to work with JdbcUserDetailsManager.
--
-- select group_name from groups
-- select username from group_members gm, groups g where gm.group_id = g.id and g.group_name = ?
-- insert into groups (group_name) values (?)
-- select id from groups where group_name = ?
-- delete from groups where id = ?
-- update groups set group_name = ? where group_name = ?
-- select g.id, g.group_name, ga.authority from groups g, group_authorities ga where g.group_name = ? and g.id = ga.group_id
*/

SET @logMessage = NULL;

DELIMITER //

CREATE PROCEDURE CheckAndCreateGroupsTable()
BEGIN
	SET @table_name = 'groups';
	
  IF NOT EXISTS (SELECT TABLE_NAME FROM INFORMATION_SCHEMA.TABLES  WHERE TABLE_NAME = @table_name) THEN
		
	CREATE TABLE groups(
	  id         BIGINT        UNSIGNED NOT NULL AUTO_INCREMENT,
	  group_name VARCHAR(255)  NOT NULL,
	  PRIMARY KEY               (id),
	  UNIQUE  KEY group_id_uq   (id),
	  UNIQUE  KEY group_name_uq (group_name)
	) ENGINE=InnoDB DEFAULT CHARSET=utf8;
	
	SET @logMessage = CONCAT('Table "', @table_name, '" was created.');
  ELSE
    SET @logMessage = CONCAT('Table "', @table_name, '" already exists.');
  END IF;

END //

DELIMITER ;

CALL CheckAndCreateGroupsTable();
SELECT @logMessage AS Message;

DROP PROCEDURE IF EXISTS CheckAndCreateGroupsTable;
