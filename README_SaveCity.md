# ♻️ SaveCity — Smart Waste Management & Reporting System

## 🌍 Overview

**SaveCity** is a web-based application built with **Spring Boot** that allows users to report waste found on roadsides, in homes, or from industries.  
Users can capture photos of waste, specify its type (dry, solid, liquid, etc.), and upload it through the platform. Once reported, the **Municipal Council** receives the details and sends a cleaning team to handle the issue — making cities cleaner and smarter.

---

## 🚀 Key Features

- 📸 **Waste Reporting:** Capture and upload images of waste.
- 🧾 **Categorization:** Classify waste as dry, solid, wet, or industrial.
- 🧍 **User Management:** Register and manage users who report issues.
- 🗺️ **Address Tracking:** Store the waste location and user address.
- 🧹 **Municipal Dashboard:** Municipal authorities can view, assign, and update cleaning tasks.
- ⚙️ **RESTful APIs:** Simple and well-structured backend APIs.
- 🛡️ **Exception Handling:** Clean and descriptive error messages.

---

## 🛠️ Tech Stack

| Layer           | Technology                               |
| --------------- | ---------------------------------------- |
| Backend         | Spring Boot, Spring Web, Spring Data JPA |
| Database        | MySQL                                    |
| Build Tool      | Maven                                    |
| Language        | Java 17+                                 |
| IDE             | Eclipse / VS Code                        |
| Version Control | Git & GitHub                             |

---

## 📁 Project Structure

```
savecity/
 ├── src/
 │   ├── main/
 │   │   ├── java/com/app/savecity/
 │   │   │   ├── user/                # User entity and logic
 │   │   │   ├── address/             # Address model
 │   │   │   ├── wastissue/           # Waste issue module (controller, service, entity)
 │   │   │   ├── error/               # Custom exceptions & handlers
 │   │   │   └── SavecityApplication.java
 │   │   └── resources/
 │   │       └── application.properties
 │   └── test/
 ├── pom.xml
 └── README.md
```

---

## ⚙️ Installation & Setup

### 1️⃣ Prerequisites

- Java 17 or above
- Maven 3.8+
- MySQL Server

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

- 🗺️ Integration with Google Maps API for location tracking
- 🔔 Real-time notifications to municipal teams
- 🧾 Waste cleaning status tracking and feedback
- 🌍 Mobile app for quick photo uploads

---

---

## 🚧 Project Status

- 🛠️ This project is currently under development.
  Some features and modules are still in progress — including image upload, municipal dashboard, and React frontend integration.
  Future updates will include a fully functional user interface and improved backend logic.

---

## 👥 Team Members

- Project Title: SaveCity — Smart Waste Management & Reporting System

Developed by:

- 👤 Vikash Sahu — Java Backend Developer

- 👥 Group Project — includes team members contributing to frontend, database, UI/UX design, and Backend

- 📧 Contact Email: sahu.vikash.sgrl@gmail.com

- 🔗 GitHub Repository: SaveCity - Java Spring Boot + React + MySQL

---
