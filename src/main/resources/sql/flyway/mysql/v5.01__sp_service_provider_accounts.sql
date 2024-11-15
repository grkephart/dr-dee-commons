
DELIMITER //

CREATE PROCEDURE CheckAndCreateServiceProviderAccountsTable()
BEGIN
  DECLARE table_exists INT DEFAULT 0;
  DECLARE logMessage VARCHAR(255);

  SELECT 'Executing CheckAndCreateServiceProviderAccountsTable' AS Message;

  SET @table_name  = 'service_provider_accounts';
  
  SELECT COUNT(*) INTO table_exists FROM INFORMATION_SCHEMA.TABLES  WHERE TABLE_SCHEMA = DATABASE() AND TABLE_NAME = @table_name;

  IF table_exists = 0 THEN
      
    CREATE TABLE service_provider_accounts (
      service_provider_account_id BIGINT       UNSIGNED NOT NULL AUTO_INCREMENT,
      service_provider_id         BIGINT       UNSIGNED NOT NULL,
      name                        VARCHAR(255) NOT NULL,
      token_holder_id             BIGINT       NULL,
      account_holder_id           BIGINT       UNSIGNED NOT NULL,
      
      PRIMARY KEY           (service_provider_account_id),
      UNIQUE  KEY sp_id_uq  (service_provider_account_id)
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
CALL CheckAndCreateServiceProviderAccountsTable();

-- Cleanup
DROP PROCEDURE IF EXISTS CheckAndCreateServiceProviderAccountsTable;

-- Verify the table creation by counting rows (should return 0 if empty)
SELECT COUNT(*) FROM service_provider_accounts;
