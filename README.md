# BSB Notification Service
BSB notification service is a microservice. This application listen to the Active MQ for user notification request
This project can be extended to send notification through email, sms, push notifications etc
This application has listner look into the queue and send notification accordingly.
This application has a dedicated database called notification database to store the user notification being sent,


### Technologies used
1. Springboot
2. JDK 11
3. Postgres
4. ActiveMQ


### Assumptions
Things are not dockerized
Not implemented yet.
Planning to implement the email notification connecting to email provider like Sendgrid etc using smtp

