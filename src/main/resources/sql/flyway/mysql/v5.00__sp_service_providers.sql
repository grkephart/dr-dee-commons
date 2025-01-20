
DELIMITER //

CREATE PROCEDURE CheckAndCreateServiceProvidersTable()
BEGIN
  DECLARE table_exists INT DEFAULT 0;
  DECLARE logMessage VARCHAR(255);

  SELECT 'Executing CheckAndCreateServiceProvidersTable' AS Message;

  SET @table_name  = 'service_providers';
  
  SELECT COUNT(*) INTO table_exists FROM INFORMATION_SCHEMA.TABLES  WHERE TABLE_SCHEMA = DATABASE() AND TABLE_NAME = @table_name;

  IF table_exists = 0 THEN
      
    CREATE TABLE service_providers (
      service_provider_id    BIGINT       UNSIGNED NOT NULL AUTO_INCREMENT,
      name                   VARCHAR(255) NOT NULL,
      description            VARCHAR(255) NULL,
      type_id                BIGINT       UNSIGNED,
      authentication_type    TINYINT      UNSIGNED,
      client_registration_id BIGINT       UNSIGNED,
      is_enabled             TINYINT(1),
      
      created_by_id          BIGINT       UNSIGNED NOT NULL,
      creation_date          TIMESTAMP    NOT NULL,
      last_update_date       TIMESTAMP    NULL,
      last_update_id         BIGINT       UNSIGNED,

      PRIMARY KEY           (service_provider_id),
      UNIQUE  KEY sp_id_uq  (service_provider_id)
    ) ENGINE=InnoDB DEFAULT CHARSET=utf8;
  
    SET logMessage = CONCAT('Table "', @table_name, '" was created.');
  ELSE
    SET logMessage = CONCAT('Table "', @table_name, '" already exists.');
  END IF;
    
  -- Output the log message
  SELECT logMessage AS Message;

END //

DELIMITER ;

-- Call the procedure
CALL CheckAndCreateServiceProvidersTable();

-- Cleanup
DROP PROCEDURE IF EXISTS CheckAndCreateServiceProvidersTable;

-- Verify the table creation by counting rows (should return 0 if empty)
SELECT COUNT(*) FROM service_providers;
