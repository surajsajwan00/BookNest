# BookNest

## Table of Contents

- [Overview](#overview)
- [Features](#features)
- [Technologies Used](#technologies-used)
    - [Backend (bookNest)](#backend-bookNest)
    - [Frontend (booknest-ui)](#frontend-booknest-ui)
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

To get started with the BookNest project, follow the setup instructions in the respective directories:

- [Backend Setup Instructions]
 # BookNest - Backend Setup

## Overview

This document provides instructions for setting up the backend of the BookNest project. Follow the steps below to get the backend up and running.

## Prerequisites

- Docker
- Maven (for building the project)

## Setup Instructions

1. **Clone the Repository**

   Start by cloning the repository to your local machine:

   ```bash
   git clone https://github.com/surajsajwan00/BookNest.git

2. **Run Docker Compose**

   Navigate to the root directory of the project and run Docker Compose to set up the required containers:

   ```bash
   docker-compose up -d

3. **Navigate to the book-social-network directory**
   ```bash
   cd book-social-network

4. **Install dependencies (assuming Maven is installed)**
   ```bash
    mvn clean install

5. **Run the application**

6. **Access the API documentation using Swagger UI**
   Open a web browser and go to `http://localhost:8088/swagger-ui/index.html.

- [Frontend Setup Instructions](booknest-ui/README.md)

## Contributors

- [Suraj singh sajwan]-[GitHub](https://github.com/surajsajwan00)
