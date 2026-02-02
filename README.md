# 🛒 URBAN-MART

URBAN-MART is a full-stack e-commerce web application developed using **Java, JSP, Servlets, JDBC, and MySQL**, with a **Bootstrap-based frontend**.  
The project demonstrates core concepts of web development including authentication, product management, cart functionality, and order processing.

A **static frontend demo** of the project is deployed using **GitHub Pages**.

---


## 🔗 Live Pages (Frontend Demo)

The frontend of **URBAN-MART** is deployed using **GitHub Pages**.

- 🏠 **Home / Products Page**  
  👉 https://vijaykr2004.github.io/URBAN-MART/

- 🛒 **Cart Page**  
  👉 https://vijaykr2004.github.io/URBAN-MART/cart.html

- 🔐 **Login Page**  
  👉 https://vijaykr2004.github.io/URBAN-MART/login.html

> ⚠️ Note: GitHub Pages supports only static content.  
> Backend features (JSP, Servlets, Database) run locally on Apache Tomcat.

---

## 📌 Features

### 👤 User Features
- User Login & Logout
- View Products
- Add Products to Cart
- View Cart Summary
- Place Orders (Backend)
- View Orders

### 🛍️ Product Features
- Product Listing
- Product Images
- Price Display
- Quantity Management

### 🛠️ Technical Features
- MVC Architecture
- JDBC Database Connectivity
- Session Management
- Responsive UI using Bootstrap 4

---

## 🧰 Tech Stack

### Frontend
- HTML5
- CSS3
- Bootstrap 4
- JavaScript

### Backend
- Java
- JSP (Java Server Pages)
- Servlets
- JDBC

### Database
- MySQL

### Tools & Platform
- Apache Tomcat
- Eclipse IDE
- Git & GitHub
- GitHub Pages (Frontend Hosting)

---

## 📂 Project Structure

URBAN-MART/
│
├── docs/ # Static frontend (GitHub Pages)
│ ├── index.html
│ ├── login.html
│ ├── cart.html
│ └── product-image/
│
├── src/main/java/
│ ├── connection/
│ ├── dao/
│ ├── model/
│ └── servlet/
│
├── src/main/webapp/
│ ├── includes/
│ ├── product-image/
│ ├── index.jsp
│ ├── login.jsp
│ ├── cart.jsp
│ └── orders.jsp
│
├── .gitignore
└── README.md



---

## ⚙️ How to Run Locally (Backend)

### Prerequisites
- Java (JDK 8+)
- Apache Tomcat (9+)
- MySQL
- Eclipse IDE

### Steps
1. Clone the repository:
   ```bash
   git clone https://github.com/vijaykr2004/URBAN-MART.git
2.Import the project into Eclipse as a Dynamic Web Project

3.Configure Apache Tomcat in Eclipse

4.Create MySQL database and tables (as per DAO classes)

5.Update database credentials in:
connection/DbCon.java

# 🚀 Deployment Details

Frontend: GitHub Pages (/docs folder)

Backend: Local Apache Tomcat Server
# 👨‍💻 Author

Vijay Kumar Gupta
B.Tech (CSE) Student
Aspiring Full-Stack / Java Developer/

🔗 GitHub: https://github.com/vijaykr2004


