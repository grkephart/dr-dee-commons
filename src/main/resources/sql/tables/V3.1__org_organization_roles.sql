
SET @logMessage = NULL;

DELIMITER //

CREATE PROCEDURE CheckAndCreateOrgRolesTable()
BEGIN
  DECLARE table_exists INT           DEFAULT 0;
  DECLARE logMessage   VARCHAR(255);

  SET @schema_name = 'reactrax';
  SET @table_name  = 'organization_roles';
  
  SELECT COUNT(*) INTO table_exists FROM INFORMATION_SCHEMA.TABLES  WHERE TABLE_SCHEMA = @schema_name AND TABLE_NAME = @table_name;
  
  IF table_exists = 0 THEN
      
    CREATE TABLE reactrax.organization_roles (
      organization_role_id BIGINT       UNSIGNED NOT NULL AUTO_INCREMENT,
      organization_id      BIGINT       UNSIGNED NOT NULL,
      name                 VARCHAR(255) NOT NULL,
      description          VARCHAR(255) NULL,

      created_by_id    BIGINT       UNSIGNED NOT NULL,
      creation_date    TIMESTAMP    NOT NULL,
      last_update_date TIMESTAMP    NULL,
      last_update_id   BIGINT       UNSIGNED,

      PRIMARY KEY                (organization_role_id),
      UNIQUE  KEY org_role_id_uq (organization_id),
        CONSTRAINT or_org_fk       FOREIGN KEY (organization_id) REFERENCES organizations (organization_id)
    ) ENGINE=InnoDB DEFAULT CHARSET=utf8;
  
    SET logMessage = CONCAT('Table "', @table_name, '" was created.');
  ELSE
    SET logMessage = CONCAT('Table "', @table_name, '" already exists.');
  END IF;
    
  -- Output the log message
  SELECT logMessage AS Message;

END //

DELIMITER ;

CALL CheckAndCreateOrgRolesTable();
SELECT @logMessage AS Message;

DROP PROCEDURE IF EXISTS CheckAndCreateOrgRolesTable;

-- Verify the table creation by counting rows (should return 0 if empty)
SELECT COUNT(*) FROM reactrax.organization_roles;
