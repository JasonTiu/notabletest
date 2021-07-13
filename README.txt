Steps to Setup
1. Clone the application

2. Create Postgres database
appointment table
doctor table

create database user_database
3. Change postgres username and password  as per your installation

open src/main/resources/application.properties

change spring.datasource.username and spring.datasource.password as per your postgres installation

4. Build and run the app on IntelliJ IDE



The app defines following CRUD APIs.

GET /api/v1/doctor

GET /api/v1/appointment

DELETE /api/v1/appointment/{appointmentId}

POST /api/v1/appointment/{Appointment}


Appointment Example:

{
    "id": 3,
    "firstName": "max",
    "lastName": "azuzk",
    "date": "2021-07-03",
    "appTime": "8:30:00",
    "kind": "New Patient",
    "docId": 1
}



