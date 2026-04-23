# **BU MET CS622: Advanced Programming Techniques - Term Project**

## **Project Title: Shopping Management System (Knowla / K-Grade Series)**

**Author:** Molla Negash

---

### **Project Description**

This project is part of Boston University’s **CS622 Advanced Programming Techniques** course. The system has evolved through six assignments, starting from a basic shopping list manager (Assignment 1) to a comprehensive Java application. It incorporates object-oriented programming (OOP) principles, JUnit testing, and database interactions.

The Shopping Management System manages items, calculates costs, prioritizes purchases, and integrates with a relational database for data storage. It includes the following key features:

* **Abstract Classes** and polymorphic behavior
* **Inheritance** (upcasting and downcasting)
* **JUnit Test Coverage**
* Eclipse-compatible project structure

---

### **System Overview**

* **Abstract Concept:** Implements an abstract class for differentiating the cost logic of purchased and unpurchased items.
* **Polymorphism:** Used for dynamically displaying item types and calculating totals.
* **File Operations:** Manages data input/output through file streams.
* **Database Integration:** Stores shopping data in a `.db` relational database format.
* **Testing:** JUnit tests ensure correct functionality of major system features.

---

### **Key Features**

* **Shopping Input:** Accepts item details like name, quantity, price, customer, and priority.
* **Duplicate Prevention:** Ensures that no duplicate items are added.
* **Bank Balance Check:** Verifies that the customer has sufficient funds before purchase.
* **Item Listing:** Differentiates between purchased and unpurchased items.
* **Cost Deduction:** Automatically deducts the total purchase cost from the bank balance.
* **Persistence:** Saves and loads shopping data from files to ensure persistence.
* **CLI Simulation:** Provides a command-line interface to simulate shopping actions.

---

### **JUnit Test Coverage**

Unit tests were written for the following key features:

* **Total Cost Calculation**
* **Bank Balance Verification**
* **Purchase Decision Logic**

These tests ensure that the system works as expected and handles various scenarios.

---

### **Directory Structure**

```plaintext
bu-apt-term-project-main/
└── cs622met 2/
    ├── src/
    │   └── cs622met/
    │       ├── *.java               # Core source files
    │       ├── shopping.db          # Sample database file
    │       └── shoppinglist.txt     # Sample output file
    └── .idea/                       # IntelliJ project files
.idea/
LICENSE
README.md
```

---

### **How to Run**

1. Open the project in **Eclipse** or **IntelliJ** IDE.
2. Ensure that **Java 8+** and **JUnit** are installed and configured.
3. Run the `MainShopping.java` class to start the application.
4. JUnit tests can be executed from the test classes using the **JUnit Test Runner**.

---

### **Assignment Breakdown**

* **Assignment 1:** Basic shopping system with CLI interface and abstract logic.
* **Assignments 2–5:** Feature additions, UI improvements, database connection, exception handling.
* **Assignment 6:** Final submission with GitHub repository, a comprehensive README, and all necessary documentation.

---

### **License**

This project is licensed under the **MIT License**.

---

### **Notes**

* All required output, documentation, screenshots, and diagrams are included in the repository.
* The project is structured for easy integration into IDEs like **Eclipse** or **IntelliJ**.

---

This format provides clearer sections and more structured information, making it easier to read and follow. Let me know if you'd like any more changes!
