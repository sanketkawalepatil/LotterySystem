#LOTTERY SYSTEM


Winner Microservice:
We have created a Winner model class which contains the winner's name and lottery number.
We have used H2 in-memory database for storing the winner's data.
We have used Spring Data JPA to interact with the database.
We have created a REST API endpoint in the WinnerController class to get the winner's name and lottery number.


Calculation Microservice:
We have created a Lottery model class which contains an auto-generated id and a lottery number.
We have used MySQL database to store the lottery data.
We have used Spring Data JPA to interact with the database.
We have created a REST API endpoint in the LotteryController class to generate and store a random lottery number.
We have used RestTemplate to call the Winner microservice's API endpoint to get the winner's name and lottery number.
We have used Feign Client to create a more user-friendly way to call Winner microservice's API.
Overall, we have used Spring Boot to create both microservices, used different databases for different purposes, used JPA to interact with databases, and used RestTemplate and Feign Client to make API calls between microservices.
