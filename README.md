# Setup HashiCorp Vault With Spring Boot Application
<p align="left">
 we use HashiCorp vault to secure sensitive configuration values like
 database username , password or any other secure information which need not
 be available as plain text in application configuration files .
 This is a sample demo application to demonstrate springboot application integration with Vault.

HashiCorp vault allows us to setup secure access to those sensitive data with reduce the risk of breaches and data exposure with identity-based security automation and encryption-as-a-service.

In this demo we are going to accomplish below.
</p>

### Main Topics

- Setup HashiCorp Vault
- Creating Secrets on Vault
- verify secrets on vault
- Spring Boot Application With Vault Configuration
  - Application Configurations
  - Load Properties With @ConfigurationProperties to Spring Boot
  - Build and Startup Application


# Setup HashiCorp Vault

Please follow the link to install
https://developer.hashicorp.com/vault/tutorials/getting-started/getting-started-install

https://spring.io/guides/gs/vault-config/

After you install Vault, launch it in a console window. Below command also starts up a server process.

vault server -dev --dev-root-token-id="18456350-7b89-11ed-85e9-a5830358e086"

Now set vault address

set VAULT_ADDR=http://127.0.0.1:8200

# Please note that this is just a dev grade install for dmeo purpose.The secrets will not be persisted and need to be added in case
vault server is restarted.

To verify vault installation launch the url specified by VAULT_ADDR and login using dev-root-token-id

Now use the following command to add secrets to vault.

vault kv put secret/customer_service_vault_dev  spring.datasource.database=customer_management spring.datasource.password=root spring.datasource.username=root app.config.auth.token=some_secret_token app.config.auth.username=demouser1

we can verify the configuration using VAULT_ADDRurl

TO Delete the configuration use the below command

vault kv delete secret/customer_service_vault_dev
![image](https://user-images.githubusercontent.com/21273507/235407769-99f94073-5bd1-45cb-b8a5-48328a1b48e6.png)

we have configure database,databseUser and Databasepassword using followong key
spring.datasource.database
spring.datasource.username
spring.datasource.password

Additional configuration is also done for demo purpose specifid by below key
app.config.auth.token
app.config.auth.username

Once the application is started the database related configuration are retrieved
from the harshicop vault and application startup script is executed and
total no of rows in the table will be printed in the log



