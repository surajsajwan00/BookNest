# BookNest

## Table of Contents

- [Overview](#overview)
- [Features](#features)
- [Technologies Used](#technologies-used)
    - [Backend (bookNest)](#backend-bookNest)
    - [Frontend (bookNest-ui)](#frontend-booknest-ui)
- [Learning Objectives](#learning-objectives)
- [Getting Started](#getting-started)

## Overview
BookNest is a vibrant social media platform designed for authors and book enthusiasts. Whether you're an aspiring writer, a seasoned author, or simply a lover of literature, BookNest provides a community where you can connect, share, and discover new books. Dive into a world of stories, engage with fellow book lovers, and let your passion for reading flourish. It offers features such as user registration, secure email validation, book management (including creation, updating, sharing, and archiving), book borrowing with checks for availability, book return functionality, and approval of book returns. The application ensures security using JWT tokens and adheres to best practices in REST API design. The backend is built with Java 21, Spring Boot 3.3.1 and Spring Security 6, while the frontend is developed using Angular with Bootstrap for styling.

## Features
- User Registration: Users can register for a new account.
- Email Validation: Accounts are activated using secure email validation codes.
- User Authentication: Existing users can log in to their accounts securely.
- Book Management: Users can create, update, share, and archive their books.
- Book Borrowing: Implements necessary checks to determine if a book is borrowable.
- Book Returning: Users can return borrowed books.
- Book Return Approval: Functionality to approve book returns.

## Technologies Used

### Backend (bookNest)

- Java 21
- Spring Boot 3.3.1
- Spring Security 6
- JWT Token Authentication
- Spring Data JPA
- JSR-303 and Spring Validation
- OpenAPI and Swagger UI Documentation
- Docker
- GitHub Actions
- Keycloak

### Frontend (booknest-ui)

- Angular
- Component-Based Architecture
- Lazy Loading
- Authentication Guard
- OpenAPI Generator for Angular
- Bootstrap

## Learning Objectives

this project helps in:

- Designing a class diagram from business requirements
- Implementing a mono repo approach
- Securing an application using JWT tokens with Spring Security
- Registering users and validating accounts via email
- Utilizing inheritance with Spring Data JPA
- Implementing the service layer and handling application exceptions
- Object validation using JSR-303 and Spring Validation
- Handling custom exceptions
- Implementing pagination and REST API best practices
- Using Spring Profiles for environment-specific configurations
- Documenting APIs using OpenAPI and Swagger UI
- Implementing business requirements and handling business exceptions
- Dockerizing the infrastructure
- CI/CD pipeline & deployment

## Getting Started

To get started with the Book Social Network project, follow the setup instructions in the respective directories:

- [Backend Setup Instructions](/bookNest/README.md)
- [Frontend Setup Instructions](booknest-ui/README.md)

## Contributors

- [Surasinghsajwan](https://github.com/surajsajwan00)
