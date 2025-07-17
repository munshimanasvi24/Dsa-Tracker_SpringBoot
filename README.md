# 🧠 DSA Practice Tracker (Backend)

A minimal and powerful backend service to **track DSA (Data Structures & Algorithms) problem-solving progress**. Built with **Java, Spring Boot**, and **MySQL**, this project supports problem logging and provides weekly summary statistics via REST APIs.

---

## 🚀 Features

- ✅ Log DSA problems you’ve solved
- ✅ Get weekly summaries of your progress (by pattern and difficulty)
- ✅ Store and retrieve all logged problems
- ✅ Easy integration with frontend dashboard (React or others)
- ✅ Built with Spring Boot + JPA (Hibernate)

---

## 📦 Tech Stack

| Layer     | Technology                     |
|-----------|--------------------------------|
| Backend   | Java 17, Spring Boot           |
| Database  | MySQL 8+                       |
| ORM       | Spring Data JPA (Hibernate)    |
| Build     | Maven                          |
| API Docs  | Swagger UI (Springdoc)         |
| Dev Tools | IntelliJ, Postman              |

---

## 📁 Project Structure

```plaintext
src/
├── model/Problem.java            # JPA Entity
├── controller/ProblemController.java
├── repository/ProblemRepository.java
├── service/ProblemService.java
└── TrackerApplication.java       # Main class
⚙️ How to Run the Project
✅ Prerequisites
Java 17+

Maven

MySQL server (running locally)

IntelliJ (Community is fine)

📂 Step-by-Step
Clone the Repository

bash
Copy
Edit
git clone https://github.com/YOUR_USERNAME/dsa-tracker-backend.git
cd dsa-tracker-backend
Configure MySQL Database

In MySQL:

sql
Copy
Edit
CREATE DATABASE dsa_tracker;
Update your application.properties:

properties
Copy
Edit
spring.datasource.url=jdbc:mysql://localhost:3306/dsa_tracker
spring.datasource.username=your_mysql_username
spring.datasource.password=your_mysql_password
spring.jpa.hibernate.ddl-auto=update
Run the App

Using IntelliJ or:

bash
Copy
Edit
./mvnw spring-boot:run
Test the APIs

Use Postman or Swagger UI:

Swagger: http://localhost:8080/swagger-ui.html

Health Check: http://localhost:8080/actuator/health

📬 API Endpoints
Method	Endpoint	Description
POST	/problems	Add a new DSA problem
GET	/problems	List all problems
GET	/summary/week	Weekly problem-solving summary
GET	/actuator/health	App health check

📅 Future Plans
Build minimal React dashboard frontend

Add filtering, authentication (optional)

Visualize charts (weekly stats)

Export stats (CSV/Excel)

🙌 Contributions
Pull requests, ideas, and feedback are welcome. You can also use this backend for your own personal DSA tracking.

🧑‍💻 Author
Made with 💻 by Manasvi Munshi.
