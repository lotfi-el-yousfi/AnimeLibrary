# Anime Library Full Stack Project

## Table of Contents
- [Introduction](#introduction)
- [Features](#features)
- [Technologies Used](#technologies-used)
- [Installation](#installation)
- [Usage](#usage)
- [Project Structure](#project-structure)
- [Contributing](#contributing) 
- [Contact](#contact)

## Introduction
The Anime Library Full Stack Project is a web application designed to allow users to browse, search, and manage a collection of anime series and movies. This project combines a user-friendly frontend with a robust backend to provide a seamless experience for anime enthusiasts.

## Features
- **User Authentication**: Secure login and registration system.
- **Anime Catalog**: Browse and search for anime series and movies.
- **Anime Details**: View detailed information about each anime.
- **Favorites**: Users can add anime to their list of favorites.
- **Responsive Design**: Mobile-friendly interface.

## Technologies Used
### Frontend
- **Angular js**: For building the user interface. 
- **Axios**: For making API requests.
- **Bootstrap**: For responsive design.

### Backend
- **Spring Boot**: For server-side development.
- **MongoDB**: As the database for storing anime data and user information.
- **MySql**: As a second choice for the database.
- **Hibernate/JPA**: For object data modeling (ODM).
- **JWT**: For user authentication.

## Installation
To get a local copy up and running, follow these steps:
### Prerequisites
- **Java 11** and **Maven** installed on your machine.
- **MySQL** installed and running.

### Backend Setup
1. Clone the repository:
    ```bash
    git clone https://github.com/lotfi-el-yousfi/AnimeLibrary
    cd AnimeLibrary
    ```

2. Configure the database:
    - Create a MySQL database named `anime_library`.
    - Update the `application.properties` file in the `src/main/resources` directory with your MySQL credentials:
    ```properties
    spring.datasource.url=jdbc:mysql://localhost:3306/anime_library
    spring.datasource.username=your_mysql_username
    spring.datasource.password=your_mysql_password
    spring.jpa.hibernate.ddl-auto=update
    spring.jpa.show-sql=true
    spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL5Dialect
    ```

3. Build the project:
    ```bash
    mvn clean install
    ```

4. Start the backend server:
    ```bash
    mvn spring-boot:run
    ```

### Frontend Setup
1. Navigate to the frontend directory:
    ```bash
    cd ../frontend
    ```

2. Install frontend dependencies:
    ```bash
    npm install
    ```

3. Start the frontend development server:
    ```bash
    npm start
    ```
## Docker Setup for MySQL Server

### Build Docker Image

Build the Docker image using Docker Compose:

   ```bash
docker-compose build
   ```
 
### Run Docker Container
 
Start the Docker container using Docker Compose: 

   ```bash
docker-compose up
   ```

## Usage
1. Open your browser and go to `http://localhost:3000` to access the application.
2. Register a new user account or log in with existing credentials.
3. Browse the anime catalog, view details, and manage your favorite anime.

## Project Structure

    
    anime-library/
    ├── backend/
    │ ├── config/
    │ ├── controllers/
    │ ├── models/
    │ ├── routes/
    │ ├── middleware/
    │ ├── .env
    │ ├── server.js
    │ └── package.json
    └── frontend/
    ├── public/
    ├── src/
    │ ├── components/
    │ ├── pages/
    │ ├── redux/
    │ ├── App.js
    │ ├── index.js
    │ └── package.json



## Contributing
Contributions are welcome! Please follow these steps:
1. Fork the project.
2. Create a new branch (`git checkout -b feature/YourFeature`).
3. Commit your changes (`git commit -m 'Add some feature'`).
4. Push to the branch (`git push origin feature/YourFeature`).
5. Open a pull request.
 
## Contact
Your Name - [themessage3003@gmail.com](mailto:themessage3003@gmail.com)

Project Link: [https://github.com/lotfi-el-yousfi/AnimeLibrary](https://github.com/lotfi-el-yousfi/AnimeLibrary)
