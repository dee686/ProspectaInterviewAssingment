# Prospecta Coding Challenge

This repository contains solutions for the **Prospecta Coding Challenge**, which consists of two main tasks:

1. **API Development**: Create APIs to interact with the [Fake Store API](https://fakestoreapi.com/).
2. **CSV Processing**: Develop a program to process CSV data, resolving formulas and returning calculated results.

---

## Table of Contents

1. [API Development](#1-api-development)
   - [Task 1: List Products Based on Category](#task-1-list-products-based-on-category)
   - [Task 2: Add a New Product](#task-2-add-a-new-product)
   - [Security and Reliability Considerations](#security-and-reliability-considerations)
2. [CSV Processing](#2-csv-processing)
   - [How I Will Tackle the Challenge](#1-how-i-will-tackle-the-challenge)
   - [Error Handling](#2-error-handling)
   - [How Users Might Break the Code](#3-how-users-might-break-the-code)
3. [Implementation Details](#3-implementation-details)
   - [Technology Stack](#technology-stack)
   - [Installation and Setup](#installation-and-setup)
4. [License](#4-license)

---

## 1. **API Development**

### **Task 1: List Products Based on Category**

- **Objective**: Create an API that lists product details based on the category provided as an input parameter.
- **API Endpoint**: `GET /products/category/{category}`
- **Input**: A category (e.g., "jewelery").
- **Output**: A list of products in the specified category with details like title, price, and description.

#### Example Request:

#### Example Response:
```json
[
    {
        "id": 1,
        "title": "Product 1",
        "price": 100,
        "description": "This is a product in the jewelry category"
    },
    {
        "id": 2,
        "title": "Product 2",
        "price": 150,
        "description": "Another product in the jewelry category"
    }
]

Task 2: Add a New Product
Objective: Create an API that allows users to add a new product with all relevant properties (e.g., title, price, description, etc.).
API Endpoint: POST /products
Request Body:
{
    "title": "New Product",
    "price": 100,
    "description": "This is a newly added product",
    "category": "jewelery"
}
Example Response:
{
    "id": 101,
    "title": "New Product",
    "price": 100,
    "description": "This is a newly added product",
    "category": "jewelery"
}
