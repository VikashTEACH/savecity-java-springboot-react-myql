# ♻️ SaveCity — Smart Waste Management & Reporting System

## 🌍 Overview

**SaveCity** is a web-based application built with **Spring Boot** that allows users to report waste found on roadsides, in homes, or from industries.  
Users can capture photos of waste, specify its type (dry, solid, liquid, etc.), and upload it through the platform. Once reported, the **Municipal Council** receives the details and sends a cleaning team to handle the issue — making cities cleaner and smarter.

---

## 🎯 Objectives

🔹Digitize city complaint & service management
🔹Provide role-based access
🔹Maintain centralized city data
🔹Improve response time
🔹Enable future smart-city integrations

## 🚀 Key Features

🔹 📸 **Waste Reporting:** Capture and upload images of waste.
🔹 🧾 **Categorization:** Classify waste as dry, solid, wet, or industrial.
🔹🧍 **User Management:** Register and manage users who report issues.
🔹 🗺️ **Address Tracking:** Store the waste location and user address.
🔹 🧹 **Municipal Dashboard:** Municipal authorities can view, assign, and update cleaning tasks.
🔹 ⚙️ **RESTful APIs:** Simple and well-structured backend APIs.
🔹 🛡️ **Exception Handling:** Clean and descriptive error messages.

---

## 👥 User Roles

| Role    | Description                     |
|-------- |---------------------------------|
| Citizen | Can create & track complaints   |
| Admin   | Full system control             |

## 🛠️ Tech Stack

## Backend (savecity-backend)

    🔹Java – Core programming language
    🔹Spring Boot – Backend framework for building REST APIs
    🔹Spring MVC – Request handling & controller layer
    🔹Spring Data JPA (Hibernate) – ORM & database interaction
    🔹Maven – Dependency & build management
    🔹MySQL – Relational database
    🔹RESTful APIs – Client–server communication
    🔹JWT (Planned) – Authentication & authorization (future-ready)

## Frontend (savecity-manish)

    🔹React.js – Frontend JavaScript library
    🔹JavaScript (ES6+) – Application logic
    🔹HTML5 – Page structure
    🔹CSS3 – Styling & layout
    🔹Axios / Fetch API – API communication
    🔹React Context API – State management
    🔹React Router DOM – Page routing

## Development & Tools

    🔹Git & GitHub – Version control
    🔹Postman – API testing
    🔹VS Code / IntelliJ IDEA – Code editors
    🔹Node.js & npm – Frontend package management

## Architecture & Design

    🔹Layered Architecture (Controller → Service → Repository)
    🔹REST Architecture
    🔹MVC Pattern
    🔹DTO Pattern

---

## 🏗️ Project Architecture

Controller Layer
      ↓
Service Layer
      ↓
Repository Layer
      ↓
Database (MySQL)

## 📁 Project Structure

## 📦 ROOT LEVEL STRUCTURE

```
  Project/

  ├── __MACOSX/                   # Mac OS auto-generated     folder    (ignore)
  │
  ├── savecity-backend/             # Spring Boot Backend
  │
  ├── savecity-manish/              # Frontend (React)
  │
  └── README.md                     # Main project README

```

## 🔧 savecity-backend (Spring Boot – COMPLETE)

```
  savecity-backend/
  │
  ├── .gitignore
  ├── mvnw
  ├── mvnw.cmd
  ├── pom.xml
  ├── README.md
  │
  ├── src/
  │   ├── main/
  │   │   ├── java/
  │   │   │   └── com/
  │   │   │       └── savecity/
  │   │   │
  │   │   │           ├── SaveCityApplication.java
  │   │   │
  │   │   │           ├── controller/
  │   │   │           │   ├── ComplaintController.java
  │   │   │           │   ├── UserController.java
  │   │   │           │   └── AdminController.java
  │   │   │
  │   │   │           ├── service/
  │   │   │           │   ├── ComplaintService.java
  │   │   │           │   ├── UserService.java
  │   │   │           │   └── impl/
  │   │   │           │       ├── ComplaintServiceImpl.java
  │   │   │           │       └── UserServiceImpl.java
  │   │   │
  │   │   │           ├── repository/
  │   │   │           │   ├── ComplaintRepository.java
  │   │   │           │   └── UserRepository.java
  │   │   │
  │   │   │           ├── model/
  │   │   │           │   ├── Complaint.java
  │   │   │           │   ├── User.java
  │   │   │           │   └── Role.java
  │   │   │
  │   │   │           ├── dto/
  │   │   │           │   ├── ComplaintRequestDto.java
  │   │   │           │   ├── ComplaintResponseDto.java
  │   │   │           │   └── UserDto.java
  │   │   │
  │   │   │           ├── exception/
  │   │   │           │   ├── ResourceNotFoundException.java
  │   │   │           │   └── GlobalExceptionHandler.java
  │   │   │
  │   │   │           ├── config/
  │   │   │           │   └── CorsConfig.java
  │   │   │
  │   │   │           ├── security/          # future ready
  │   │   │           │   ├── JwtFilter.java
  │   │   │           │   ├── JwtUtil.java
  │   │   │           │   └── SecurityConfig.java
  │   │   │
  │   │   │           └── util/
  │   │   │               └── ApiResponse.java
  │   │   │
  │   │   └── resources/
  │   │       ├── application.properties
  │   │       ├── application-dev.properties
  │   │       ├── application-prod.properties
  │   │       ├── static/
  │   │       └── templates/
  │   │
  │   └── test/
  │       └── java/
  │           └── com/
  │               └── savecity/
  │                   └── SaveCityApplicationTests.java
  │
  └── docs/
  ├── api-docs.md
  └── database-schema.sql

```

## 🎨 savecity-manish (Frontend – React COMPLETE)

```
  savecity-manish/
  │
  ├── .gitignore
  ├── package.json
  ├── package-lock.json
  ├── README.md
  │
  ├── public/
  │   ├── index.html
  │   ├── favicon.ico
  │   └── assets/
  │
  ├── src/
  │   ├── index.js
  │   ├── App.js
  │   ├── App.css
  │
  │   ├── components/
  │   │   ├── Navbar.js
  │   │   ├── Footer.js
  │   │   ├── ComplaintCard.js
  │   │   └── Loader.js
  │
  │   ├── pages/
  │   │   ├── Home.js
  │   │   ├── Login.js
  │   │   ├── Register.js
  │   │   ├── RaiseComplaint.js
  │   │   ├── MyComplaints.js
  │   │   └── AdminDashboard.js
  │
  │   ├── services/
  │   │   ├── api.js
  │   │   ├── complaintService.js
  │   │   └── authService.js
  │
  │   ├── context/
  │   │   └── AuthContext.js
  │
  │   ├── utils/
  │   │   └── constants.js
  │
  │   └── styles/
  │       └── main.css
  │
  └── build/

```

---

## ⚙️ Installation & Setup

### 1️⃣ Prerequisites

🔹 Java 17 or above
🔹 Maven 3.8+
🔹 MySQL Server

### 2️⃣ Clone the Repository

```bash
git clone https://github.com/VikashTEACH/savecity-java-springboot-react-myql.git
cd savecity-java-springboot-react-myql

```

### 3️⃣ Configure Database

Edit `src/main/resources/application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/savecitydb
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
spring.servlet.multipart.enabled=true
spring.servlet.multipart.max-file-size=10MB
spring.servlet.multipart.max-request-size=10MB
```

### 4️⃣ Build & Run

```bash
mvn clean install
mvn spring-boot:run
```

### 5️⃣ Access the App

Open [http://localhost:8080](http://localhost:8080)

---

## 🌐 API Examples

| Method | Endpoint        | Description                        |
| ------ | --------------- | ---------------------------------- |
| POST   | /users          | Register a new user                |
| POST   | /wastissue      | Report new waste with photo upload |
| GET    | /wastissue      | View all waste reports             |
| PUT    | /wastissue/{id} | Update waste cleaning status       |
| DELETE | /wastissue/{id} | Delete a waste record              |

---

## 💾 Sample Waste Report JSON

```json
{
  "userId": 1,
  "wasteType": "Dry",
  "description": "Plastic bottles and wrappers on roadside",
  "address": "Near Green Park, Sector 5",
  "imageUrl": "uploads/waste_2025_11_01.jpg"
}
```

---

## 📸 Future Enhancements

🔹 🗺️ Integration with Google Maps API for location tracking
🔹 🔔 Real-time notifications to municipal teams
🔹 🧾 Waste cleaning status tracking and feedback
🔹 🌍 Mobile app for quick photo uploads

---

---

## 🚧 Project Status

🔹🟡 Partially Completed
🔹✔ Core backend APIs implemented
🔹🔧 Security & frontend integration pending

---

## 👥 Team Members

🔹 Project Title: SaveCity — Smart Waste Management & Reporting System

## Developed by:

🔹👤 Vikash Sahu — Java Backend Developer

🔹👥 Group Project — includes team members contributing to frontend, database, UI/UX design, and Backend

🔹📧 Contact Email: sahu.vikash.sgrl@gmail.com

🔹 🔗 GitHub Repository: SaveCity - Java Spring Boot + React + MySQL

---
