# Restaurant Review Platform

![TypeScript](https://img.shields.io/badge/TypeScript-79.7%25-blue)
![Java](https://img.shields.io/badge/Java-18.3%25-orange)
![License](https://img.shields.io/badge/License-MIT-green)
![Status](https://img.shields.io/badge/Status-Active-brightgreen)

A **production-grade full-stack application** designed to deliver a comprehensive restaurant discovery and review ecosystem. This platform enables users to explore restaurants, leverage advanced search capabilities with intelligent filtering, and share authentic dining experiences through detailed reviews and ratings.

---

## 📋 Table of Contents

- [Overview](#overview)
- [Architecture](#architecture)
- [Key Features](#key-features)
- [Technology Stack](#technology-stack)
- [Project Structure](#project-structure)
- [Getting Started](#getting-started)
- [API Documentation](#api-documentation)
- [Authentication](#authentication)
- [Development](#development)
- [Deployment](#deployment)
- [Known Limitations](#known-limitations)
- [Future Roadmap](#future-roadmap)
- [Contributing](#contributing)
- [License](#license)

---

## 📖 Overview

The Restaurant Review Platform is a sophisticated web application that demonstrates modern full-stack development practices. It combines a responsive frontend built with Next.js and TypeScript with a robust backend powered by Spring Boot, showcasing enterprise-level patterns and best practices in microservice architecture, authentication, and search optimization.

**Key Benefits:**
- Intuitive user interface for discovering and reviewing restaurants
- Lightning-fast search powered by Elasticsearch
- Enterprise-grade security with OAuth2/JWT authentication
- Highly scalable and containerized infrastructure

---

## 🏗️ Architecture

### System Design

```
┌─────────────────────────────────────────────────────────────┐
│                        Client Layer                         │
│                   (Next.js Frontend)                        │
└────────────────────────┬────────────────────────────────────┘
                         │ REST API / JSON
                         │
┌────────────────────────▼────────────────────────────────────┐
│                    Application Layer                        │
│              (Spring Boot Backend / Java 21)               │
│  ┌──────────────────────────────────────────────────────┐  │
│  │  Controllers │ Services │ Repositories │ Security    │  │
│  └──────────────────────────────────────────────────────┘  │
└──────┬───────────────────┬──────────────────────┬───────────┘
       │                   │                      │
       ▼                   ▼                      ▼
┌──────────────┐    ┌─────────────┐      ┌────────────────┐
│ Elasticsearch│    │ Keycloak    │      │ File Storage   │
│ (Search DB)  │    │ (Auth)      │      │ (Photos)       │
└──────────────┘    └─────────────┘      └────────────────┘
```

### Technology Layers

| Layer | Technology | Purpose |
|-------|-----------|---------|
| **Frontend** | Next.js, React, TypeScript | User Interface & Client Logic |
| **API Gateway** | Spring Boot REST Controllers | Request Handling & Routing |
| **Business Logic** | Spring Boot Services | Core Application Logic |
| **Data Access** | Spring Data Elasticsearch | Search & Data Retrieval |
| **Authentication** | Keycloak, OAuth2, JWT | Security & Authorization |
| **Search Engine** | Elasticsearch 8.x | Full-text & Geo-spatial Search |
| **Infrastructure** | Docker & Docker Compose | Containerization & Orchestration |

---

## ✨ Key Features

### 🔍 Advanced Search Capabilities
- **Full-Text Search**: Search restaurant names, descriptions, and cuisine types
- **Fuzzy Matching**: Find restaurants even with typos or partial queries
- **Multi-Filter Support**: Filter by rating, cuisine type, location, and price range
- **Real-Time Results**: Instant search results with optimized indexing

### 📍 Geospatial Search
- Discover restaurants within a specified radius of your location
- Sort results by proximity
- Location-based recommendations

### ⭐ Comprehensive Review System
- **Star Ratings**: 1-5 star rating system
- **User-Generated Reviews**: Detailed written reviews with timestamps
- **Edit Functionality**: Modify reviews within a configurable time window
- **Review Moderation**: Admin controls for review management

### 🔐 Enterprise Security
- **OAuth2 + JWT Authentication**: Industry-standard security protocols
- **Role-Based Access Control**: Granular permission management
- **Secure API Endpoints**: All endpoints protected with Spring Security
- **Token Management**: Automatic token refresh and validation

### 📸 Media Management
- Upload restaurant images and photos
- Review-specific photo uploads
- Secure file storage and retrieval
- Image optimization and caching

### 🐳 Infrastructure & DevOps
- **Docker Containerization**: Reproducible environments
- **Docker Compose**: One-command setup for all services
- **Service Orchestration**: Automated service management
- **Health Checks**: Container health monitoring

---

## 🛠️ Technology Stack

### Backend
```
- Java 21 (Latest LTS)
- Spring Boot 3.x
- Spring Security 6.x
- Spring Data Elasticsearch
- OAuth2 Resource Server
- Maven (Dependency Management)
```

### Frontend
```
- Next.js (React Framework)
- TypeScript (79.7% of codebase)
- CSS / Tailwind CSS (1.6%)
- Responsive Design
```

### Infrastructure & Services
```
- Docker & Docker Compose
- Elasticsearch 8.x (Search & Analytics)
- Kibana (Monitoring & Debugging)
- Keycloak (Identity & Access Management)
```

### DevOps Tools
- Git (Version Control)
- Maven (Build Automation)
- npm/yarn (Frontend Package Management)

---

## 📁 Project Structure

```
reviewrestaurant/
├── backend/
│   ├── src/
│   │   ├── main/java/com/mahfooz/restaurant/
│   │   │   ├── controller/          # REST Endpoints
│   │   │   ├── service/             # Business Logic
│   │   │   ├── repository/          # Data Access Layer
│   │   │   ├── domain/              # Entity Models
│   │   │   ├── config/              # Spring Configuration
│   │   │   ├── security/            # OAuth2 & Security Config
│   │   │   └── exception/           # Exception Handling
│   │   ├── resources/
│   │   │   └── application.properties
│   │   └── test/
│   ├── pom.xml                      # Maven Dependencies
│   └── Dockerfile
│
├── frontend/
│   ├── src/
│   │   ├── pages/                   # Next.js Pages
│   │   ├── components/              # React Components
│   │   ├── hooks/                   # Custom React Hooks
│   │   ├── utils/                   # Utility Functions
│   │   └── styles/                  # CSS & Styling
│   ├── package.json
│   └── next.config.js
│
├── docker-compose.yaml              # Multi-container Setup
├── .env.example                     # Environment Variables Template
└── README.md                        # This File
```

---

## 🚀 Getting Started

### Prerequisites

Before you begin, ensure you have installed:

- **Docker & Docker Compose** (v20.0+)
- **Java Development Kit** (JDK 21+)
- **Maven** (v3.8+)
- **Node.js & npm** (v18+)
- **Git**

### Installation Steps

#### Step 1: Clone the Repository

```bash
git clone https://github.com/mahfoozalamcse/reviewrestaurant.git
cd reviewrestaurant
```

#### Step 2: Configure Environment Variables

```bash
cp .env.example .env
# Edit .env with your configuration
```

#### Step 3: Start Infrastructure Services

Launch Elasticsearch, Keycloak, and other required services:

```bash
docker-compose up -d
```

**Verify services are running:**
```bash
docker-compose ps
```

#### Step 4: Initialize Backend

```bash
# Build the project
./mvnw clean build

# Run the application
./mvnw spring-boot:run
```

The backend will be available at `http://localhost:8080`

#### Step 5: Setup & Run Frontend

```bash
cd frontend

# Install dependencies
npm install

# Create frontend environment file
cp .env.example .env.local

# Run development server
npm run dev
```

The frontend will be available at `http://localhost:3000`

#### Step 6: Access Keycloak (for authentication setup)

- **URL**: http://localhost:8080/auth
- **Admin Console**: http://localhost:8080/auth/admin

---

## 📡 API Documentation

### Base URL
```
http://localhost:8080/api/v1
```

### Authentication Header
All requests (except login) require:
```
Authorization: Bearer {JWT_TOKEN}
```

### Restaurants Endpoints

#### Get All Restaurants
```http
GET /restaurants?page=0&size=20
```

**Response:**
```json
{
  "content": [
    {
      "id": "1",
      "name": "Restaurant Name",
      "cuisine": "Italian",
      "rating": 4.5,
      "location": "123 Main St",
      "latitude": 40.7128,
      "longitude": -74.0060
    }
  ],
  "totalElements": 100,
  "totalPages": 5
}
```

#### Search Restaurants
```http
GET /restaurants/search?query=pizza&cuisine=Italian&minRating=4&limit=10
```

#### Get Restaurant Details
```http
GET /restaurants/{id}
```

### Reviews Endpoints

#### Get Restaurant Reviews
```http
GET /restaurants/{restaurantId}/reviews
```

#### Create Review
```http
POST /restaurants/{restaurantId}/reviews
Content-Type: application/json

{
  "rating": 5,
  "title": "Excellent Experience",
  "comment": "Great food and service!",
  "visitDate": "2026-04-20"
}
```

#### Update Review
```http
PUT /restaurants/{restaurantId}/reviews/{reviewId}
```

#### Delete Review
```http
DELETE /restaurants/{restaurantId}/reviews/{reviewId}
```

### Search Endpoints

#### Full-Text Search
```http
GET /search?query=pizza&type=restaurant
```

#### Geospatial Search
```http
GET /search/nearby?latitude=40.7128&longitude=-74.0060&distance=5km
```

---

## 🔐 Authentication

### Authentication Flow

1. **User Login** → POST `/auth/login` with credentials
2. **Token Issued** → Keycloak returns JWT token
3. **API Requests** → Include token in Authorization header
4. **Token Refresh** → Use refresh token to obtain new access token
5. **Logout** → Invalidate token on server

### Keycloak Configuration

**Realm Details:**
- **Realm Name**: `restaurant-review`
- **Protocol**: OAuth2 + OpenID Connect
- **Token Type**: JWT
- **Token Expiration**: 15 minutes (configurable)
- **Refresh Token**: 7 days (configurable)

### Environment Variables for Auth

```env
KEYCLOAK_URL=http://localhost:8080/auth
KEYCLOAK_REALM=restaurant-review
KEYCLOAK_CLIENT_ID=restaurant-client
KEYCLOAK_CLIENT_SECRET=your-secret-here
JWT_SECRET=your-jwt-secret
```

---

## 👨‍💻 Development

### Setting Up Development Environment

```bash
# Install development dependencies
npm install --save-dev

# Backend: Run with live reload
./mvnw spring-boot:run -Dspring-boot.run.arguments="--spring.profiles.active=dev"

# Frontend: Run with hot reload
npm run dev
```

### Running Tests

```bash
# Backend tests
./mvnw test

# Frontend tests
npm run test
```

### Code Quality & Linting

```bash
# Java code formatting
./mvnw spotless:apply

# TypeScript linting
npm run lint
npm run lint:fix
```

### Database Migrations

```bash
# Elasticsearch index management
curl -X PUT http://localhost:9200/restaurants -H 'Content-Type: application/json' -d @index-mapping.json
```

---

## 🚢 Deployment

### Docker Build & Run

```bash
# Build Docker image
docker build -t restaurant-review:latest .

# Run container
docker run -p 8080:8080 restaurant-review:latest
```

### Docker Compose Production

```bash
docker-compose -f docker-compose.prod.yml up -d
```

### Cloud Deployment (AWS/GCP)

**Recommended Services:**
- **AWS**: ECS, RDS, CloudFront
- **GCP**: Cloud Run, Cloud Firestore, Cloud CDN
- **Azure**: App Service, Cosmos DB, CDN

See [DEPLOYMENT.md](./DEPLOYMENT.md) for detailed cloud deployment instructions.

---

## ⚠️ Known Limitations

| Issue | Impact | Workaround |
|-------|--------|-----------|
| Elasticsearch as Primary DB | Data loss on index corruption | Regular backups recommended |
| Security Disabled in Dev | Potential exposure during development | Enable in staging/production |
| Single Instance | No fault tolerance | Use load balancer + multiple instances |
| Limited Caching | Slower repeated queries | Implement Redis caching layer |

---

## 🗺️ Future Roadmap

### Q2 2026
- [ ] PostgreSQL integration (hybrid architecture)
- [ ] Redis caching layer
- [ ] API rate limiting

### Q3 2026
- [ ] Role-Based Access Control (RBAC)
- [ ] GraphQL API support
- [ ] Mobile app (React Native)

### Q4 2026
- [ ] API Gateway (Kong/Zuul)
- [ ] CI/CD Pipeline (GitHub Actions)
- [ ] Cloud deployment templates (AWS, GCP, Azure)
- [ ] Kubernetes manifests

### Future Enhancements
- Advanced analytics dashboard
- Restaurant owner portal
- AI-powered recommendations
- Real-time notifications
- Social features (follow, like, share)

---

## 🤝 Contributing

Contributions are welcome! Please follow these guidelines:

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/amazing-feature`)
3. Commit changes (`git commit -m 'Add amazing feature'`)
4. Push to branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request

### Contribution Standards
- Write clean, documented code
- Follow existing code style and conventions
- Add unit tests for new features
- Update documentation as needed
- Include meaningful commit messages

---

## 📄 License

This project is licensed under the **MIT License** - see the [LICENSE](LICENSE) file for details.

### MIT License Summary
- ✅ Commercial use
- ✅ Modification
- ✅ Distribution
- ✅ Private use
- ⚠️ Liability limited

---

## 📞 Support & Contact

**Author**: Mahfooz Alam  
**GitHub**: [@mahfoozalamcse](https://github.com/mahfoozalamcse)  
**Email**: [Your Email]

### Getting Help

- 📖 Check the [Documentation](./docs)
- 🐛 Report issues on [GitHub Issues](https://github.com/mahfoozalamcse/reviewrestaurant/issues)
- 💬 Join discussions on [GitHub Discussions](https://github.com/mahfoozalamcse/reviewrestaurant/discussions)

---

## ⭐ Show Your Support

If you found this project helpful or learned something from it, please give it a star! Your support helps others discover this project.

```bash
# Clone and star the repository
git clone https://github.com/mahfoozalamcse/reviewrestaurant.git
```

---

## 📊 Project Stats

- **Language Composition**: TypeScript 79.7%, Java 18.3%, CSS 1.6%, JavaScript 0.4%
- **Status**: Active Development ✅
- **Last Updated**: 2026-04-25

---

*Last Updated: April 2026 | Made with ❤️ by Mahfooz Alam*
