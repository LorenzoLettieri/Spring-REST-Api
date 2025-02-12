# Simple Spring Rest API

This project is a simple REST API built with Spring Boot, using various plugins to enhance code quality and reduce boilerplate.

## Table of Contents

- [Technologies Used](#technologies-used)
- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Installation](#installation)
- [API Endpoints](#api-endpoints)
- [Database Migrations](#database-migrations)
- [Contributing](#contributing)
- [License](#license)

## Technologies Used

- **Spring & Spring Boot**

  - Core framework for building Java applications and REST APIs.

- **Spring Data Rest & Spring Data JPA**

  - Used to expose API endpoints in a standardized way while reducing manual code implementation.

- **Flyway**

  - Manages database configuration and migrations automatically and dynamically.

- **Lombok**

  - Reduces boilerplate code for entity classes by generating getters, setters, and constructors automatically.

## Getting Started

### Prerequisites

- Java 17 or later
- Maven
- MySQL

### Installation

1. Clone the repository:

   ```sh
   git clone https://github.com/your-username/your-repository.git
   cd your-repository
   ```

2. Configure the database in `application.properties` or `application.yml`:

   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/your_db
   spring.datasource.username=your_user
   spring.datasource.password=your_password
   ```

3. Run the application:

   ```sh
   mvn spring-boot:run
   ```

## API Endpoints

These APIs expose information about a list of registered users. You can explore the following endpoints:

- `/api/members` : Retrieve the list of all users.
- `/api/members/{id}` : Retrieve a specific user by their ID.
- You can also add, update, or delete users by making requests with the corresponding HTTP method to `/api/members`.

Additionally, some custom functionalities have been added:

- Search for a user by first name, last name, or email using:
  ```
  /api/members/search/findByName?name={name}
  ```
- Retrieve a random user using:
  ```
  /api/members/search/randomMember
  ```
- All endpoints support pagination and sorting, following the standards and features of Spring Data Rest.

## Database Migrations

Flyway ensures that database migrations are applied automatically on application startup. Define migration scripts inside:

```
/src/main/resources/db/migration/
```

