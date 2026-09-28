# Book My Room

A Spring Boot based Room Booking Management System with MySQL database.

## Features

- View available rooms
- Add rooms
- Add guests
- Create room bookings
- View bookings
- Delete bookings
- MySQL database integration
- REST API using Spring Boot

## Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- MySQL
- HTML
- CSS
- JavaScript
- Maven

## How to Run

1. Create a MySQL database named `bookmyroom`.
2. Configure MySQL username and password in `application.properties`.
3. Run `BookMyRoomApplication.java`.
4. Open `http://localhost:8080/`

## API Endpoints

- `GET /api/rooms`
- `POST /api/rooms`
- `GET /api/guests`
- `POST /api/guests`
- `GET /api/bookings`
- `POST /api/bookings`
- `DELETE /api/bookings/{id}`
