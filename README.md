# 🍽️ Restaurant Review Platform

![Java](https://img.shields.io/badge/Java-21-orange)
![Spring Boot](https://img.shields.io/badge/SpringBoot-3.x-green)
![Elasticsearch](https://img.shields.io/badge/Elasticsearch-8.x-yellow)
![Docker](https://img.shields.io/badge/Docker-Enabled-blue)
![License](https://img.shields.io/badge/License-MIT-lightgrey)

A **production-style full-stack application** that enables users to discover restaurants, search using advanced filters, and share their dining experiences through reviews and ratings.

---

## 🏗️ Architecture Diagram

```
        ┌───────────────┐
        │   Frontend    │
        │   Next.js     │
        └──────┬────────┘
               │ REST API
        ┌──────▼────────┐
        │  Spring Boot  │
        │   Backend     │
        └──────┬────────┘
               │
     ┌─────────┼─────────┐
     │                   │
┌────▼─────┐       ┌─────▼─────┐
│Elasticsearch│     │ Keycloak  │
│ (Search DB)│     │ (Auth)    │
└───────────┘     └───────────┘
```

---

## ✨ Features

* 🔍 **Advanced Search**

  * Full-text search
  * Fuzzy matching
  * Filter by rating, cuisine, location

* 📍 **Geospatial Search**

  * Find restaurants near you using coordinates

* ⭐ **Review System**

  * Ratings (1–5 stars)
  * User-generated reviews
  * Edit within the time limit

*  **Authentication**

  * OAuth2 + JWT using Keycloak
  * Secure API endpoints

* 📸 **Photo Upload**

  * Upload restaurant & review images

*  **Dockerized System**

  * One command setup using Docker Compose

---

## 🛠️ Tech Stack

### Backend

* Java 21
* Spring Boot
* Spring Security
* OAuth2 Resource Server
* Spring Data Elasticsearch

### Frontend

* Next.js (React)

### DevOps & Tools

* Docker & Docker Compose
* Elasticsearch
* Kibana
* Keycloak

---

## 📦 Project Structure

```
restaurant/
 ├── src/main/java/com/mahfooz/restaurant
 │    ├── controllers
 │    ├── services
 │    ├── repositories
 │    ├── domain
 │    └── config
 ├── src/main/resources
 │    └── application.properties
 ├── docker-compose.yaml
 ├── pom.xml
 ├── frontend/
```

---

## ⚙️ Setup Guide

### 1️⃣ Clone Repo

```
git clone https://github.com/mahfoozalamcse/reviewrestaurant.git
cd reviewrestaurant
```

### 2️⃣ Run Docker Services

```
docker-compose up -d
```

### 3️⃣ Run Backend

```
./mvnw spring-boot:run
```

### 4️⃣ Run Frontend

```
cd frontend
npm install
npm run dev
```

---

## Authentication (Keycloak)

* Realm: `restaurant-review`
* Protocol: OAuth2 + OpenID Connect
* Token Type: JWT

---

## 📡 API Overview

### Restaurants

* `GET /restaurants`
* `POST /restaurants`

### Reviews

* `GET /restaurants/{id}/reviews`
* `POST /restaurants/{id}/reviews`

### Photos

* `POST /photos`

---

## Search Capabilities

* Full-text search
* Fuzzy search
* Geo-distance queries
* Filtering & pagination

---

## Why This Project is Modern Industry Practice Follow..

* Real-world architecture (microservices-style)
* Secure authentication using industry standards
* Scalable search with Elasticsearch
* Containerized environment (Docker)

---

## Key Learnings

* Implemented secure REST APIs
* Integrated Keycloak with Spring Security
* Built a scalable search system using Elasticsearch
* Designed a clean layered architecture

---

##  Limitations

* Elasticsearch used as primary database (not ideal for production)
* Security disabled for dev environment

---

##  Future Improvements

* Add PostgreSQL (hybrid architecture)
* Role-Based Access Control (RBAC)
* API Gateway
* CI/CD (GitHub Actions)
* Cloud Deployment (AWS / GCP)

---

## 👨‍💻 Author

**Mahfooz Alam**
GitHub: https://github.com/mahfoozalamcse

---

## ⭐ Show Your Support

If you like this project, give it a ⭐ on GitHub!
