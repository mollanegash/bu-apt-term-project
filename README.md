
# BU MET CS622: Advanced Programming Techniques - Term Project

## Project Title: Shopping Management System (Knowla / K-Grade Series)

### Author: Molla Negash

---

## 📜 Project Description

This project is a part of Boston University’s CS622 Advanced Programming Techniques course. Over the span of 6 assignments, the project evolved from a simple shopping list manager (Assignment 1) to a robust, multi-functional Java application integrating core OOP concepts, JUnit testing, and database interaction.

The project manages purchased and unpurchased items, performs cost calculations, prioritizes purchases, and connects to a relational database. The final version includes:

- Abstract class and polymorphic behavior
- Inheritance and upcasting/downcasting
- JUnit test coverage
- Eclipse-compatible structure

---

## 🧠 System Summary

- **Abstract Concept**: Differentiates cost logic between purchased and unpurchased items via an abstract method.
- **Polymorphism**: Applied in displaying item types and totals.
- **File Operations**: Data input/output using file streams.
- **Database**: Supports storing shopping data in a `.db` relational format.
- **Testing**: Multiple JUnit tests implemented for logic verification.

---

## 💡 Features

- Accepts shopping input (item name, quantity, price, customer, priority)
- Prevents duplicate item entries
- Checks against customer bank balance
- Lists purchased and unpurchased items separately
- Automatically deducts total cost from the balance
- Saves data to and loads data from a file
- Provides a CLI-based shopping simulation

---

## 🧪 JUnit Test Coverage

Unit tests are written for:
- Total cost calculation
- Bank balance check
- Purchase decision logic

---

## 📂 Directory Structure

```
bu-apt-term-project-main/
└── cs622met 2/
    ├── src/
    │   └── cs622met/
    │       ├── *.java               # Core source files
    │       ├── shopping.db          # Sample database
    │       └── shoppinglist.txt     # Sample file output
    └── .idea/                       # IntelliJ project files
.idea/
LICENSE
README.md
```

---

## ▶️ How to Run

1. Open the project in **Eclipse** or **IntelliJ**.
2. Ensure Java 8+ and JUnit are installed.
3. Run `MainShopping.java` to start the application.
4. JUnit tests can be run from test classes using JUnit Test Runner.

---

## 📝 Assignment Breakdown

- **Assignment 1**: Base shopping system, CLI-based, abstract logic.
- **Assignment 2–5**: Feature improvements, UI refinement, database connection, exception handling.
- **Assignment 6**: Final push to GitHub, submission-ready with README and documentation.

---

## 🧑‍💻 Instructor Instructions

All required output, documentation, screenshots, diagrams, and testing files are included in the repo and appended as needed. See `Appendix` sections if referenced.

---

## 📜 License

This project is licensed under the MIT License.
