# Java Packages – Vehicle Project

**Name:** Clyde Bastasa  
**Section:** BSIT – 2A

## Description

This project demonstrates the use of Java Packages by organizing related classes and interfaces into separate packages. The Vehicle project shows how Java packages help keep the program organized, improve code readability, and make classes easier to manage.

It includes different types of vehicles, a service interface, and a printer class. Each class is placed in its appropriate package to demonstrate how packages work together in a Java application.

## Project Structure

```text
src/
├── app/
│   └── Main.java
├── contracts/
│   └── Serviceable.java
├── devices/
│   └── Printer.java
└── vehicles/
    ├── Vehicle.java
    ├── Car.java
    ├── Motorcycle.java
    └── Truck.java
```

## Packages Used

**1. vehicles**

Contains the abstract Vehicle class and its subclasses:
- `Vehicle.java` – Serves as the abstract parent class for all vehicles.
- `Car.java` – Represents a car and implements the Serviceable interface.
- `Motorcycle.java` – Represents a motorcycle and implements the Serviceable interface.
- `Truck.java` – Represents a truck and implements the Serviceable interface.

**2. contracts**

Contains the `Serviceable` interface, which defines the service method that must be implemented by classes using it.

**3. devices**

Contains the `Printer` class, which implements the Serviceable interface without extending the Vehicle class.

**4. app**

Contains the `Main.java` file, which serves as the main entry point of the program. It creates the vehicle objects and demonstrates the use of the different packages.

## Concepts Applied

- **Java Packages** – Used to organize related classes and interfaces into separate folders.
- **Abstraction** – Applied through the abstract Vehicle class.
- **Inheritance** – Used by Car, Motorcycle, and Truck to extend the Vehicle class.
- **Interfaces** – Applied through the Serviceable interface.
- **Polymorphism** – Demonstrated using Vehicle and Serviceable arrays to call methods implemented by different classes.
- **Import Statements** – Used to access classes and interfaces from other packages.

## Program Features

- Displays information about different vehicles.
- Demonstrates the movement of a car, motorcycle, and truck.
- Provides service methods for vehicles and the printer.
- Uses package imports to connect classes from different packages.
- Reuses the same vehicle objects for vehicle and service operations.

## Program Output

The program displays the information and movement of each vehicle, followed by the service information of the car, motorcycle, truck, and printer.

The output demonstrates how the different packages, classes, and interfaces work together in one Java application.



