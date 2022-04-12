# Cryptography API
The cryptography API can be used for encryption, decryption, and hashing of objects with various methods. The methods supported are Blowfish, Twofish, AES, and BCrypt.
Following entities are used and have available endpoints:
* Hashing
  * BCrypt
* Cryptography
  * Blowfish
  * Twofish
  * AES
* Users
* Groups
* Roles
* Authorities

## Login
There are two main Roles in this Application.
* Admins
* Default users
### User Information
| User          | Password                   | Role    |
|:--------------|:---------------------------|:--------|
| anton         | admin                      | ADMIN   |
| bob           | password                   | DEFAULT |



Read the instructions to learn about more details how to setup the application.

## Instructions
To start this application run the method `run()` in the class `AppStartupRunner` (File: [DemoApplication.java](src/main/java/com/example/demo/DemoApplication.java)).
### Database Information
| Property      | Value                      |
|:--------------|:---------------------------|
| DBMS          | Postgres                   |
| Database-Name | postgres                   |
| Protocol      | postgres                   |
| Host          | localhost                  |
| Port          | 5432                       |
| **Full URL**  | postgres://localhost:5432/ |
| Database user | postgres                   |
| Password      | postgres                   |

### Logs
The log can be accessed via [logs/application.log](logs/application.log).

### Endpoints
All endpoints are documented with **Swagger**.
To view this documentation go to 
[http://localhost:8080/swagger-ui/index.html#](http://localhost:8080/swagger-ui/index.html#).

### Properties
Properties of this application are defined in [application.properties](src/main/resources/application.properties).

## More detailed information
For further details check the detailed documentation in the pdf-File.
