# Student CRUD Application

A RESTful web application built using **Java and Spring Boot** to manage student records. This project demonstrates the fundamentals of building REST APIs and organizing a Spring Boot application using a layered architecture.

## Features

- Create student records
- Retrieve student information
- Update existing student records
- Delete student records
- RESTful API endpoints
- Layered architecture using Controller, Service, Repository, and Entity

## Tech Stack

- **Language:** Java
- **Framework:** Spring Boot
- **Data Access:** Spring Data JPA
- **Database:** Configure the database supported by your project
- **Build Tool:** Maven
- **API Testing:** Postman or Thunder Client
- **Version Control:** Git and GitHub

## Project Structure

```text
crudSpringBootDemo/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── in/ragiyo/crudSpringBootDemo/
│   │   │       ├── controller/
│   │   │       │   └── StudentController.java
│   │   │       ├── entity/
│   │   │       │   └── Student.java
│   │   │       ├── repository/
│   │   │       │   └── StudentRepository.java
│   │   │       ├── service/
│   │   │       │   └── StudentService.java
│   │   │       └── CrudSpringBootDemoApplication.java
│   │   └── resources/
│   │       └── application.properties
│   └── test/
├── pom.xml
├── mvnw
├── mvnw.cmd
└── README.md
```

## Getting Started

### Prerequisites

Install the following tools:

- Java JDK compatible with the version configured in `pom.xml`
- IntelliJ IDEA or another Java IDE
- Git
- A database configured for the application, if required

### Installation

**1. Clone the repository**

```bash
git clone https://github.com/a74455131-stack/crudSpringBootDemo.git
```

**2. Navigate to the project directory**

```bash
cd crudSpringBootDemo
```

**3. Configure the database**

Update `src/main/resources/application.properties` with your database connection details and credentials, if your application uses a database.

Do not commit real passwords or other secrets to GitHub.

**4. Run the application**

On Windows PowerShell:

```powershell
.\mvnw.cmd spring-boot:run
```

Alternatively, open the project in IntelliJ IDEA and run `CrudSpringBootDemoApplication.java`.

## API Endpoints

The following are typical CRUD operations. Adjust the paths and HTTP methods to match your `StudentController.java`.

| Operation | HTTP Method | Purpose |
|---|---|---|
| Create student | POST | Add a student |
| Get students | GET | Retrieve student records |
| Get student by ID | GET | Retrieve one student |
| Update student | PUT | Modify a student |
| Delete student | DELETE | Remove a student |

## Learning Objectives

This project helps demonstrate:

- Understanding REST APIs
- Building applications with Spring Boot
- Dependency injection
- Layered application architecture
- Repository-based data access with Spring Data JPA
- Managing code with Git and GitHub

## Future Improvements

- Add input validation
- Implement global exception handling
- Add pagination and sorting
- Add API documentation using Swagger/OpenAPI
- Add automated tests
- Implement authentication and authorization

## Author

**Aditya Parmar**

GitHub: [@a74455131-stack](https://github.com/a74455131-stack)

---

If you find this project useful, feel free to explore the code and suggest improvements.
