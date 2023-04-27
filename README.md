# User Management(Validation)

## Framework and Language used
* Springboot
* Java

## Project Summary
* This is a SpringBoot-based project for managing users, with endpoints for adding, retrieving, updating, and deleting user information.

## user attributes
* id
* userName
* dateOfBirth
* email
* phoneNumber

## controller
* UserController

## Service
* UserService

## Model
* Users

## Repository
* UserRepo

## Data Structure used
* ArrayList

## Validation
* **username** : Ensures that a value is provided
* **dateOfBirth** : Ensures that the provided value is a date in the past, and that the date is formatted as YYYY-MM-DD (separated by hyphens)
* **email** :  Ensures that the provided value is a valid email address
* **phoneNumber** : Ensures that the provided value is a valid phone number, formatted as "+{country code}-{10 digits}"

