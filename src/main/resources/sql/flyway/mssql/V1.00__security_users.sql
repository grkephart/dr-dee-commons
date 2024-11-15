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


IF OBJECT_ID('CheckAndCreateUsersTable', 'P') IS NOT NULL
    DROP PROCEDURE CheckAndCreateUsersTable;
GO

CREATE PROCEDURE CheckAndCreateUsersTable AS
BEGIN
  DECLARE @table_name NVARCHAR(255);
  DECLARE @logMessage NVARCHAR(MAX);

  SET @table_name = 'users';
  
  IF NOT EXISTS (SELECT TABLE_NAME FROM INFORMATION_SCHEMA.TABLES  WHERE TABLE_SCHEMA = SCHEMA_NAME() AND TABLE_NAME = @table_name)
  BEGIN
  CREATE TABLE users (
    user_id         BIGINT        NOT NULL IDENTITY(1,1),
    username        NVARCHAR(255) NOT NULL,
    password        NVARCHAR(255) NULL,
    name            NVARCHAR(255) NOT NULL,
    status          INT           NOT NULL DEFAULT 0,
    enabled         BIT           NOT NULL DEFAULT 1,
    CONSTRAINT PK_users PRIMARY KEY (user_id),
    CONSTRAINT UQ_username UNIQUE (username)
    );
  
  SET @logMessage = 'Table "' + @table_name + '" was created.';
  END
  ELSE
  BEGIN
    SET @logMessage = 'Table "' + @table_name + '" already exists.';
  END

  PRINT @logMessage;
END;
GO


EXEC CheckAndCreateUsersTable;

DROP PROCEDURE IF EXISTS CheckAndCreateUsersTable;
GO