
DELIMITER //

CREATE PROCEDURE CheckAndCreateServiceProviderTokenHoldersTable()
BEGIN
  DECLARE table_exists INT DEFAULT 0;
  DECLARE logMessage VARCHAR(255);

  SELECT 'Executing CheckAndCreateServiceProviderTokenHoldersTable' AS Message;

  SET @table_name  = 'service_provider_account_token_holders';
  
  SELECT COUNT(*) INTO table_exists FROM INFORMATION_SCHEMA.TABLES  WHERE TABLE_SCHEMA = DATABASE() AND TABLE_NAME = @table_name;

  IF table_exists = 0 THEN
      
    CREATE TABLE service_provider_account_token_holders (
      service_provider_account_token_holder_id BIGINT       UNSIGNED NOT NULL AUTO_INCREMENT,
      account_id            BIGINT       UNSIGNED NOT NULL,
      access_token          VARCHAR(255) NOT NULL,
      access_token_expiry   TIMESTAMP    NULL DEFAULT NOW(),
      refresh_token         VARCHAR(255) NOT NULL,
      refresh_token_expiry  TIMESTAMP    NOT NULL DEFAULT NOW(),
      
      PRIMARY KEY           (service_provider_account_token_holder_id),
      UNIQUE  KEY sp_id_uq  (service_provider_account_token_holder_id),
      CONSTRAINT sp_accounts_fk FOREIGN KEY (account_id) REFERENCES service_provider_accounts (service_provider_account_id)
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
CALL CheckAndCreateServiceProviderTokenHoldersTable();

-- Cleanup
DROP PROCEDURE IF EXISTS CheckAndCreateServiceProviderTokenHoldersTable;

-- Verify the table creation by counting rows (should return 0 if empty)
SELECT COUNT(*) FROM service_provider_account_token_holders;
