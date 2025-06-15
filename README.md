#Love Pet

#Features
-Customer management
- management
-Vaccine management
-Sales management
-Product management
-Providers management
-Workers management with access levels
-Generation of reports and sales orders
-Animal record with all registered vaccines

Screenshots
![Screenshot 1](/Telas/1.png)
![Screenshot 2](/Telas/2.png)
![Screenshot 3](/Telas/3.png)
![Screenshot 4](/Telas/4.png)


#Logins
Administrator (Full Access)
Username: admin@admin.com
Password: 123

#Salesperson
Access: Customer, Animal, Product, and Service Registration, Service Schedule, Open POS
Username: vendedor@vendedor.com
Password: 123

#Veterinarian
Access: Customer, Animal, Product, and Service Registration, Service Schedule, Generate Animal Record, Vaccine Registration
Username: veterinario@veterinario.com
Password: 123

#Installation
Before you start, ensure you have Java 17/22 and Apache Maven installed on your computer. If not, download and install them from the official websites.

#Database Configuration
Rename the config.properties.example file inside the resources folder to config.properties.
Edit the file with your database information.

#Database Migration
Execute the FlywayMigration inside the br.com.petShop.jdbc package to migrate the database.

#Running the Project
In the project's root directory, execute the following Maven commands to clean and package the project:
mvn clean package

#The above command will generate a LovePet-1.0-SNAPSHOT.jar file in the target folder.

#Starting the Application
Execute the generated petHUB-1.0-SNAPSHOT.jar file, which will include all necessary dependencies:
java -jar target/LovePet-1.0-SNAPSHOT.jar
