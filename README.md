# Java MicroServices from scratch with SpringBoot

Java MicroServices from scratch with SpringBoot, Spring Cloud, Netflix Eureka, Netflix Zuul and Netflix Ribbon. 

## How to run?
1. Clone or download the repository. It has 3 modules `accounts` micro service, `registry` named registry server and `gateway` named gateway server
2. Import 3 modules separately as maven projects on IntelliJ or Eclipse
3. Go to registry folder and change `application.yml` file based on your configuration
4. Run RegistrationServer class to MicroServices Registry. Once it started go to [http://localhost:8761](http://localhost:8761) to see the status and general information
5. Now go to resources folder in `accounts` folder and update database credentials and create database in your MySql server
6. Now run `AccountsApplication` class to start Accounts MicroService. Once it started see [http://localhost:8081/actuator](http://localhost:8081/actuator) to see the actuator information
7. You should also see accounts application under [registry server](http://localhost:8761/) with name `ACCOUNTS-SERVICE`
8. Now go to resource folder in `gaeway` folder, update configuration if needed. Run `GatewayApplication` to start the gateway server for microservices. It should be available on [http://localhost:8080](http://localhost:8080)
9. From this point onwards, you can access microservices data through Gateway and restrict direct access to Individual service
   [http://192.168.1.172:8080/accounts/{accountNumber}](http://192.168.1.172:8080/accounts/{accountNumber})
### Technologies

1. Spring Boot
2. Spring Cloud
3. Netflix Eureka
4. Netflix Zuul
5. Netflix Ribbon
6. MySql 



