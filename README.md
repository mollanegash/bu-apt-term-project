
```markdown
# BU MET CS622: Advanced Programming Techniques - Term Project

## Project Title: Shopping Management System (Knowla / K-Grade Series)

### Author: Molla Negash

---

## 📜 Project Description

This project is part of Boston University’s **CS622 Advanced Programming Techniques** course. Over the course of six assignments, this project evolved from a simple shopping list manager (Assignment 1) to a robust, multi-functional Java application that integrates core OOP concepts, JUnit testing, and database interaction.

The system manages purchased and unpurchased items, performs cost calculations, prioritizes purchases, and connects to a relational database. The final version includes:

- **Abstract Class** and polymorphic behavior
- **Inheritance** and upcasting/downcasting
- **JUnit** test coverage
- **Eclipse**-compatible structure

---

## 🧠 System Summary

- **Abstract Concept**: Differentiates cost logic between purchased and unpurchased items via an abstract method.
- **Polymorphism**: Used for displaying item types and calculating totals dynamically.
- **File Operations**: Handles data input/output via file streams.
- **Database**: Stores shopping data in a `.db` relational database format.
- **Testing**: JUnit tests verify logic for key functionalities.

---

## 💡 Features

- Accepts shopping input (item name, quantity, price, customer, priority)
- Prevents duplicate item entries
- Verifies customer bank balance before purchase
- Lists purchased and unpurchased items separately
- Automatically deducts the total cost from the balance
- Saves and loads data from a file for persistence
- Provides a CLI-based shopping simulation for user interaction

---

## 🧪 JUnit Test Coverage

Unit tests are written for:
- Total cost calculation
- Bank balance verification
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

1. Open the project in **Eclipse** or **IntelliJ** IDE.
2. Ensure that **Java 8+** and **JUnit** are installed and configured.
3. Run `MainShopping.java` to start the application.
4. JUnit tests can be executed from the test classes using the JUnit Test Runner.

---

## 📝 Assignment Breakdown

- **Assignment 1**: Base shopping system with CLI interface, abstract logic.
- **Assignment 2–5**: Feature enhancements, UI improvements, database connection, exception handling.
- **Assignment 6**: Final submission with GitHub repo, comprehensive README, and all documentation.

---

## 📜 License

This project is licensed under the **MIT License**.
```

---


This is now cleaner and more concise. Let me know if you'd like to further adjust anything!
