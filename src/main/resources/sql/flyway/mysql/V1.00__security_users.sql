/*
-- Structured to work with JdbcUserDetailsManager.
--
-- insert into users (username, password, enabled) values (?,?,?)
-- delete from users where username = ?
-- update users set password = ?, enabled = ? where username = ?
-- select username from users where username = ?
-- update users set password = ? where username = ?
-- password can be null since we use Google Auth to store it
*/

SET @logMessage = NULL;

DELIMITER //

CREATE PROCEDURE CheckAndCreateUsersTable()
BEGIN

	SET @table_name = 'users';
	
	IF NOT EXISTS (SELECT TABLE_NAME FROM INFORMATION_SCHEMA.TABLES  WHERE TABLE_SCHEMA = DATABASE() AND TABLE_NAME = @table_name) THEN
			
		CREATE TABLE users (
		  user_id         BIGINT       UNSIGNED NOT NULL AUTO_INCREMENT,
		  username        VARCHAR(255) NOT NULL,
		  password        VARCHAR(255) NULL,
		  name            VARCHAR(255) NOT NULL,
		  status          INT          UNSIGNED NOT NULL DEFAULT 0,
		  enabled         TINYINT(1)   UNSIGNED NOT NULL DEFAULT 1,
		  PRIMARY KEY             (user_id),
		  UNIQUE  KEY user_id_uq  (user_id),
		  UNIQUE  KEY username_uq (username)
		) ENGINE=InnoDB DEFAULT CHARSET=utf8;
	
		SET @logMessage = CONCAT('Table "', @table_name, '" was created.');
	ELSE
	  SET @logMessage = CONCAT('Table "', @table_name, '" already exists.');
	END IF;

END //

DELIMITER ;

CALL CheckAndCreateUsersTable();
SELECT @logMessage AS Message;

DROP PROCEDURE IF EXISTS CheckAndCreateUsersTable;
